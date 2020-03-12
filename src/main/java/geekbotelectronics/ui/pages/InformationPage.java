package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='birthday']")
    private  WebElement bornDateBox;

    public String getEmailText() {
        return emailTextBox.getAttribute("value");
    }

    public String getBornDate() {
        return bornDateBox.getAttribute("value");
    }

}
