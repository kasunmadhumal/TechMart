package com.icbt.TechMart.operation.AdminsOperations.Operations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class RetrieveSelectedBranchItemStoreDataTest {

    @Test
    public void getSelectedBranchStoreDetails() {
        ResultSet resultSet = new RetrieveSelectedBranchItemStoreData().getSelectedBranchStoreDetails("ga");
        assertEquals(resultSet!=null,true);

    }
}