package com.icbt.TechMart.operation.dataBindingOperations.selectedItemDetailsList;

import com.icbt.TechMart.model.product.ProductImplementation;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AboutItemDetailListTest {

    @Test
    public void getSelectedItemDetailList() {
        ArrayList<ProductImplementation> result = new AboutItemDetailList("phobudhuablu").getSelectedItemDetailList();
        assertEquals(result!=null,true);
    }
}