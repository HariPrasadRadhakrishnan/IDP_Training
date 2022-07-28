package week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//Step1: Locate the element
		WebElement eleMen = driver.findElement(By.xpath("//a[text()='Men']"));
		
		//Step2: Create object for Actions class
		Actions builder = new Actions(driver);
		
		//step3
		builder.moveToElement(eleMen).perform(); //perform() is mandatory at the end of all the actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	}

}
