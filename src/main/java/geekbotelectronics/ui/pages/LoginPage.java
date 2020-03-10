package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import geekbotelectronics.utils.WebDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    /**
     * Finds the username or email box.
     */
    @FindBy(id = "username")
    private WebElement emailBox;

    /**
     * Finds the password box.
     */
    @FindBy(id = "password")
    private WebElement passwdBox;

    /**
     * Finds the login button
     */
    @FindBy(xpath = "//button[@name='login']")
    private WebElement AccessBtn;

    public void login(final String email, final String passwd) {
        WebDriverHelper.enterKeys(emailBox, email);
        WebDriverHelper.enterKeys(passwdBox, passwd);
        AccessBtn.click();
    }
}
