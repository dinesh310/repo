package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmail {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\New folder\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://accounts.google.com/SignUp?hl=en");
		System.out.println("successfully opened gmail");

  }
}
