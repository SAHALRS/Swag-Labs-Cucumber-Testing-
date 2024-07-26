package pkg;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extendsreport {
	public static void main(String[] args){
	 String baseurl="https:/www.facebook.com";
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver d=new ChromeDriver();
	 d.get(baseurl);
	WebElement username=d.findElement(By.xpath("//*[@id=\"email\"]"));
	username .sendKeys("sahal");
	WebElement password=d.findElement(By.xpath("//*[@id=\"pass\"]"));
	password.sendKeys("rayyanrichu");
	WebElement logine=d.findElement(By.xpath("//*[@id=\"u_0_5_yn\"]"));
	
	 
	 
	}
}
