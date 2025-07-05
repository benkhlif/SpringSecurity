package com.benkhlif.springsecurity.repository;
 

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benkhlif.springsecurity.entities.Role;
import com.benkhlif.springsecurity.entities.User;
 
  
@Repository
public interface UserRepository extends JpaRepository<User, Long> { 

	List<User> findByRole(Role role);

    Optional<User> findByEmail(String email);

	boolean existsByEmail(String email);
	Optional<User> findByNom(String nom);
	}