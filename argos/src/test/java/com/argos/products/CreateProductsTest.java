package com.argos.products;

import org.testng.annotations.Test;

import com.argocrm.Pages.HomePage;
import com.argocrm.Pages.ProductsPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class CreateProductsTest extends BaseTest {
    @Test
	public void SignInPage() throws Throwable{
	
//public static void main(String args[])throws Throwable{
// BaseTest bt=new BaseTest();
// bt.openBrowser();

   
SignInPage sp =new SignInPage();
FileLib filb=new FileLib();
  
 sp.login(filb.readPropertyData(PROP_PATH,"un"),
		 filb.readPropertyData(PROP_PATH, "pw"));
 
 
		 
	 
    }
}
  



