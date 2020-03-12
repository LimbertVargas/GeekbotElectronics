package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailTextBox;

    public String getEmailText() {
        return emailTextBox.getAttribute("value");
    }
}
