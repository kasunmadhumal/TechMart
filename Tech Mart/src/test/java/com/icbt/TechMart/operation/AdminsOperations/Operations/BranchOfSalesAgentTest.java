package com.icbt.TechMart.operation.AdminsOperations.Operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class BranchOfSalesAgentTest {

    @Test
    public void getBranchOfSalesAgent() {
        String result = new BranchOfSalesAgent().getBranchOfSalesAgent("agent1@gmail.com");
        assertEquals(result!=null,true);
    }
}