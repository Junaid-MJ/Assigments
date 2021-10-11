package Test;

import org.junit.After; 
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Test {
	
	WebDriver driver;
	String url= "https://the100meterscroll.com/";
	
	@Before
	public void Browsersetup() throws InterruptedException {
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\src\\test\\resources\\chromedriver.exe");
		
		//Open browser instance
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the AUT
		driver.get(url);
		//Declare an implicit wait which is bounded to WebDriver instance
        Thread.sleep(2000);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"field\"]")));
		driver.findElement(By.xpath("//*[@id=\"startBtn\"]")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(0,381260)", "");
//		Thread.sleep(10000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(10000);
		
	}
	
	@After
	public void close() {
		driver.quit();
	}

}
