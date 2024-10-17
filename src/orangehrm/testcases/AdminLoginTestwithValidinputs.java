package orangehrm.testcases;

import orangehrm.libray.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithValidinputs 
{
	public static void main(String[] args) throws Throwable
	{
//      classname.methodname
// step1		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
//  step2		 
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
			 boolean  result = lp.isAdminModuleDisplayed();
		if (result)
		{
			System.out.println("Admin Login Test Pass");
		}else
		{
			System.out.println("Admin Login Test Fail");	
		}
			Thread.sleep(4000);
		
//  step3		
		lp.Logout();
//  step4		
		AppUtils.closeApp();
		
				
	}

}
