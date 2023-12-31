package com.cdac.BookYourCookies.controller;

import com.cdac.BookYourCookies.dto.RestaurantLoginDetails;
import com.cdac.BookYourCookies.dto.RestaurantLoginStatus;
import com.cdac.BookYourCookies.dto.Status;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.BookYourCookies.service.RestaurantService;
import com.cdac.BookYourCookies.dto.RegistrationStatusRestaurant;
import com.cdac.BookYourCookies.entity.Restaurant;
import com.cdac.BookYourCookies.exception.RestaurantServiceException;
@CrossOrigin
@RestController
@RequestMapping("api/v1/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	
	Logger logger = LoggerFactory.getLogger(RestaurantController.class);
	
	@PostMapping("/register")
	public RegistrationStatusRestaurant register(@RequestBody Restaurant restaurant) {
		logger.info("Processing request to register the restaurant data {}",restaurant);
		try {
			int id = restaurantService.register(restaurant);
			
			RegistrationStatusRestaurant status = new RegistrationStatusRestaurant();
			status.setStatus(true);
			status.setStatusMessage("Customer registered successfully!");
			status.setRestaurantId(id);
			return status;
		}
		catch (RestaurantServiceException e) {
			RegistrationStatusRestaurant status = new RegistrationStatusRestaurant();
			status.setStatus(false);
			status.setStatusMessage(e.getMessage());
			return status;			
		}
	}


	@PostMapping("/login")
	public Status login(@RequestBody RestaurantLoginDetails loginDetails) {
		logger.info("Processing request to login the restaurant data {}",loginDetails);
		try {
			Restaurant restaurant = restaurantService.login(loginDetails.getOwnerEmailId(), loginDetails.getPassword());

			RestaurantLoginStatus status = new RestaurantLoginStatus();
			status.setStatus(true);
			status.setMessageIfAny("Restaurant Login successful!");
			status.setRestaurantId(restaurant.getRestaurantId());
			status.setRestaurantName(restaurant.getRestaurantName());
			//status.setCustomer(customer);
			return status;
		}
		catch (RestaurantServiceException e) {
			Status status = new Status();
			status.setStatus(false);
			status.setMessageIfAny(e.getMessage());
			return status;
		}
	}

}
