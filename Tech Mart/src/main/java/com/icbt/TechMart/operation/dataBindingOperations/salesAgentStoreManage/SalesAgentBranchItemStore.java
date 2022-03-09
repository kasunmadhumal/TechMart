package com.icbt.TechMart.operation.dataBindingOperations.salesAgentStoreManage;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.AdminsOperations.AdminOperationFactory;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;
import com.icbt.TechMart.operation.dataBindingOperations.selectedItemCategory.SelectedItemCategoryDetailList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesAgentBranchItemStore {
    private AdminOperations repositoryOperation;
    private String category;
    public SalesAgentBranchItemStore(String category){
        this.category = category;
    }

    public ArrayList<ProductImplementation> getItemDetailsSelectedCategory(){

        repositoryOperation =  new AdminOperationFactory("updateStores").getItemDataClass();
        ResultSet branchStoreData = repositoryOperation.getSelectedBranchStoreDetails(category);

        ArrayList<ProductImplementation> list = new ArrayList<>();

        ProductImplementation product;

        try {
            while(branchStoreData.next()){

                product = new ProductImplementation(

                        branchStoreData.getString("itemID"),
                        branchStoreData.getString("itemName"),
                        branchStoreData.getString("mainCategory"),
                        branchStoreData.getString("subCategory"),
                        branchStoreData.getDouble("price"),
                        branchStoreData.getString("color"),
                        branchStoreData.getInt("inStockItem"),
                        branchStoreData.getString("warrantyTime"),
                        branchStoreData.getString("shortDescription"),
                        branchStoreData.getInt("rating"),
                        branchStoreData.getString("brand"),
                        branchStoreData.getString("imagePath")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesAgentBranchItemStore.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
