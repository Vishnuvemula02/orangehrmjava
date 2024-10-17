package orangehrm.libray;

import org.openqa.selenium.By;


import graphql.PublicApi;
import utils.AppUtils;
// lginpage is childclass and App utils is parent
public class LoginPage  extends AppUtils
{

	//Function1
	public void login(String uid,String pwd)
	{

		driver.findElement(By.id("txtUsername")).sendKeys(uid);	
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();

	}
	//Function2  
	public boolean isAdminModuleDisplayed() 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;

		}
	}

	//Function3   
	public void Logout()  
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	//Function4

	public  boolean isErrMsgDisplyed() 
	{
		String  errmsg  =	driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		if(errmsg.contains("invalid") || errmsg.contains("empty")) 
		{
			return true;

		}else 
		{
			return false;
		}
	}

	// Admin login test with valid credentials
	// step=1    Launch orangeHRM app
	// step=2    Login as Admin AND check Admin Module Displayed or Not? 
	// step=3	 Logout
	// step=4	 close App




}
