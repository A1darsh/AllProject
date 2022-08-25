package com.zensar.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.onetomany.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
