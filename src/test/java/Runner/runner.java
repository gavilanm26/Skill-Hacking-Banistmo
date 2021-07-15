package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"SeleniumGlueCode"},
        tags = {"@chat"}
)
public class runner {
}