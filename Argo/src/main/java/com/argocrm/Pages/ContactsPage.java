package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class ContactsPage {
	@FindBy(xpath= "//a[text()='Contacts']") private WebElement ContactsTab;
	
	  	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getContactsBtn() {
		return ContactsTab;
	}

	public void clickContactsTab() 
	{
		ContactsTab.click();
	}

	
}
