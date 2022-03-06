package com.icbt.TechMart.operation.dataBindingOperations.homePageData;

import com.icbt.TechMart.model.product.ProductImplementation;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateHomePageItemDataViewList {
    private RepositoryOperation repositoryOperation;

    public CreateHomePageItemDataViewList(){}

    public ArrayList<ProductImplementation> getItemDetailsToShowInHomePage(){

        repositoryOperation = (RepositoryOperation) new DataRepositoryOperationFactory("homePageView").getItemDataClass();
        ResultSet ItemDataForHomePage = (ResultSet) repositoryOperation.getResults();

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
            Logger.getLogger(CreateHomePageItemDataViewList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

}
