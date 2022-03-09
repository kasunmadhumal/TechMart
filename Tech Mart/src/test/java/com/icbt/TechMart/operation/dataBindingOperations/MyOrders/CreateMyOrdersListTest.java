package com.icbt.TechMart.operation.dataBindingOperations.MyOrders;

import com.icbt.TechMart.model.orders.Orders;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateMyOrdersListTest {

    @Test
    public void getMyOrders() {
        ArrayList<Orders> result = new CreateMyOrdersList("skasunmk98@gmail.com").getMyOrders();
        assertEquals( result!=null ,true);
    }
}