package com.cdac.BookYourCookies.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int restaurantId;
	 
	  @Column(name = "restaurant_name")
	private String restaurantName;
	  
	  @Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", ownerName="
				+ ownerName + ", ownerEmailId=" + ownerEmailId + ", password=" + password + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", contactNumber=" + contactNumber + ", photo=" + photo
				+ ", noOfTables=" + noOfTables + ", tables=" + tables + "]";
	}

	@Column(name = "owner_name")
	private String ownerName;
	  
	  @Column(name = "owner_email_id")
	private String ownerEmailId;
	  
	private String password;
	private String address;
	private String city;
	private String state;
	
	  @Column(name = "contact_number")
	private String contactNumber;
	  
	  
	private String photo;
	
	  @Column(name = "no_of_tables")
	private int noOfTables;
	  
	  @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
	    private List<TablesEntity> tables;
//	  @OneToMany(mappedBy = "restaurant",cascade=CascadeType.ALL)
//	    private List<Booking> booking;

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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmailId() {
		return ownerEmailId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}
	

}
