package STPL_TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.CorpSelectPage;
import STPLPages.LoginPage;
import STPLPages.ODTPage;
import STPLPages.STPL_HomePage;
import junit.framework.Assert;

public class STPL_Home_Test extends stpl_Test_base {
	
	LoginPage loginpage;
	ODTPage odtpage;
	CorpSelectPage corpselectpage;
	STPL_HomePage stplhomepage;
	
	
	public STPL_Home_Test()
	{
		super();
	}
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException
	{
		initate();
		loginpage = new LoginPage();
		loginpage.CorrectLogin(prop.getProperty("usr"), prop.getProperty("pas"));
		odtpage = new ODTPage();
		odtpage.validodt(prop.getProperty("ODT"));
		Thread.sleep(2000);
		corpselectpage = new CorpSelectPage();
		corpselectpage.corpclick();
		corpselectpage.userclick();
		corpselectpage.LoginButton();
		stplhomepage = new STPL_HomePage();
	}
	
	@Test
	public void CheckTitle()
	{
		String hometitle = stplhomepage.TitleCheck();
		Assert.assertEquals(hometitle, "Aurus Inc - StorePlace");
		
	}
	
	@Test
	public void checkUserName()
	{
		String getuserdetails = stplhomepage.userprofile();
		Assert.assertEquals(getuserdetails, "Vishal");
	}
	
	@Test
	public void GetDate()
	{
		String DATE = stplhomepage.getDate();
		System.out.println(DATE +"TOday's Date");
	}
	
	@Test
	public void viewalldata()
	{
		stplhomepage.viewall();
	}
	
	@Test
	public void Nonfinance() throws InterruptedException
		{
			stplhomepage.NonFinanceClick();
			
		}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
