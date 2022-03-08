package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddNewSalesAgent {
    private String userName;
    private String password;
    private String branch;
    private Connection connection;

    public AddNewSalesAgent(String userName,String password,String branch){
        this.userName = userName;
        this.password = password;
        this.branch = branch;
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void addNewSalesAgent(){

        try {
            String sql = "INSERT INTO salesagent (userID,password,branch) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, branch);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }
    }

}
