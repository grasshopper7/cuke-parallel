package parallel;

import io.cucumber.core.cli.Main;

public class RunnerTest {
	
	public static void main(String[] args) {
		String[] params = new String[] { 
				"--threads", "4", "-g", "parallel",
				"-p", "timeline:src/test/resources/cucumber-parallel-report", 
				"src/test/resources/parallel/", };
		Main.run(params, Thread.currentThread().getContextClassLoader());
	}
}
