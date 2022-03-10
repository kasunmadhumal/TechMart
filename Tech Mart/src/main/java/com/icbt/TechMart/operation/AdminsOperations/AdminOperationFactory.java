package com.icbt.TechMart.operation.AdminsOperations;

import com.icbt.TechMart.operation.AdminsOperations.Operations.*;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.*;

public class AdminOperationFactory {
    private String parameter;
    private AdminOperations adminOperations;

    public AdminOperationFactory(String parameter){
        this.parameter = parameter;
    }

    public AdminOperations getItemDataClass(){
        if(parameter=="salesAgentBranch"){
            adminOperations = new BranchOfSalesAgent();
        }
        else if(parameter == "ordersInSalesAgentArea"){
            adminOperations = new OrdersInSalesAgentArea();
        }
        else if(parameter == "updateCustomerOrderDetails"){
            adminOperations = new UpdateCustomerOrderDetails();
        }else if(parameter == "orderRemoveFromDatabase"){
            adminOperations = new OrderRemoveFromDatabase();
        }else if(parameter == "updateStores"){
            adminOperations = new RetrieveSelectedBranchItemStoreData();
        }else if(parameter=="allCustomerOrders"){
            adminOperations = new AllCustomerOrders();
        }else if(parameter =="RetrieveAllSales"){
            adminOperations = new RetrieveAllSales();
        }else if(parameter == "addNewRequest"){
            adminOperations = new UpdateRequestTable();
        }


        return adminOperations;

    }
}
