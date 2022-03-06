package com.icbt.TechMart.model.dataRepository;

import java.sql.Connection;

public class DataRepositoryFactory {
    private String databaseType;
    private Connection connection;

    public DataRepositoryFactory(String databaseType){
        this.databaseType = databaseType;
    }

    public Connection getConnection(){
        if(databaseType == "MySQL"){
               connection = new MySQLDatabaseConnection().getDatabaseConnection();
        }
        return connection;
    }
}
