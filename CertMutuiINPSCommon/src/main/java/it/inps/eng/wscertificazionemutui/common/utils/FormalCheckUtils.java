package it.inps.eng.wscertificazionemutui.common.utils;


import java.util.Iterator;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import org.apache.log4j.Logger;

public class FormalCheckUtils {
	
	//codice fiscale
	//public static String CF_PATTERN = "[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]";
	public static String CF_PATTERN = "^([A-Za-z]{6}[0-9lmnpqrstuvLMNPQRSTUV]{2}[abcdehlmprstABCDEHLMPRST]{1}[0-9lmnpqrstuvLMNPQRSTUV]{2}[A-Za-z]{1}[0-9lmnpqrstuvLMNPQRSTUV]{3}[A-Za-z]{1})|([0-9]{11})$";
	private static FormalCheckUtils INSTANCE;

	private Logger logger = Logger.getLogger(getClass().getName());
	
	public static FormalCheckUtils getInstance() {
		if (INSTANCE == null) INSTANCE = new FormalCheckUtils();
		return INSTANCE;
	}
	
	public boolean isNumeric(String s) {
		if(s== null || s.isEmpty()){
			return false;
		}
		try{
			return s.matches("[-+]?\\d*\\.?\\d+");
		}catch(PatternSyntaxException e){ 
			logger.info("PatternSyntaxException", e);
			return false; }
	}  

//	private boolean isEmptyOrNullString(String... str) {
//		if(str==null) 
//			return true;
//		
//		for(String s : str) {
//			if(s==null||"".equals(s.trim()))
//				return true;
//		}
//		
//		return false;
//	}
	
	
	
	
	public static boolean isEmptyString(String s) {
		if (s == null || "".equals(s.trim())){
			return true;
		}
		return false;
	}


	public static boolean isEmptyBlob(byte[] f) {
		if ( f== null || f.length<=0 )
			return true;
		return false;
	}
	
	public static boolean isEmptyObject(Object obj) {
		if ( obj == null){
			return true;
		}
		return false;
	}
	

	public static boolean isEmptyBoolean(Boolean flag){
		if(flag == null){
			return true;
		}
		return false;
	}
 
	
	public static boolean isEmptyStringList(List<String> list) {
		if(list==null || list.isEmpty() )
			return true;
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) { 
			String item = iterator.next();
			if (item == null || item.isEmpty())
				return true;
		}
		return false;
	}
	
	public boolean isListaVuota(List<?> lista){
		return lista == null || lista.isEmpty() ? true : false;
	}

	public boolean isExtValida(String fileName, List<String> extensions) {
		if(isEmptyString(fileName)) return false;
		String myExt = HelperUtils.getInstance().getFileExtension(fileName);
		if(isEmptyString(myExt)) return false;
		if(extensions.contains(myExt.toLowerCase()))
			return true;
		return false;
	}

	

	/**
	 * Restituisce una stringa non nulla dell'oggetto passato per argomento
	 * 
	 * @param o l'oggetto da verificare
	 * @return una stringa vuota se l'argomento era null altrimenti la sua rappresentazione stringa.
	 */
	public String nNull(Object o) {
		// Se non nullo -> vers. stringa | stringa vuota
		String res = (o!=null) ? o.toString() : "";
		if(isEmptyString(res))
				logger.warn("Stringa null bypassata");
		return res;
	}
	
	
	
}
