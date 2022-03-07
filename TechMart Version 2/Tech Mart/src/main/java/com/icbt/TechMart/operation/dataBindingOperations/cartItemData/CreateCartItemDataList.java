package com.icbt.TechMart.operation.dataBindingOperations.cartItemData;

import com.icbt.TechMart.model.product.ProductInCart;
import com.icbt.TechMart.operation.dataBindingOperations.homePageData.CreateHomePageItemDataViewList;
import com.icbt.TechMart.operation.dataRepositoryOperations.DataRepositoryOperationFactory;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateCartItemDataList {
    private RepositoryOperation repositoryOperation;
    private String userID;
    public CreateCartItemDataList(String userID){
        this.userID = userID;
    }

    public ArrayList<ProductInCart> getItemDetailsOfCart(){

        repositoryOperation = (RepositoryOperation) new DataRepositoryOperationFactory("cartItemsData").getItemDataClass();
        ResultSet DataOfCartItems = (ResultSet) repositoryOperation.getCartItemDetails(userID);

        ArrayList<ProductInCart> list = new ArrayList<>();

        ProductInCart product;

        try {
            while(DataOfCartItems.next()){

                product = new ProductInCart(
                        DataOfCartItems.getString("userID"),
                        DataOfCartItems.getString("itemID"),
                        DataOfCartItems.getInt("quantity"),
                        DataOfCartItems.getString("date"),
                        DataOfCartItems.getString("itemName"),
                        DataOfCartItems.getString("mainCategory"),
                        DataOfCartItems.getString("subCategory"),
                        DataOfCartItems.getDouble("price"),
                        DataOfCartItems.getString("color"),
                        DataOfCartItems.getInt("inStockItem"),
                        DataOfCartItems.getString("warrantyTime"),
                        DataOfCartItems.getString("shortDescription"),
                        DataOfCartItems.getInt("rating"),
                        DataOfCartItems.getString("brand"),
                        DataOfCartItems.getString("imagePath")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateHomePageItemDataViewList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

}
