package learnSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumcommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
	//  options.addArguments("--headless");
	//	options.setHeadless(false);
		options.addArguments("--incognito");
		options.addArguments("--start-fullscreen");
		
		ChromeDriver driver=new ChromeDriver(options);			
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	    driver.close();
		
	}

}
