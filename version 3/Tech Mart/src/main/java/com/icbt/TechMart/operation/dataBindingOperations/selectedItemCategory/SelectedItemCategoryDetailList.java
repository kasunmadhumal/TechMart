package com.icbt.TechMart.operation.dataBindingOperations.selectedItemCategory;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectedItemCategoryDetailList {
    private RepositoryOperation repositoryOperation;
    private String category;
    public SelectedItemCategoryDetailList(String category){
        this.category = category;
    }

    public ArrayList<ProductImplementation> getItemDetailsSelectedCategory(){

        repositoryOperation = (RepositoryOperation) new DataRepositoryOperationFactory("selectedCategory").getItemDataClass();
        ResultSet ItemDataForHomePage = (ResultSet) repositoryOperation.getSelectedItemDetails(category);

        ArrayList<ProductImplementation> list = new ArrayList<>();

        ProductImplementation product;

        try {
            while(ItemDataForHomePage.next()){

                product = new ProductImplementation(

                        ItemDataForHomePage.getString("itemID"),
                        ItemDataForHomePage.getString("itemName"),
                        ItemDataForHomePage.getString("mainCategory"),
                        ItemDataForHomePage.getString("subCategory"),
                        ItemDataForHomePage.getDouble("price"),
                        ItemDataForHomePage.getString("color"),
                        ItemDataForHomePage.getInt("inStockItem"),
                        ItemDataForHomePage.getString("warrantyTime"),
                        ItemDataForHomePage.getString("shortDescription"),
                        ItemDataForHomePage.getInt("rating"),
                        ItemDataForHomePage.getString("brand"),
                        ItemDataForHomePage.getString("imagePath")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectedItemCategoryDetailList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
