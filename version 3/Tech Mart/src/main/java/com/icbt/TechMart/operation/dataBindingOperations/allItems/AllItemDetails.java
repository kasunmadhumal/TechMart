package com.icbt.TechMart.operation.dataBindingOperations.allItems;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.AdminsOperations.Operations.AdminOperations;
import com.icbt.TechMart.operation.AdminsOperations.Operations.RetrieveAllItemDetails;
import com.icbt.TechMart.operation.dataBindingOperations.selectedItemCategory.SelectedItemCategoryDetailList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllItemDetails {

    private ResultSet result;
    public AllItemDetails(){}

    public ArrayList<ProductImplementation> getItemDetails(){

        result = new RetrieveAllItemDetails().getStoreDetails();

        ArrayList<ProductImplementation> list = new ArrayList<>();

        ProductImplementation product;

        try {
            while(result.next()){

                product = new ProductImplementation(

                        result.getString("itemID"),
                        result.getString("itemName"),
                        result.getString("mainCategory"),
                        result.getString("subCategory"),
                        result.getDouble("price"),
                        result.getString("color"),
                        result.getInt("inStockItem"),
                        result.getString("warrantyTime"),
                        result.getString("shortDescription"),
                        result.getInt("rating"),
                        result.getString("brand"),
                        result.getString("imagePath")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger( AllItemDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
