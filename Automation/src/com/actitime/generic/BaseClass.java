package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseClass 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("open Browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
		driver.quit();

	}
	@BeforeMethod
	public void login() throws IOException
	{
		FileLib f=new FileLib();
		String url=f.getPropertyData("url");
		 String un = f.getPropertyData("username");
		 String pw = f.getPropertyData("password");
		 driver.get(url);
		 Reporter.log("login",true);
//		 LoginPage l = new LoginPage(driver);
//		 l.setLogin(un,pw);
		 
	}
 	@AfterMethod
 	public void logout()
 	{
		 Reporter.log("logout",true);
//		HomePage h = new HomePage(driver);
//		h.setLogOut();

 	}
}
