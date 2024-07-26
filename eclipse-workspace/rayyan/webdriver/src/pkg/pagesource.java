package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String sorce=driver.getPageSource();
if(sorce.contains("Gmail")) {
	System.out.println("pass");
	
}


else {
	System.out.println("failed");
}


	}

}
