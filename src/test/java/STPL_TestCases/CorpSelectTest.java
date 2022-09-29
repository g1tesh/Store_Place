package STPL_TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.CorpSelectPage;
import STPLPages.LoginPage;
import STPLPages.ODTPage;

public class CorpSelectTest extends stpl_Test_base {
	
	LoginPage loginpage;
	ODTPage odtpage;
	CorpSelectPage corpselect;
	
	
	public CorpSelectTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initate();
		loginpage = new LoginPage();
		loginpage.CorrectLogin(prop.getProperty("usr"), prop.getProperty("pas"));
		odtpage = new ODTPage();
		odtpage.validodt(prop.getProperty("ODT"));
		corpselect = new CorpSelectPage();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void clickOnCorp() throws InterruptedException
	{
		corpselect.corpclick();
		Thread.sleep(2000);
		corpselect.userclick();
		Thread.sleep(2000);
		String Role = corpselect.UserRole();
		System.out.println(Role);
		Assert.assertEquals(Role, "Corporate","Role is different");
	}
	
	@Test
	public void LoginCorp() throws InterruptedException
	{
		corpselect.corpclick();
		Thread.sleep(2000);
		corpselect.userclick();
		Thread.sleep(2000);
		corpselect.LoginButton();
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Tearing down in 3 seconds");
		driver.quit();
	}
	
	

}
