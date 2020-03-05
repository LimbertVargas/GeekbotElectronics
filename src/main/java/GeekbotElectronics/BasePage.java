package GeekbotElectronics;

import core.selenium.webdrivers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver, this);
    }
}
