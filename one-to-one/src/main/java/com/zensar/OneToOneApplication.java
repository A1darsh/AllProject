package com.zensar;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.onetoone.entity.Gender;
import com.zensar.onetoone.entity.User;
import com.zensar.onetoone.entity.UserProfile;
import com.zensar.onetoone.repository.UserProfileRepository;
import com.zensar.onetoone.repository.UserRepository;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user=null;
		UserProfile userProfile=null;
		
		userProfile=UserProfile.builder()
				.birthOfDate(LocalDate.of(2022, 04, 30))
				.phoneNumber("87758765")
				.address("badnawar")
				.gender(Gender.MALE)
				.user(user)
				.build();
		
		user=User.builder()
				.name("Govind")
				.email("solankigovind77@gmail.com")
				.userProfile(userProfile)
				.build();
		userRepository.save(user);
		
	}

}
