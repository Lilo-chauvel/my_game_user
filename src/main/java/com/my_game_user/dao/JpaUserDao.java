package com.my_game_user.dao;

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

    public UserEntity create(UserEntity userEntity) {
        userRepository.save(userEntity);
        return userEntity;
    }


    public UserEntity getUserWithId(String id){
        Optional<UserEntity> myUserEntity = userRepository.findById(Integer.valueOf(id));

        if (myUserEntity.isEmpty()) {
            return null;
        }else{
            return myUserEntity.get();
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

    public UserEntity deleteUser(String id){
        Optional<UserEntity> myUserEntity = userRepository.findById(Integer.valueOf(id));

        if (myUserEntity.isEmpty()) {
            return null;
        }else{
            userRepository.delete(myUserEntity.get());
        }

        return myUserEntity.get();
    };
}
