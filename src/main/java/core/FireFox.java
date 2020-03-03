package core;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * This class implements the configuration of the Firefox browser.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class FireFox implements IBrowser {
    /**
     * This method is used for configure the Firefox browser.
     *
     * @return a WebDriver with configuration the Firefox browser.
     */
    public WebDriver initDriver() {
        FirefoxDriverManager.getInstance().version("73.0.1").setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new FirefoxDriver(firefoxOptions);
    }
}
