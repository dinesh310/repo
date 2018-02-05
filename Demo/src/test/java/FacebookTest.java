import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

import org.apache.xalan.lib.Extensions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Window;



public class FacebookTest {
	
	static WebDriver driver;
	
//	@Test
//	public void FacebookLogin() throws AWTException{
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C://Users//home//.m2//repository//org//seleniumhq//selenium//selenium-chrome-driver//3.4.0//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://semantic-ui.com/collections/table.html");
		ArrayList array = new ArrayList(driver.getWindowHandles());
		Integer no = array.size();
		System.out.println(no);
//		driver.switchTo().window((String) array.get(1));
//		Robot ro = new Robot();
//		ro.keyPress(KeyEvent.VK_CONTROL);
//		ro.keyPress(KeyEvent.VK_W);
//		ro.keyRelease(KeyEvent.VK_CONTROL);
//		ro.keyRelease(KeyEvent.VK_W);
//		
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> waitt = new FluentWait<>(driver);
		waitt.withTimeout(10, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='another example']//ancestor::table[@class='ui compact celled definition table']/tbody/tr")));
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='another example']//ancestor::table[@class='ui compact celled definition table']/tbody/tr")));
		
		Integer size = driver.findElements(By.xpath("//div[@class='another example']//ancestor::table[@class='ui compact celled definition table']/tbody/tr")).size();
		
		System.out.println(size);
		for(int i=0;i<size;i++){
			
			String xpath = "//div[@class='another example']//ancestor::table[@class='ui compact celled definition table']/tbody/tr[X]";
			String actualpath = xpath.replaceAll(xpath.substring(i),"X");
			String vale = driver.findElement(By.xpath(actualpath)).getText();
			System.out.println(vale);
		}
		
		
		
	}

}
