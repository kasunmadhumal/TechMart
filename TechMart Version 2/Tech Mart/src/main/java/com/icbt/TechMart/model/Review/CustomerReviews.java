package com.icbt.TechMart.model.Review;

public class CustomerReviews {
    private String userID;
    private String itemID;
    private String description;
    private int rating;

    public CustomerReviews(String userID, String itemID, String description, int rating){
        this.userID = userID;
        this.itemID = itemID;
        this.description = description;
        this.rating = rating;
    }

    public String getUserID(){return userID;}
    public String getItemID(){return itemID;}
    public String getDescription(){return description;}
    public int getRating(){return rating;}

}
