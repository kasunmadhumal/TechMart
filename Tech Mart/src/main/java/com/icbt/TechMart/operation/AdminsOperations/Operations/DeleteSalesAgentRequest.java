package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteSalesAgentRequest {
    private String salesagentID ;
    private String branch ;
    private String message ;
    private String date ;
    private Connection connection;

    public DeleteSalesAgentRequest(String salesagentID,String branch,String message,String date){
        this.salesagentID = salesagentID;
        this.branch = branch;
        this.message = message;
        this.date = date;
        connection = new DataRepositoryFactory("MySQL").getConnection();

    }

    public void deleteRequest(){

        try{


            String sql = "DELETE FROM requesttosupplier WHERE salesagentID= ? AND  branch = ? AND request = ? AND date = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, salesagentID);
            preparedStatement.setString(2, branch);
            preparedStatement.setString(3, message);
            preparedStatement.setString(4, date);

            preparedStatement.executeUpdate();



        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }

    }

}
