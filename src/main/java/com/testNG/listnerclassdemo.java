package com.testNG;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class listnerclassdemo
{
	int i=0;
	@Test
	public void test1()
	{
		throw new SkipException("I skip this test");
	}
	@Test(successPercentage=80,invocationCount=5)
	public void test2()
	{
		i++;
		if(i==1||i==2)
		{
			//System.out.println("Test Failed "+i+" th time");
			Assert.assertEquals(i,8);
		}
	}
	@Test
	public void test3()
	{
		
	}
}
