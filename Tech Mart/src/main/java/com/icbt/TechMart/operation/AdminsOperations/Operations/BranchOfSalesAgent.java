package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BranchOfSalesAgent implements AdminOperations{

    private String userName;
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private String branch;

    public BranchOfSalesAgent(){

        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public String getBranchOfSalesAgent(String userName) {
        this.userName = userName;

            try{
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT branch FROM salesagent WHERE userID = '"+userName+"'");
                while(resultSet.next()){
                    branch = resultSet.getString("branch");
                }

            }catch (SQLException e){
                System.out.println(Arrays.toString(e.getStackTrace()));
            }




            return branch;


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

    @Override
    public void update(String salesAgentID, String branch, String message) {

    }
}
