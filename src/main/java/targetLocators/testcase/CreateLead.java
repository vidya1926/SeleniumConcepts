package targetLocators.testcase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends CommonSteps {
	
	
	
@BeforeClass
 public void callFile() {	 
	 filename="DeleteLead";
 }
	
	
	@Test(dataProvider="fetchdata",groups="Smoke")
	public void createLead(String phno) {
	    driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
	
}
	
	
	
	
	
	
	
}






