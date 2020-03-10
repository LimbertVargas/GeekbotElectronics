package geekbotelectronics.utils;

import java.util.HashMap;
import java.util.Map;

public abstract class TransporterHelper {
    private static final Map<String, String> URL_SUFIX = new HashMap<>();

    static {
        URL_SUFIX.put("login", "/mi-cuenta/");
    }

    public static String getUrl(final String url) {
        return GeekbotElectronicsConfig.getInstance().getCredentials("baseUrl") + URL_SUFIX.get(url);
    }
}
