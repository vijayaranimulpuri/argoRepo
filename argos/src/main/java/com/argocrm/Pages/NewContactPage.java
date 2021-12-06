package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class NewContactPage {
	
	@FindBy(xpath= "//input[@value='New Contact']") private WebElement newcontactTab;
 //  @FindBy(xpath ="//input[@name='property(Last Name)']") private WebElement lastnameBtn;
	 // @FindBy(xpath="(//a[text()='Del'])[2]") private WebElement delBtn;
	public NewContactPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getNewcontactTab() {
		return newcontactTab;
	}
	public void newcontactTab()
	{
		newcontactTab.click();
	}
	
//	public WebElement getLastnameBtn() {
//		return lastnameBtn;
//	}
//	public void NewContactPage(String lastnameBtn)
//	{
//		lastnameBtn.sendkeys();
//	}
}
