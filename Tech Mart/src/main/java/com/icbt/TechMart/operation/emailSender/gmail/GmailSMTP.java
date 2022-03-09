package com.icbt.TechMart.operation.emailSender.gmail;



import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class GmailSMTP implements GmailSMTPInterface{
    public void sendEmail(String Email, String otp){

        final String username = "techmart34@gmail.com";
        final String password = "TechMart#12";
        String fromEmail = username;
        String toEmail = Email;


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
            message.setSubject("TechMart Mobile accessories selling shop");
            String text = ">>" + otp;
            message.setText(text);

//            Multipart emailContent = new MimeMultipart();
//
//            MimeBodyPart textPart = new MimeBodyPart();
//            final EmailFormatter emailFormatter = new EmailFormatter();
//            String body = emailFormatter.getEmailBody();
//            textPart.setText(body);
//
//
//
//            emailContent.addBodyPart(textPart);


//            message.setContent(emailContent);
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}