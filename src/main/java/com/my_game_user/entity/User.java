package com.my_game_user.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private int id;
    private String name;
    private String password;
    private String role;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public User(int id, String name, String password, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    public User(int id, String name, String password, String role, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public void UpdateTime() {
        this.updateAt = LocalDateTime.now();
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

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

}