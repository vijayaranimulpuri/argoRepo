package com.argos.products;

import org.testng.annotations.Test;

import com.argocrm.Pages.HomePage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;
import com.argocrm.genericLib.WebDriverCommonLib;

public class VerifyHomePageTest extends BaseTest  {
	
	  //  public static void main(String args[]) throws Throwable {
		//BaseTest bt=new BaseTest();
		//bt.openBrowser();
	  @Test
		public void Homepage() throws Throwable{
	    Thread.sleep(2000);
		SignInPage sp =new SignInPage(); 
		FileLib filb=new FileLib();
		  
		 sp.login(filb.readPropertyData(PROP_PATH,"un"),
				 filb.readPropertyData(PROP_PATH, "pw"));
	
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();		
   //FileLib flib= new FileLib();
   // String exceptedLoginTitle=flib.readPropertyData(PROP_PATH,"HomeTitle");
  // wlib.verify(wlib.getPageTitle(),  exceptedLoginTitle,"HomeTitle");
	wlib.verify(FileLib.readPropertyData(PROP_PATH,"homeTitle"),wlib.getPageTitle(),"homeTitle");
   Thread.sleep(3000);
   
	 HomePage hp= new HomePage();
	 hp.clickHomeTab();
	}
	    
	    

}