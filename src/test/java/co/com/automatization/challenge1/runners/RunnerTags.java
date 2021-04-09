package co.com.automatization.challenge1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //features = "src/test/resources/features/challenge.feature",
        //features = "src/test/resources/features/challenge2.feature",
        features = "src/test/resources/features/challenge4.feature",
        tags = "@stories",
        glue = "co.com.automatization.challenge1.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags { }
