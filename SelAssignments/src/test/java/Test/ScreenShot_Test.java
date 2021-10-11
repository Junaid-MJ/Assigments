package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Test {
	
	WebDriver driver;
	String url= "https://www.netflix.com/in/";
	
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
    	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
//		Thread.sleep(2000);
		
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		File scrfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("C:\\Users\\admin\\Pictures\\autoscreenshot.JPEG"));
	
	}
	
	@After
	public void close() {
		driver.close();
	}

}
