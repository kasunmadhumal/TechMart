package com.icbt.TechMart.operation.dataBindingOperations.MyOrders;

import com.icbt.TechMart.model.orders.Orders;
import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateMyOrdersList {
    private RepositoryOperation repositoryOperation;
    private String userID;
    public CreateMyOrdersList(String userID){
        this.userID = userID;
    }

    public ArrayList<Orders> getMyOrders(){

        repositoryOperation = (RepositoryOperation) new DataRepositoryOperationFactory("retrieveMyOrders").getItemDataClass();
        ResultSet myOrdersList = (ResultSet) repositoryOperation.getSelectedItemDetails(userID);

        ArrayList<Orders> list = new ArrayList<>();

        Orders order;

        try {
            while(myOrdersList.next()){

                order = new Orders(

                        myOrdersList.getString("email"),
                        myOrdersList.getString("branch"),
                        myOrdersList.getString("items"),
                        myOrdersList.getDouble("totalPrice"),
                        myOrdersList.getString("date"),
                        myOrdersList.getString("driverID"),
                        myOrdersList.getString("vehicleType"),
                        myOrdersList.getString("status")

                );
                list.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateMyOrdersList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

}
