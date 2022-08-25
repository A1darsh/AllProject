package com.zensar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class AdditionTest {

	Addition a = null;
//	@BeforeClass        //only once
//	public static void stUp() {
//		System.out.println("Ram");
//	}

	@Before
	public void setUp() {
		// System.out.println("hi");
		a = new Addition();
	}

	
	@Test
	public void test_Add() {
		// Addition a= new Addition();
		int actualResult = a.add(3, 5);
		int expectedResult = 8;

		assertEquals(expectedResult, actualResult);

	}
	@Test
	public void testArray() {

		int actualArray[] = a.myArr();
		int expectedArray[] = { 1, 2, 3, 4, 5 };
		// assertEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testString() {
		
		String actualResult = a.getName("zensar");
//		try {
//			Thread.currentThread().sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		String expectedResult = "zENSAR";
		assertNotEquals(expectedResult, actualResult);

	}

	@Test
	public void testStringForNull() {
		String actulaResult = a.getName("abc");
		String expectedResult = null;
		// assertNull(expectedResult, actulaResult);
		assertNotNull(expectedResult, actulaResult);
	}

	@Test(expected=Exception.class)
	public void testStringForExceotion() {
		a.getName("");
		
	}
	
	
	
	
	

	@Test
	public void test_Sub() {
		// Addition a= new Addition();
		int actualResult = a.sub(4, 3);
		int expectedResult = 1;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_Mul() {
		// Addition a= new Addition();
		int actualResult = a.mul(2, 3);
		int expectedResult = 6;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_Div() {
		// Addition a= new Addition();
		int actualResult = a.div(2, 2);
		int expectedResult = 1;

		assertEquals(expectedResult, actualResult);
	}

	@After
	public void tearDown() {
		// System.out.println("helo");
		a = null;
	}

	@Ignore
	@Test
	public void test() {
		// System.out.println("Ram");
	}

	@BeforeClass // only once
	public static void stUp() {
		System.out.println("Ram");
	}

	@AfterClass // after all execution executed,only once
	public static void tardown() {
		System.out.println("seeta");
	}
	

}

