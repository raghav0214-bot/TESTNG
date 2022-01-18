package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders
{
	@DataProvider
	public Object[][] Testdata()
	{
		Object [][] data=new Object[2][2];
		data[0][0]="Test1";
		data[0][1]="Test2";
		data[1][0]="Test3";
		data[1][1]="Test4";
		
		return data;
		
		
	}
	@DataProvider
	public Object[][] Testdata1()
	{
		Object [][] data=new Object[3][3];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=1;
		data[2][0]=2;
		data[2][1]=3;
		data[2][2]=4;
		return data;
		
		
	}
	
	@Test(dataProvider="Testdata")
	public void testcase(String s1,String s2)
	{
		System.out.println("s1"+s1+"s2"+s2);
		
	}

	@Test(dataProvider="Testdata1")
	public void testcase1(int s1,int  s2,int s3)
	{
		System.out.println("s1"+s1+"s2"+s2+"s3"+s3);
		
	}
	

}
