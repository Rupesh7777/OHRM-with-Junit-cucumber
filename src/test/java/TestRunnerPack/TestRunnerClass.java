package TestRunnerPack;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/java/Featurefiles/ligin.feature",
		glue={"StepDef"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						},monochrome = true
				//,publish = true		
)
public class TestRunnerClass {

}
