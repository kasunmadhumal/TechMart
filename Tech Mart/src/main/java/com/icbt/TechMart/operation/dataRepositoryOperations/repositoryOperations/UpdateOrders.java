package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.*;
import java.util.Arrays;

public class UpdateOrders implements RepositoryOperation{
    private String email;
    private String branch;
    private String items;
    private double price;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private Statement statement1;
    private ResultSet resultSet1;
    private Statement statement2;
    private ResultSet resultSet2;

    public UpdateOrders(){connection = new DataRepositoryFactory("MySQL").getConnection();}

    public void UpdateCustomerOrders(String email,String branch,String items,double price){
        this.email = email;
        this.branch = branch;
        this.items = items;
        this.price = price;

        try{


            statement2 = connection.createStatement();
            resultSet2 = statement2.executeQuery("SELECT * FROM cart WHERE  userID = '"+email+"'");

            while(resultSet2.next()) {


                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM cart  WHERE userID= '" + email + "' AND  itemID = '" + resultSet2.getString("itemID") + "'");
                int itemCount = 0;
                while (resultSet.next()) {
                    itemCount = resultSet.getInt("quantity");
                }


                statement1 = connection.createStatement();
                resultSet1 = statement.executeQuery("SELECT * FROM items WHERE itemID = '" + resultSet2.getString("itemID") + "'");
                int inStock = 0;
                while (resultSet1.next()) {
                    inStock = resultSet1.getInt("inStockItem");
                }


                int newCount = 0;
                newCount = inStock - itemCount;


                String sql3 = "UPDATE items SET inStockItem = ? WHERE itemID = ?";
                PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
                preparedStatement3.setInt(1, newCount);
                preparedStatement3.setString(2, resultSet2.getString("itemID"));
                preparedStatement3.executeUpdate();


            }









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
