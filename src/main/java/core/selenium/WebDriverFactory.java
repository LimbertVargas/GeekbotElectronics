package core.selenium;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static core.selenium.Browsers.CHROME;
import static core.selenium.Browsers.FIREFOX;

/**
 * This class implements the logic for select a browser.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class WebDriverFactory {
    /**
     * This method is used for select a Browser.
     *
     * @param browser The browser parameter defines a input Browser
     * @return a webDriver.
     */

    public static WebDriver getWebDriver(final Browsers browser) {
        Map<Browsers, IBrowser> map;
        map = new HashMap<>();
        map.put(CHROME, new Chrome());
        map.put(FIREFOX, new FireFox());
        return map.get(browser).initDriver();
    }
}
