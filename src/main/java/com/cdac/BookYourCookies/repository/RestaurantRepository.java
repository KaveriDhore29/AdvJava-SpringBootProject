package com.cdac.BookYourCookies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.BookYourCookies.entity.Restaurant;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>{


	@Query("select count(r) from Restaurant r where r.ownerEmailId = ?1")
	public Long findIfRestaurantExists(String email);

	@Query("select count(r) from Restaurant r where r.ownerEmailId = ?1 and r.password = ?2")
	public Long findIfRestaurantIsPresent(String email, String password);

	public Optional<Restaurant> findByOwnerEmailId(String email);
	public Optional<Restaurant> findByOwnerEmailIdAndPassword(String email, String password);
	public Optional<Restaurant> findByRestaurantId(int id);


}