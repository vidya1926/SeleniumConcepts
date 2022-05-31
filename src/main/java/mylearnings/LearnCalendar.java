package mylearnings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCalendar {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		String reqDate = "10-10-2022";
		String[] split = reqDate.split("-");
		int Monthtoselect = Integer.parseInt(split[1]);

		driver.findElement(By.id("datepicker")).click();
		String CMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(CMonth);

		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(year);

		SimpleDateFormat monthfor = new SimpleDateFormat("MMMM");
		Calendar dateSet = Calendar.getInstance();
		dateSet.setTime(monthfor.parse(CMonth));

		SimpleDateFormat outputformat = new SimpleDateFormat("MM");
		System.out.println(outputformat.format(dateSet.getTime()));
		int presentMonth = Integer.parseInt(outputformat.format(dateSet.getTime()));
		System.out.println(presentMonth);

		if (Monthtoselect > presentMonth) {
			for (int i = 0; i < (Monthtoselect - presentMonth); i++) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		} else if (Monthtoselect < presentMonth) {
			for (int i = 0; i < (presentMonth - Monthtoselect); i++) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
		}

		driver.findElement(By.linkText(split[0])).click();

	}
}
