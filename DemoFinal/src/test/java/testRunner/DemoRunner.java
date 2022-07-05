package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/NhsTest.feature",
		glue="stepDefination",
		monochrome=true,
		dryRun=false,
		plugin={"pretty","html:target/NhsDemoTest"}
		)

public class DemoRunner {

}
