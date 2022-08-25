package com.zensar.stockapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.stockapplication.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	List<UserEntity> findByUsername(String username);

}
