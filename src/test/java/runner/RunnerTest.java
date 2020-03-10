package runner;

import core.selenium.WebDriverManager;
import geekbotelectronics.utils.Reports;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

/**
 * RunCukesTest class.
 *
 * @author Melissa Román
 * @version 1.0
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"},
        glue = {"steps"},
        features = {"src/test/resources/features/"},
        monochrome = true)
public class RunnerTest extends AbstractTestNGCucumberTests {

    /**
     * Generates de utils after the test execution. Also quits from the browser.
     */
    @AfterTest
    public void afterExecution() {
        Reports.generateReport();
        WebDriverManager.getInstance().getWebDriver().quit();
    }
}
