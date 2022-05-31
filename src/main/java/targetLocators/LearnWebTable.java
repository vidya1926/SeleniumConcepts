package targetLocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		// to get the row size
		List<WebElement> rowsize = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		System.out.println(rowsize.size());

		// to get each train name from the row of the table.
		List<String> lst = new ArrayList<String>();
		for (int i = 0; i < rowsize.size(); i++) {
			String names = rowsize.get(i).getText();
			System.out.println(names);
			lst.add(names);
		}

	

	
	  //to get size 
	 int size1= lst.size(); // Store train names in set from list
	
	  Set <String> hash = new LinkedHashSet <String>(lst); 
	  // get the size 
	  int
	  size2 = hash.size();
	  System.out.println(size2);
	  
	  if(size1 == size2) {
	  System.out.println("Size are equal and the names are Unique");
	}
	else 
	{
		System.out.println("Not equal");
	}

}}
