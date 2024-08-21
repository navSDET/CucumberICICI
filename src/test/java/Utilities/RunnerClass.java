package Utilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue="StepDefination",
        tags="@Integration",
        plugin = "pretty",
        monochrome = true,
        dryRun = false

)
public class RunnerClass
{

}
