package com.icbt.TechMart.operation.dataBindingOperations.allItems;

import com.icbt.TechMart.model.product.ProductImplementation;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllItemDetailsTest {

    @Test
    public void getItemDetails() {
        ArrayList<ProductImplementation> result = new AllItemDetails().getItemDetails();
        assertEquals( result!=null ,true);
    }
}