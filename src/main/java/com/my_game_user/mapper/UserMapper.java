package com.my_game_user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.my_game_user.dto.UserDTO;
import com.my_game_user.dto.UserExposeDTO;
import com.my_game_user.entity.User;
import com.my_game_user.entity.database.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "role", source = "role")
    @Mapping(target = "createAt", source = "createAt")
    @Mapping(target = "updateAt", source = "updateAt")
    public User mapToUser(UserEntity userEntity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "role", source = "role")
    @Mapping(target = "createAt", source = "createAt")
    @Mapping(target = "updateAt", source = "updateAt")
    public UserEntity mapToEntity(User user);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "role", source = "role")
    public UserExposeDTO mapToExposeDTO(User user);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "role", source = "role")
    default UserEntity mapToEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }

        return new UserEntity(
                userDTO.getId(),
                userDTO.getName(),
                userDTO.getPassword(),
                userDTO.getRole());
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "role", source = "role")
    public UserExposeDTO mapToExposeDTO(UserEntity userEntity);
}