package week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnKeyBoardActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/selectable/");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//To switch into frame
		driver.switchTo().frame(0);
		
				
		//Step1: Locate the element
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
				
		  //Step2: Create object for Actions class 
		Actions builder = new Actions(driver);
		  
		  //step3 
		builder
		.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		.click(item5)
		.click(item7)
		.keyUp(Keys.CONTROL)
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	}

}
