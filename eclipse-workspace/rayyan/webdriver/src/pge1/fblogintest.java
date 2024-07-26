package pge1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fblogintest {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setup() {
		WebDriver driver=new ChromeDriver();
	
		
		
	}
	
		
	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);}
	@Test
	public void loginepage() {
		
		fbloginepage ob=new fbloginepage(driver);
		ob.setvalues("vshjd@gmail.com", "abc");
		ob.login();
		
	
		
	}

}
