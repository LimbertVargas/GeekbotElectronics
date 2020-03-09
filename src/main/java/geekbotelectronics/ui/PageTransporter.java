package geekbotelectronics.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class PageTransporter {
    private static WebDriver webDriver;

    public static void goToPage(final String url) {
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.get(TransporterHelper.getUrl(pageName));
    }
}
