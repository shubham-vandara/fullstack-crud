package com.example.frontcrud.service;

import java.util.List;
import java.util.Optional;

import com.example.frontcrud.entities.FrontUser;

public interface FrontUserService {

	// Get all users
	List<FrontUser> getAllFrontUser();

	// Get a user by ID
	Optional<FrontUser> getFrontUserById(Integer id);

	// Delete a user by ID
	void deleteFrontUser(Integer id);

	// Add or update a user in the database
	FrontUser saveFrontUser(FrontUser user);

	// Add Multiple users
	List<FrontUser> saveAllFrontUser(List<FrontUser> user);
}
