package com.icbt.TechMart.model.users;

public class Admin implements User{
    private String userName;
    private String password;
    private String branch;

    public Admin(String userName,String password,String branch){
        this.userName = userName;
        this.password = password;
        this.branch =  branch;
    }


    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getBranch(){
        return branch;
    }


}
