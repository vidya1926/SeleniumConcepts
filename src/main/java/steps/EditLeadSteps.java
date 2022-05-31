package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLeadSteps extends BaseClass {
	@When("Click on Edit button")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();

	}

	@Given("Change the company name to {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);

	}

	@When("Click on Update button")
	public void clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();

	}


}



