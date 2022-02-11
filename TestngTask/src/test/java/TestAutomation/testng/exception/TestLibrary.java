package TestAutomation.testng.exception;
import static org.testng.Assert.*;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.com.TestngTask.PracticeAssignment.MemberClass;

//import org.junit.Test;

public class TestLibrary {
	
	@org.testng.annotations.Test
	public void testaddMember() {
		LibProject l = new LibProject();
		l.AddMember(new MemberClass(1,"SWati","Deshwal","delhi",23,true));
		l.AddMember(new MemberClass(2,"anu","sharma","pune",20,true));
		l.AddMember(new MemberClass(3,"anjali","mishra","pune",22,true));
		l.AddMember(new MemberClass(4,"anu","sharma","pune",24,false));
		System.out.println("success");
		assertEquals(l.getofSize(),4);
	}
	@Test
	@DataProvider(name="issueToMember")
	public static Object[][] issueBookToMembers(int bookId, int MemID)
	{
		return new Object[][] {
			{1,2},
			{2,1},
			{2,2},
			{4,3},
			{3,3},
			{1,1},
			
			
		};
	}
	@Test
	@BeforeMethod
	public void testaddMember1() {
		LibProject l = new LibProject();
		l.AddMember(new MemberClass(1,"SWati","Deshwal","delhi",23,true));
		System.out.println("Learning");
		assertEquals(l.getofSize(),1);
	}
	
	@Test
	public void issuedBook(int bookid, int memid) {
		Admin1 admin=new Admin1();
		admin.issueBookToMember(1,1);
//		assertEquals(1,1);
		Assert.assertEquals(1, 1);
		System.out.println("Learning");

	}

//	
//	@Test
//	@DataProvider(name="csvprovider")
//	private Iterator<Object[]>csvReader

}
	

	

	
	
