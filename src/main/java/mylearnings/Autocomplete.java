package mylearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();

		WebElement autocom = driver.findElement(By.id("tags"));
		autocom.click();
		autocom.sendKeys("s",Keys.DOWN,Keys.ENTER);		
		List<WebElement> listofOpt = driver.findElements(By.xpath("//ul/li/div[@class='ui-menu-item-wrapper']"));
		System.out.println(listofOpt.size());
		WebElement text = listofOpt.get(2);
	//	text.click();			
		  Actions builder =new Actions(driver);
		  builder.moveToElement(text).sendKeys(Keys.ENTER).build().perform();
		  
		 
		
		
		
		
		
	}
}
