package geekbotelectronics.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogManager {
    private static Logger logger = Logger.getLogger(LogManager.class);
    private static LogManager logManager;

    private LogManager() {
        initLogManager();
    }

    public void initLogManager() {
        PropertyConfigurator.configure("log4j.properties");
        logger.setLevel(Level.ALL);
    }

    public static LogManager getInstance() {
        if (logManager == null) {
            logManager = new LogManager();
        }
        return logManager;
    }

    public Logger getLogger() {
        return logger;
    }
}
