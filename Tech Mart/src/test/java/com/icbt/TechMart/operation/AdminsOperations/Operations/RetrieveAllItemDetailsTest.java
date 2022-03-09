package com.icbt.TechMart.operation.AdminsOperations.Operations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class RetrieveAllItemDetailsTest {

    @Test
    public void getStoreDetails() {
        ResultSet resultSet = new RetrieveAllItemDetails().getStoreDetails();
        assertEquals(resultSet!=null,true);
    }
}