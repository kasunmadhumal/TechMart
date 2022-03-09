package com.icbt.TechMart.operation.dataBindingOperations.selectedItemDetailsList;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AboutItemDetailList {
    private RepositoryOperation repositoryOperation;
    private String itemID;
    public AboutItemDetailList(String itemID){
        this.itemID = itemID;
    }

    public ArrayList<ProductImplementation> getSelectedItemDetailList(){

        repositoryOperation = (RepositoryOperation) new DataRepositoryOperationFactory("aboutItem").getItemDataClass();
        ResultSet selectedItemData = (ResultSet) repositoryOperation.getSelectedItemDetails(itemID);

        ArrayList<ProductImplementation> list = new ArrayList<>();

        ProductImplementation product;

        try {
            while(selectedItemData.next()){

                product = new ProductImplementation(

                        selectedItemData.getString("itemID"),
                        selectedItemData.getString("itemName"),
                        selectedItemData.getString("mainCategory"),
                        selectedItemData.getString("subCategory"),
                        selectedItemData.getDouble("price"),
                        selectedItemData.getString("color"),
                        selectedItemData.getInt("inStockItem"),
                        selectedItemData.getString("warrantyTime"),
                        selectedItemData.getString("shortDescription"),
                        selectedItemData.getInt("rating"),
                        selectedItemData.getString("brand"),
                        selectedItemData.getString("imagePath")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AboutItemDetailList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
