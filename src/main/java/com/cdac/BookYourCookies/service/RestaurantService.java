package com.cdac.BookYourCookies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cdac.BookYourCookies.entity.Restaurant;
import com.cdac.BookYourCookies.exception.RestaurantServiceException;
import com.cdac.BookYourCookies.repository.RestaurantRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class RestaurantService{

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public int register(Restaurant restaurant) throws RestaurantServiceException {
		//suppose we need to check if this restaurant has already registered before
		Optional<Restaurant> restaurantCheck = restaurantRepository.findByOwnerEmailId(restaurant.getOwnerEmailId());
		System.out.println("RestaurantCheck"+restaurantCheck);
		if(restaurantCheck.isEmpty()) {
			Restaurant savedRestaurant = restaurantRepository.save(restaurant);
			return savedRestaurant.getRestaurantId();
		}
		else
			throw new RestaurantServiceException("Restaurant already registered!");
	}

	public Restaurant login(String email, String password) throws RestaurantServiceException {
		Long count = restaurantRepository.findIfRestaurantIsPresent(email, password);
		if(count == 0)
			throw new RestaurantServiceException("Invalid Email/Password");
		else {
			return restaurantRepository.findByOwnerEmailId(email).get();
		}
	}

}
