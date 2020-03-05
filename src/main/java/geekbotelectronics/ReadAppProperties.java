package geekbotelectronics;

import core.selenium.utils.LoadProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadAppProperties {
    private static final String PROPERTIES_FILE = "geekbotelectronics.properties";
    private static Map<String, String> mapPropertiesFile;
    private static ReadAppProperties readAppProperties;
    private static Properties properties;

    private ReadAppProperties() {
        initialize();
    }

    public static ReadAppProperties getInstance() {
        if (readAppProperties == null) {
            readAppProperties = new ReadAppProperties();
        }
        return readAppProperties;
    }

    private void initialize() {
        mapPropertiesFile = new HashMap<>();
        addGeekbotElectronicsProperties();
    }

    private void addGeekbotElectronicsProperties() {
        properties = LoadProperties.readFile(PROPERTIES_FILE);
        properties.forEach((key, value) -> mapPropertiesFile.put(key.toString(), value.toString()));
    }

    public Map<String, String> getAppProperties() {
        return mapPropertiesFile;
    }
}
