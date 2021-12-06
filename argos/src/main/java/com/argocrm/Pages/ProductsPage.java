package com.argocrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.argocrm.genericLib.BaseTest;

public class ProductsPage {
	
@FindBy (xpath="//a[text()='Products']") private WebElement productsBtn;
@FindBy (xpath="//input[@value='New Product']") private WebElement newproductBtn;
@FindBy (xpath="//input[@name='property(Product Name)']") private WebElement propertyBtn;
@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement saveBtn;
@FindBy(xpath="(//input[@value='Delete'])[1]") private WebElement deleteBtn;
@FindBy(xpath= "//input[@value='New Task']") private WebElement newtaskBtn;
@FindBy(xpath= "(//input[@value='Edit'])[1]")private WebElement editBtn;

@FindBy(xpath="//input[@name='property(subject)']") private WebElement subjBtn;
public ProductsPage() {
	PageFactory.initElements(BaseTest.driver,this);
}


public WebElement getProductsBtn() {
	return productsBtn;
}

public WebElement getNewproductBtn() {
	return newproductBtn;
}

public WebElement getPropertyBtn() {
	return propertyBtn;
}

public void ProductsBtn()
{
	productsBtn.click();
}

public WebElement getSaveBtn() {
	return  saveBtn;
}


public WebElement getDeleteBtn() {
	return deleteBtn;
}


public WebElement getNewtaskBtn() {
	return newtaskBtn;
}


public WebElement getSubjBtn() {
	return subjBtn;
}


public WebElement getEditBtn() {
	return editBtn;
}


public void NewproductBtn()
{
	newproductBtn.click();
}
public void productsname(String pn,String sb)

{
	 propertyBtn.sendKeys(pn);
	 saveBtn.click();
	// deleteBtn.click();
	 newtaskBtn.click();
	 subjBtn.sendKeys(sb);
	 saveBtn.click();
	 
	 deleteBtn.click();

	 
}





	
}





