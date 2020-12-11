package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/feature",
        glue= {""},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class Runner {

}