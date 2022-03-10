package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.*;

public class OrderRemoveFromDatabase implements AdminOperations{
    private String username;
    private double orderAmount;
    private Connection connection;
    private String salesAgent;
    private Statement statement1;
    private ResultSet resultSet1;


    public OrderRemoveFromDatabase(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void orderRemoveFromDatabase(String username,double orderAmount,String salesAgent){
        this.username = username;
        this.orderAmount = orderAmount;
        this.salesAgent =  salesAgent;

        try{

            statement1 = connection.createStatement();
            resultSet1 = statement1.executeQuery("SELECT * FROM orders WHERE email ='"+username+"' AND totalPrice ="+orderAmount+"");
            String items = "";
            while (resultSet1.next()){items = resultSet1.getString("items");}

            String sql = "DELETE FROM orders WHERE email= ? AND  totalPrice = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setDouble(2, orderAmount);
            preparedStatement.executeUpdate();

            String sql1 = "INSERT INTO transaction (userID,items,price,salesAgent) VALUES (?,?,?,?);";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setString(1, username);
            preparedStatement1.setString(2, items);
            preparedStatement1.setDouble(3, orderAmount);
            preparedStatement1.setString(4, salesAgent);
            preparedStatement1.executeUpdate();






        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public ResultSet getSelectedBranchStoreDetails(String branchName) {
        return null;
    }

    @Override
    public ResultSet allCustomerOrders() {
        return null;
    }

    @Override
    public void update(String salesAgentID, String branch, String message) {

    }

    @Override
    public String getBranchOfSalesAgent(String userName) {
        return null;
    }

    @Override
    public ResultSet getSalesAgentAreaOrdersList(String branch) {
        return null;
    }

    @Override
    public void updateCustomerOrder(String driverID, String vehicleType, String status, String email, double price) {

    }
}
