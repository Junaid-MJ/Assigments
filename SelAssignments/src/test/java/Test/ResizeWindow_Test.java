package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow_Test {
	
	WebDriver driver;
	
	
	@Before
	public void Browsersetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\src\\test\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		Dimension d = new Dimension(500,900);
		driver.manage().window().setSize(d);
		 Thread.sleep(2000);
		
		
	}
	
	@After
	public void close() {
		driver.quit();
	}

}
