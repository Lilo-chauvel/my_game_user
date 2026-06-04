package com.my_game_user.dao;

import com.my_game_user.entity.User;
import com.my_game_user.entity.database.UserEntity;
import com.my_game_user.repository.UserRepository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao implements UserDao {
    private UserRepository userRepository;

    public JpaUserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        userRepository.save(toEntity(user));
        return user;
    }


    public User getUserWithId(String id){
        Optional<UserEntity> myUserEntity = userRepository.findById(Integer.valueOf(id));

        if (myUserEntity.isEmpty()) {
            return null;
        }else{
            return toDomain(myUserEntity.get());
        }
    }    
    
    public Boolean isUserExist(String id){
        Optional<UserEntity> myUserEntity = userRepository.findById(Integer.valueOf(id));

        if (myUserEntity.isEmpty()) {
            return false;
        }else{
            return true;
        }
    };

    public User deleteUser(String id){
        Optional<UserEntity> myUserEntity = userRepository.findById(Integer.valueOf(id));

        if (myUserEntity.isEmpty()) {
            return null;
        }else{
            userRepository.delete(myUserEntity);
        }
        
        return toDomain(myUserEntity);
    };


    private UserEntity toEntity(User user) {
        UserEntity myUser = new UserEntity(user.getId(), user.getName(), user.getPassword().toString(), user.getRole(),
                user.getCreateAt(), user.getUpdateAt());
        return myUser;
    }

    private User toDomain(UserEntity userEntity){
        return new User(userEntity.getId(),userEntity.getName(),userEntity.getPassword(),userEntity.getRole());
    }
}
