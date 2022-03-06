package com.icbt.TechMart.operation.dataRepositoryOperations;

import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.CartItemRetrieve;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RepositoryOperation;
import com.icbt.TechMart.operation.dataRepositoryOperations.repositoryOperations.RetrieveDataForHomePage;

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
        }

        return repositoryOperation;

    }
}
