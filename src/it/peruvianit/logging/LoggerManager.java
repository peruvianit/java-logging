package it.peruvianit.logging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerManager {
    private static final Logger LOGGER = Logger.getLogger(LoggerManager.class.getName());

    static {
        try {
            InputStream configFile = LoggerManager.class.getResourceAsStream("logging.properties");
            if (configFile != null) {
                LogManager.getLogManager().readConfiguration(configFile);
            } else {
                LOGGER.warning("Impossibile trovare il file di configurazione del logging.");
            }
        } catch (IOException e) {
            LOGGER.severe("Impossibile caricare la configurazione del logging: " + e);
        }
    }

    public static Logger getLogger(Class<?> clazz) {
        return Logger.getLogger(clazz.getName());
    }
}
