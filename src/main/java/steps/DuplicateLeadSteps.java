package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DuplicateLeadSteps extends BaseClass {
	@When("Click on Duplicate Lead button")
	public void clickDuplicateLeadButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();

	}

	@When("Click Create Lead button in the current screen")
	public void clickCreateLeadCurrent() {
		driver.findElement(By.name("submitButton")).click();

	}


}



