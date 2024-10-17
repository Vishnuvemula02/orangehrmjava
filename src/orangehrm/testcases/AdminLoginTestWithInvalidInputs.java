package orangehrm.testcases;

import orangehrm.libray.LoginPage;
import utils.AppUtils;

public class AdminLoginTestWithInvalidInputs {

	public static void main(String[] args) {
	//step1	
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
	//step2	
		LoginPage lp = new LoginPage();
		
	//	lp.login("abcd", "XYZ");
		//user name can not be empty		
				lp.login("aaa", "xyz");	
		boolean res = lp.isErrMsgDisplyed();
		if(res)
		{
			System.out.println("System displaying expected error massage for invalid data ,Test Pass");
		}else
		{
			System.out.println("System  not displaying expected error massage for invalid data ,Test Fail");
		}	
		
		
	
	//step3
		AppUtils.closeApp();
		
	}

}
