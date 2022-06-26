package targetlocators;




import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.target.model.SessionID;
import org.openqa.selenium.devtools.v102.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCDPDeviceMetrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
        Map<String, Object> dm=new HashMap<String,Object>();
        dm.put("width", 600);
        dm.put("height", 1000);
        dm.put("mobile",true);
        dm.put("deviceScaleFactor",70);
        
       driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", dm);
       driver.get("https://www.netflix.com/");
       
       
       
       
	}

}
