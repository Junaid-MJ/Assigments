package Test;

import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Test {
	
	WebDriver driver;
	String url= "https://www.seleniumeasy.com/test/window-popup-modal-demo.html";
	
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
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click();
		Set<String> handler= driver.getWindowHandles();
		
		Iterator<String> it= handler.iterator();
		
		String parentWindowid = it.next();
		System.out.println("Parent Window id is : "+ parentWindowid);
		System.out.println("Parent Window Title is : "+ driver.getTitle());
		
		String childWindowid = it.next();
		System.out.println("Child Window id is : "+ childWindowid);
		
		
		driver.switchTo().window(childWindowid);
		System.out.println("Child Window Title is : "+ driver.getTitle());
		
		driver.close();//close the pop up window
		
		
	}
	
	@After
	public void close() {
		driver.quit();
	}

}
