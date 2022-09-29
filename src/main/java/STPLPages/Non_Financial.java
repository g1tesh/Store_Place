package STPLPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.STPL.base.stpl_Test_base;

public class Non_Financial extends stpl_Test_base {
	
	//PageFactory
	
	@FindBy(className = "exportprint")
	WebElement export;
	
	@FindBy(id = "successText")
	WebElement recordText;
	
	@FindBy(id = "txnDetailsLink")
	WebElement backbutton;
	
	@FindBy(linkText = "Export")
	WebElement ExportXLS;
	
	//Initialize Page Factory
	
	public Non_Financial()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void exportReport() throws InterruptedException
	{
		Thread.sleep(2000);
		String Record = recordText.getText();
		System.out.println(Record);
		
		if(Record.equals("0 Records found "))
		{
			Thread.sleep(2000);
			backbutton.click();
		}
		else {
			System.out.println("Transactions found");
		}
		export.click();
		Thread.sleep(2000);
		ExportXLS.click();
	}
	
	
	

}
