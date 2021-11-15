package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class LeadsPage {
	@FindBy(xpath="//a[text()='Leads']")  private WebElement leadsBtn;


public LeadsPage()
{
	PageFactory.initElements(BaseTest.driver,this);	
}


public WebElement getLeadsBtn() {
	return leadsBtn;
}
public void ClickLeadsBtn()
{
	leadsBtn.click();
}
}