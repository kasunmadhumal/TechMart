package com.icbt.TechMart.operation.AdminsOperations.Operations;

import java.sql.ResultSet;

public interface AdminOperations {
    String getBranchOfSalesAgent(String userName);
    ResultSet getSalesAgentAreaOrdersList(String branch);
    void updateCustomerOrder(String driverID,String vehicleType,String status,String email,double price);
    ResultSet getSelectedBranchStoreDetails(String branchName);
    void orderRemoveFromDatabase(String username,double orderAmount,String salesAgent);
    ResultSet allCustomerOrders();
    void update(String salesAgentID,String branch,String message);
}
