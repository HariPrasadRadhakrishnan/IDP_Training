package week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToClickAndHold {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/sortable/");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//To switch into frame
		driver.switchTo().frame(0);
		
				
		//Step1: Locate the element
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		//to get the location of WebElement
		Point location = item4.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		
		
		  //Step2: Create object for Actions class 
		Actions builder = new Actions(driver);
		  
		  //step3 
		builder
		.clickAndHold(item1)
		.moveByOffset(location.getX(), location.getY())
		.pause(500)
		.release()
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	}

}
