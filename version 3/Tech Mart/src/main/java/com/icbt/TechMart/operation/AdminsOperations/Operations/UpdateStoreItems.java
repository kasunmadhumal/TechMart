package com.icbt.TechMart.operation.AdminsOperations.Operations;

import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStoreItems {
    private String itemID;
    private int stockCount;
    private Connection connection;

    public UpdateStoreItems(){
        connection = new DataRepositoryFactory("MySQL").getConnection();
    }

    public void updateItemStoreCount(String itemID,int stockCount){
        this.itemID = itemID;
        this.stockCount = stockCount;

        try{
            String sql = "UPDATE items SET inStockItem = ? WHERE itemID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, stockCount);
            preparedStatement.setString(2, itemID);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }





    }
}
