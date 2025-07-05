package com.benkhlif.springsecurity.services;

import java.util.Collections;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.benkhlif.springsecurity.repository.UserRepository;

 
@Service
public class UserServiceImpl implements UserDetailsService {

    private final UserRepository customerRepository;
    @Autowired

    public UserServiceImpl(UserRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
//cette methode recherche un utilisateur dans la base de données par son email.
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        com.benkhlif.springsecurity.entities.User customer = customerRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Customer not found with email: " + email));

        Set<GrantedAuthority> authorities = Collections.singleton(new SimpleGrantedAuthority(customer.getRole().name()));

        return new User(customer.getEmail(), customer.getPassword(), authorities);
    }
}