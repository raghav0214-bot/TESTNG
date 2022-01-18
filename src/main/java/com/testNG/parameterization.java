package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterization
{
	@Test
	@Parameters({"data"})
	public void test1(@Optional("Default")String data)
	{
		System.out.println(data);
	}

}
