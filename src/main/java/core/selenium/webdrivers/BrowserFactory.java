package core.selenium.webdrivers;

import java.util.HashMap;
import java.util.Map;

public abstract class BrowserFactory {
    private static final Map<String, IBrowser> BROWSERS = new HashMap<>();

    static {
        BROWSERS.put("chrome", new Chrome());
        BROWSERS.put("firefox", new Firefox());
    }

    public static IBrowser getBrowser(final String browserName) {
        return BROWSERS.get(browserName);
    }
}
