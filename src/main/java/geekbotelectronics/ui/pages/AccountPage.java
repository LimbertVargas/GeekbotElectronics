package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    @FindBy(xpath = "//a[@href='https://www.nova.com.bo/datos-personales']")
    private WebElement editInformationLink;

    public void pressInformationLink() {
        editInformationLink.click();
    }
}
