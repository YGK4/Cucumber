package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EpicStep {

	  

	  
	 @Given("I want to write a step with precondition")
	  public void i_want_to_write_a_step_with_precondition() {
		  System.out.println("GIVEN");
	  }

	  @Given("some other precondition")
	  public void some_other_precondition() {
		  System.out.println("Given)))é2");
	  }

	  @When("I complete action")
	  public void i_complete_action() {
		  System.out.println("whennnnnnnnn");
	  }

	  @Then("I validate the outcomes")
	  public void i_validate_the_outcomes() {
		  System.out.println("Thennnnnnnnnnnnnnnnnnnnnnn");
		  
	  }
	  
	  WebDriver driver = new ChromeDriver();
	  @Given("login into application")
	  public void login_into_application() {
		  System.out.println("login into applicaton");
		  driver.get("http://www.google.com");
	  }

	  @Given("i clicked something")
	  public void i_clicked_something() {
		  System.out.println("i clicked something");
	  }

	  @When("i tried")
	  public void i_tried() {
		  System.out.println("i tried");
	  }

	  @Then("it worked")
	  public void it_worked() {
		  System.out.println("it worked");
	  }

	}
