package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class PotentialsPage {
	@FindBy(xpath="//a[text()='Potentials']") public WebElement potentialsTab;
	
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getpotentialsTab() {
		return potentialsTab;
	}
	public void clickpotentialsTab()
	{
		potentialsTab.click();
	}
}
