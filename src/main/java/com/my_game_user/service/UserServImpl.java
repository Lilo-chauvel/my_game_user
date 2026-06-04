package com.my_game_user.service;

import com.my_game_user.dao.UserDao;
import com.my_game_user.dto.UserDTO;
import com.my_game_user.dto.UserExposeDTO;
import com.my_game_user.entity.database.UserEntity;
import com.my_game_user.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServImpl implements UserServ {
    private UserDao userDao;
    
    @Autowired
    private UserMapper mapper;
    

    public UserServImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserExposeDTO createUser(UserDTO userDTO) {
        UserEntity myUserEntity =  mapper.mapToEntity(userDTO);

        userDao.create(myUserEntity);

        return mapper.mapToExposeDTO(myUserEntity);
    }

    public UserExposeDTO getUser(String id) {
        return mapper.mapToExposeDTO(userDao.getUserWithId(id));
    }

    public Boolean isUserExist(String id) {
        return userDao.isUserExist(id);
    }

    public UserExposeDTO deleteUser(String id) {
        return mapper.mapToExposeDTO(userDao.deleteUser(id));
    }
}
