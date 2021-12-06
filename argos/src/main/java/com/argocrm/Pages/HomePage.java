package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;
import com.argocrm.genericLib.WebDriverCommonLib;

public class HomePage{
	
	//@FindBy(xpath = "//a[text()='Contacts']") private WebElement ContactsTab;
	@FindBy(xpath ="//a[text()='Home']") private WebElement HomeTab;
	
	public HomePage() 
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	public WebElement getHomeTab() {
		return HomeTab;
	}

    public void clickHomeTab()
   {
   HomeTab.click()	;
   }

	
    
    
	} 

		
	

	


