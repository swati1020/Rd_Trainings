package epam.com.SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.j.Parameters;

public class LeaveClassEg {
	WebDriver driver;
	@Test
	@BeforeClass
	@Parameters("browserName")
	public void leave(String browserName) {

		driver = UiAutomationFactoryAssignment2.factory(browserName);
		driver.get("https://prasoonr-trials73.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("U@qBLVtm09");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//leave
		driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/a")).click();
		//click on apply leave
		driver.findElement(By.xpath("//*[@id=\"menu_leave_applyLeave\"]/span[2]")).click();
		//dropdown
		driver.findElement(By.xpath("//*[@id=\"leaveType_inputfileddiv\"]/div/input")).click();
		
		//for date
//		driver.findElement(By.xpath("//div/span[@caret]//parent::div")).click();
//		
		driver.findElement(By.xpath("//li/span[contains(text(),'Sick Leave - US')]")).click();
		driver.findElement(By.xpath("//span/span/i")).click();
	    }
	}



