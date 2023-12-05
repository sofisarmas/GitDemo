package CEPApp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features ="src/resource/Feature",
	glue ="CEPApp.stepDef",
	plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Runner extends AbstractTestNGCucumberTests{

}
