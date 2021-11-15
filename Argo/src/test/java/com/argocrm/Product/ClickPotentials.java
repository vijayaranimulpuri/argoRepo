package com.argocrm.Product;

import org.testng.annotations.Test;

import com.argocrm.Pages.ContactsPage;
import com.argocrm.Pages.CreateContactPage;
import com.argocrm.Pages.HomePage;
import com.argocrm.Pages.NewContactPage;
import com.argocrm.Pages.NewPotentialsPage;
import com.argocrm.Pages.PotentialsPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class ClickPotentials extends BaseTest {
	@Test
	 public void Potential()throws Throwable{

		SignInPage sp =new SignInPage(); 
		FileLib filb=new FileLib();
		sp.login(filb.readPropertyData(PROP_PATH,"un"),
				 filb.readPropertyData(PROP_PATH, "pw"));

//	       Thread.sleep(2000);
	       
//	       HomePage hp= new HomePage();
//			 hp.clickHomeTab();
//			 Thread.sleep(2000);
	
	       PotentialsPage ps=new PotentialsPage();
	      ps.clickpotentialsTab();
	      Thread.sleep(2000);
	      NewPotentialsPage npp=new NewPotentialsPage ();
		    npp.clickNewpotentialTab();
			Thread.sleep(2000);
		   NewPotentialsPage npe=new NewPotentialsPage ();
	      npe.clickPotentialname(filb.readPropertyData(PROP_PATH,"pn"),
	    		  filb.readPropertyData(PROP_PATH, "pv"),
	    		  filb.readPropertyData(PROP_PATH, "date"),
	    		
	    		  filb.readPropertyData(PROP_PATH,"stgname"));
	  	Thread.sleep(2000);
	  
	  	
}
}
