package com.argocrm.Product;

import org.testng.annotations.Test;

import com.argocrm.Pages.CreateLeadsPage;
import com.argocrm.Pages.LeadsPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class ClickLeads extends BaseTest {
	
	 @Test
	 public void Leads()throws Throwable{
	 Thread.sleep(3000);
	SignInPage sp =new SignInPage(); 
	FileLib filb=new FileLib();
	sp.login(filb.readPropertyData(PROP_PATH,"un"),
				 filb.readPropertyData(PROP_PATH, "pw"));	
	Thread.sleep(2000);
	
    LeadsPage lp=new LeadsPage();
    lp.ClickLeadsBtn();
    Thread.sleep(2000);
    CreateLeadsPage clp=new CreateLeadsPage();
    clp.clickNewleadBtn();
    Thread.sleep(2000);
    CreateLeadsPage cll=new CreateLeadsPage();
    cll.company(filb.readPropertyData(PROP_PATH,"cp"));
	cll.lname(filb.readPropertyData(PROP_PATH,"lnl"));		
    cll.Clickemail(filb.readPropertyData(PROP_PATH,"em"));
    Thread.sleep(2000);
    cll.Clickeditbtn(filb.readPropertyData(PROP_PATH,"lnv"));
    Thread.sleep(2000);
}
}

