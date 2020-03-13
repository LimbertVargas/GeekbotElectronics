package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {
    private By alert = By.cssSelector(".alert");

    //@FindBy(xpath = "//a[contains(text(),'Cerrar sesión') and @class='logout hidden-sm-down']")
    @FindBy(css = "#_desktop_user_info a[class*='logout']")
    private static WebElement logoutButton;

    public boolean logoutIsVisible() {
        return logoutButton.isDisplayed();
    }

    public void getAlertMessageText() {
        WebElement alertMessage = webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(alert));
    }
}
