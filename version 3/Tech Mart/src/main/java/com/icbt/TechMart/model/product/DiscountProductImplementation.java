package com.icbt.TechMart.model.product;


public class DiscountProductImplementation extends Product {
    private double discount;

    public DiscountProductImplementation(String itemID, String itemName, String mainCategory, String subCategory, double prize, String color, int inStockItems,
                                 String warrantyTime, String shortDescription, int rating, String brand, String imagePath) {

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

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount() {

    }

}
