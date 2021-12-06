package bg;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidSteps {
@Before
public void beforeTest() {
	System.out.println("Before Test");
}
@After
public void afterTest() {
	System.out.println("After Test");
}
@Given("Open Browser")
public void open_browser() {
	System.out.println("Open Browser");
}
@Given("enter URL")
public void enter_URL() {
	System.out.println("enter Url");
}
@When("user give valid input")
public void user_give_valid_input() {
	System.out.println("user give valid input");
}
@Then("Field should accept")
public void field_should_accept() {
	System.out.println("Field Should Accept");
}
}
