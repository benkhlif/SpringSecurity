package com.benkhlif.springsecurity.services;

 
import com.benkhlif.springsecurity.dto.SignupRequest;
import com.benkhlif.springsecurity.entities.User;
 
public interface AuthService {

	User createCustomer(SignupRequest signupRequest); }
