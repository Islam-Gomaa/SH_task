package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Scenarios", 
glue = { "StepDefinitions" },plugin = {"json:target/Json Reports.json","html:target/Html Reports"})

public class Runner {

}
