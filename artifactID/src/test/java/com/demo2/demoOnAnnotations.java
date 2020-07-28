package com.demo2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoOnAnnotations {

	@BeforeTest
	void afterTest()
	{
		System.out.println("This is Before Test");
	}

	/*
	 * @BeforeMethod void beforemethode() {
	 * System.out.println("This is Before Method"); }
	 */
	@Test
	void test1() {
		System.out.println("Method1");
	}
	
	@Test
	void test2() {
		System.out.println("Method2");
	}
	
	/*
	 * @AfterMethod void aftermethod() { System.out.print("After Method\n"); }
	 */
	
	@AfterTest
	void Aftertest()
	{
		System.out.println("This is After Test");
	}
}
