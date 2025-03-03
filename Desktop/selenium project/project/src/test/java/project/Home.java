package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.pom.product;

public class Home {
	WebDriver driver=new ChromeDriver();
	
	product obj =new product(driver);
@Test
@Given("open website")
public void open_website() {
	
	driver.get("https://www.saucedemo.com/");
	
}

@When("user enters valid username and password")
public void user_enters_valid_username_and_password() {
	
	obj.elements("standard_user", "secret_sauce");
  
}

@And("click on submit")
public void click_on_submit() throws InterruptedException {
	
	obj.click();
    
}

@Then("Navigate to Home")
public void Navigate_to_Home() {
	
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
   
}

@And("click on all products")
public void click_on_all_products() {
	
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(120,0)","");
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
   }

@And("click on cart page")
public void click_on_cart_page() throws InterruptedException {
	
	
	
	obj.cart();
	
	
	
	
   
}
@Then("navigate to cart page")
public void navigate_to_cart_page() {
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).click();
}

@And("close driver")
public void close_driver() {
    driver.close();
}


@When("configure dropdown")
public void configure_dropdown() {
   WebElement drop=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
   Select select=new Select(drop);
   select.selectByIndex(2);
}



@And("Click Continue purchase")
public void Click_Continue_purchase() {
	driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
   
}
@And("Remove added products")
public void Remove_added_products()throws InterruptedException {
	
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	driver.findElement(By.id("remove-sauce-labs-bike-light")).click();

	driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
	driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
}
    

@And("click on cart")
public void click_on_cart() throws InterruptedException {
    

	
	obj.cart();
	



}

@And("Click on menu")
public void click_on_menu() {

	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
   
}
@And("Click on logout")
public void click_on_logout() {
	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    
}

@And("Click on Reset app state")
public void click_on_reset_app_state() {
    driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]")).click();
}
@Then("check the product button states is Reseted")
public void check_the_product_button_states_is_reseted() {
    String State=driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
    String Expected="Add to cart";
    if(State.equals(Expected))
    {
    	System.out.println("State Changed Succesfully :"+State);
    }
    else
    {
    	System.out.println("State is not changed(Error) :"+State);
    }
}

@And("click on All items in menu")
public void click_on_all_items_in_menu() {
	
	driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
}
}