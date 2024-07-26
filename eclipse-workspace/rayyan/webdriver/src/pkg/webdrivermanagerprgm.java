package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanagerprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String title=driver.getTitle();
String window=driver.getWindowHandle();
System.out.println(title);
String exp ="Google";
if(title.equals(exp)) {
	System.out.println("pass");
	
}else
{
System.out.println("faled");	
}

	}

}
