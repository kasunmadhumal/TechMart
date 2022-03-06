package com.icbt.TechMart.operation.emailSender;

public class EmailFormatter {
    public String getEmailBody(){
        StringBuilder body = new StringBuilder();
        body.append("Your requested report");

        return body.toString();
    }
}
