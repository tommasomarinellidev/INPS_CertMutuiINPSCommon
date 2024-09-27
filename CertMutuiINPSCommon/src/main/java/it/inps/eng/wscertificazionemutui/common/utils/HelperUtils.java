package it.inps.eng.wscertificazionemutui.common.utils;

import org.apache.commons.logging.impl.Log4JLogger;


public class HelperUtils {

	protected final static Log4JLogger logger = new Log4JLogger("HelperUtils");
	
	private static HelperUtils INSTANCE;

	

	public static HelperUtils getInstance() {
		if (INSTANCE == null) INSTANCE = new HelperUtils();
		return INSTANCE;
	}
	
	/**
	 * implementa replaceLast() di String, sostituisce in "string", 
	 * l'ultima occorrenza di "from" con "to" 
	 */
	public String stringReplaceLast(String string, String from, String to) {
	     int lastIndex = string.lastIndexOf(from);
	     if (lastIndex < 0) return string;
	     String tail = string.substring(lastIndex).replaceFirst(from, to);
	     return string.substring(0, lastIndex) + tail;
	}
	
	public String getFileExtension(String fileName) {
		String extension = "";
		int i = fileName.lastIndexOf('.');
		int p = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
		if (i > p) {
		    extension = fileName.substring(i+1);
		}
		return extension;
	}
	
	public String getStringFromBoolean(Boolean value){
		String flag = (value != null && value.equals(true)) ? "S" : "N";
		return flag;
	}
	
	
}
