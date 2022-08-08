package mavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.findElement(By.tagName("title")).getAttribute("textContent");
        System.out.println(title);
        
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		  WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		  Select opt = new Select(source);		  
		  opt.selectByIndex(0); 
		  
		  Thread.sleep(3000);// pause the execution for the given time (millisec)
		  opt.selectByIndex(2);
		  
		  WebElement marketCamp =
		  driver.findElement(By.id("createLeadForm_marketingCampaignId")); Select val =
		  new Select(marketCamp); val.selectByValue("9002");
		  
		  Thread.sleep(3000); 
		  
		  val.selectByVisibleText("Automobile");
		  
		  boolean multiple = val.isMultiple(); System.out.println(multiple);
		  
		  // Click Leads // Click Create Lead // Enter Company Name // enter First name
		  // Enter Last Name // Click Create // get the title/verify 
		  String title1 = driver.getTitle(); 
		  System.out.println(title1);
		  
		 
		 
	}

}
