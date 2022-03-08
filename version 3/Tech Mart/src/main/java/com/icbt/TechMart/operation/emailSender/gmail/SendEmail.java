package com.icbt.TechMart.operation.emailSender.gmail;



public class SendEmail
{
    private String email;
    private String otp;
    public SendEmail(String email, String otp){
        this.email = email;
        this.otp = otp;
        GmailSMTP send = new GmailSMTP();
        send.sendEmail(email,otp);
    }
}