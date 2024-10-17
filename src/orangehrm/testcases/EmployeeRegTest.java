package orangehrm.testcases;

import orangehrm.libray.Employee;
import orangehrm.libray.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args) {
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage  lp = new  LoginPage();
		lp.login("Admin", "Qedge123!@#");
		Employee emp = new Employee ();
		
		boolean res = emp.addEmployee("ramana1", "Demo1");		
		if(res)
		{
			System.out.println("New Employee Registered Successfully, Test Pass");
		}else
		{
			System.out.println("New Employee Registered not displayed in Employee List, Test Fail");
		}
		
		lp.Logout();
		AppUtils.closeApp();

		
	}

}
