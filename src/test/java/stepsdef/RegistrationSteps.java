package stepsdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DateTimeUtil;

public class RegistrationSteps {

	private ChromeDriver chromeDriver = null;
	private WebDriverWait driverWait = null;

	@Given("Lauching the the browser")
	public void lauching_the_the_browser() {
		chromeDriver = new ChromeDriver();
		driverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
		chromeDriver.get("https://demowebshop.tricentis.com/");
		chromeDriver.manage().window().maximize();

	}

	@Given("click on registration button")
	public void click_on_registration_button() {
		chromeDriver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}

	@When("Enter the details in all mandatory fields")
	public void enter_the_details_in_all_mandatory_fields() {
		chromeDriver.findElement(By.id("gender-male")).click();
		chromeDriver.findElement(By.id("FirstName")).sendKeys("banrey");
		chromeDriver.findElement(By.id("LastName")).sendKeys("Stinson");
		chromeDriver.findElement(By.xpath("//input[@id='Password']")).sendKeys("banrey@123");
		

	}

	@Then("Choose passwords")
	public void choose_passwords() {
		
		chromeDriver.findElement(By.id("Email")).sendKeys("banrey"+DateTimeUtil.datetimesec() +"@gmail.com");
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='ConfirmPassword']")));
		chromeDriver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("banrey@123");

	}

	@Then("click on register")
	public void click_on_register() {
		chromeDriver.findElement(By.id("register-button")).click();

	}

}
