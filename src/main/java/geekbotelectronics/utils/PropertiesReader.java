package geekbotelectronics.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class PropertiesReader {
    public static Properties getProperties(final String path) {
        try (InputStream inputStream = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            LogManager.getInstance().getLogger().error(e + path + "could not be read");
            throw new RuntimeException(e + path + "could not be read");
        }
    }
}
