package com.cdac.BookYourCookies.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private int bookingId;

    public int getBookingId() {
    	
		return bookingId;
		
		
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

//	public Restaurant getRestaurant() {
//		return restaurant;
//	}
//
//	public void setRestaurant(Restaurant restaurant) {
//		this.restaurant = restaurant;
//	}

	public TablesEntity getTable() {
		return table;
	}

	public void setTable(TablesEntity table) {
		this.table = table;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerId")
    private Customer customer;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "restaurantId")
//    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tableId")
    private TablesEntity table;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    @Column(name = "booking_date")
    private String bookingDate;
    
   

    // Constructors, getters, and setters...

    public Booking() {
    }

    public Booking(Customer customer, Restaurant restaurant, TablesEntity table, LocalDateTime bookingTime, String bookingDate) {
        this.customer = customer;
//        this.restaurant = restaurant;
        this.table = table;
        this.bookingTime = bookingTime;
        this.bookingDate = bookingDate;
    }

    
}
