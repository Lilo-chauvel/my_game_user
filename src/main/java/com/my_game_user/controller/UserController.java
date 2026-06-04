package com.my_game_user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my_game_user.dto.UserDTO;
import com.my_game_user.dto.UserExposeDTO;
import com.my_game_user.service.UserServ;
import com.my_game_user.service.UserServImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    private final UserServ userServ;

    public UserController(UserServImpl userServ) {
        this.userServ = userServ;
    }

    @PostMapping("/users")
    public UserExposeDTO createUser(@RequestBody UserDTO userDTO) {
        return userServ.createUser(userDTO);
    }

    // GET /users/{id} — récupérer un utilisateur par son identifiant
    @GetMapping("/users/{id}")
    public UserExposeDTO getUser(@PathVariable Integer id) {
        return userServ.getUser(id);
    }

    // GET /users/{id}/valid — vérifier qu'un identifiant existe (cette route sera
    // appelée par l'app de jeux)
    @GetMapping("/users/{id}/valid")
    public Boolean isUserExist(@PathVariable Integer id) {
        return userServ.isUserExist(id);
    }

    // DELETE /users/{id} — supprimer un utilisateur
    @DeleteMapping("/users/{id}")
    public UserExposeDTO deleteUser(@PathVariable Integer id) {
        return userServ.deleteUser(id);
    }
}
