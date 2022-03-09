package com.icbt.TechMart.operation.dataBindingOperations.homePageData;

import com.icbt.TechMart.model.product.ProductImplementation;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CreateHomePageItemDataViewListTest {

    @Test
    public void getItemDetailsToShowInHomePage() {
        ArrayList<ProductImplementation> result = new CreateHomePageItemDataViewList().getItemDetailsToShowInHomePage();
        assertEquals(result!=null,true);
    }
}