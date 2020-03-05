package geekbotelectronics;

import core.selenium.webdrivers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage() {
        this.webDriverWait = WebDriverManager.getInstance().getWebDriverWait();
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
