package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"summary","timeline:src/test/resources/cucumber-parallel-report"})
public class RunnerTest extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
		return super.scenarios();
	}
}
