package steps;

import cucumber.api.java.en.Given;
import geekbotelectronics.ui.PageTransporter;

public class CommonSteps {
    @Given("^I go to the (.*) page")
    public void iGoToTheLoginPage(final String url) {
        PageTransporter.goToPage(url);
    }
}
