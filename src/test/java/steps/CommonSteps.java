package steps;

import core.selenium.WebDriverConfig;
import core.selenium.WebDriverManager;
import cucumber.api.java.bs.I;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import geekbotelectronics.ui.PageTransporter;
import geekbotelectronics.ui.pages.HeaderPage;
import geekbotelectronics.ui.pages.InformationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonSteps {
    private InformationPage informationPage;

    @When("the user goes to (.*) page")
    public void loginPage(final String url) {
        PageTransporter.goToPage(url);
    }

    @Then("An successfull message is displayed")
    public void alertIsDisplayed() {
        informationPage = new InformationPage();
        WebDriverWait wait = new WebDriverWait(WebDriverManager.getInstance().getWebDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'actualizada correctamente.')]")));
        Assert.assertTrue(informationPage.isInformationUpdated());
    }
}
