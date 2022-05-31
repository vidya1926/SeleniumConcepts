package mylearnings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.name("filename"));
		// upload.sendKeys("C:\\Users\\Public\\Documents\\Vidyabahrathi-Employee self
		// Evaluation form.pdf");
		Actions builder = new Actions(driver);
		builder.click(upload).perform();
		Thread.sleep(3000);

		// copying File path to Clipboard
		StringSelection str = new StringSelection(
				"C:\\Users\\Public\\Documents\\Vidyabahrathi-Employee self Evaluation form.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		Robot rb = new Robot();
		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
