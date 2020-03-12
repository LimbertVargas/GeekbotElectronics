package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import geekbotelectronics.ui.PageTransporter;
import geekbotelectronics.ui.pages.HeaderPage;

public class CommonSteps {
    private HeaderPage headerPage;

    @When("the user goes to (.*) page")
    public void loginPage(final String url) {
        PageTransporter.goToPage(url);
    }

    @Then("and alert (.*) is displayed")
    public void alertIsDisplayed() {

    }
}
