package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.pom.Cart;

public class cart {
	WebDriver driver =new ChromeDriver();
	
Cart obj=new Cart(driver);
@Given("user enters login page")
public void user_enters_login_page() {
	
	driver.get("https://www.saucedemo.com/");
   
}
@And("select products and click on checkout")
public void select_products_and_click_on_checkout() {
    obj.Login();
}
@And("Close driver")
public void close_driver() {
  driver.close();
}

@Then("Enter Valid Credentials")
public void enter_valid_credentials() {
	
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("James");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Joseph");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("12222");

   
}
@And("Click on continue")
public void click_on_continue() {
    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
}

@Then("Enter Lastname")
public void enter_lastname() {
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Joseph");
}
@Then("click on finish")
public void click_on_finish() {
    driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
}

@And("click on cancel")
public void click_on_cancel() {
	 driver.findElement(By.xpath("//*[@id=\"cancel\"]")).click();
}
@Then("verify Total amound")
public void verify_total_amound() {
   String Total=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText();
   String Expected_title="Total: $32.39";
   if(Total.equals(Expected_title)) {
	   System.out.println("Success  :"+Total);
   }
   else {
	   System.out.println("Failed  :"+Total);

	   
   }
}

}
