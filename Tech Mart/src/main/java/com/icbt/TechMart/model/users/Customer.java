package com.icbt.TechMart.model.users;

public class Customer implements User{
    private String userName;
    private String password;

    public Customer(String userName,String password){
        this.password = password;
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
