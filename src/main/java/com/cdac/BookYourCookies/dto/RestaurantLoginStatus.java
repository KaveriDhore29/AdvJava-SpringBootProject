package com.cdac.BookYourCookies.dto;

public class RestaurantLoginStatus extends Status {
    private int restaurantId;
    private String restaurantName;

    public int getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
