package week1.day4;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://erail.in/");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Step2
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));

		fromStation.clear();
		fromStation.sendKeys("MAS");
		 Thread.sleep(1000);
		fromStation.sendKeys(Keys.TAB);

		//Step3
		WebElement toStation = driver.findElement(By.id("txtStationTo"));

		toStation.clear();
		toStation.sendKeys("NMKL");
		 Thread.sleep(500);
		toStation.sendKeys(Keys.TAB);
		
		//step4
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(500); //to load the result
		
		//to find the number of rows
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int noOfRows = allRows.size();
		
		
		for (int i =1; i <= noOfRows; i++) {
			
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
