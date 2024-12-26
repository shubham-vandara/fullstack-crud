package com.example.frontcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frontcrud.entities.FrontUser;
import com.example.frontcrud.service.FrontUserServiceImpl;

@RestController
@RequestMapping("/frontUser")
public class FrontUserController {

    @Autowired
    private FrontUserServiceImpl frontUserService;

    // Fetch all FrontUser entities
    @GetMapping
    public List<FrontUser> getAllFrontUser() {
        return frontUserService.getAllFrontUser();
    }

    // Fetch a specific FrontUser by ID
    @GetMapping("/{id}")
    public Optional<FrontUser> getFrontUserById(@PathVariable Integer id) {
        return frontUserService.getFrontUserById(id);
    }

    // Create a new FrontUser entity
    @PostMapping
    public FrontUser createUser(@RequestBody FrontUser user) {
        return frontUserService.saveFrontUser(user);
    }

    // Create a new FrontUser entity
    @PostMapping("/addUsers")
    public List<FrontUser> createAllUser(@RequestBody List<FrontUser> user) {
        return frontUserService.saveAllFrontUser(user);
    }

    // Update an existing FrontUser entity
    @PutMapping("/{id}")
    public FrontUser updateUser(@PathVariable Integer id, @RequestBody FrontUser user) {
        user.setId(id);
        return frontUserService.saveFrontUser(user);
    }

    // Delete a FrontUser entity
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        frontUserService.deleteFrontUser(id);
    }

    // Return a blank FrontUser object (example method)
    private final FrontUser frontUser = new FrontUser();

    @GetMapping("/getObject")
    public FrontUser getUserObject() {
        return frontUser;
    }
}
