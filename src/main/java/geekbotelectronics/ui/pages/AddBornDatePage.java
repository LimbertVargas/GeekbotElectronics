package geekbotelectronics.ui.pages;

import geekbotelectronics.ui.BasePage;
import geekbotelectronics.utils.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBornDatePage extends BasePage {
    @FindBy(xpath = "//input[@name='birthday']")
    private WebElement bornDateTxtBox;

    @FindBy(name = "password")
    private WebElement passwdBox;

    @FindBy(xpath = "//button[@data-link-action='save-customer']")
    private WebElement saveBtn;

    public void saveForm(final String bornDate, final String passwd) {
        WebDriverHelper.enterKeys(bornDateTxtBox, bornDate);
        WebDriverHelper.enterKeys(passwdBox, passwd);
        saveBtn.click();
    }
}
