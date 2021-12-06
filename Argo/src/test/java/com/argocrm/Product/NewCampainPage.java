package com.argocrm.Product;

import org.testng.annotations.Test;

import com.argocrm.Pages.CampaingsPage;
import com.argocrm.Pages.CreateCampainPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class NewCampainPage extends BaseTest {
	@Test
	 public void CampainPage()throws Throwable{

		SignInPage sp =new SignInPage(); 
		FileLib filb=new FileLib();
		sp.login(filb.readPropertyData(PROP_PATH,"un"),
				 filb.readPropertyData(PROP_PATH, "pw"));

		CampaingsPage cp=new CampaingsPage();
				cp.clickCampaingsTab();
		Thread.sleep(5000);		
				
				
				Thread.sleep(5000);	
				CreateCampainPage cce=new CreateCampainPage();
				cce.clicknewcampaingnBtn();
				Thread.sleep(5000);	
				CreateCampainPage ccp=new CreateCampainPage();
				Thread.sleep(5000);	
				ccp.campaingnname(filb.readPropertyData(PROP_PATH, "cn"));
				ccp.clickEditBtn(filb.readPropertyData(PROP_PATH,"cv"));
				
}
	
		
	
}
