package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true
,tags = "@SmokeTest and @RegressionTest or @SmokeTest"
,plugin = {"pretty","html:target/cucumber.html","json:targe/cucumber.json"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
