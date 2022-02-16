package epam.com.SeleniumTestCases;

import org.testng.annotations.BeforeClass;

import com.beust.jcommander.Parameters;

public class LeaveClassEg {
	
	@BeforeClass
	public void leave() {
		UiAutomationFactoryAssignment2 obj=new UiAutomationFactoryAssignment2();
//		obj.factory();
//		obj.browser.
		obj.browser = UiAutomationFactoryAssignment2.getWebDriver(browser);
	}
	}

}


