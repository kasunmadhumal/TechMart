package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class RetrieveAllSales implements AdminOperations{

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;

    public RetrieveAllSales(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }


    public ResultSet allCustomerOrders() {

        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM transaction");
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return resultSet;
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

    @Override
    public ResultSet getSelectedBranchStoreDetails(String branchName) {
        return null;
    }

    @Override
    public void orderRemoveFromDatabase(String username, double orderAmount, String salesAgent) {

    }
}
