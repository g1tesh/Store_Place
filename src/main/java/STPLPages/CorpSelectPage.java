package STPLPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.STPL.base.stpl_Test_base;

public class CorpSelectPage extends stpl_Test_base {
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Select Corporate...')]")
	WebElement corp;
	
	@FindBy(xpath = "//span[contains(text(),'Select User...')]")
	WebElement user;
	
	@FindBy(css= "#userRoleName.userRoleNmaeSpan" )
	WebElement userrole;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement Login;
	
	//Initiate Page Factory
	
	public CorpSelectPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public void corpclick() throws InterruptedException
	{
		
		corp.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'"+prop.getProperty("CorpName")+"')]")).click();
	}
	
	public void userclick() throws InterruptedException
	{
		user.click();
		System.out.println("Hereeee");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'WakeFern_Toshiba_Admin(Vishal Lunawat)')]")).click();
	}
	
	public String UserRole()
	{
		//return userrole.getAttribute("innerHTML");
		return userrole.getText();
	}
	
	public void LoginButton()
	{
		Login.click();
	}
	

}
