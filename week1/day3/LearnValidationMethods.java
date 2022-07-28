package week1.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnValidationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/pages/Edit.html");
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled();
		System.out.println(enabled);
		
		driver.get("https://leafground.com/pages/checkbox.html");
		
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		System.out.println(selected);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
