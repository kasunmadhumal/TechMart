package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class CartItemRetrieveTest {

    @Test
    public void getCartItemDetails() {
        ResultSet resultSet = new CartItemRetrieve().getCartItemDetails("mekhala@gmail.com");
        assertEquals(resultSet!=null,true);
    }
}