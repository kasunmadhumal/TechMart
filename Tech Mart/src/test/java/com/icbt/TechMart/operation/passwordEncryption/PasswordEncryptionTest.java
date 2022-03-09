package com.icbt.TechMart.operation.passwordEncryption;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordEncryptionTest {

    @Test
    public void getNewPassword() {
        String result = new PasswordEncryption("1234").getNewPassword();
        assertEquals(result== "1234",false);
    }
}