package com.zensar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.manytomany.entity.Course;
import com.zensar.manytomany.entity.Student;
import com.zensar.manytomany.repository.StudentRepository;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


		Student student1=null;
		Student student2=null;
		Course course1=null;
		Course course2=null;
		
		course1 = Course.builder().listStudents(Arrays.asList(student1, student2)).name("java").build();
		course2 = Course.builder().listStudents(Arrays.asList(student1, student2)).name("C++").build();

		student1 = Student.builder().name("govind").listCourses(Arrays.asList(course1, course2))
				.addrass("bamansuta").build();
		student2 = Student.builder().name("sheetal").listCourses(Arrays.asList(course1, course2))
				.addrass("badnawar").build();

		List<Student> list=new ArrayList<>();
		list.add(student1);
		list.add(student2);
		studentRepository.saveAll(list);
		
		

	}

}
