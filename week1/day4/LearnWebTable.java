package week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://leafground.com/pages/table.html");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		List<WebElement> allRows = driver.findElements(By.xpath("//table//tr"));
		int noOfRows = allRows.size();
		

		for (int i = 2; i <= noOfRows; i++) {
			
			List<WebElement> allColumns = driver.findElements(By.xpath("//table//tr["+i+"]/td"));
			int noOfCols = allColumns.size();

			for (int j = 1; j <= noOfCols; j++) {

				String text = driver.findElement(By.xpath("//table//tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(text);
			}

		}

	}

}
