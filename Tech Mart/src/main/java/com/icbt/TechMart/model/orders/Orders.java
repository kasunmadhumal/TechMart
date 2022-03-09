package com.icbt.TechMart.model.orders;

public class Orders {
    private String email;
    private String branch;
    private String items;
    private double totalPrice;
    private String date;
    private String driverID;
    private String vehicleType;
    private String status;

    public Orders(String email,String branch,String items,double totalPrice,String date,String driverID,String vehicleType,String status){
        this.email = email;
        this.branch = branch;
        this.items = items;
        this.totalPrice = totalPrice;
        this.date = date;
        this.driverID = driverID;
        this.vehicleType = vehicleType;
        this.status = status;
    }

    public String getEmail(){return email;}
    public String getBranch(){return branch;}
    public String getItems(){return items;}
    public double getTotalPrice(){return totalPrice;}
    public String getDate(){return date;}
    public String getDriverID(){return driverID;}
    public String getVehicleType(){return vehicleType;}
    public String getStatus(){return status;}

}
