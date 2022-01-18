package com.testNG;

import org.testng.annotations.*;

public class basicannotation
{
	@BeforeSuite
public void test1()
{
	System.out.println("Before Suite");
}
	@BeforeTest
public void test2()
{
		System.out.println("Before test");

}
	@BeforeClass
public void test3()
{
		System.out.println("Before class");

}
	@BeforeMethod
public void test4()
{	System.out.println("Before Method");

	
}
	@Test
public void test5()
{
		System.out.println("Test");

}
	@Test
public void test10()
{
		System.out.println("Test10");

}
	@AfterSuite
public void test6()
{
		System.out.println("After Suite");

}
	@AfterTest
public void test7()
{
		System.out.println("After Test");

}
	@AfterClass
public void test8()
{
		System.out.println("After class");

}
	@AfterMethod
public void test9()
{
		System.out.println("After Method");

}
}
