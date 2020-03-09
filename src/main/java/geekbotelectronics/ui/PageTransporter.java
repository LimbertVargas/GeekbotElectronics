package geekbotelectronics.ui;

import core.selenium.WebDriverManager;
import geekbotelectronics.ReadAppProperties;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public final class PageTransporter {
    private static WebDriver webDriver;

    public static void goToPage(final String url) {
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.get(TransporterHelper.getUrl(pageName));
    }
}
