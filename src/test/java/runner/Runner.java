package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "F:\\Users\\GOPAL\\eclipse-workspace\\cucumber-example\\EpicName.feature",
	glue = "stepDefinitions",
	dryRun = false)
	public class Runner {
		
	}
