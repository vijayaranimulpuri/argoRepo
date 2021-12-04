package com.argocrm.Product;


import org.testng.annotations.Test;

import com.argocrm.Pages.ContactsPage;
import com.argocrm.Pages.CreateContactPage;
import com.argocrm.Pages.HomePage;
import com.argocrm.Pages.NewContactPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class ClickNewContact extends BaseTest {

	//public static void main(String args[])throws Throwable{
		// BaseTest bt=new BaseTest();
		// bt.openBrowser();
		 @Test
		 public void NewContactPage()throws Throwable{
		 Thread.sleep(3000);
		SignInPage sp =new SignInPage(); 
		FileLib filb=new FileLib();
		sp.login(filb.readPropertyData(PROP_PATH,"un"),
					 filb.readPropertyData(PROP_PATH, "pw"));
			
			
		 HomePage hp= new HomePage();
		 hp.clickHomeTab();
		 Thread.sleep(3000);
		 ContactsPage cp= new ContactsPage();
		 cp.clickContactsTab();
		 Thread.sleep(4000);
				 
		 NewContactPage np= new NewContactPage();
		 np.newcontactTab();
		 Thread.sleep(4000);
				 
		 CreateContactPage ccp=new  CreateContactPage();
		   ccp.lname(filb.readPropertyData(PROP_PATH,"ln"));
		   ccp.clickeditTab(filb.readPropertyData(PROP_PATH,"lne"));
		   Thread.sleep(4000);
}
}