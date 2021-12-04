package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class CreateLeadsPage {
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newleadBtn;
	@FindBy(xpath="//input[@name='property(Company)']")private WebElement companyBtn;
	@FindBy(xpath="//input[@name='property(Last Name)']")private WebElement lastnameBtn;
	@FindBy(xpath="//input[@name='property(Last Name)']")private WebElement lastnameBtn1;
	@FindBy(xpath="//input[@name='property(Email)']")private WebElement emailBtn;
	@FindBy(xpath="(//input[@value='Save'])[1]")private WebElement saveBtn;
	@FindBy(xpath="(//input[@value='Edit'])[1]") private WebElement editbtn;
	
public CreateLeadsPage ()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getNewleadBtn() {
	return newleadBtn;
}
public void clickNewleadBtn()	
{
	newleadBtn.click();
}

public WebElement getCompanyBtn() {
	return companyBtn;
}

public WebElement getLastnameBtn() {
	return lastnameBtn;
}

public WebElement getEmailBtn() {
	return emailBtn;
}

public WebElement getSaveBtn() {
	return saveBtn;
}
public WebElement getEditBtn() {
	return editbtn;
}
public WebElement getLastname1Btn() {
	return lastnameBtn1;
}
public void company(String cp)
{
	companyBtn.sendKeys(cp);
}
public void lname(String lnl)
{
	lastnameBtn.sendKeys(lnl);
	//saveBtn.click();
}
public void Clickemail(String em)
	{
		emailBtn.sendKeys(em);	
		saveBtn.click();
	
	}

public void Clickeditbtn(String lnv)
{
	editbtn.click();
	lastnameBtn.clear();
	lastnameBtn1.sendKeys(lnv);
	saveBtn.click();
}
}





