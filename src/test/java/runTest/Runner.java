package runTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        features = "./src/test/resources/feature",
        glue = {"steps", "commons"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class Runner {

}