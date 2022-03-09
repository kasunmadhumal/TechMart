package com.icbt.TechMart.model.dataRepository;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySQLDatabaseConnectionTest {

    @org.junit.Test
    public void getDatabaseConnection() {

            Connection con = new MySQLDatabaseConnection().getDatabaseConnection();
            assertEquals(con!=null,true);

    }
}