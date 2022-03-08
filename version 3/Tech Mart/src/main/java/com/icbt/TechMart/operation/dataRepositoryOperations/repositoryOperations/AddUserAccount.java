package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;
import com.icbt.TechMart.operation.passwordEncryption.PasswordEncryption;

import java.sql.*;
import java.util.Arrays;

public class AddUserAccount implements RepositoryOperation{

    private Statement statement;
    private Connection connection;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    public AddUserAccount(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }


    public void addUserDetails(String email, String firstName, String lastName, String passcode){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = new PasswordEncryption(passcode).getNewPassword();
        try{
        String sql = "INSERT INTO users (email,firstName,lastName,password)" + " VALUES(?,?,?,?)";
        PreparedStatement preparedStatement =connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, password);
        preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
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
}
