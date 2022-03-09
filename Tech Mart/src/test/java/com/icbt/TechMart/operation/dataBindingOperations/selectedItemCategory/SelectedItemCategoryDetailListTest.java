package com.icbt.TechMart.operation.dataBindingOperations.selectedItemCategory;

import com.icbt.TechMart.model.product.ProductImplementation;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SelectedItemCategoryDetailListTest {

    @Test
    public void getItemDetailsSelectedCategory() {
        ArrayList<ProductImplementation> result = new SelectedItemCategoryDetailList("phone").getItemDetailsSelectedCategory();
        assertEquals(result!=null,true);
    }
}