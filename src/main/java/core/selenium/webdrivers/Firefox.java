package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class implements the configuration of the Firefox browser.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class Firefox implements IBrowser {
    /**
     * This method is used for configure the Firefox browser.
     *
     * @return a WebDriver with configuration the Firefox browser.
     */
    public WebDriver initDriver() {
        FirefoxDriverManager.getInstance().setup();
        return new FirefoxDriver();
    }
}
