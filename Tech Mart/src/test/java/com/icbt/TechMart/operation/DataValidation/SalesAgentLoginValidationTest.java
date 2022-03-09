package com.icbt.TechMart.operation.DataValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesAgentLoginValidationTest {

    @Test
    public void checkLoginValidation() {
        int result = new SalesAgentLoginValidation("agent1@gmail.com","agent1").checkLoginValidation();
        assertEquals(result,1);
    }
}