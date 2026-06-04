package com.my_game_user.service;

import com.my_game_user.dao.UserDao;
import com.my_game_user.dto.UserDTO;
import com.my_game_user.entity.User;

import org.springframework.stereotype.Service;

@Service
public class UserServImpl implements UserServ {
    private UserDao userDao;

    public UserServImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User createUser(UserDTO userDTO) {
        User myNewUser = userDTO.toUser();

        return userDao.create(myNewUser);
    }

    public User getUser(String id) {
        return userDao.getUserWithId(id);
    }

    public Boolean isUserExist(String id) {
        return userDao.isUserExist(id);
    }

    public User deleteUser(String id) {
        return userDao.deleteUser(id);
    }
}
