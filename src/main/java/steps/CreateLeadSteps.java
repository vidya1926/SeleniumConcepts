package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass {

	@Given("Enter the username as {string}")
	public void enterUsername(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void verifyHomepage() throws Exception {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage verified sucessfulluy");
		} else {
			System.out.println("Homepage verification failed");
		}
	}

	@When("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then("MyHomePage should be displayed")
	public void verifyMyHomePage() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		if (displayed) {
			System.out.println("My Homepage displayed");
		} else {
			System.out.println("My Homepage is not displayed");
		}
	}

	@When("Click on Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the company name as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

	}
	
	@Given("Enter the first name as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}
	
	@Given("Enter the last name as {string}")
	public void enterLirstName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}
	
	@When("Click on Create Lead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("View Lead page should be displayed")
	public void verifyViewLead() {
		boolean displayed = driver.findElement(By.xpath("//div[text() = 'View Lead']")).isDisplayed();
		if (displayed) {
			System.out.println("View Lead page displayed");
		} else {
			System.out.println("View Lead page is not displayed");
		}
	}
}


