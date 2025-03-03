package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentication {
	
	WebDriver dr=new ChromeDriver();

@Given("Navigate to Home page")
public void navigate_to_home_page() {
	
	dr.get("https://www.saucedemo.com/");
    
}

@When("Enter the name and password")
public void Enter_the_name_and_password() {
	
dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
   dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
}

@And("Click on products")
public void click_on_products() {
	
	dr.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
   
}

@Then("Navigate to the next page")
public void navigate_to_the_next_page() {
	
	boolean title=dr.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
   
}

@And("click on product")
public void click_on_product() {
	 
	JavascriptExecutor js=(JavascriptExecutor)dr;
	js.executeScript("window.scrollBy(0,120)","");
	dr.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

  
  
}
@Then("quite the page")
public void quite_the_page() {
	
dr.close();
   
}

@When("Enter the name {string} and password {string}")
public void enter_the_name_and_password(String string, String string2) {
	
dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(string);
   dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
  
}


@When("skip name and password")
public void skip_name_and_password() {
    try {
    	dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("");
    	   dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
    	
    }
    catch (Exception e) {
		System.out.println("Exception is :"+e);
	}
}
@When("skip name feild")
public void skip_name_feild() {
    try {
    	dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("");
    	   dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    	
    }
    catch (Exception e) {
		System.out.println("Exception is :"+e);
	}
}
@When("skip password feild")
public void skip_password_feild() {
	 try {
	    	dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	    	   dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
	    	
	    }
	    catch (Exception e) {
			System.out.println("Exception is :"+e);
		}
    
}
@When("^enter(.*)and(.*)$")
public void enter_username_and_password(String username,String password){
 
	 try {
	    	dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	    	   dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    	
	    }
	    catch (Exception e) {
			System.out.println("Exception is :"+e);
		}
}















}
