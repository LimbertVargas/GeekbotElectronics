package steps;

import cucumber.api.java.en.When;
import geekbotelectronics.ui.PageTransporter;

public class CommonSteps {
    @When("the user goes to (.*) page")
    public void loginPage(final String url) {
        PageTransporter.goToPage(url);
    }
}
