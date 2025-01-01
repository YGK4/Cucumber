package stepDefinitions;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleDetaLog {

    WebDriver chromeDriver;
    WebDriverWait driverWait;
    
   
    @Given("Launch the browser")
    public void launch_the_browser() {
        chromeDriver = new ChromeDriver();
        driverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        chromeDriver.get("https://demowebshop.tricentis.com/");
        chromeDriver.manage().window().maximize();
    }

    @And("Click on the login button")
    public void click_on_login_button() {
        chromeDriver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
    }

    @When("Enter login details for the following users:")
    public void enter_login_details(DataTable dataTable) {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            //System.out.println("Attempting to log in with Username: " + user.get("username"));

            chromeDriver.findElement(By.xpath("//input[@id='Email']")).clear();
            chromeDriver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user.get("username"));

            chromeDriver.findElement(By.xpath("//input[@id='Password']")).clear();
            chromeDriver.findElement(By.xpath("//input[@id='Password']")).sendKeys(user.get("password"));

            chromeDriver.findElement(By.xpath("//input[@value='Log in']")).click();

            boolean isLoginSuccessful = chromeDriver.findElements(By.xpath("//a[normalize-space()='Log out']")).size() > 0;

            if (isLoginSuccessful) {
               // System.out.println("Logged in successfully with Username: " + user.get("username"));
                chromeDriver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
            } else {
               // System.out.println("Login failed for Username: " + user.get("username"));
            }

            chromeDriver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
        }

    }

    @Then("Close the browser")
    public void close_the_browser() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }
}
