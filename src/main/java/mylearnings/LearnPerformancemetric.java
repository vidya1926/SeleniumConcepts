package targetlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.performance.Performance;
import org.openqa.selenium.devtools.v102.performance.model.Metric;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPerformancemetric {

		@Test(enabled = true)
		public void testScript() throws Exception {
		  try {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				DevTools devTools = driver.getDevTools();
				devTools.createSession();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.findElement(By.id("username")).sendKeys("demoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();

				List<Metric> metrics = devTools.send(Performance.getMetrics());
			       metrics.forEach(metric-> System.out.println(metric.getName() +" : "+ metric.getValue() ));
				
				
		  } catch (Exception e) {
		    System.out.println(e.getMessage());
		  }}
}
