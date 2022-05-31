package learnSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildClass extends commonclass {
    @BeforeMethod
    public void beforeChildMethod() {
        System.out.println("@BeforeMethod ChildClass");
    }

    @AfterMethod
    public void afterChildMethod() {
        System.out.println("@AfterMethod ChildClass");
    }

    @Test
    public void testCase() {
        System.out.println("@Test testCase");
    }
}
