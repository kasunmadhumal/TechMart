package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import java.sql.ResultSet;

public interface RepositoryOperation {
    ResultSet getResults();
    void addUserDetails(String email, String firstName,String lastName,String password);
    ResultSet getSelectedItemDetails(String ItemID);
    void updateCartTable(String email,int itemCount,String itemID);
    ResultSet getCartItemDetails(String userID);
    void deleteCartItem(String email,String itemID);
    void UpdateCustomerOrders(String email,String branch,String items,double price);

}
