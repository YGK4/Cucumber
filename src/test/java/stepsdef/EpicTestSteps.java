package stepsdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EpicTestSteps {

	ChromeDriver chromeDriver = new ChromeDriver();
	WebDriverWait driverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));

	@Given("Luanch the browser")
	public void luanch_the_browser() {
		// ChromeDriver chromeDriver =new ChromeDriver();
		chromeDriver.get("https://www.inmotionhosting.com/");
		chromeDriver.manage().window().maximize();
	}

	@Given("click on login button")
	public void click_on_login_button() {
		chromeDriver.findElement(By.xpath("//a[@class=\"nav-link btn-secondary-alt btn-login\"]")).click();

	}

	@When("enter login details")
	public void enter_login_details() {
		//chromeDriver.switchTo().window("https://secure1.inmotionhosting.com/index/login");
		chromeDriver.findElement(By.id("username")).sendKeys("Barney");
		chromeDriver.findElement(By.id("password")).sendKeys("banrey@123");

	}

	@Then("Click on Login button")
	public void click_on_login_button2() throws InterruptedException {
		//driverWait.until(ExpectedConditions.invisibilityOf(chromeDriver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"))));
		//chromeDriver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
Thread.sleep(5000);
		chromeDriver.findElement(By.id("login-submit")).click();

	}

}
