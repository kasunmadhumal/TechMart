package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;
import com.icbt.TechMart.operation.passwordEncryption.PasswordEncryption;

import java.sql.*;
import java.util.Arrays;

public class UpdateItemCount implements RepositoryOperation{
    private Statement statement;
    private Connection connection;
    private String email;
    private int itemCount;
    private String itemID;

    public UpdateItemCount(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }


    public void updateCartTable(String email,int itemCount,String itemID){
        this.email = email;
        this.itemCount = itemCount;
        this.itemID = itemID;

        try{
            if(itemCount >1) {
                String sql = "UPDATE cart SET quantity = ? WHERE userID = ? AND itemID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, itemCount);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, itemID);
                preparedStatement.executeUpdate();

            }else if(itemCount ==1){
                String sql = "INSERT INTO cart (userID,itemID  ,quantity) VALUES(?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, itemID);
                preparedStatement.setInt(3, itemCount);
                preparedStatement.executeUpdate();

            }
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
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
    public ResultSet getSelectedItemDetails(String ItemID) {
        return null;
    }


    @Override
    public ResultSet getResults() {
        return null;
    }

    @Override
    public void addUserDetails(String email, String firstName, String lastName, String password) {

    }
}
