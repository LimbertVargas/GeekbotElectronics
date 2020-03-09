package geekbotelectronics.utils;

import core.selenium.WebDriverConfig;
import org.apache.log4j.Logger;

import java.util.Properties;

public class GeekbotElectronicsConfig {
    private static GeekbotElectronicsConfig geekbotElectronicsConfig;
    private static Properties properties;
    private static Logger logger;

    private GeekbotElectronicsConfig() {
        properties = PropertiesReader.getProperties("geekbotelectronics.properties");
        logger = Logger.getLogger(WebDriverConfig.class.getName());
    }

    public static GeekbotElectronicsConfig getInstance() {
        if (geekbotElectronicsConfig == null) {
            geekbotElectronicsConfig = new GeekbotElectronicsConfig();
        }
        return geekbotElectronicsConfig;
    }

    public String getCredentials(final String property) {
        return properties.getProperty(property);
    }
}
