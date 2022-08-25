package com.zensar.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.onetoone.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
