package pkg;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99 {
	
	WebDriver driver1;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
	}
	@BeforeMethod
	public void urloading()
	{
		driver1.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test1()
	{
		
		driver1.findElement(By.xpath("/html/body/p/a")).click();
		String parentwindow=driver1.getWindowHandle();
		System.out.println("parent window title"+driver1.getTitle());
		Set<String> allwindowhandles=driver1.getWindowHandles();
		
		
		for(String handle:allwindowhandles)
		{
		System.out.println(handle);
		
		if(!handle.equalsIgnoreCase(parentwindow)) {
		driver1.switchTo().window(handle);
		
		
		String s=driver1.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
		System.out.println(allwindowhandles);
		driver1.close();
		
		
		}
		else {
		driver1.switchTo().window(parentwindow);
		
		WebDriver driver=driver1.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.close();
	
		}
		
		}

	

	

	}	
	
	
	


