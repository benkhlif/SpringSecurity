package com.benkhlif.springsecurity.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benkhlif.springsecurity.dto.SignupRequest;
import com.benkhlif.springsecurity.entities.User;
import com.benkhlif.springsecurity.services.AuthService;
  

@RestController
@RequestMapping("/signup")
public class SignupController {
    private final AuthService authService;
 
    public SignupController(AuthService authService ) {
        this.authService = authService;
     }

    @PostMapping
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest) {
        // Créer un compte avec un mot de passe temporaire
        User createdCustomer = authService.createCustomer(signupRequest);

        if (createdCustomer != null) {
 
            // Récupérer le mot de passe temporaire généré
            String temporaryPassword = createdCustomer.getPassword(); 
 

            return ResponseEntity.status(HttpStatus.CREATED).body("Compte créé avec succès et email envoyé !");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Échec de la création du compte");
        }
    }
}

