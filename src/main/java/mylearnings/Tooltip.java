package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();

		WebElement tooltip = driver.findElement(By.id("age"));
		// tooltip.click();
  
		Actions builder = new Actions(driver);
		builder.moveToElement(tooltip).perform();

		String attribute = tooltip.getAttribute("title");
		System.out.println(attribute);
		
	}

}
