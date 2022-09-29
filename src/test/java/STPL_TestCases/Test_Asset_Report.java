package STPL_TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.Asset_Report;
import STPLPages.CorpSelectPage;
import STPLPages.LoginPage;
import STPLPages.ODTPage;

public class Test_Asset_Report extends stpl_Test_base {
	
	
	LoginPage loginpage;
	ODTPage odtpage;
	CorpSelectPage corpselectpage;
	Asset_Report assetreport;

	Test_Asset_Report()
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
		corpselectpage = new CorpSelectPage();
		Thread.sleep(2000);
		corpselectpage.corpclick();
		Thread.sleep(2000);
		corpselectpage.userclick();
		corpselectpage.LoginButton();
		
	}
	@Test
	public void InstallationReport() throws InterruptedException
	{
		assetreport = new Asset_Report();
		assetreport.reportclick();
		
	}
}
