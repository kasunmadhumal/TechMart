package com.icbt.TechMart.operation.dataBindingOperations.salesAgentStoreManage;

import com.icbt.TechMart.model.product.ProductImplementation;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SalesAgentBranchItemStoreTest {

    @Test
    public void getItemDetailsSelectedCategory() {
        ArrayList<ProductImplementation> result = new SalesAgentBranchItemStore("ga").getItemDetailsSelectedCategory();
        assertEquals(result!=null,true);
    }
}