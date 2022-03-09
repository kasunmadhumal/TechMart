package com.icbt.TechMart.model.dataRepository;

import java.sql.Connection;

public interface DataRepository {
    void setDatabaseConnection();
    Connection getDatabaseConnection();

}
