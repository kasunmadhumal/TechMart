package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class RetrieveDataForHomePageTest {

    @Test
    public void getResults() {
        ResultSet result = new RetrieveDataForHomePage().getResults();
        assertEquals(result!=null,true);
    }
}