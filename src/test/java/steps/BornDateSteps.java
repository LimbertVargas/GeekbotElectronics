package steps;

import cucumber.api.java.en.And;
import geekbotelectronics.ui.pages.AddBornDatePage;
import geekbotelectronics.ui.pages.InformationPage;
import geekbotelectronics.utils.GeekbotElectronicsConfig;
import org.testng.Assert;

public class BornDateSteps {
    private AddBornDatePage addBornDatePage;
    private InformationPage informationPage;

    @And("the user adds a born date and the password")
    public void addsABornDate() {
        addBornDatePage = new AddBornDatePage();
        addBornDatePage.saveForm(GeekbotElectronicsConfig.getInstance().getCredentials("password"),
                GeekbotElectronicsConfig.getInstance().getCredentials("bornDate"));
    }

    @And("the born date appears on information page")
    public void bornDateAppears() {
        informationPage = new InformationPage();
        Assert.assertEquals(informationPage.getBornDate(),GeekbotElectronicsConfig.getInstance().getCredentials("bornDate"));
    }
}
