package Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendkeys_Test {
	WebDriver driver;
	String url= "https://www.youtube.com/";
	
	@Before
	public void Browsersetup() throws InterruptedException {
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\src\\test\\resources\\chromedriver.exe");
		
		//Open browser instance
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the AUT
		driver.get(url);
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Infosys pune DC");
		//driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		js.executeScript("document.getElementById('search').value= 'Infosys pune DC'");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
		js.executeScript("arguments[0].click();",element);
		Thread.sleep(5000);
		
		
	}
	
	@After
	public void close() {
		driver.quit();
	}

}
