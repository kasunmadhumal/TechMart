package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class CartItemRetrieve implements RepositoryOperation {
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private String userID;

    public CartItemRetrieve(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    @Override
    public ResultSet getCartItemDetails(String userID) {
        this.userID = userID;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT cart.userID,cart.itemID,cart.quantity,cart.date,items.itemName,items.mainCategory,items.subCategory,items.price,items.color,items.inStockItem,items.warrantyTime,items.shortDescription,items.rating,items.brand,items.imagePath FROM cart INNER JOIN items ON cart.itemID = items.itemID WHERE userID ='"+userID+"'");
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return resultSet;
    }

    @Override
    public void deleteCartItem(String email, String itemID) {

    }

    @Override
    public void UpdateCustomerOrders(String email, String branch, String items, double price) {

    }

    @Override
    public ResultSet getResults() {
        return null;
    }

    @Override
    public void addUserDetails(String email, String firstName, String lastName, String password) {

    }

    @Override
    public ResultSet getSelectedItemDetails(String ItemID) {
        return null;
    }

    @Override
    public void updateCartTable(String email, int itemCount, String itemID) {

    }


}
