package pkg;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru {
	
	WebDriver driver;
@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
}
@BeforeMethod()
public void urloading()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
}
@Test
public void test1() 
{
Actions act=new Actions(driver);	
WebElement right=driver.findElement(By .xpath("//*[@id=\"authentication\"]/span"));
act.contextClick(right).perform();
driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
Alert a =driver.switchTo().alert();
System.out.println(a.getText());
List<WebElement>details=driver.findElements(By.xpath("//*[@id=\"authentication\"]/span"));
a.accept();
act.perform();
	
}
	
}

