package utils;

import java.sql.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils
{
	public static  WebDriver driver;
	//Global variables
	//Function1
	public static void launchApp(String url)
	{

		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWorkspace\\OrangeHRMvishnu\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);

	}



	public static void closeApp() 
	{
		driver.close();		
	}

}
