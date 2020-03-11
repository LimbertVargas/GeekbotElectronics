package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import geekbotelectronics.ui.pages.AccountPage;
import geekbotelectronics.ui.pages.LoginPage;
import geekbotelectronics.utils.GeekbotElectronicsConfig;
import org.testng.Assert;

public class LoginSteps {
    private LoginPage loginPage;
    private AccountPage accountPage;

    @When("the user login entering his email and password")
    public void theUserLoginEnteringHisEmailAndPassword() {
        loginPage = new LoginPage();
        loginPage.login(GeekbotElectronicsConfig.getInstance().getCredentials("email"),
                GeekbotElectronicsConfig.getInstance().getCredentials("password"));
    }

    @Then("Return to the (.*) page")
    public void miCuentaTitleIsShown() {
        accountPage = new AccountPage();
        Assert.assertEquals(accountPage.getTextTitle(),"Mi cuenta","The text does not match");
    }
}
