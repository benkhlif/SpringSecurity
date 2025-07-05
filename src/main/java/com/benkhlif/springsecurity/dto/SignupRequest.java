package com.benkhlif.springsecurity.dto;

import com.benkhlif.springsecurity.entities.Role;

public class SignupRequest {

    private String email;
    private String nom;

    private String password;
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private Role role;
 
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	 

 
}