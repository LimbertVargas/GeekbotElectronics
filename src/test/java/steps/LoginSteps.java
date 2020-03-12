package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import geekbotelectronics.ui.PageTransporter;
import geekbotelectronics.ui.pages.AccountPage;
import geekbotelectronics.ui.pages.HeaderPage;
import geekbotelectronics.ui.pages.InformationPage;
import geekbotelectronics.ui.pages.LoginPage;
import geekbotelectronics.utils.GeekbotElectronicsConfig;
import org.testng.Assert;

public class LoginSteps {
    private LoginPage loginPage;
    private AccountPage accountPage;
    private HeaderPage headerPage;
    private InformationPage informationPage;

    @When("the user login entering his email and password")
    public void theUserLoginEnteringHisEmailAndPassword() {
        loginPage = new LoginPage();
        loginPage.login(GeekbotElectronicsConfig.getInstance().getCredentials("email"),
                GeekbotElectronicsConfig.getInstance().getCredentials("password"));
    }

    @When("go to the (.*) page")
    public void returnLoginPage(final String url) {
        PageTransporter.goToPage(url);
    }

    @Then("CERRAR SESIÓN is in the header-top menu")
    public void textInTheHeaderTopMenu() {
        headerPage = new HeaderPage();
        Assert.assertEquals(headerPage.getLogoutText(), "Cerrar sesión", "There is not logout option");
        throw new cucumber.api.PendingException();
    }

    @Then("the user email appears on the datos-personales page")
    public void theUserEmailAppearsOnTheDatosPersonalesPage() {
        accountPage.pressInformationLink();
        informationPage = new InformationPage();
        Assert.assertEquals(informationPage.getEmailText(), GeekbotElectronicsConfig.getInstance().getCredentials("email"));
    }
}
