package com.cdac.BookYourCookies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.BookYourCookies.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long>{

}