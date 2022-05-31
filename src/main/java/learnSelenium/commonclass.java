package learnSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commonclass {
	@BeforeMethod(groups = { "beforeMethod" })
public void beforeMethod() {
    System.out.println("@BeforeMethod BaseClass");
}

@AfterMethod(alwaysRun = true, dependsOnGroups = { "beforeMethod" })
public void afterMethod() {
    System.out.println("@AfterMethod BaseClass");
}

}
