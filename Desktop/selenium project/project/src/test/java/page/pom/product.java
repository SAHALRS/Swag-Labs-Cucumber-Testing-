package page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product {
	
	WebDriver driver;
	
	By Username=By.xpath("//*[@id=\"user-name\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By submit=By.xpath("//*[@id=\"login-button\"]");
	By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");

	public product(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void elements(String name,String Password) {
		
		driver.findElement(Username).sendKeys(name);
		driver.findElement(password).sendKeys(Password);
		
		
		
	}
	
	public void click() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(submit).click();
	}
	public void cart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(cart).click();
	}
	
	
}
