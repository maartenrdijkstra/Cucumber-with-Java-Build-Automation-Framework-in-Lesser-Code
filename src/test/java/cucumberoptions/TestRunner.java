package cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/features",
	    glue= "stepdefinitions",
		monochrome = true,
//		tags="@MobileTest",
		plugin = {"pretty",
				"html:target/cucumber/index.html",
				"json:target.cucumber.json",
				"junit:target/cukes.xml"}
				)
public class TestRunner {

}
