package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class NewPurchaseOrder {
	@FindBy(xpath="//input[@value='New Purchase Order']") private WebElement newpoBtn;
   @FindBy(xpath="//input[@name='property(Subject)']") private WebElement subjBtn;
public NewPurchaseOrder()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getNewpoBtn() {
	return newpoBtn;
}

public WebElement getSubjBtn() {
	return subjBtn;
}

public void NewpoBtn()
{
	newpoBtn.click();
}  

}
