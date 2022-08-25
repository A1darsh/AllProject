package com.zensar.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.manytomany.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
