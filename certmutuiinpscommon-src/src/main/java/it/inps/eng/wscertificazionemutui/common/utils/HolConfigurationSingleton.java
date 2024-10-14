package it.inps.eng.wscertificazionemutui.common.utils;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.impl.Log4JLogger;

/**
 * 
 * @author Andrea M. Orfeo
 *
 */
public class HolConfigurationSingleton {

	private static final String PROPERTIES_FILE = "HOL_BE_configuration.properties";
	private static HolConfigurationSingleton instance = null;
	private static Properties properties = new Properties() ;
	Log4JLogger logger = new Log4JLogger(this.getClass().getName());
	
	private HolConfigurationSingleton () {
		
		InputStream is = null;
		try {
			is = this.getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);  
			properties.load(is) ;
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public static HolConfigurationSingleton getInstance() {
		
		if ( instance == null) 
			instance = new HolConfigurationSingleton();
		
		return instance;
	}
	
	
	public static void refresh(){
		instance = new HolConfigurationSingleton();
	}
	
	public void printAllProperties(){
		if(properties != null){
			for(String key : properties.stringPropertyNames()) {
				if(!key.contains("password")){
					String value = properties.getProperty(key);
					logger.debug(key + "->" + value);
				}
			}
		}
	}
	
	public String getProperty(String chiave) {
		
		String description = properties.getProperty(chiave);
		
		if ( FormalCheckUtils.isEmptyString(description) )
			description = "Descrizione property di configurazione non trovata.";
		
		return description;
		
	}
	
	
	public String getProperty(String chiave, String defaultValue) {
		
		String description = properties.getProperty(chiave, defaultValue);
		
		if (FormalCheckUtils.isEmptyString(description) )
			description = "Descrizione property di configurazione non trovata.";
		
		return description;
		
	}
	
}
