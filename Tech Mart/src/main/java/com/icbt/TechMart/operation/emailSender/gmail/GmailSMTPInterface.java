package com.icbt.TechMart.operation.emailSender.gmail;

public interface GmailSMTPInterface {
    String sendEmail(String Email, String filePath);
}
