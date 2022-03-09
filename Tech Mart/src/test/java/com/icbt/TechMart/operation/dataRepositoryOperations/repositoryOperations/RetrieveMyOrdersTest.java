package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class RetrieveMyOrdersTest {

    @Test
    public void getSelectedItemDetails() {
        ResultSet result = new RetrieveMyOrders().getSelectedItemDetails("skasunmk982@gmai.com");
        assertEquals(result!=null,true);
    }
}