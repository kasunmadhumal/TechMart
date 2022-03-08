package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddNewReview {
    private String itemID;
    private String userID;
    private String comment;
    private int rating;
    private Connection connection;

    public AddNewReview(String itemID,String userID,String comment,int rating){
        this.itemID = itemID;
        this.userID = userID;
        this.comment = comment;
        this.rating = rating;
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void addNewUserComment(){
        try {
            String sql = "INSERT INTO review (userID,itemID,discription,rating) VALUES (?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userID);
            preparedStatement.setString(2, itemID);
            preparedStatement.setString(3, comment);
            preparedStatement.setInt(4,rating);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }
    }
}
