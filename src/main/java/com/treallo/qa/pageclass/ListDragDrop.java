package com.treallo.qa.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListDragDrop {
	
	WebDriver driver;
	
	public ListDragDrop(WebDriver driver)
	{
		this.driver = driver;
				
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(name="name")
	WebElement list_A;
	
	@FindBy(xpath="//input[@value='Add list']")
	WebElement add_List_A;
	
	@FindBy(name="name")
	WebElement list_B;
	
	@FindBy(xpath="//input[@value='Add list']")
	WebElement add_List_B;
	
	@FindBy(xpath="//div[@id=\"board\"]/div[1]/div/div[3]/a")
	WebElement click_onTextBox;
	
	@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
	WebElement text_area_list_A;
	
	@FindBy(xpath="//div[@id='board']/div[1]/div/div[2]/div/div[2]/div[1]/input")
	WebElement enter_card;

	@FindBy(xpath="//div[@id='board']/div[1]/div/div[2]/div/div[2]/div[1]/a")
	WebElement add_card;

	
	@FindBy(xpath="//span[@dir='auto']")
	WebElement drag_card;
	
	@FindBy(xpath="//div[@id='board']/div[2]/div/div[2]")
	WebElement drop_card;
	
	@FindBy(xpath="//*[@id='header']/div[3]/button[3]/div/span")
	WebElement click_acc_profile;
	
	@FindBy(xpath="/html/body/div[6]/div/section/div/nav/ul/li[11]/button")
	WebElement logout_btn;
	
	
	
	public WebElement selectListA()
	{
		return list_A;
		
	}
	
	public WebElement addSelectListA()
	{
		return add_List_A;
		
	}
	
	public WebElement selectListB()
	{
		return list_B;
		
	}
	
	public WebElement addSelectListB()
	{
		return add_List_B;
		
	}
	
	public WebElement clickOnListBox()
	{
		return click_onTextBox;
		
	}
	
	public WebElement textAreaSelect()
	{
		return text_area_list_A;
		
	}
	
	public WebElement cardName()
	{
		return enter_card;
		
	}
	
	public WebElement addCard()
	{
		return add_card;
		
	}
	
	public WebElement dargCard()
	{
		return drag_card;
		
	}
	
	public WebElement dropCard()
	{
		return drop_card;
		
	}
	
	public WebElement cliclonProfile()
	{
		return click_acc_profile;
		
	}
	
	public WebElement logoutButton()
	{
		return logout_btn;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
