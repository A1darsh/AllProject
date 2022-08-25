package com.zensar.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.login.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long>{

	
	
}
