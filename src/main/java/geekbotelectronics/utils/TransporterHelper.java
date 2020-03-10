package geekbotelectronics.utils;

import java.util.HashMap;
import java.util.Map;

public abstract class TransporterHelper {
    private static final Map<String, String> URL_SUFFIX = new HashMap<>();

    static {
        URL_SUFFIX.put("login", "/mi-cuenta/");
    }

    public static String getUrl(final String url) {
        return GeekbotElectronicsConfig.getInstance().getCredentials("baseUrl") + URL_SUFFIX.get(url);
    }
}