package com.icbt.TechMart.model.product;

public class ProductInCart extends Product{

    String userID;
    int quantity;
    String date;
    public ProductInCart(String userID,String itemID,int quantity,String Date, String itemName, String mainCategory, String subCategory, double prize, String color, int inStockItems,
                                 String warrantyTime, String shortDescription, int rating, String brand, String imagePath) {
        this.userID = userID;
        this.quantity = quantity;
        this.date = Date;
        this.itemID = itemID;
        this.itemName = itemName;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.prize = prize;
        this.color = color;
        this.inStockItems = inStockItems;
        this.warrantyTime = warrantyTime;
        this.shortDescription = shortDescription;
        this.rating = rating;
        this.brand = brand;
        this.imagePath = imagePath;
    }

    public String getUserID(){return userID;}
    public int getQuantity(){return quantity;}
    public String getDate(){return date;}
}
