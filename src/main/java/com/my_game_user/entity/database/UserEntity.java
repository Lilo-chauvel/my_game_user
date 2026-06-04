package com.my_game_user.entity.database;

import java.time.LocalDateTime;

import com.my_game_user.entity.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private int id;
    private String name;
    private String password;
    private String role;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    protected UserEntity() {
    }

    public UserEntity(int id, String name, String password, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    public UserEntity(int id, String name, String password, String role, LocalDateTime createAt,
            LocalDateTime updateAt) {
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

    public User toDomain() {
        return new User(this.id, this.name, this.password, this.role, this.createAt, this.updateAt);
    }
}
