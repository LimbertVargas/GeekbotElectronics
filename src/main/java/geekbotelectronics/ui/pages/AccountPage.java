package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement myAccountTitle;

    public String getTextTitle() {
        return myAccountTitle.getText();
    }
}
