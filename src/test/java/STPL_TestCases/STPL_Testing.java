package STPL_TestCases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.LoginPage;

public class STPL_Testing extends stpl_Test_base {
	
	LoginPage loginpage;					//loginpage will help us to access the methods we defined in LoginPage
	
	public STPL_Testing()
	{
		super();					//stpl_Test_base stb = new stpl_Test_base();   This will call the properties constructor
									
	}
	
	@BeforeMethod
	public void setup()
	{
		initate();       				//This will call the driver to initiate
		loginpage = new LoginPage();
	}
	@Test(enabled = true)
	public void imageTest()
	{
		
		loginpage.VerifyImage();
		Assert.assertTrue(true);;
		System.out.println();
	}
	
	@Test()
	public void LoginTest1()
	{
		
		loginpage.InvalidLoginTest("asdad", "asdasda");
		String error  =loginpage.errorcheck();
		Assert.assertEquals(error, "Invalid User Name or Password");
		System.out.println("Received error ofr login "+error);
		
	}
	@Test()
	
		public void LoginCorrect()
		{
			loginpage.CorrectLogin(prop.getProperty("usr"), prop.getProperty("pas"));
		}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		System.out.println("Tearing Donw in 3 seconds");
		Thread.sleep(3000);
		driver.quit();
	}
	

}
