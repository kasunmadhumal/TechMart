package com.icbt.TechMart.operation.AdminsOperations.Operations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class OrdersInSalesAgentAreaTest {

    @Test
    public void getSalesAgentAreaOrdersList() {
        ResultSet result = new OrdersInSalesAgentArea().getSalesAgentAreaOrdersList("agent1@gmail.com");
        assertEquals(result!=null,true);
    }
}