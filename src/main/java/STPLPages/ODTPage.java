package STPLPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.STPL.base.stpl_Test_base;

public class ODTPage extends stpl_Test_base {
	
	
	//PageFactory
	@FindBy(id = "OtpEntered")
	WebElement ODT;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")   //Login
	WebElement submitODT;
	
	@FindBy(className = "err")             //  Invalid ODT. Please try again 
	WebElement ODTerror;
	
	//PageFactory Initialization 
	
	public ODTPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public String InvalidODT() throws InterruptedException 
	{
		submitODT.click();
		Thread.sleep(1000);
		return ODTerror.getText();
		
	}
	
	public void validodt(String currentodt)
	{
		ODT.sendKeys(currentodt);
		submitODT.click();
	}
	
	
	
}
