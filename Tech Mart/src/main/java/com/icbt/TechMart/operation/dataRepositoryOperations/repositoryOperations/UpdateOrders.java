package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class UpdateOrders implements RepositoryOperation{
    private String email;
    private String branch;
    private String items;
    private double price;
    private Connection connection;

    public UpdateOrders(){connection = new DataRepositoryFactory("MySQL").getConnection();}

    public void UpdateCustomerOrders(String email,String branch,String items,double price){
        this.email = email;
        this.branch = branch;
        this.items = items;
        this.price = price;

        try{
            String sql = "INSERT INTO orders (email,branch ,items,totalPrice) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, branch);
            preparedStatement.setString(3, items);
            preparedStatement.setDouble(4, price);
            preparedStatement.executeUpdate();


            String sql1 = "DELETE FROM cart WHERE userID= ?";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setString(1, email);
            preparedStatement1.executeUpdate();

        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
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

    @Override
    public void deleteCartItem(String email, String itemID) {

    }
}
