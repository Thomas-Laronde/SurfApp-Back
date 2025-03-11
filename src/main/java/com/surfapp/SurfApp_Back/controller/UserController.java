package com.surfapp.SurfApp_Back.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surfapp.SurfApp_Back.models.User;
import com.surfapp.SurfApp_Back.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    // Créer un nouvel utilisateur
    @PostMapping("/create")
   public User createUser(@RequestBody User user) {
    return userService.createUser(user);
   }
    
    // Trouver un utilisateur par son nom d'utilisateur
   @GetMapping("/find/{username}")
   public User findUserByUserName(@PathVariable String username) {
    return userService.findUserByUsername(username)
                        .orElseThrow(()-> new RuntimeException("User not found"));
   }
    // Mettre à jour un nouvel utilisateur
   @PutMapping("path/{id}")
   public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
       
       User existingUser = userService.getUserById(id)
                        .orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setPassword(updatedUser.getPassword());    
        
        return userService.createUser(existingUser);
   }

    // Supprimer un nouvel utilisateur


    // Avoir tout les utilisateurs


}
