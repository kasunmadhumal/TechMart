package com.icbt.TechMart.operation.DataValidation;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class SupplierLoginValidation {
    private String username;
    private String password;
    private Connection connection;
    private ResultSet resultSet;
    private int State;

    public SupplierLoginValidation(String username,String password){
        this.username = username;
        this.password = password;
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public int checkLoginValidation(){

        try{

            String sql = "SELECT * FROM suppliers WHERE userID=? AND password=?";
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password );
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                State =  1;
            }
            else{

                State =  0;

            }

        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return State;

    }

}
