package com.cdac.BookYourCookies.dto;

public class RestaurantLoginDetails {
    private String ownerEmailId;
    private String password;

    public String getOwnerEmailId() {
        return ownerEmailId;
    }

    @Override
    public String toString() {
        return "RestaurantLoginDetails{" +
                "ownerEmailId='" + ownerEmailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setOwnerEmailId(String ownerEmailId) {
        this.ownerEmailId = ownerEmailId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
