package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class SignInPage {
	

	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
    @FindBy(xpath ="//input[@title='Sign In']")
    private WebElement signinBtn;
    
    public SignInPage()
    {	
    PageFactory.initElements(BaseTest.driver,this);
    }

	public WebElement getUntb() {
		return untb;
	}
	

	public WebElement getPwtb()
	{
		return pwtb;
	}
	
	public WebElement getSignInBtn() {
		return signinBtn;
	}
	public void login(String un,String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		signinBtn.click();
	}

	
	
}
    

