package com.icbt.TechMart.operation.dataRepositoryOperations;

import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.*;

public class DataRepositoryOperationFactory {
    private String typeOfData;
    private RepositoryOperation repositoryOperation;

    public DataRepositoryOperationFactory(String typeOfData){
        this.typeOfData = typeOfData;
    }

    public RepositoryOperation getItemDataClass(){
        if(typeOfData=="homePageView"){
            repositoryOperation = new RetrieveDataForHomePage();
        }
        else if(typeOfData == "cartItemsData"){
            repositoryOperation = new CartItemRetrieve();
        }else if(typeOfData == "addUser"){
            repositoryOperation = new AddUserAccount();
        }else if(typeOfData == "aboutItem"){
            repositoryOperation = new SelectedItemDetails();
        }else if(typeOfData == "itemReview"){
            repositoryOperation = new ItemReviewData();
        }else if(typeOfData == "updateItemCountInCart"){
            repositoryOperation = new UpdateItemCount();
        }else if(typeOfData == "deleteCartItem"){
            repositoryOperation = new DeleteCartItem();
        }else if(typeOfData == "selectedCategory"){
            repositoryOperation = new RetriewITemDataForSelectedCategory();
        }else if(typeOfData == "makeOrder"){
            repositoryOperation = new UpdateOrders();
        }else if(typeOfData == "retrieveMyOrders"){
            repositoryOperation = new RetrieveMyOrders();
        }


        return repositoryOperation;

    }
}
