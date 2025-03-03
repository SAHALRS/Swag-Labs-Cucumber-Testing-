package page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;
	
	By Username=By.xpath("//*[@id=\"user-name\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By submit=By.xpath("//*[@id=\"login-button\"]");
	By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By Checkout=By.xpath("//*[@id=\"checkout\"]");

	public Cart(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void Login() {
		driver.findElement(Username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(submit).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).click();
		driver.findElement(cart).click();
		driver.findElement(Checkout).click();
	
	}


}
