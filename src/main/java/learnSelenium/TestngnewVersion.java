package learnSelenium;

import org.testng.annotations.CustomAttribute;
import org.testng.annotations.Test;

public class TestngnewVersion {

	//Honour custom attribute values in TestNG default reports
	//to include the code name in the testng report
	@Test ( attributes = {
	        @CustomAttribute(
	                name = "code_name",
	                values = {"Login"}),
	            @CustomAttribute(
	                name = "code_name",
	                values = {"CreateLead"})
	})
	public  void SampleTest() {
		// TODO Auto-generated method stub

	}

}
