package core;

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
}
