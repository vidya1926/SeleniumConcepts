package targetlocators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.network.Network;
import org.openqa.selenium.devtools.v102.network.model.ConnectionType;
import org.openqa.selenium.devtools.v102.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCDPNetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.requestWillBeSent(), requestSent -> {

			System.out.println("Request URL => " + requestSent.getRequest().getUrl());
			System.out.println("Request Method => " + requestSent.getRequest().getMethod());

			System.out.println("Request Headers => " + requestSent.getRequest().getHeaders().toString());

			System.out.println("-------------------------------------------------");
		});

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devTools.addListener(Network.responseReceived(), responseReceieved -> {

			System.out.println("Response Url => " + responseReceieved.getResponse().getUrl());

			System.out.println("Response Status => " + responseReceieved.getResponse().getStatus());

			System.out.println("Response Headers => " + responseReceieved.getResponse().getHeaders().toString());

			System.out.println("Response MIME Type => " + responseReceieved.getResponse().getMimeType().toString());

			System.out.println("------------------------------------------------------");

		});

		devTools.send(Network.emulateNetworkConditions(false, 20, 20, 50, Optional.of(ConnectionType.WIFI)));

		devTools.send(Security.setIgnoreCertificateErrors(true));
		devTools.send(Network.clearBrowserCache());

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
