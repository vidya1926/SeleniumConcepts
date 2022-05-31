package targetLocators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		//WebElement frameElement = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		driver.switchTo().frame(0);
		WebElement clickbutton = driver.findElement(By.id("Click"));
		clickbutton.click();
		System.out.println(clickbutton.getText());
		driver.switchTo().defaultContent();//Takes the control to the webPage to handle other available WebElements
		
		WebElement frameEle2 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
				
		
		driver.switchTo().frame(frameEle2);
		driver.switchTo().frame("frame2");
		WebElement element = driver.findElement(By.id("Click1"));
		File screenshot = element.getScreenshotAs(OutputType.FILE);		
		File d=new File("./snap/pic1.png");
		FileUtils.copyFile(screenshot, d);		
		element.click();
		System.out.println(element.getText());
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);		
		File dest=new File("./snap/pic.png");
		FileUtils.copyFile(screenshotAs, dest);
		
	//	driver.switchTo().parentFrame();->takes the control to the next high level frame /immediate frame
		
		
		
		
	}

}
