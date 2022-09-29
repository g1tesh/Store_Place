package STPLPages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.STPL.base.stpl_Test_base;

public class ReportPage extends stpl_Test_base {
	
	//PageFactory
	
	@FindBy(id = "successText")
	WebElement RecordText;
	
	//@FindBy(xpath = "//div[@id = 'backgroundPopup' and @style = 'opacity: 0.7; display: block;']")
	@FindBy(id = "tourPopup")
	WebElement background;
	
	@FindBy(id = "txnDetailsLink")
	WebElement back;
	
	@FindBy(linkText = "Advance Filter")
	WebElement Filter;
	
	@FindBy(id = "selectCategory")
	WebElement filterselect;
	
	@FindBy(id = "datetypes")
	WebElement date;
	
	@FindBy(id = "butapply_add_cat")
	WebElement ApplyforFilter;
	
	@FindBy(xpath = "//a[contains(text(),'Submit')][1]")
	WebElement FilterApply;
	
	@FindBy(linkText = "Export")
	WebElement FinancialExport;
	
	@FindBy(className = "icon-export")
	WebElement XLSReport;
	
	//initialize page factory
	
	public ReportPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String reportcount()
	{
		
		return RecordText.getText();
		
	}
	
	public void backgroundclick() throws InterruptedException
	{
		
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(back).click().perform();
		Thread.sleep(4000);		
		//background.click();
	}
	
	public void AdvanceFilter() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Filter).click().perform();
		Thread.sleep(3000);
		Select select = new Select(filterselect);
		select.selectByVisibleText("Transaction Date");
		Thread.sleep(2000);
		Select select1 = new Select(date);
		select1.selectByVisibleText("This Week");
		Thread.sleep(2000);
		ApplyforFilter.click();
		Thread.sleep(2000);
		FilterApply.click();
		Thread.sleep(7000);
		FinancialExport.click();
		Thread.sleep(1000);
		XLSReport.click();
		
		
		
		
	}
	


}
