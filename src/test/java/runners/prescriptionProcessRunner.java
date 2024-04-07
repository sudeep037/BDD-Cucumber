package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"./src/test/resources/featureFiles"},
		glue= {"stepDefinitions","Hooks"},
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false
		)

public class prescriptionProcessRunner {

}
