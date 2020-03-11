package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "")
    private WebElement InformationTitle;

    public String getTextTitle() {
        return InformationTitle.getText();
    }
}
