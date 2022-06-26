package targetlocators;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LambadatestSample {

	 public RemoteWebDriver driver = null;
	  String username = "vidyar1926";
	  String accessKey = "xqHmrSa12TjL04iSMDva7kF07xB1ElHQWuIjm7u5oa3JJFbXRl";
		
		@BeforeTest
		public void setUp() throws Exception {
		  DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("browserName", "Chrome");
	    capabilities.setCapability("version", "92.0");
	    capabilities.setCapability("platform", "Windows 10");
	    capabilities.setCapability("resolution","1024x768");
		  capabilities.setCapability("build", "First Test");
		  capabilities.setCapability("name", "Sample Test");
		  capabilities.setCapability("network", true); // To enable network logs
		  capabilities.setCapability("visual", true); // To enable step by step screenshot
		  capabilities.setCapability("video", true); // To enable video recording
		  capabilities.setCapability("console", true); // To capture console logs

		  try {
		    driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), capabilities);
		  } catch (MalformedURLException e) {
		    System.out.println("Invalid grid URL");
		  }
		}

		@Test(enabled = true)
		public void testScript() throws Exception {
		  try {

				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.findElement(By.id("username")).sendKeys("demoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();

		  } catch (Exception e) {
		    System.out.println(e.getMessage());
		  }}
}
