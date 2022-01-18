package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependents
{	
	@Test
	public void Test1()
	{
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods={"Test1"})
	public void Test2()
	{
		System.out.println("In Test 2");
	}
	@Test(dependsOnMethods={"Test1","Test2"})
	public void Test3()
	{
		System.out.println("In Test 3");
	}
	
	
	@Test
	public void Test4()
	{
		Assert.assertTrue(false);
	}
	
	
	
	
	
	
	
	
	@Test(dependsOnMethods={"Test4"})
	public void Test5()
	{
		System.out.println("In Test 5");
	}
	@Test(dependsOnMethods={"Test4","Test5"})
	public void Test6()
	{
		System.out.println("In Test 6");
	}

}
