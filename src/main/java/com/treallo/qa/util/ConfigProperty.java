package com.treallo.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {
	
	InputStream inputstream;
	Properties prop;
	
	public ConfigProperty() throws IOException
	{
		inputstream = new FileInputStream("C:\\Users\\Manjunath Sudhakar\\eclipse-workspace\\trealloproject\\src\\main\\java\\com\\treallo\\qa\\propfile\\PropertyFile.properties");
		
		prop = new Properties();
		
		prop.load(inputstream);
	}
	
	public String setUrl()
	{
		return prop.getProperty("url");
	}
	
	public String username()
	{
		return prop.getProperty("user");
	}
	
	public String password()
	{
		return prop.getProperty("pass");
	}
	
	
	
	
	

}
