package com.icbt.TechMart.operation.dataBindingOperations.reviewItemDetailsList;

import com.icbt.TechMart.model.Review.CustomerReviews;
import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.dataBindingOperations.selectedItemDetailsList.AboutItemDetailList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReviewItemDetailsList {
    private RepositoryOperation repositoryOperation;
    private String itemID;

    public ReviewItemDetailsList(String itemID){
        this.itemID = itemID;
    }

    public ArrayList<CustomerReviews> getItemReviewDetailList(){

        repositoryOperation = new DataRepositoryOperationFactory("itemReview").getItemDataClass();
        ResultSet itemReviews = repositoryOperation.getSelectedItemDetails(itemID);

        ArrayList<CustomerReviews> list = new ArrayList<>();

        CustomerReviews review;

        try {
            while(itemReviews.next()){

                review = new CustomerReviews(

                        itemReviews.getString("userID"),
                        itemReviews.getString("itemID"),
                        itemReviews.getString("discription"),
                        itemReviews.getInt("rating")

                );
                list.add(review);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AboutItemDetailList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
