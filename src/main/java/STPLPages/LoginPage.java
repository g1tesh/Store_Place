package STPLPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.STPL.base.stpl_Test_base;

public class LoginPage extends stpl_Test_base {
	
	//PageFactory
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement LoginBtn;
	
	@FindBy(className = "img-responsive")
	WebElement image;
	
	@FindBy(className = "err")
	WebElement error;    // Invalid User Name or Password
	

	//PageFactory Initialize
	public LoginPage()
	{
		PageFactory.initElements(driver, this);  //This keyword is used to refer the current objects in a constructor
		
	}
	
	//Actions
	
	public boolean VerifyImage()
	{
		boolean img = image.isDisplayed();
		return img;
	}
	
	public void InvalidLoginTest(String usr,String pwd)
	{
		username.sendKeys(usr);
		password.sendKeys(pwd);
		LoginBtn.click();
		
	}
	
	public void CorrectLogin(String usr, String pwd)
	{
		username.sendKeys(usr);
		password.sendKeys(pwd);
		LoginBtn.click();
	}
	
	public String errorcheck()
	{
		return error.getText();
		
	}
	

}
