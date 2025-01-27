package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests; // For TestNG
import io.cucumber.junit.Cucumber; // For JUnit
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/resources",
    glue = "stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class TestRunner {

}
