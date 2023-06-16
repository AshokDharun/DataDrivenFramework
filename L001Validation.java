package org.dd.testcases;

import java.io.IOException;

import org.dd.base.BroswerInstance;
import org.dd.page.Loginpage;
import org.testng.annotations.Test;

import dataprovide.ReadXLdata;

public class L001Validation extends BroswerInstance
{
	@Test(dataProvider = "p1",dataProviderClass = ReadXLdata.class)
	public void login001(String username, String password) throws IOException
	{
		Loginpage login=new Loginpage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
	}
	
}
