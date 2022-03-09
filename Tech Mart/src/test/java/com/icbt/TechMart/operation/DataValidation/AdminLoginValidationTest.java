package com.icbt.TechMart.operation.DataValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdminLoginValidationTest {

    @Test
    public void checkLoginValidation() {
        int result = new AdminLoginValidation("admin1@gmail.com","admin1").checkLoginValidation();
        assertEquals(result,1);
    }
}