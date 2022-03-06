package com.icbt.TechMart.operation.emailSender.gmail;

import com.icbt.TechMart.operation.emailSender.EmailFormatter;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class GmailSMTP  {
    public static  void main(String[] args){
        final String username = "techmart34@gmail.com";
        final String password = "TechMart#12";
        String fromEmail = username;
        String toEmail = "skasunmk982@gmail.com";


        String host = "smtp.gmail.com";
        String port = "587";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust","*");

        Session session = Session.getInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(toEmail)
            );
            message.setSubject("E-commerce shop report");
            message.setText("Your requested report");

            Multipart emailContent = new MimeMultipart();

            MimeBodyPart textPart = new MimeBodyPart();
            final EmailFormatter emailFormatter = new EmailFormatter();
            String body = emailFormatter.getEmailBody();
            textPart.setText(body);




            emailContent.addBodyPart(textPart);


            message.setContent(emailContent);
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }

}
