package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider="fetchData")
	public void runCreateLead(String Cname,String Fname, String Lname ) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.name("submitButton")).click();
			
		//readExcel--->dataProviderMethod-->@TestMethod
}
	@DataProvider(name="fetchData")
	public String[][] readData() throws IOException {		
		//companyname  fn  ln
		//TL       Vidya 		R
		//IDP		Shruthi		S
		/*
		 * String[][] testData=new String[2][3];
		 * 
		 * testData[0][0]= "Tl"; testData[0][1]="Vidya"; testData[0][2]="R";
		 * 
		 * testData[1][0]= "IDP"; testData[1][1]="Shruthi"; testData[1][2]="S";
		 * 
		 * return testData;
		 */
		
		return ReadExceldata.testData();
		
		
		
	}
	
}






