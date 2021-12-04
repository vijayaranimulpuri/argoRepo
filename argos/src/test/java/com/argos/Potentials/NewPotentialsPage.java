package com.argos.Potentials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.WebDriverCommonLib;

public class NewPotentialsPage {
	@FindBy(xpath="//input[@value='New Potential']") public WebElement newpotentialTab;
	@FindBy(xpath="//input[@name='property(Potential Name)']") public WebElement potentialnameBtn;
	@FindBy(xpath="//input[@name='property(Account Name)']") public WebElement  accontnameBtn;
	@FindBy(xpath="//select[@name='property(Type)']") public WebElement typeBtn;
	@FindBy(xpath="//input[@name='property(Next Step)']") public WebElement nextstepBtn;
	@FindBy(xpath="//input[@name='property(Campaign Source)']") public WebElement campaignsourceBtn;
	@FindBy(xpath="//input[@name='property(Amount)']") public WebElement amountBtn;
	@FindBy(xpath="//input[@name='property(Closing Date)']") public WebElement closingdateBtn;
	@FindBy(xpath="//select[@name='property(Stage)']") public WebElement stageBtn;
	@FindBy(xpath="//input[@name='property(Probability)']") public WebElement probabilityBtn;
	@FindBy(xpath="//select[@name='property(Lead Source)']") public WebElement leadsourceBtn;
	@FindBy(xpath="(//input[@value='Save'])[1]") public WebElement saveBtn;

	
	
	public NewPotentialsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	public WebElement getNewpotentialsTab() {
		return newpotentialTab;
	}
	public void clickNewpotentialTab()
	{
		newpotentialTab.click();
	}

	public WebElement getPotentialnameBtn() {
		return potentialnameBtn;
	}
	public void clickPotentialnameBtn() {
		potentialnameBtn.click();
	}

	public WebElement getAccontnameBtn() {
		return accontnameBtn;
	}

	public WebElement getTypeBtn() {
		return typeBtn;
	}

	public WebElement getNextstepBtn() {
		return nextstepBtn;
	}

	public WebElement getCampaignsourceBtn() {
		return campaignsourceBtn;
	}

	public WebElement getAmountBtn() {
		return amountBtn;
	}
public void clickAmountBtn()
{
	amountBtn.click();
}
	public WebElement getClosingdateBtn() {
		return closingdateBtn;
	}
	public void clickClosingdateBtn() {
		closingdateBtn.click();
	}

	public WebElement getStageBtn() {
		return stageBtn;
	}

	public WebElement getProbabilityBtn() {
		return probabilityBtn;
	}

	public WebElement getLeadsourceBtn() {
		return leadsourceBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
    public void clickPotentialname(String pn,String pv,String date,String stgname)
	{
		potentialnameBtn.sendKeys(pn);
		accontnameBtn.sendKeys(pv);
		closingdateBtn.sendKeys(date);
		//saveBtn.click();
	
  
       WebDriverCommonLib wlib=new WebDriverCommonLib();	
       wlib.selectOption("Qualification", stageBtn);
       saveBtn.click();
       
    }
	
}
