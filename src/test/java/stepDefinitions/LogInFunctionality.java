package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInFunctionality {
	 ChromeDriver chromeDriver = null;
	 WebDriverWait driverWait = null;

	@Given("Launchinto the browser")
	public void launchinto_the_browser() {
		chromeDriver = new ChromeDriver();
		driverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
		chromeDriver.get("https://demowebshop.tricentis.com/");
		chromeDriver.manage().window().maximize();

	   
	}
	
 @And("clicked on login button")
	 public void clicked_on_login_button() {
		chromeDriver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();

	 
 }
 
	@When("Entered log in details")
	public void entered_log_in_details() {
		
		chromeDriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("barney@gmail.com");

		chromeDriver.findElement(By.xpath("//input[@id='Password']")).sendKeys("banrey@123");

	}

	@Then("clicked on login")
	public void clicked_on_login() {
		chromeDriver.findElement(By.xpath("//input[@value='Log in']")).click();

	
}
}