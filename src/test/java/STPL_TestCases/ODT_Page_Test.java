package STPL_TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.LoginPage;
import STPLPages.ODTPage;

public class ODT_Page_Test extends stpl_Test_base {
	
	ODTPage odtpage;
	LoginPage loginpage;
	
	
	public ODT_Page_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void ODTPage()
	{
		initate();
		loginpage = new LoginPage();
		odtpage = new ODTPage();
		loginpage.CorrectLogin(prop.getProperty("usr"), prop.getProperty("pas"));
	}
	
	@Test
	public void ODTInvalid() throws InterruptedException
	{
		String errormessage = odtpage.InvalidODT();
		Assert.assertEquals(errormessage, "Invalid ODT. Please try again");
		System.out.println(errormessage);
	}
	
	@Test
	public void validODT()
	{
		odtpage.validodt(prop.getProperty("ODT"));
		System.out.println(prop.get("ODT"));
		
	}
	
	@AfterMethod
	
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(3000);
			System.out.println("Tearing down in 3 seconds");
			driver.quit();
		}
	
	
	

}
