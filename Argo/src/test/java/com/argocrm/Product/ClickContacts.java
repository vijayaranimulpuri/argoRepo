package com.argocrm.Product;


import org.testng.annotations.Test;

import com.argocrm.Pages.ContactsPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class ClickContacts extends BaseTest{
	
	//public static void main(String args[])throws Throwable{
   // BaseTest bt=new BaseTest();
   // bt.openBrowser();
	@Test
	public void ContactsPage() throws Throwable
	{
	
	SignInPage sp =new SignInPage(); 
	 FileLib filb=new FileLib();
	  
	 sp.login(filb.readPropertyData(PROP_PATH,"un"),
			 filb.readPropertyData(PROP_PATH, "pw"));
	 
	Thread.sleep(2000);
		 
		 
      ContactsPage cp= new ContactsPage();
      cp.clickContactsTab();
        
}
}
