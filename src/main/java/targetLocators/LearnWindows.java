package targetLocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);		
		
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());		
		List<String>windows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.switchTo().window(windows.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.quit();
		
	}

}
