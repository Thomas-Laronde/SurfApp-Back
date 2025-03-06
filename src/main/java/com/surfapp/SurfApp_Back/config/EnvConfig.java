package com.surfapp.SurfApp_Back.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    @Bean
    public void loadEnv() {
        // Charge le fichier .env
        Dotenv dotenv = Dotenv.load();
        
        // Récupère les variables
        String dbUsername = dotenv.get("DB_USERNAME");
        String dbPassword = dotenv.get("DB_PASSWORD");
        String dbUrl = dotenv.get("DB_URL");

        // Configuration de Spring Boot (cela dépend si tu veux l'ajouter ici ou dans application.properties)
        System.setProperty("DB_USERNAME", dbUsername);
        System.setProperty("DB_PASSWORD", dbPassword);
        System.setProperty("DB_URL", dbUrl);
        
        // Éviter d'afficher le mot de passe dans les logs !
        System.out.println("Database Username: " + dbUsername);
    }
}