package targetLocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		
		//To handle Simple Alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//Switch the driver control to the alert
		Alert alert = driver.switchTo().alert();	
		//Decide the action part
	    alert.accept();
		
	    
	    //To handle Confirmation alert
	    driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    driver.switchTo().alert().dismiss();
	    String text = driver.findElement(By.id("result")).getText();	    
	    System.out.println(text);		
	    
	    //To handle the Prompt alert
	    driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	    alert.sendKeys("Learning Alert");
	    alert.accept();
	    String alertText = driver.findElement(By.id("result1")).getText();
	    System.out.println(alertText);
	    
	    
	    
	    
	}

}
