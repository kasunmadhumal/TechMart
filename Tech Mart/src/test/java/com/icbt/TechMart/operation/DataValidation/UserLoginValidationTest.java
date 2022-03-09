package com.icbt.TechMart.operation.DataValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginValidationTest {

    @Test
    public void checkLoginValidation() {
        int result = new UserLoginValidation("skasunmk98@gmail.com","1234").checkLoginValidation();
        assertEquals(result,1);

    }
}