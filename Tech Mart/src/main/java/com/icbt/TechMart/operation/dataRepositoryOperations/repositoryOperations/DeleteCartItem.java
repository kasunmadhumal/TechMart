package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.*;
import java.util.Arrays;

public class DeleteCartItem implements RepositoryOperation{

    private Connection connection;
    private String email;
    private String itemID;


    public DeleteCartItem(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void deleteCartItem(String email,String itemID){
        this.email = email;
        this.itemID = itemID;

        try{

                String sql = "DELETE FROM cart WHERE userID= ? AND  itemID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, itemID);
                preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

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

    @Override
    public ResultSet getCartItemDetails(String userID) {
        return null;
    }
}
