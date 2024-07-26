package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
	
	@BeforeTest
	public void browseropen()
	{
		System.out.println("browser open");	
	}
	@BeforeMethod
	public void urload()
	{
		System.out.println("url loading");
	}
	@Test(priority=3,invocationCount = 4)
	public void test1()
	{
		
	}
	@Test(priority=2,enabled = false)
	public void test2()
	{
		
	}
	@Test(priority=1)
	public void test3()
	{
		
	}
	@AfterMethod
	public void aftermethod()
	{
		
	}

}

