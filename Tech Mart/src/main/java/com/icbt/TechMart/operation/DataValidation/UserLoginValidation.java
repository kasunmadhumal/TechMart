package com.icbt.TechMart.operation.DataValidation;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;
import com.icbt.TechMart.operation.passwordEncryption.PasswordEncryption;

import java.sql.*;
import java.util.Arrays;

public class UserLoginValidation {
    private String userName;
    private String password;
    private Connection connection;
    private ResultSet resultSet;
    private String newPassword;
    private int State;
    public UserLoginValidation(String userName, String password){
        this.userName = userName;
        this.password = password;
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public int checkLoginValidation(){
        newPassword = new PasswordEncryption(password).getNewPassword();
        try{

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,newPassword );
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
