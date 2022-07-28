package week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://leafground.com/pages/drop.html");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//Step1: Locate the element
		WebElement eleDraggable = driver.findElement(By.id("draggable"));
		WebElement eleDroppable = driver.findElement(By.id("droppable"));
		
		//Step2: Create object for Actions class
		Actions builder = new Actions(driver);
		
		//step3
		builder.dragAndDrop(eleDraggable, eleDroppable).perform(); //perform() is mandatory at the end of all the actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	}

}
