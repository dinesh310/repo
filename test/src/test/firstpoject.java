package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

public class firstpoject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("7795349708");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
	}

}
