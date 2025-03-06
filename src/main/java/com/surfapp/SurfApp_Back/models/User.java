package com.surfapp.SurfApp_Back.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class User {

    @Id //Défini ma clef primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Générée automatiquement
    private Long id;

    private String username;
    private String password;

    // Constructeur


    public User(String username, String password) {
        this.username=username;
        this.password=password;

    }

    
}
