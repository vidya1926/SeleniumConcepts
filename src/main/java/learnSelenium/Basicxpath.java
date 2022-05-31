package learnSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicxpath {
@Test
	public  void main() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		// Step2: Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Step3:Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To maximize the screen
		driver.manage().window().maximize();
		//wait for the driver to locate  the webelement if not done throws the exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//xpath for user->attribute based xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");		
		
		//driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		//collection based xpath
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		String title = driver.getTitle();		
		System.out.println(title);
		//Partial attribute based xpath
		//driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		//Partial text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		String crmPage = driver.getTitle();
		System.out.println(crmPage);
		
		driver.close();
		
	}

}
