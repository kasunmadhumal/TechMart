package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class ItemReviewDataTest {

    @Test
    public void getSelectedItemDetails() {
        ResultSet resultSet = new ItemReviewData().getSelectedItemDetails("phoflaXiagre");
        assertEquals(resultSet!=null,true);
    }
}