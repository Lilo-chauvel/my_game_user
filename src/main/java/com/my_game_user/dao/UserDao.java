package com.my_game_user.dao;

import com.my_game_user.entity.database.UserEntity;

public interface UserDao {
    public UserEntity create(UserEntity userEntity);

    public UserEntity getUserWithId(Integer id);

    public Boolean isUserExist(Integer id);

    public UserEntity deleteUser(Integer id);
}