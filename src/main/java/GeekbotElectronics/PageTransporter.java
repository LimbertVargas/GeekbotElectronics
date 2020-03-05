package GeekbotElectronics;

import com.sun.javafx.fxml.builder.URLBuilder;
import core.selenium.webdrivers.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public final class PageTransporter {
    private static final String URL_BASE = "http://www.geekbotelectronics.com/";
    private static WebDriver webDriver;
    private static Map<String, String> endpoint = new HashMap<>();

    private PageTransporter() {
    }

    public static void goToUrl(final String url) {
        endpoint.put("login", "login");
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.navigate().to(ReadAppProperties.getInstance()
                .getAppProperties().get(URL_BASE).concat(endpoint.get(url)));
    }
}
