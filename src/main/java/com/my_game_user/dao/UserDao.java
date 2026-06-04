package com.my_game_user.dao;

import org.springframework.stereotype.Service;

import com.my_game_user.entity.database.UserEntity;

@Service
public interface UserDao {
    public UserEntity create(UserEntity userEntity);

    public UserEntity getUserWithId(String id);

    public Boolean isUserExist(String id);

    public UserEntity deleteUser(String id);
}