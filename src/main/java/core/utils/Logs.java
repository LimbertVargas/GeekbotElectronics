package core.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
    private static final String LOG4J_PROPERTIES = "log4j.properties";
    private static Logs instance;
    private static Logger log = Logger.getLogger(Logs.class);

    private Logs() {
        PropertyConfigurator.configure(LOG4J_PROPERTIES);
        log.setLevel(Level.ALL);
    }

    public static Logs getInstance() {
        if (instance == null) {
            instance = new Logs();
        }
        return instance;
    }

    public Logger getLog() {
        return log;
    }
}
