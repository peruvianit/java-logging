package it.peruvianit.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

import it.peruvianit.logging.utils.Utils;

public class MainWithLoggerCentralizer {

	// Ottieni un logger per la classe corrente
	private static final Logger LOGGER = LoggerManager.getLogger(MainWithLoggerCentralizer.class);

    public static void main(String[] args) {
        
    	// Modifica il livello di log a livello di info
        LOGGER.setLevel(Level.INFO);
  
    	// Esegui la registrazione di alcuni messaggi di log di diversi livelli
        LOGGER.info("Utilizzando la classe Logger centralizzata");
        
        /**
         *  Messaggio non visualizzato per configurazione del logging.properties
         *  
         *  it.peruvianit.logging.utils.Utils.level=INFO
         *  
         *  e non sarà visulizzato perché sull'implementazione il log è :
         *  
         *  LOGGER.finer("Se questo messaggio è visualizzato controllare il logging.propeties"); 
         *  
         *  che sarà escluso dal livello INFO.
         */
        Utils.message();
        
    }
}
