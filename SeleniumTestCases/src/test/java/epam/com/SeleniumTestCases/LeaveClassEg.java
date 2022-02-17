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
//		driver.findElement(By.xpath("//*[@id=\"leaveType_inputfileddiv\"]/div/input")).click();
		
		//for date
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/section/div[2]/ui-view/div/div/form/div[1]/materializecss-decorator[1]/div/sf-decorator[1]/div/div/input")).click();
//		/html/body/div[1]/div/div/div[2]/section/div[2]/ui-view/div/div/form/div[1]/materializecss-decorator[1]/div/sf-decorator[1]/div/div/ul/li[5]/span
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/section/div[2]/ui-view/div/div/form/div[1]/materializecss-decorator[1]/div/sf-decorator[1]/div/div/ul/li[5]/span")).click();
		driver.findElement(By.xpath("")).click();
	    }
	}



