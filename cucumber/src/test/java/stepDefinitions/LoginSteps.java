package stepDefinitions;
//Sravani
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	
	@Given("User Open Browser")
	public void user_open_browser() {
System.setProperty("webdriver.chrome.driver","E:\\ArgoCRM\\ArgoCRM\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();
	   }

	@Given("^enters actitime URL$")
	public void enters_actitime_url() {
		driver.get("https://demo.actitime.com/login.do");
	    
	}

	@When("^user enter (.*)$")
	public void user_enters_admin(String un) {
		driver.findElement(By.name("username")).sendKeys(un);
	   
	}

	@When("user enters (.*)$")
	public void user_enters_manager(String pw) {
		driver.findElement(By.name("pwd")).sendKeys(pw);
	   
	}

	@When("user clicks on login Button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	}

	@Then("Home page should be Displayed")
	public void home_page_should_be_displayed() throws InterruptedException  {
		Thread.sleep(4000);
		Assert.assertEquals("actiTIME- Enter Time-Track",driver.getTitle());
		System.out.println("Home Page is Displayed,PASS");
	   
	}


}
