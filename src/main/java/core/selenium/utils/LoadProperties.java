package core.selenium.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static Properties readFile(final String path) {
        Properties properties = new Properties();
        try {
            Logs.getInstance().getLog().info("Load property files...");
            InputStream inputStream = new FileInputStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            Logs.getInstance().getLog().error(e);
            throw new RuntimeException(e);
        }
        return properties;
    }
}
