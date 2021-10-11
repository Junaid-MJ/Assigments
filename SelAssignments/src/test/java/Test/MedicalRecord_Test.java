package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MedicalRecord_Test {
	WebDriver driver;
	String url= "http://openclinic.sourceforge.net/openclinic/home/index.php";

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
		driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();

		//Find the namedropdown list and store it as a WebElement
		WebElement nameDropdown= driver.findElement(By.id("search_type"));

		//Pass the reference variable for namedropdown as a parameter for the Select class
		Select namerp= new Select(nameDropdown);
		
		Thread.sleep(1000);

		namerp.selectByValue("3");
		Thread.sleep(1000);	
		
		driver.findElement(By.id("search_patient")).click();
		
		
	}

	@After
	public void close() {
		driver.close();
	}



}
