package it.peruvianit.logging;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Classe che utilizza il logging.properties di default
 * 
 * Livelli di log disponibili nel framework di logging di Java (java.util.logging) 
 * 
 * Level.SEVERE: Indica un errore grave che generalmente porta a un arresto anomalo dell'applicazione. 
 * 				 È utilizzato per segnalare problemi critici.
 * Level.WARNING: Indica un possibile problema o situazione anomala che non è grave quanto un errore 
 * 				 (SEVERE) ma che potrebbe richiedere attenzione.
 * Level.INFO: Fornisce messaggi informativi che descrivono l'avanzamento dell'applicazione senza indicare problemi.
 * Level.CONFIG: Utilizzato per segnalare la configurazione dell'applicazione o altri dettagli di configurazione.
 * Level.FINE: Indica messaggi di log dettagliati utili per la diagnosi dei problemi. È più dettagliato di INFO.
 * Level.FINER e Level.FINEST: Livelli di log più dettagliati rispetto a FINE, utilizzati per messaggi di log più 
 * 							   specifici e di dettaglio.
 * Level.OFF: Rappresenta un livello di log speciale che disabilita completamente la registrazione dei messaggi di log.
 */
public class MainDefault {

	// Ottieni un logger per la classe corrente
    private static final Logger LOGGER = Logger.getLogger(MainDefault.class.getName());

    public static void main(String[] args) {
        
    	
        LOGGER.setLevel(Level.ALL);

        //Imposta il livello dei gestori di log predefiniti a ALL
        Handler[] handlers = Logger.getLogger("").getHandlers();
        for (Handler handler : handlers) {
            handler.setLevel(Level.ALL);
        }
        
    	// Esegui la registrazione di alcuni messaggi di log di diversi livelli
        LOGGER.severe("Questo è un messaggio di livello SEVERE");
        LOGGER.warning("Questo è un messaggio di livello WARNING");
        LOGGER.info("Questo è un messaggio di livello INFO");
        LOGGER.config("Questo è un messaggio di livello CONFIG");
        LOGGER.fine("Questo è un messaggio di livello FINE");
        LOGGER.finer("Questo è un messaggio di livello FINER");
        LOGGER.finest("Questo è un messaggio di livello FINEST");

    }
}
