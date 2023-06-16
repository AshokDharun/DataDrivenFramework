package org.dd.testcases;

import java.io.IOException;

import org.dd.base.BroswerInstance;
import org.dd.page.Logout;
import org.testng.annotations.Test;

public class L002Logout extends BroswerInstance
{
	
	public void logout002() throws IOException
	{
		
		Logout lg=new Logout(driver);
		lg.selectUser();
		lg.clickSignout();
	}
}
