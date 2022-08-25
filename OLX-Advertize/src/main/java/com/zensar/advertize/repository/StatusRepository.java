package com.zensar.advertize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.advertize.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer>{

}
