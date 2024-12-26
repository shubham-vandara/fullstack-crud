package com.example.frontcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.frontcrud.entities.FrontUser;

@Repository
public interface FrontUserRepository extends JpaRepository<FrontUser, Integer> {
}
