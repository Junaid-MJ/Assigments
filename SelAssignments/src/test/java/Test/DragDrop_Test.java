package Test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_Test {
	WebDriver driver;
	String url= "https://jqueryui.com/droppable/";
	
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
	public void test() {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement fromElement= driver.findElement(By.id("draggable"));
		WebElement ToElement= driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(fromElement, ToElement).perform();
		
		String afterDragging= driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		
		if(afterDragging.equals("Dropped!")) {
			System.out.println("Drag successful.");
		}
		else
			{System.out.println("Drag Unsuccessful.");
			
			}
	}
	
	@After
	public void close() {
		driver.close();
	}

}
