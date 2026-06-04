package com.my_game_user.service;

import com.my_game_user.dto.UserDTO;
import com.my_game_user.dto.UserExposeDTO;

public interface UserServ {
    public UserExposeDTO createUser(UserDTO userDTO);

    public UserExposeDTO getUser(Integer id);

    public Boolean isUserExist(Integer id);

    public UserExposeDTO deleteUser(Integer id);
}
