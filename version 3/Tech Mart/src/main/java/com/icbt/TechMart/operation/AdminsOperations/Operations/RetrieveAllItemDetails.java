package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class RetrieveAllItemDetails {

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;

    public RetrieveAllItemDetails(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public ResultSet getStoreDetails() {

        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM items ");
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return resultSet;
    }
}
