package com.my_game_user.dto;

public class UserExposeDTO {
    private int id;
    private String name;
    private String role;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public UserExposeDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
