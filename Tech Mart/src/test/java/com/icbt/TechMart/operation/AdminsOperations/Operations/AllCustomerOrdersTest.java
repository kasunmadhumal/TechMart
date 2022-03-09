package com.icbt.TechMart.operation.AdminsOperations.Operations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class AllCustomerOrdersTest {

    @Test
    public void allCustomerOrders() {
        ResultSet resultSet = new AllCustomerOrders().allCustomerOrders();
        assertEquals(resultSet!=null,true);
    }
}