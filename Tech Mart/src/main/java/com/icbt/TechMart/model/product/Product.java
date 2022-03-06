package com.icbt.TechMart.model.product;


public class Product {
    String itemID;
    String itemName;
    String mainCategory;
    String subCategory;
    double prize;
    String color;
    int inStockItems;
    String warrantyTime;
    String shortDescription;
    int rating;
    String brand;
    String imagePath;

    public Product() {
    }

    public String getItemID(){return itemID;}
    public String getItemName(){return  itemName;}
    public String getMainCategory(){return mainCategory;}
    public String getSubCategory(){return subCategory;}
    public String getColor(){return color;}
    public String getWarrantyTime(){return warrantyTime;}
    public String getShortDescription(){return shortDescription;}
    public String getBrand(){return brand;}
    public String getImagePath(){return imagePath;}
    public int getInStockItems(){return inStockItems;}
    public int getRating(){return rating;}
    public double getPrize(){return prize;}


}
