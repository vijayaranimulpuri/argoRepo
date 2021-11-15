package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;



public class PurchaseOrder {
	
@FindBy (xpath="//img[@id='scrollright']") private WebElement scrollTab;
@FindBy (xpath="//a[text()='Purchase Orders']") private WebElement purchaseorderTab;


public   PurchaseOrder()
{
	PageFactory.initElements(BaseTest.driver,this);
}


public WebElement getScrollTab() {
	return scrollTab;
}

public WebElement getPurchaseorderTab() {
	return purchaseorderTab;
}


public void choose() throws Throwable  {
	for(int i=1;i<=35;i++)
	{ 
		Thread.sleep(2000);
		scrollTab.click();	
	}
	purchaseorderTab.click();
}


}

