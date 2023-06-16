package org.dd.base;

import java.io.IOException;

import org.dd.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BroswerInstance
{
	public WebDriver driver;
	@BeforeMethod
	public void initiDriverInstance() throws IOException
	{
		if(Utility.fetchProperty("broswername").toString().equalsIgnoreCase("chrome"))
		{
			System.out.println("is that chrome");
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();	
		}else if(Utility.fetchProperty("broswername").toString().equalsIgnoreCase("edge"))
		{
			System.out.println("the driver is not add path");
			driver=new EdgeDriver();
		}else if(Utility.fetchProperty("broswername").toString().equalsIgnoreCase("firefox"))
		{
			System.out.println("the driver is not add path");
			driver=new FirefoxDriver();
		}else
		{

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exr");
			driver=new ChromeDriver();	
		}

		driver.get(Utility.fetchProperty("applicationURL").toString());
	}
	
	@AfterMethod
	public void closeInstance()
	{
		driver.close();
	}
}
