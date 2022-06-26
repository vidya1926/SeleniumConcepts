package targetlocators;




import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.target.model.SessionID;
import org.openqa.selenium.devtools.v102.emulation.Emulation;
import org.openqa.selenium.devtools.v102.layertree.LayerTree;
import org.openqa.selenium.devtools.v102.network.Network;
import org.openqa.selenium.devtools.v102.network.model.Cookie;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCDPGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
        Map<String, Object> loc=new HashMap<String,Object>();
        loc.put("latitude", 37.354107);
        loc.put("longitude", -121.955238);
        loc.put("accuracy",1);        
       driver.executeCdpCommand("Emulation.setGeolocationOverride", loc);
       
     driver.executeCdpCommand("Network.enable", loc);
       driver.get("http://leaftaps.com/opentaps/control/login");
       
     
       
	}

}
