package com.example.frontcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.frontcrud.entities.FrontUser;
import com.example.frontcrud.repository.FrontUserRepository;

@Service
public class FrontUserServiceImpl implements FrontUserService {

	@Autowired
	private FrontUserRepository frontUserRepository;

	// Fetch all users
	@Override
	public List<FrontUser> getAllFrontUser() {
		return frontUserRepository.findAll();
	}

	// Delete a user by ID
	@Override
	public void deleteFrontUser(Integer id) {
		frontUserRepository.deleteById(id);
	}

	// Add or update a user in the database
	@Override
	public FrontUser saveFrontUser(FrontUser user) {
		return frontUserRepository.save(user);
	}

	// Fetch a user by ID
	@Override
	public Optional<FrontUser> getFrontUserById(Integer id) {
		return frontUserRepository.findById(id);
	}
	
	@Override
	public List<FrontUser> saveAllFrontUser(List<FrontUser> user) {
		return frontUserRepository.saveAll(user);
	}
}
