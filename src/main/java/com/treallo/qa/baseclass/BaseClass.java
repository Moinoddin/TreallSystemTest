package com.treallo.qa.baseclass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.treallo.qa.util.ConfigProperty;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigProperty configproperty;
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		// Lunching the Chrome Browser 
		driver = new ChromeDriver();
		
		// Created object of Properties file Object
		configproperty = new ConfigProperty();
		
		// Maximized Browser window
		driver.manage().window().maximize();
		
		//Lunching the Url of website
		driver.get(configproperty.setUrl());
	
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	

}
