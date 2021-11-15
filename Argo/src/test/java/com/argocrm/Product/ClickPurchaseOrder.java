package com.argocrm.Product;

import org.testng.annotations.Test;

import com.argocrm.Pages.NewPurchaseOrder;
import com.argocrm.Pages.ProductsPage;
import com.argocrm.Pages.PurchaseOrder;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;

public class ClickPurchaseOrder  extends BaseTest{
	@Test
	 public void Purchase() throws Throwable{

		SignInPage sp =new SignInPage(); 
		FileLib filb=new FileLib();
		sp.login(filb.readPropertyData(PROP_PATH,"un"),
				 filb.readPropertyData(PROP_PATH, "pw"));
		Thread.sleep(4000);
		
		PurchaseOrder po=new PurchaseOrder();
		po.choose();
		po.getPurchaseorderTab();
	
		Thread.sleep(4000);
		NewPurchaseOrder np=new NewPurchaseOrder();
		np.NewpoBtn();
		
}
}
