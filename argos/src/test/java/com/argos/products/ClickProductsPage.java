package com.argos.products;

import org.testng.annotations.Test;


import com.argocrm.Pages.ProductsPage;
import com.argocrm.Pages.SignInPage;
import com.argocrm.genericLib.BaseTest;
import com.argocrm.genericLib.FileLib;



public class ClickProductsPage extends BaseTest {
	
	@Test
	 public void ProductPage()throws Throwable{

		SignInPage sp =new SignInPage(); 
		FileLib filb=new FileLib();
		sp.login(filb.readPropertyData(PROP_PATH,"un"),
				 filb.readPropertyData(PROP_PATH, "pw"));
		Thread.sleep(4000);
		ProductsPage pp=new ProductsPage();
		 pp. ProductsBtn();
		 Thread.sleep(4000);
		 ProductsPage pg=new ProductsPage();
		 pg. NewproductBtn();
		 Thread.sleep(4000);
		 ProductsPage pf=new ProductsPage();
		 pf.productsname(filb.readPropertyData(PROP_PATH, "pn"),
				 filb.readPropertyData(PROP_PATH, "sb")); 
		 Thread.sleep(4000);
		 
		
}
	

}	


