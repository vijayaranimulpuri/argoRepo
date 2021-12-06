package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class CustomViewPage {
	
	@FindBy(xpath= "//input[@value='New Contact']") private WebElement newContactBtn;
	
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	
	
}
