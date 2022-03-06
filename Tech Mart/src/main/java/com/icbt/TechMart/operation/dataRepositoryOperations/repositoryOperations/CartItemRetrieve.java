package com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class CartItemRetrieve implements RepositoryOperation {
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;

    public CartItemRetrieve(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    @Override
    public ResultSet getResults() {
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT cart.userID,cart.itemID,cart.quantity,cart.date,items.itemName,items.mainCategory,items.subCategory,items.price,items.color,items.inStockItem,items.warrantyTime,items.shortDescription,items.rating,items.brand,items.imagePath FROM cart INNER JOIN items ON cart.itemID = items.itemID WHERE userID ='mekhala@gmail.com'");
        }catch (SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return resultSet;
    }

}
