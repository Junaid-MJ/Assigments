package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropdownTest {
	
	WebDriver driver;
	String url= "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
	
	@Before
	public void Browsersetup() throws InterruptedException {
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\git\\Assigments\\selAssignment\\resources\\chromedriver.exe");
		
		//Open browser instance
		driver= new ChromeDriver();
		
		//open the AUT
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//Declare an implicit wait which is bounded to WebDriver instance
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		//Find the From dropdown list and store it as a WebElement
		WebElement bootstrapDropdown= driver.findElement(By.id("option-droup-demo"));
		
		//Pass the reference variable for bootstrapdropdown as a parameter for the Select class
		Select btrp= new Select(bootstrapDropdown);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(2000);
		
		//Use the select reference variable for selecting any option using index/value/visible text approach
		btrp.selectByValue("HTML");
	    Thread.sleep(3000);	
	
	}
	
	@After
	public void close() {
		driver.close();
	}


}
