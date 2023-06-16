package org.dd.page;

import java.io.IOException;

import org.dd.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout
{
	WebDriver driver;
	public Logout (WebDriver driver) 
	{
		this.driver=driver;
	}
	public void selectUser() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElement("selectuser"))).click();

	}
	public void clickSignout() throws IOException 
	{
		driver.findElement(By.xpath(Utility.fetchElement("signout"))).click();
	
	}

}
