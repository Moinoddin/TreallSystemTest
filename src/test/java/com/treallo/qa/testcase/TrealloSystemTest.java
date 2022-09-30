package com.treallo.qa.testcase;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.treallo.qa.baseclass.BaseClass;
import com.treallo.qa.pageclass.ListDragDrop;
import com.treallo.qa.pageclass.LoginPage;
import com.treallo.qa.pageclass.TrealloHomePage;
import com.treallo.qa.util.WaitaSec;

public class TrealloSystemTest extends BaseClass {

	LoginPage loginpage;
	TrealloHomePage treallHomepage;
	ListDragDrop listDragDrop;
	Actions actions;
	Point xy;

	@Test
	public void loginpageTest() throws InterruptedException
	{

		loginpage = new LoginPage(driver);

		loginpage.loginClick().click();

		loginpage.userName().sendKeys(configproperty.username());

		loginpage.usernameloginBtn().click();
		WaitaSec.waitSec();

		loginpage.passWord().sendKeys(configproperty.password());

		loginpage.passswordloginBtn().click();

		treallHomepage = new TrealloHomePage(driver);
		WaitaSec.waitSec();
		
		treallHomepage.createBoard().click();
		WaitaSec.waitSec();
		
		treallHomepage.boardName().sendKeys("DemoTest");

		treallHomepage.createBoardClick().click();

		WaitaSec.waitSec();
		listDragDrop = new ListDragDrop(driver); 

		listDragDrop.selectListA().sendKeys("List A");

		listDragDrop.addSelectListA().click();

		listDragDrop.selectListB().sendKeys("List B");

		listDragDrop.addSelectListB().click();

		listDragDrop.clickOnListBox().click();

		listDragDrop.textAreaSelect().sendKeys("card added");

		WaitaSec.waitSec();
		listDragDrop.cardName().click();
		listDragDrop.addCard().click();

		actions = new Actions(driver);
		actions.dragAndDrop(listDragDrop.dargCard(),listDragDrop.dropCard()).perform();

		xy = listDragDrop.dropCard().getLocation();
		System.out.println("X and Y co-ordinates of the card that you moved is: "+"X :"+xy.getX()+" Y is :"+xy.getY());

		WaitaSec.waitSec();
		listDragDrop.cliclonProfile().click();
		
		WaitaSec.waitSec();
		listDragDrop.logoutButton().click();

	}


}
