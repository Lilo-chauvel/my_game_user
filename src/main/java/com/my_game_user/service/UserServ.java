package com.my_game_user.service;

import com.my_game_user.dto.UserDTO;
import com.my_game_user.entity.User;

public interface UserServ {
    public User createUser(UserDTO userDTO);

}
