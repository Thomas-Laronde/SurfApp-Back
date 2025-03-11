package com.surfapp.SurfApp_Back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.surfapp.SurfApp_Back.models.User;
import com.surfapp.SurfApp_Back.repositories.UserRepository;

@Service
public class UserService {
   
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Récupérer tous les utilisateurs
    public List <User> getAllUsers() {
        return userRepository.findAll();
    }

    // Récupérer un utilisateur par son ID
    public Optional<User> getUserById(Long id) { //c'est quoi Optional ?
        return userRepository.findById(id);
    }

    // Récupérer un utilisateur par son ID
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Créer un utilisateur
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Supprimer un utilisateur
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
