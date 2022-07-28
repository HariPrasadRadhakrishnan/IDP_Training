package week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToDragAndDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://leafground.com/pages/drag.html");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//Step1: Locate the element
		WebElement eleDraggable = driver.findElement(By.id("draggable"));
		
		//Step2: Create object for Actions class
		Actions builder = new Actions(driver);
		
		//step3
		builder.dragAndDropBy(eleDraggable, 150, 200).perform(); //perform() is mandatory at the end of all the actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	}

}
