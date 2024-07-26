package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pkg.webdrivermanagerprgm;

public class loginepagetest {
WebDriver d;
String baseurl="https://www.vrlbus.in/vrl2013/booking_home_v4.aspx";
@BeforeTest
public void setup() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	
}
@BeforeTest
public void url()
{
	d.get(baseurl);
}
@Test
public void test1()
{
	
	
}

}
