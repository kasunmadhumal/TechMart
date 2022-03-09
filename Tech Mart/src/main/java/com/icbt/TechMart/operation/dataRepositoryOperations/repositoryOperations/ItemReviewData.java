package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class ItemReviewData implements RepositoryOperation{
    private Statement statement;
    private ResultSet resultSet;
    private final Connection connection;

    public ItemReviewData(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    @Override
    public ResultSet getSelectedItemDetails(String ItemID) {
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM review WHERE itemID = '"+ItemID+"'");
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return resultSet;
    }

    @Override
    public void updateCartTable(String email, int itemCount, String itemID) {

    }

    @Override
    public ResultSet getCartItemDetails(String userID) {
        return null;
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
}
