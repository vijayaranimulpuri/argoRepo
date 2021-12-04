package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class CreateCampainPage {
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newcampaingnBtn;
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement cnameBtn;
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement cnameBtn1;
	@FindBy(xpath="(//input[@value='Save'])[1]")private WebElement saveBtn;
	@FindBy(xpath="//input[@value='Edit']") private WebElement editBtn;
	@FindBy(xpath="(//input[@value='Clone'])[1]") private WebElement cloneBtn;
	
	@FindBy(xpath="(//input[@value='Save & New'])[1]]") private WebElement savenandnewBtn;
	public  CreateCampainPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	
	public WebElement getNewcampaingnBtn() {
		return newcampaingnBtn;
	}
	public void clicknewcampaingnBtn() {
		newcampaingnBtn.click();
	}
	public WebElement getCampaignnameBtn() {
		return cnameBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getEditBtn() {
		return editBtn;
	}
	public WebElement getCnameBtn1() {
		return cnameBtn1;
	}
	public WebElement getCloneBtn() {
		return cloneBtn;
	}


	public WebElement getSavenandnewBtn() {
		return savenandnewBtn;
	}
	
	public void campaingnname(String cn)
	{
		cnameBtn.sendKeys(cn);
		saveBtn.click();
		//editBtn.click();
	}
	public void clickEditBtn(String cv)
	{
		editBtn.click();
		cnameBtn.clear();
		 cnameBtn1.sendKeys(cv);
		 saveBtn.click();
		 cloneBtn.click();
		// savenandnewBtn.click();
		 saveBtn.click();
	}






	
	
	
	
	}



