package com.my_game_user.service;

import com.my_game_user.dto.UserDTO;
import com.my_game_user.dto.UserExposeDTO;

public interface UserServ {
    public UserExposeDTO createUser(UserDTO userDTO);

    public UserExposeDTO getUser(String id);

    public Boolean isUserExist(String id);

    public UserExposeDTO deleteUser(String id);
}
