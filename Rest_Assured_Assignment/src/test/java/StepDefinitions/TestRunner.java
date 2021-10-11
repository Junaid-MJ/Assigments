package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features\\report.feature", glue= {"parameterization"})
//plugin= {"json:target\\report.json"}

public class TestRunner {

}









