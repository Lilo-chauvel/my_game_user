package com.my_game_user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my_game_user.dto.UserDTO;
import com.my_game_user.entity.User;
import com.my_game_user.service.UserServImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    private final UserServImpl userServImpl;

    public UserController(UserServImpl userServImpl) {
        this.userServImpl = userServImpl;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody UserDTO userDTO) {
        return userServImpl.createUser(userDTO);
    }

    // GET /users/{id} — récupérer un utilisateur par son identifiant
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return userServImpl.getUser(id);
    }

    // GET /users/{id}/valid — vérifier qu'un identifiant existe (cette route sera
    // appelée par l'app de jeux)
    @GetMapping("/users/{id}/valid")
    public Boolean isUserExist(@PathVariable String id) {
        return userServImpl.isUserExist(id);
    }

    // DELETE /users/{id} — supprimer un utilisateur
    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable String id){
        return userServImpl.deleteUser(id);
    }
}
