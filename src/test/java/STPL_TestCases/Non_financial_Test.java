package STPL_TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.CorpSelectPage;
import STPLPages.LoginPage;
import STPLPages.Non_Financial;
import STPLPages.ODTPage;
import STPLPages.STPL_HomePage;

public class Non_financial_Test extends stpl_Test_base {
	
	LoginPage loginpage;
	ODTPage odtpage;
	CorpSelectPage corpselectpage;
	STPL_HomePage stplhomepage;
	Non_Financial nonfinancial;
	
	public Non_financial_Test()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException
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
		stplhomepage.NonFinanceClick();

	}
	@Test
	public void NonfinacialTest() throws InterruptedException
	{
		nonfinancial = new Non_Financial();
		nonfinancial.exportReport();
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Tearing Down");
	}

}
