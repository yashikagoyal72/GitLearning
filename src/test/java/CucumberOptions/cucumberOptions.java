package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features", 
		dryRun=true,
		glue="stepDefinition", 
		monochrome = true,
		tags = "@SmokeTest or @RegressionTest",
		plugin= {"pretty", "html:target/cucumber.html"})
public class cucumberOptions extends AbstractTestNGCucumberTests{

}


