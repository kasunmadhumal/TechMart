package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateCustomerOrderDetails implements AdminOperations{
    private String driverID;
    private String vehicleType;
    private String status;
    private String email;
    private double price;
    private Connection connection;

    public UpdateCustomerOrderDetails(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void updateCustomerOrder(String driverID,String vehicleType,String status,String email,double price){
        this.driverID = driverID;
        this.vehicleType = vehicleType;
        this.status = status;
        this.email = email;
        this.price = price;

        try{
            String sql = "UPDATE orders SET driverID = ?, vehicleType = ?, status = ? WHERE email = ? AND totalPrice = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, driverID);
            preparedStatement.setString(2, vehicleType);
            preparedStatement.setString(3, status);
            preparedStatement.setString(4, email);
            preparedStatement.setDouble(5, price);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }





    }



    @Override
    public ResultSet getSelectedBranchStoreDetails(String branchName) {
        return null;
    }

    @Override
    public void orderRemoveFromDatabase(String username, double orderAmount, String salesAgent) {

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
}
