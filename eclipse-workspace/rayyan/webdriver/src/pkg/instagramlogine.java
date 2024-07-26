package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class instagramlogine {

	WebDriver d;
	
	@BeforeTest
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
 d=new ChromeDriver();
	}
@BeforeMethod
public void url()
{
d.get("https://www.instagram.com/accounts/login/");	
d.getTitle();
}
@Test
public void test1()throws Exception {
	
WebElement username=d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
username.sendKeys("sahal");
WebElement password=d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
Actions act=new Actions(d);
act.keyDown(username,Keys.CONTROL).sendKeys("a").keyUp(username,Keys.CONTROL);
act.keyDown(username,Keys.CONTROL).sendKeys("c").keyUp(username,Keys.CONTROL);
act.keyDown(password,Keys.CONTROL).sendKeys("v").keyUp(password,Keys.CONTROL);
act.build().perform();
d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
act.perform();
}
	

	
}

		


