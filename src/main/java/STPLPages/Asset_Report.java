package STPLPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.STPL.base.stpl_Test_base;

public class Asset_Report extends stpl_Test_base {
	
	//Page factory
	
	@FindBy(xpath = "//a[@id = 'reportsHighlight']")
	WebElement asset;
	
	@FindBy(id = "AssetReport")
	WebElement assetReport;
	
	@FindBy(xpath = "//div[@class = 'topicshead']")
	WebElement installation;
	
	
	
	public Asset_Report()
	{
		//Initiate Page Factory
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Action 
	public void reportclick() throws InterruptedException
	{
		Thread.sleep(2000);
		asset.click();
	}
	
	
	
	

}
