🔐 Spring Security - Gestion d'authentification et d'inscription

Ce projet est une API backend construite avec **Spring Boot** et **Spring Security**, permettant la gestion des utilisateurs, l'inscription (signup) avec mot de passe temporaire, et la sécurisation des endpoints via JWT.

## 🚀 Fonctionnalités

- Création de comptes utilisateurs avec mot de passe temporaire
- Authentification sécurisée avec JWT
- Architecture RESTful
- Validation des données à l'inscription
- Gestion des rôles et permissions

## 🛠️ Technologies utilisées

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Maven
- Lombok
- JPA / Hibernate
- MySQL  
## 📦 Structure du projet

com.benkhlif.springsecurity
├── controllers # Contrôleurs REST (SignupController)
├── services # Interface AuthService et son implémentation
├── entities # Modèle de données (User, Role, etc.)
├── dto # Objets de transfert de données (SignupRequest)
└── SpringSecurityApplication.java # Classe principale


## 📸 Démonstration

### Inscription  
![Inscription](https://github.com/user-attachments/assets/7581ac07-d14f-4803-9a32-30f232082aa6)

### Login  
![Login](https://github.com/user-attachments/assets/d282df2b-8e80-4975-8d9f-62fc068814e1)

