package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login_facebook {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\New folder\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println("successfully opened facebook");

	}
}
