package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Cerrar sesión') and @class='logout hidden-sm-down']")
    private static WebElement logoutButton;

    public String getLogoutText() {
        return logoutButton.getAttribute("textContent");
    }
}
