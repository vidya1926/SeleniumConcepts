package targetlocators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.browser.Browser;
import org.openqa.selenium.devtools.v102.browser.Browser.GetVersionResponse;
import org.openqa.selenium.devtools.v102.log.Log;
import org.openqa.selenium.devtools.v102.network.Network;
import org.openqa.selenium.devtools.v102.network.model.ConnectionType;
import org.openqa.selenium.devtools.v102.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCDPConsloelog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Log.enable());

		devTools.addListener(Log.entryAdded(), logEntry -> {

			System.out.println("Log Text : " + logEntry.getText());

			System.out.println("Log Level : " + logEntry.getLevel());

			System.out.println("Log Source : " + logEntry.getSource());

			System.out.println("URL : " + logEntry.getUrl().toString());

		});
	

	      GetVersionResponse browser = devTools.send(Browser.getVersion());

	      System.out.println("Browser Version => "+browser.getProduct());

	      System.out.println("User Agent => "+browser.getUserAgent());

	  
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
