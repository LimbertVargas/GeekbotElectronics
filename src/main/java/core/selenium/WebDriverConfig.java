package core.selenium;

import geekbotelectronics.utils.PropertiesReader;

import java.util.Properties;

public final class WebDriverConfig {
    private int implicitWait;
    private int explicitWait;
    private String browserName;
    private Properties properties;
    private static WebDriverConfig configInstance;

    private WebDriverConfig() {
        properties = PropertiesReader.getProperties("webDriver.properties");
        readProperties();
    }

    public static WebDriverConfig getInstance() {
        if (configInstance == null) {
            configInstance = new WebDriverConfig();
        }
        return configInstance;
    }

    public void readProperties() {
        browserName = properties.getProperty("browserName");
        implicitWait = Integer.parseInt(properties.getProperty("implicitWaitTime"));
        explicitWait = Integer.parseInt(properties.getProperty("explicitWaitTime"));
    }

    public String getBrowserName() {
        return browserName;
    }

    public int getImplicitWait() {
        return implicitWait;
    }

    public int getExplicitWait() {
        return explicitWait;
    }
}
