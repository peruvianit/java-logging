package it.peruvianit.logging;

import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MainWithFileProperties {

	public static void main(String[] args) {
		try {
            // Carica il file di configurazione del logging dallo stesso package della classe
            InputStream configFile = MainDefault.class.getResourceAsStream("logging.properties");
            if (configFile != null) {
                LogManager.getLogManager().readConfiguration(configFile);
            } else {
                System.err.println("Impossibile trovare il file di configurazione del logging.");
            }
        } catch (Exception e) {
            System.err.println("Impossibile caricare la configurazione del logging: " + e);
        }
        // Ottieni un logger per la classe corrente
		
        Logger LOGGER = Logger.getLogger(MainWithFileProperties.class.getName());
        
        // Esegui la registrazione dei messaggi di log di diversi livelli
        LOGGER.severe("Questo è un messaggio di livello SEVERE");
        LOGGER.warning("Questo è un messaggio di livello WARNING");
        LOGGER.info("Questo è un messaggio di livello INFO");
        LOGGER.config("Questo è un messaggio di livello CONFIG");
        LOGGER.fine("Questo è un messaggio di livello FINE");
        LOGGER.finer("Questo è un messaggio di livello FINER");
        LOGGER.finest("Questo è un messaggio di livello FINEST");
    }
}
