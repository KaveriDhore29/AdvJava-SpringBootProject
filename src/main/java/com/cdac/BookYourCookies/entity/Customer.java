package com.cdac.BookYourCookies.entity;

import java.util.List;

import jakarta.persistence.*;


@Entity
	@Table(name = "customer")
	public class Customer {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	    private int customerId;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "password")
	    private String password;

	    @Column(name = "phone_number")
	    private String phoneNumber;

	    @Column(name = "date_of_birth")
	    private String dateOfBirth;

	    @Column(name = "gender")
	    private String gender;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "state")
	    private String state;

	    @Column(name = "pincode")
	    private String pincode;

	    @Column(name = "photo")
	    private String photo;
	    
	    @OneToMany(mappedBy = "customer")
	    private List<Booking> booking;


	   

	    public Customer() {
	    }

	    public Customer(String name, String email, String password, String phoneNumber, String dateOfBirth, String gender,
	                    String address, String city, String state, String pincode, String photo) {
	        this.name = name;
	        this.email = email;
	        this.password = password;
	        this.phoneNumber = phoneNumber;
	        this.dateOfBirth = dateOfBirth;
	        this.gender = gender;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.pincode = pincode;
	        this.photo = photo;
	    }

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
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

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}
            
	    
	  
	}




