package com.argocrm.genericLib;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;

	public class BaseTest implements IAutoConsts {
		
		public static WebDriver driver;
	
		@BeforeClass
		public void openBrowser() throws Throwable
		{
			FileLib flib=new FileLib();
		    String browserName=flib.readPropertyData(PROP_PATH,"browser" );
			if(browserName.equalsIgnoreCase("chrome"))
			{
			
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				
			System.setProperty(GECKO_KEY, GECKO_VALUE)	;
			
			driver=new FirefoxDriver();	
			}
			else {
				System.out.println("enter proper browser name");
		}
			driver.manage().window().maximize();
		    String appURL	=flib.readPropertyData(PROP_PATH, "url");
			driver.get(appURL);
	     Thread.sleep(3000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
//	String eptedLoginTitle=flib.readPropertyData(PROP_PATH,"loginTitle");
//	wlib.verify(wlib.getPageTitle(),  exceptedLoginTitle,"loginTitle");
		wlib.verify(flib.readPropertyData(PROP_PATH,"loginTitle"),wlib.getPageTitle(),"loginTitle");
			
		}
		@AfterClass
		
		public void browser()
		{
		driver.quit();
		}
		
	
		   
	
		}
	

	



