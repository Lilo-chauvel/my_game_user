package com.my_game_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my_game_user.entity.database.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    
} 