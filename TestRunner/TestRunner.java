package TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/rsdet.feature",
glue= {"StepDefinition","utilities"},
dryRun = false,
tags = {"@OLA2"},
//tags = {"@Smoke","@new"}, //And condition
//tags = {"@Smoke,@new"},// OR Condition
//tags= {"~@smoke"},//Skip condition
plugin = { "pretty", "html:target/cucumber-pretty"})

public class TestRunner {

}
