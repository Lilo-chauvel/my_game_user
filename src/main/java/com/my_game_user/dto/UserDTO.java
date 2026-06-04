package com.my_game_user.dto;

import org.springframework.data.annotation.Id;

import com.my_game_user.entity.User;

public class UserDTO {
    @Id
    private int id;
    private String name;
    private String password;
    private String role;

    public UserDTO(int id, String name, String password, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public User toUser() {
        return new User(this.id, this.name, this.password, this.role);
    }
}
