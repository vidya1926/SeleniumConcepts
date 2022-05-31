package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MergeLeadSteps extends BaseClass {
	public String leadID;
	public List<String> allhandles;
	public List<String> allhandles2;

	@When("Click on Merge Leads")
	public void clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}

	@When("Click on image next to From Lead text box")
	public void clickImageFrom() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

	}

	@Given("Switch to the next window - window1")
	public void switchWindow1() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}

	@Given("Enter the first name in window1 as {string}")
	public void firstNameWindow1(String firstName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
	}

	@When("Click on Find Leads button in window1")
	public void clickFindLeadsButtonWindow1() throws Exception {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Given("Store the first Lead ID in window1")
	public void storeLeadIDWindow1() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
	}

	@When("Click on first Lead ID in window1")
	public void clickfirstLeadIDWindow1() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	/* @Given("Switch to previous window")
	public void switchToPreviousWindow() {
		driver.switchTo().window(allhandles.get(0));
	} */

	@When("Click on image next to To Lead text box")
	public void clickImageTo() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

	}

	@Given("Switch to the next window - window2")
	public void switchWindow2() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}

	@Given("Enter the first name in window2 as {string}")
	public void firstNameWindow2(String firstName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
	}

	@When("Click on Find Leads button in window2")
	public void clickFindLeadsButtonWindow2() throws Exception {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@When("Click on first Lead ID in window2")
	public void clickfirstLeadIDWindow2() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	/* @Given("Switch back to previous window")
	public void switchBackToPreviousWindow() {
		driver.switchTo().window(allhandles2.get(0));
	} */

	@When("Click on Merge button")
	public void clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

	}

	@When("Switch to alert and accept")
	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

}


















