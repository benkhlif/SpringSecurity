package com.benkhlif.springsecurity.services;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.benkhlif.springsecurity.dto.SignupRequest;
import com.benkhlif.springsecurity.entities.User;
import com.benkhlif.springsecurity.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserRepository customerRepository, PasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    // Méthode pour créer un nouvel utilisateur (Customer) à partir d'une requête d'inscription (SignupRequest)
    public User createCustomer(SignupRequest signupRequest) {
        if (customerRepository.existsByEmail(signupRequest.getEmail())) {
            return null;
        }

        User customer = new User();
        BeanUtils.copyProperties(signupRequest, customer);
        String hashPassword = passwordEncoder.encode(signupRequest.getPassword());
        customer.setPassword(hashPassword);
 

        return customerRepository.save(customer);
    }
}