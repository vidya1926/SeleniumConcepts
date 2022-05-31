package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumbasic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Step2: Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Step3:Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To maximize the screen
		driver.manage().window().maximize();
		//Step 4: Enter the username(enter the input sendkeys)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//step 5:Enter the Password(enter the input sendkeys)
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the login
		driver.findElement(By.className("decorativeSubmit"));
		//username:demosalesmanager
		//password:crmsfa
		//click the CRM/SFA
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click the lead button
		driver.findElement(By.linkText("Leads")).click();
		//click the create lead button
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter the firstname use send keys
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");

		//Enter the lastname use send keys
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");		
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));		
		Select options=new Select(source);
		options.selectByIndex(2);
		
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt=new Select(market);
		opt.selectByValue("CATRQ_AUTOMOBILE");
		opt.selectByVisibleText("eCommerce Site Internal Campaign");
		
		boolean multipleOPt = opt.isMultiple();
		System.out.println(multipleOPt);
	
		driver.close();
		/*
		 * //Click the Create Lead button
		 * driver.findElement(By.className("smallSubmit")).click();
		 */
	}

}
