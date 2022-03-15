package com.icbt.TechMart.operation.AdminsOperations.Operations;
import com.icbt.TechMart.model.dataRepository.DataRepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddNewItems implements AdminOperations{

    private String itemID;
    private String itemName;
    private String mainCategory;
    private String subCategory;
    private double price;
    private String color;
    private int inStockItem;
    private String warrantyTime;
    private String shortDescription;
    private int rating;
    private String brand;
    private String imagePath;
    private String branch;
    Connection connection;


    public AddNewItems(){
        connection = new DataRepositoryFactory("MySQL").getConnection();

    }

    public void addNewItem(String itemID,String itemName,String mainCategory,String subCategory,double price,String color,int inStockItem,
                           String warrantyTime,String shortDescription,int rating,String brand,String imagePath,String branch){
          this.itemID = itemID;
          this.itemName = itemName;
          this.mainCategory = mainCategory;
          this.subCategory = subCategory;
          this.price  = price;
          this.color = color;
          this.inStockItem = inStockItem;
          this.warrantyTime = warrantyTime;
          this.shortDescription = shortDescription ;
          this.rating = rating;
          this.brand = brand;
          this.imagePath = imagePath;
          this.branch = branch;

        try {
            String sql = "INSERT INTO items (itemID,itemName,mainCategory,subCategory,price,color,inStockItem,warrantyTime,shortDescription,rating,brand,imagePath,branch) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, itemID);
            preparedStatement.setString(2, itemName);
            preparedStatement.setString(3, mainCategory);
            preparedStatement.setString(4, subCategory);
            preparedStatement.setDouble(5,price);
            preparedStatement.setString(6, color);
            preparedStatement.setInt(7, inStockItem);
            preparedStatement.setString(8, warrantyTime);
            preparedStatement.setString(9, shortDescription);
            preparedStatement.setInt(10, rating);
            preparedStatement.setString(11, brand);
            preparedStatement.setString(12, imagePath);
            preparedStatement.setString(13, branch);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }


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
