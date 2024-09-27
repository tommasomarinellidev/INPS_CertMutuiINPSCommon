package it.inps.eng.wscertificazionemutui.common.utils;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.impl.Log4JLogger;

/**
 * 
 * @author Andrea M. Orfeo
 *
 */
public class HolErrorsSingleton {
	
	public static final String DESCRIZIONE_ERRORE_NON_TROVATA = "Descrizione errore non trovata.";

	private static final String PROPERTIES_FILE = "HOL_BE_errori.properties";
	private static final String VERSIONE = "VERSIONE";
	private static HolErrorsSingleton instance = null;
	private static Properties properties = new Properties() ;
	private Log4JLogger logger = new Log4JLogger(this.getClass().getName());
	
	private HolErrorsSingleton () {
		InputStream is = null;
		try {
			is = this.getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);  
			properties.load(is) ;
			logger.info("HolErrorsSingleton VERSIONE : "+getProperty(VERSIONE));
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public static HolErrorsSingleton getInstance() {
		
		if ( instance == null) 
			instance = new HolErrorsSingleton();
		
		return instance;
	}

	public String getProperty(String chiave) {
		
		String description = properties.getProperty(chiave);
		
		if (FormalCheckUtils.isEmptyString(description) )
			description = DESCRIZIONE_ERRORE_NON_TROVATA;
		
		return description;
		
	}	
	public String getDescrizioneCatalogoErroriByCodice(int codiceErrore) {
		
		
		String prefisso = Costanti.CatalogoErrori.class.getSimpleName();
		
		String chiave = prefisso + ""+codiceErrore;
		
		String description = properties.getProperty(chiave);
		
		if (FormalCheckUtils.isEmptyString(description) )
			description = DESCRIZIONE_ERRORE_NON_TROVATA;
		
		return description;
		
	}
	
}
