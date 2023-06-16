package org.dd.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility 
{
public static Object fetchProperty(String key) throws IOException
{
	FileInputStream file=new FileInputStream("./config/config.properties");
	Properties property=new Properties();
	property.load(file);
	return property.getProperty(key);
}
public static String fetchElement(String ele) throws IOException
{
	FileInputStream file=new FileInputStream("./config/elements.properties");
	Properties property=new Properties();
	property.load(file);
	 //String element=property.getProperty(ele);
	 return property.get(ele).toString();
}
}
