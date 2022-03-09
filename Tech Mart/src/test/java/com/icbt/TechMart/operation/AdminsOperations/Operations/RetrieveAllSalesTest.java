package com.icbt.TechMart.operation.AdminsOperations.Operations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class RetrieveAllSalesTest {

    @Test
    public void allCustomerOrders() {
        ResultSet result = new RetrieveAllSales().allCustomerOrders();
        assertEquals(result!=null,true);
    }
}