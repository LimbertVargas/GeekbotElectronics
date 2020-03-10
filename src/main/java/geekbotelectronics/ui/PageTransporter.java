package geekbotelectronics.ui;

import core.selenium.WebDriverManager;
import geekbotelectronics.utils.TransporterHelper;
import org.openqa.selenium.WebDriver;

public final class PageTransporter {
    private static final WebDriver WEB_DRIVER = WebDriverManager.getInstance().getWebDriver();

    public static void goToPage(final String url) {
        WEB_DRIVER.get(TransporterHelper.getUrl(url));
    }
}
