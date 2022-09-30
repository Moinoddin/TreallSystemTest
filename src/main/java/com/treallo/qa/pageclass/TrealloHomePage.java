package com.treallo.qa.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrealloHomePage {
	
	
	WebDriver driver;
	
	public TrealloHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='board-tile mod-add']/p")
	WebElement create_Board;
	
	@FindBy(xpath="//label[@class='Yb0we30YG32Gdb']/input")
	WebElement board_Name;
	
	@FindBy(xpath="//button[@data-test-id='create-board-submit-button']")
	WebElement board_Name_create_Click;
	
	
	public WebElement createBoard()
	{
		return create_Board;
		
	}
	
	public WebElement boardName()
	{
		return board_Name;
		
	}
	
	public WebElement createBoardClick()
	{
		return board_Name_create_Click;
		
	}

}
