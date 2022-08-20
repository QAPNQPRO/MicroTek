package runner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, 
				features = "src/test/resources/features",
				glue= {"stepguides"},
				plugin = {"html:target/cucumber.html","json:target/cucumber.json"}
				
		)

public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
}
