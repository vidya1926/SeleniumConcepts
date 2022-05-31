package targetLocators.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSteps {
	public RemoteWebDriver driver;
	public String filename;
@Parameters({"browser","url","username","pwd"})
@BeforeMethod(alwaysRun=true)
	public void preConditions(String browser,String url,String username,String pwd) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome"))
				{
				WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@DataProvider()
	public String[][] fetchdata() throws IOException {		
	return ReadcellValue.exceldata(filename);
	
		
	}
	
}
