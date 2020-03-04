package core.selenium;

import core.selenium.utils.LoadProperties;

import java.util.Properties;

public class WebDriverConfig {
    private static final String PROPERTIES_FILE = "gradle.properties";
    private static WebDriverConfig webDriverConfig;
    private Properties properties;
    private static final String BROWSER = "browser";
    private static final String IMPLICIT_WAIT = "implicit-wait";
    private static final String EXPLICIT_WAIT = "explicit-wait";
    private static final String SLEEP_TIME = "sleep-time";

    private WebDriverConfig() {
        initialize();
    }

    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    private void initialize() {
        properties = LoadProperties.readFile(PROPERTIES_FILE);
    }

    public Browsers getBrowser() {
        return Browsers.valueOf(properties.getProperty(BROWSER).toUpperCase());
    }

    public long getImplicitWait() {
        return Long.parseLong(properties.getProperty(IMPLICIT_WAIT));
    }

    public long getExplicitWait() {
        return Long.parseLong(properties.getProperty(EXPLICIT_WAIT));
    }

    public long getSleepWait() {
        return Long.parseLong(properties.getProperty(SLEEP_TIME));
    }
}
