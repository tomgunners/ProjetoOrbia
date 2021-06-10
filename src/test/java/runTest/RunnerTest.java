package runTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty:STDOUT",
                "html:report",
                "json:target/cucumber.json",
                "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml",
        },
        features = "./src/test/resources/feature",
        glue = {"steps", "commons"},
        tags = {"~@ignore"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class Runner {

}