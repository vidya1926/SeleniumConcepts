package learnSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumusingJs {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();			
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println(driver.getTitle());	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");		
		
		//driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.executeScript("document.getElementById('password'). value='crmsfa';");
		
		WebElement loginclick = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		//scroll verically
		driver.executeScript("scroll(0,1000);");
		
		//scroll for the visibility of the particular element
		driver.executeScript("arguments[0].scrollIntoView();", loginclick);
		driver.executeScript("arguments[0].click();", loginclick);
		
		Thread.sleep(1000);
		//scroll horizontally
		driver.executeScript("scroll(500,0);");

		
	    driver.close();
		
	}

}
