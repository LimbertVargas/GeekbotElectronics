package GeekbotElectronics;

import core.selenium.webdrivers.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PageTransporter {
    private static final String URL_BASE = "http://www.geekbotelectronics.com/";
    protected WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
}
