package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import geekbotelectronics.ui.pages.AddBornDatePage;
import geekbotelectronics.utils.GeekbotElectronicsConfig;

public class BornDateSteps {
    private AddBornDatePage addBornDatePage;
    @And("the user adds a born date and the password")
    public void addsABornDate() {
        addBornDatePage = new AddBornDatePage();
        addBornDatePage.saveForm(GeekbotElectronicsConfig.getInstance().getCredentials("password"),
                GeekbotElectronicsConfig.getInstance().getCredentials("bornDate"));
    }
}
