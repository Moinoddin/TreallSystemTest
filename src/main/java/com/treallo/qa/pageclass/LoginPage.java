package com.treallo.qa.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Log in') and @data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']")
	WebElement login_click;
	
	
	@FindBy(id="user")
	WebElement user_name;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//span[@class='css-19r5em7']//span")
	WebElement login_button;
	
	
	public WebElement loginClick()
	{
		return login_click;
	}
	
	public WebElement userName()
	{
		return user_name;
	}
	
	public WebElement usernameloginBtn()
	{
		return loginBtn;
		
	}

	public WebElement passWord()
	{
		return password;
	}
	
	public WebElement passswordloginBtn()
	{
		return login_button;
		
	}

	
	
	
}
