package com.zensar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.onetomany.entity.Comment;
import com.zensar.onetomany.entity.Post;
import com.zensar.onetomany.repository.PostRepository;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Post post=null;
		
		List<Comment> list=null;
		
		list=new ArrayList<>();
		
		post=Post.builder().title("sjfjksh").descreption("slfksjfsksdlk").comments(list).build();
		
		list.add(Comment.builder().text("sfhksjdhkfk").build());
		list.add(Comment.builder().text("sfhksjk").build());
		list.add(Comment.builder().text("dhkfk").build());
		
		postRepository.save(post);
	}

}
