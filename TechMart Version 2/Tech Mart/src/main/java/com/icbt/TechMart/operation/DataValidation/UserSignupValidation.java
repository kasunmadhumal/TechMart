package com.icbt.TechMart.operation.DataValidation;

public class UserSignupValidation {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    public UserSignupValidation(String firstName, String lastName,String email,String password,String confirmPassword){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password= password;
        this.confirmPassword = confirmPassword;
    }

    public int verifySignup(){
        if(password.equals(confirmPassword)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
