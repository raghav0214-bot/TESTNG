package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupingintestNG 
{
	
	@Test(groups={"Sanity"})
	public void Test1() {
		Assert.assertTrue(true);
	}
	@Test(groups={"regresion"})
	public void Test2() {
		
	}
	@Test(groups={"Sanity"})
	public void Test3() {
		
	}
	@Test(dependsOnMethods={"Test1"})
	public void Test4() {
		
	}

}
