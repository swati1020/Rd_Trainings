package TestAutomation.testng.exception;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import epam.com.TestngTask.PracticeAssignment.MemberClass;

public class LibProject{
//	LibProject(int MemberID, String Firstname, String Lastname, String City, int Age, Boolean Status) {
//		super(MemberID, Firstname, Lastname, City, Age, Status);
//		// TODO Auto-generated constructor stub
//	}
	ArrayList<MemberClass>list=new ArrayList<>();

	public void AddMember(MemberClass mem) {

		list.add(mem);
  }
   public int getofSize() {
	   return list.size();
   }
public Object getMemberClass() {
	// TODO Auto-generated method stub
	return null;
}


}


	
