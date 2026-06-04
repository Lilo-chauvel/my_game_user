package com.my_game_user.dao;

import org.springframework.stereotype.Service;

import com.my_game_user.entity.User;

@Service
public interface UserDao {
    public User create(User user);

    public User getUserWithId(String id);

    public Boolean isUserExist(String id);

    public User deleteUser(String id);
}