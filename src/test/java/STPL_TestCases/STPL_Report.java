package STPL_TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.STPL.base.stpl_Test_base;

import STPLPages.CorpSelectPage;
import STPLPages.LoginPage;
import STPLPages.ODTPage;
import STPLPages.ReportPage;
import STPLPages.STPL_HomePage;

public class STPL_Report extends stpl_Test_base {
	
	LoginPage loginpage;
	ODTPage odtpage;
	CorpSelectPage corpselectpage;
	STPL_HomePage stplhomepage;
	ReportPage reportpage;
	
	stpl_Test_base st = new stpl_Test_base();
	
	
//	public STPL_Report()
//	{
//		super();
//	}
	
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
		corpselectpage.userclick();
		corpselectpage.LoginButton();
		stplhomepage = new STPL_HomePage();
		Thread.sleep(3000);
		stplhomepage.viewall();
		Thread.sleep(2000);
		reportpage = new ReportPage();
		
	}
	
	@Test
	public void TransCount()
	{
		String Count = reportpage.reportcount();
		System.out.println(Count);
		if(Count.equalsIgnoreCase("0 Records found"))
		{
			System.out.println("No Transaction for the day");
		}
		else
		{
			System.out.println("There are transactions from today");
		}
		
		
		
	}
	
	@Test
	public void backgroundclick() throws InterruptedException
	{
		String Count = reportpage.reportcount();
		System.out.println(Count);
		if(Count.equalsIgnoreCase("0 Records found"))
		{
			reportpage.backgroundclick();
		}
		else {
			System.out.println("Transactions are present for the day");
		}
		
		//e822be48-8f55-48ea-83de-6a6704be2ed1
		//a0d8035e-759a-49b1-a262-c6a50df46681
		reportpage.AdvanceFilter();
		

	}
		
	@AfterMethod
	public void TearDown()
	{
		//driver.quit();
	}
	
}
