package com.zensar.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.zensar.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("payment started....");
	}
}
