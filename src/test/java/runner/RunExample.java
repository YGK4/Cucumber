package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Users\\GOPAL\\eclipse-workspace\\cucumber-example\\src\\test\\resources\\FeatureFiles\\Example.feature",
glue = "stepDefinitions", plugin = {
		"pretty", // Console output
		"html:target/cucumber-reports.html", // HTML report
		"json:target/cucumber.json", // JSON report for external tools
		"junit:target/cucumber.xml" // XML report for CI/CD tools
}, monochrome = true // For clean console output
)
public class RunExample {

}
