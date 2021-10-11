package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPinCodes_Test {
	WebDriver driver;
	String url= "https://finkode.com/tn/chennai.html";

	@Before
	public void Browsersetup() throws InterruptedException {
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\src\\test\\resources\\chromedriver.exe");

		//Open browser instance
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//open the AUT
		driver.get(url);
		Thread.sleep(2000);

	}



	@Test
	public void test() throws InterruptedException {
		String pincode1 = driver.findElement(By.xpath("//*[@id=\"c760\"]/div[2]/table/tbody/tr[2]/td[3]/a")).getText();
		String pincode2 = driver.findElement(By.xpath("//*[@id=\"c760\"]/div[2]/table/tbody/tr[3]/td[3]/a")).getText();
		Assert.assertNotSame(pincode1, pincode2, "Pincode Are Not Same ");
		

		
		
	}

	@After
	public void close() {
		driver.close();
	}
	
	

}
