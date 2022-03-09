package com.icbt.TechMart.model.users;

public class SalesAgent implements User{
    private String userName;
    private String password;
    private String branch;

    public SalesAgent(String userName,String password,String branch){
        this.userName = userName;
        this.password = password;
        this.branch = branch;
    }

    public String branch(){
        return branch;
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
