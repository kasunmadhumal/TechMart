package com.icbt.TechMart.operation.dataBindingOperations.reviewItemDetailsList;

import com.icbt.TechMart.model.Review.CustomerReviews;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReviewItemDetailsListTest {

    @Test
    public void getItemReviewDetailList() {
        ArrayList<CustomerReviews> result = new ReviewItemDetailsList("phomidredblu").getItemReviewDetailList();
        assertEquals(result!=null,true);
    }
}