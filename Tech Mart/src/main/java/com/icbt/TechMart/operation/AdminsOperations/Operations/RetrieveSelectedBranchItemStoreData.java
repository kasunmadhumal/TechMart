package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class RetrieveSelectedBranchItemStoreData implements AdminOperations {
    private String branchName ;
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;

    public RetrieveSelectedBranchItemStoreData(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }



    @Override
    public ResultSet getSelectedBranchStoreDetails(String branchName) {
        this.branchName = branchName;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM items WHERE branch = '"+branchName+"'");
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return resultSet;
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

    @Override
    public void updateCustomerOrder(String driverID, String vehicleType, String status, String email, double price) {

    }


}
