package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadSteps extends BaseClass {
	public String leadID;

	@When("Click on Leads")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on Find Leads")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@When("Click on Phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@Given("Enter the phone number as {string}")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);

	}

	@When("Click on Find Leads button")
	public void clickFindLeadsButton() throws Exception {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Given("Store the first Lead ID")
	public void storeLeadID() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
	}

	@When("Click on first Lead ID")
	public void clickfirstLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on Delete button")
	public void clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();

	}

	@When("Click on Find Leads again")
	public void clickFindLeadsAgain() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@Given("Enter the Lead ID stored")
	public void enterLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Click on Find Leads button in the current screen")
	public void clickFindLeadsButtonCurrent() throws Exception {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}


	@Then("No records should be displayed")
	public void verifyNoLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}
}


