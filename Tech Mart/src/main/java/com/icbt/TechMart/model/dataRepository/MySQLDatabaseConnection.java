package com.icbt.TechMart.model.dataRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabaseConnection implements DataRepository{
    private final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/techmart";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "";
    private Connection conn;

    public MySQLDatabaseConnection(){
        setDatabaseConnection();
    }


    @Override
    public void setDatabaseConnection() {
        try {
            Class.forName(this.DB_DRIVER);
            conn = DriverManager.getConnection(this.DB_URL, this.DB_USERNAME, this.DB_PASSWORD);


        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("db connection error");
        }

    }


    @Override
    public Connection getDatabaseConnection() {

        return conn;
    }




}
