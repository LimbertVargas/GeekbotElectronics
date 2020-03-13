package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='birthday']")
    private WebElement bornDateBox;

    //@FindBy(xpath = "//li[text()='Información actualizada correctamente.']")
    @FindBy(xpath = "//li[contains(text(),'actualizada correctamente.')]")
    private static WebElement alertText;

    public static WebElement getAlertText() {
        return alertText;
    }

    public String getEmailText() {
        return emailTextBox.getAttribute("value");
    }

    public String getBornDate() {
        return bornDateBox.getAttribute("value");
    }

    public boolean isInformationUpdated() {
        return alertText.getText().contains("actualizada correctamente.");
    }
}
