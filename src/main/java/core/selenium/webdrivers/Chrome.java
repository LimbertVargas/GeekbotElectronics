package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.util.HashMap;

/**
 * This class implements the configuration of the Chrome browser.
 *
 * @author Limbert Alvaro Vargas Laura.
 * @version 0.0.1
 */
public class Chrome implements IBrowser {
    /**
     * This method is used for configure the Chrome browser.
     *
     * @return a WebDriver with configuration the Chrome browser.
     */
    public WebDriver initDriver() {
        ChromeDriverManager.getInstance().version("80.0.3987.132").setup();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("profile.default_content_setting_values.notifications", 2);
        chromePrefs.put("download.prompt_for_download", "false");
        String path = "C:\\Users\\Admin\\Downloads";
        File file = new File(path);
        chromePrefs.put("download.default_directory", file.getAbsolutePath());
        chromePrefs.put("safebrowsing.enabled", "true");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        return new ChromeDriver(chromeOptions);
    }
}
