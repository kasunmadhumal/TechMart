package com.icbt.TechMart.operation.passwordEncryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryption {
    private String oldPassword;
    private String newPassword = null;

    public PasswordEncryption(String oldPassword){
        this.oldPassword = oldPassword;
    }

    public String getNewPassword(){

        try
        {

            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(oldPassword.getBytes());

            byte[] bytes = md.digest();


            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }


            newPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

  return newPassword;
    }

}
