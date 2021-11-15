package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class CampaingsPage {
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaingsTab;

//@FindBy(xpath="//input[@value='New Campaign']") private WebElement newcampaingnBtn;

public  CampaingsPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getCampaingsTab() {
	return campaingsTab;
}

public void clickCampaingsTab() {
	campaingsTab.click();
}

}
