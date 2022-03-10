package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateRequestTable implements AdminOperations{
    private String salesAgentID;
    private String branch;
    private String message;
    private Connection connection;

    public UpdateRequestTable(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void update(String salesAgentID,String branch,String message){
        this.salesAgentID = salesAgentID;
        this.branch = branch;
        this.message = message;

        try {
            String sql = "INSERT INTO requesttosupplier (salesagentID,branch,request) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,salesAgentID);
            preparedStatement.setString(2, branch);
            preparedStatement.setString(3, message);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }
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
}
