package STPLPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.STPL.base.stpl_Test_base;

public class STPL_HomePage extends stpl_Test_base{
	
	
	//PageFactory
	@FindBy(linkText = "view all")
	WebElement ViewReport;
	
	@FindBy(id = "profileHighlight")
	WebElement Profile;
	
	@FindBy(id = "filterLabel")
	WebElement date;
	
	@FindBy(linkText = "view all")
	WebElement viewallreport;
	
	@FindBy(xpath = "//a[@onclick = 'NonFinancialFun()']")
	WebElement nonf;
	
	public STPL_HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	
	public String userprofile()
	{
		return Profile.getText();
	}
	
	public String TitleCheck()
	{
		return driver.getTitle();
	}
	public String getDate()
	{
		return date.getText();
	}
	
	public void viewall()
	{
		viewallreport.click();
	}
	
	public void NonFinanceClick() throws InterruptedException
	{
		Thread.sleep(2000);
		nonf.click();
		Thread.sleep(3000);
	}
	
	
}
