package com.icbt.TechMart.operation.dataBindingOperations.cartItemData;

import com.icbt.TechMart.model.product.ProductInCart;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CreateCartItemDataListTest {

    @Test
    public void getItemDetailsOfCart() {
        ArrayList<ProductInCart> result = new CreateCartItemDataList("mekhala@gmail.com").getItemDetailsOfCart();
        assertEquals(result!=null,true);
    }
}