package org.dd.page;

import java.io.IOException;

import org.dd.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	WebDriver driver;

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enterUsername(String uname) throws IOException
	{
		driver.findElement(By.id(Utility.fetchElement("login_usernae_id"))).sendKeys(uname);
	}

	public void enterPassword(String pass) throws IOException
	{
		driver.findElement(By.id(Utility.fetchElement("login_pass_id"))).sendKeys(pass);
	}

	public void clickLogin() throws IOException
	{
		driver.findElement(By.id(Utility.fetchElement("sign_in"))).click();
	}
}
