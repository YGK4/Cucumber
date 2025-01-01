package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "F:\\Users\\GOPAL\\eclipse-workspace\\cucumber-example\\src\\test\\resources\\MultipleDataLogin.feature",
	glue = "stepDefinitions")
public class MultiDataLogRunner {

	
}
