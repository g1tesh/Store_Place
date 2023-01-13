package com.STPL.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stpl_Test_base {
	
	public static Properties prop;
	public  static WebDriver driver;
	
	public stpl_Test_base()
	{
		prop = new Properties();
		try {
		FileInputStream FI = new FileInputStream("D:\\Workspace\\StorePlace\\src\\main\\java\\com\\STPL\\base\\config.properties");
		prop.load(FI);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}	
	}
	
	public static void initate()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	

}
