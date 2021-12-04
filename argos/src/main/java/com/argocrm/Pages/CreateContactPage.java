package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class CreateContactPage
{
	
	
	@FindBy(xpath ="//input[@name='property(saltName)']") private WebElement dropBtn;
	@FindBy(xpath ="//input[@name='property(First Name)'") private WebElement firstnameBtn;
	 @FindBy(xpath="//input[@id= 'Account Name']") private WebElement accountnameBtn;
	
     @FindBy(xpath="//input[@name= 'property(Email)']") private WebElement emailBtn;
     @FindBy(xpath="//input[@name='property(Department)']") private WebElement deptmentBtn;
     @FindBy(xpath="//input[@name='property(Home Phone)']") private WebElement homeBtn;
     @FindBy(xpath="//input[@name='property(Fax)") private WebElement faxBtn;
     
   //  @FindBy(xpath="//input[@name='property(Date of Birth)']") private WebElement dbBtn;
    
     @FindBy(xpath="//input[@name='property(Asst Phone)']") private WebElement asstphoneBtn;
     @FindBy(xpath ="//input[@name='property(Last Name)']") private WebElement lastnameBtn;
     @FindBy(xpath ="//input[@name='property(Last Name)']") private WebElement lastnameBtn1;
     @FindBy(xpath ="//input[@name='property(Vendor Name)']") private WebElement vendorBtn;
     @FindBy(xpath="//input[@name='property(Title)']") private WebElement titleBtn;
   //  @FindBy(xpath="//img[@src='/crm/images/cal.gif']") private WebElement calBtn;
     
     @FindBy(xpath="//input[@name='property(Phone)']") private WebElement phoneBtn;
     @FindBy(xpath="//input[@name='property(Other Phone)]") private WebElement OtherphoneBtn;
     @FindBy(xpath="//input[@name='property(Mobile)']") private WebElement mobileBtn;
     @FindBy(xpath="//input[@name='property(Assistant)]") private WebElement assistantBtn;
     @FindBy(xpath="//input[@name='property(Reports To)']") private WebElement reportesBtn;
     
     @FindBy(xpath="//input[@name='property(Mailing Street)']") private WebElement mailingstreetBtn;
     @FindBy(xpath="//input[@name='property(Mailing City)']") private WebElement  mailingcityBtn;
     @FindBy(xpath="//input[@name='property(Mailing State )']") private WebElement mailingsttateBtn;
     @FindBy(xpath="//input[@name='property(Mailing Zip)']") private WebElement mailingzipBtn;
     @FindBy(xpath="//input[@name='property(Mailing Country)']") private WebElement mailingcountryBtn; 
    // @FindBy(xpath="//input[@name='copyAddress']]") private WebElement copyaddressBtn;
     
     @FindBy(xpath="//input[@name='property(Other Street)']") private WebElement otherstreetBtn;
     @FindBy(xpath="//input[@name='property(Other City)']") private WebElement othercityBtn;
     @FindBy(xpath="//input[@name='property(Other State)']") private WebElement otherstateBtn;
     @FindBy(xpath="//input[@name='property(Other Zip)]") private WebElement otherzipBtn;

     @FindBy(xpath="//input[@name='property(Other Country)']") private WebElement othercountryBtn;
     
     @FindBy(xpath="//textarea[@name='property(Description)']") private WebElement propertydescBtn;
     @FindBy(xpath="(//input[@name='Button'])[1]") private WebElement saveBtn;
     @FindBy(xpath="(//input[@value='Save & New'])[1]") private WebElement savenewBtn;
     
     @FindBy(xpath="//input[@name='Cancel']") private WebElement cancleBtn ;
     
     @FindBy(xpath=  "//input[@value='Edit']") private WebElement editTab;
     @FindBy(xpath="//a[@align='right']") private WebElement rightBtn;
   @FindBy(xpath= "(//input[@value='Clone'])[1]") private  WebElement cloneBtn;
  @FindBy(xpath= "(//input[@value='Delete'])[1]") private WebElement  deleteBtn;
 // @FindBy(xpath="(//a[text()='Del'])[2]") private WebElement delBtn;
  @FindBy(xpath="//a[@href='/crm/logout.sas']") private WebElement logoutBtn;
     public CreateContactPage()
 	{
 		PageFactory.initElements(BaseTest.driver,this);
 	}

	public WebElement getDropBtnBtn() {
		return dropBtn;
	}



	public WebElement getFirstnameBtn() {
		return firstnameBtn;
	}



	public WebElement getAccountnameBtn() {
		return accountnameBtn;
	}



	public WebElement getEmailBtn() {
		return emailBtn;
	}



	public WebElement getDeptmentBtn() {
		return deptmentBtn;
	}



	public WebElement getHomeBtn() {
		return homeBtn;
	}



	public WebElement getFaxBtn() {
		return faxBtn;
	}



	public WebElement getAsstphoneBtn() {
		return asstphoneBtn;
	}



	public WebElement getLastnameBtn() {
		return lastnameBtn;
	}



	public WebElement getVendorBtn() {
		return vendorBtn;
	}



	public WebElement getTitleBtn() {
		return titleBtn;
	}



	public WebElement getPhoneBtn() {
		return phoneBtn;
	}



	public WebElement getOtherphoneBtn() {
		return OtherphoneBtn;
	}



	public WebElement getMobileBtn() {
		return mobileBtn;
	}



	public WebElement getAssistantBtn() {
		return assistantBtn;
	}



	public WebElement getReportesBtn() {
		return reportesBtn;
	}



	public WebElement getMailingstreetBtn() {
		return mailingstreetBtn;
	}



	public WebElement getMailingcityBtn() {
		return mailingcityBtn;
	}



	public WebElement getMailingsttateBtn() {
		return mailingsttateBtn;
	}



	public WebElement getMailingzipBtn() {
		return mailingzipBtn;
	}



	public WebElement getMailingcountryBtn() {
		return mailingcountryBtn;
	}



	public WebElement getOtherstreetBtn() {
		return otherstreetBtn;
	}



	public WebElement getOthercityBtn() {
		return othercityBtn;
	}



	public WebElement getOtherstateBtn() {
		return otherstateBtn;
	}



	public WebElement getOtherzipBtn() {
		return otherzipBtn;
	}



	public WebElement getOthercountryBtn() {
		return othercountryBtn;
	}



	public WebElement getPropertydescBtn() {
		return propertydescBtn;
	}



	public WebElement getSavenewBtn() {
		return savenewBtn;
	}



	public WebElement getCancleBtn() {
		return cancleBtn;
	}
	public WebElement getEditTab() {
		return editTab;
	}
	public WebElement getRightBtn() {
		return rightBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getCloneBtn() {
		return cloneBtn;
	}
	
//	public WebElement getDelBtn() {
	//	return delBtn;
	//}
	public WebElement getLastnameBtn1() {
		return lastnameBtn1;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
public void lname(String ln)
{
lastnameBtn.sendKeys(ln);


 saveBtn.click();
   // cloneBtn.click();
   // saveBtn.click();
  
	//savenewBtn.click();
	//editBtn.click();
	
   // deleteBtn.click();
   // saveBtn.click();
}
	public void clickeditTab(String lne) 
	{
		editTab.click();
		lastnameBtn.clear();
		lastnameBtn1.sendKeys(lne);
		saveBtn.click();
		cloneBtn.click();
		saveBtn.click();
		// logoutBtn.click();
		 
		 BaseTest.driver.navigate();
		 BaseTest.driver.navigate();
		 BaseTest.driver.navigate();
	}

	
}














	

	


