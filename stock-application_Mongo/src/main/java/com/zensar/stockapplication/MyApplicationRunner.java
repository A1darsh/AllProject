package com.zensar.stockapplication;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		String[] sourceArgs=args.getSourceArgs();
		System.out.println("MyApplicationRunner"+Arrays.toString(sourceArgs));
	}

}
