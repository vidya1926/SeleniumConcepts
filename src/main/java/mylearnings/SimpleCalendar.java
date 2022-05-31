package mylearnings;

import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		String reqDate = "10-10-2022";
		String edate = reqDate.split("-")[0];
		String emonth = reqDate.split("-")[1];
		String eyear = reqDate.split("-")[2];

		driver.findElement(By.id("datepicker")).click();
		String CMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(CMonth);

		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(year);
		WebElement Prev = driver.findElement(By.xpath("//span[text()='Prev']"));
		while (true) {
			if (!CMonth.equalsIgnoreCase(emonth) || !year.equalsIgnoreCase(eyear)) {
				Prev.click();
				break;
			}

		}
		List<WebElement> allDate = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for (WebElement date : allDate) {
			String dt = date.getText();
			if (dt.equals(edate)) {
				date.click();
				break;

			}

		}
	}
}