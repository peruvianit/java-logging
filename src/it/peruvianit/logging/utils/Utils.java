package it.peruvianit.logging.utils;

import java.util.logging.Logger;

import it.peruvianit.logging.LoggerManager;

/**
 * 
 * Classe per testare esclusione del logger
 *
 */
public class Utils {
	
	// Ottieni un logger per la classe corrente
	private static final Logger LOGGER = LoggerManager.getLogger(Utils.class);
		
	public static String message() {
		LOGGER.finer("Se questo messaggio è visualizzato controllare il logging.propeties");
		return "Messaggio non visualizzato";
	}
}
