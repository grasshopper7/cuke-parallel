package parallel;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;

public class StepDefinition {
	
	private String scenDesc;
	
	@Before
	public void before(Scenario scenario) {
		this.scenDesc = scenario.getName();
	}
	
	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(500);
	}
	
	@And("this is {string} step")
	public void step(String stepNum) {
		System.out.format("Thread %2d -> %18s - %s STEP\n", Thread.currentThread().getId(), scenDesc, stepNum);
	}
}