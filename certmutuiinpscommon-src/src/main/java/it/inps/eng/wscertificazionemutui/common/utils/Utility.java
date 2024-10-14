package it.inps.eng.wscertificazionemutui.common.utils;

import java.math.BigDecimal;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * @author Sistemi2000 : Iovenitti Riccardo, Camorchia Michele
 *
 * Piccola classe di utilit� da utilizzare ovunque nell'applicazione. Realizza soltanto membri
 * statici e, grazie al costruttore protetto, non � possibile creare istanze (ala singleton).
 * 
 */
public class Utility {
	private static DecimalFormat df = null;
	private static SimpleDateFormat sdf = null;
	private static DecimalFormat sgndf = null;

	/**
	 * Inizializzatore statico.
	 */
	static {
		// formatter decimale
		df = new DecimalFormat("###,##0.00");
		// decimale con segno
		sgndf = new DecimalFormat("\u00A4 +###,##0.00;\u00A4 -###,##0.00");
		// formatter per le date
		sdf = new SimpleDateFormat("yyyyMMdd");
	}

	/**
	 * Costruttore base protetto. Non fa nulla. Evita solo che si possano
	 * creare istanze.
	 *
	 */
	protected Utility() {
		// non fa nulla
	}
	
	/**
	 * Restituisce la versione non-null della stringa passata per argomento. 
	 * 
	 * @param s la stringa da verificare
	 * @return una stringa vuota se null oppure l'originale
	 */
	public static String notNull(String s) {
		// operatore ternario docet
		return (s!=null) ? s : "";
	}
	
	/**
	 * Restituisce la versione non-null (con trim) della stringa passata per argomento. 
	 * 
	 * @param s la stringa da verificare
	 * @return una stringa vuota se null oppure l'originale trimmata
	 */
	public static String notNullTrimmed(String s) {
		// riusare!
		return notNull(s).trim();
	}
	
    /**
     * Restituisce la versione capitalizzata (prima maiuscola, resto cos� com'�) della stringa
     * passata per argomento. Restituisce null o stringa vuota se s � null o stringa vuota
     * rispettivamente.
     * 
     * @param s la stringa da capitalizzare
     * @return la versione capitalizzata di s
     */
    public static String capitalize(String s) {
        // nullo o vuoto?? lascia cos� com'�
        if(s==null || s.length()==0) return s;
        // prima maiuscola, il resto lascialo cos� com'�
        return s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
    }
    
	/**
	 * Inizializza eventuali properit� statiche.
	 */
	static {
		// inizializzatore statico, per ora vuoto.
	}

	/**
	 * Crea una java.util.Date a partire da una strniga anno/mese in formato <aaaa><mm>.
	 * Il giorno viene impostato a 1. Restituisce null in caso il parametro non sia
	 * formalmente corretto (o vuoto).
	 * 
	 * @param annoMese l'anno mese in formato aaaamm
	 * @return una java.util.Date o null se non valido.
	 */
	public static Date annoMeseToDate(String annoMese) {
		// usa l'altra versione con giorno a 1
		return annoMeseToDate(annoMese, 1);
	}
	
	/**
	 * 	Converte una data in formato gg/mm/yyyy in Date.
	 * 
	 * @param java.util.Date da convertire
	 * @return una java.util.Date o null se non valido
	 */
	public static Date stringToDate(String date) {
		if(date==null) return null;
		if(date.length()!=10) return null;
		try {
			// giorno
			int g = Integer.parseInt(date.substring(0, 2));
			// anno
			int a = Integer.parseInt(date.substring(6));
			// mese
			int m = Integer.parseInt(date.substring(3,5));
			// crea il date con i dati specificati
			return toDate(g, m, a);
		}
		catch(Exception e) {
			// errore... null
			return null;
		}
	}
	
	/**
	 * Converte una stringa anno/mese nel formato <aaaa><mm> in una java.util.Date 
	 * con il giorno impostato a gg. Restituisce null in caso i parametri non sono validi.
	 * 
	 * @param annoMese una stringa in formato aaaamm
	 * @param gg il giorno da impostare
	 * @return una java.util.Date o null se non valido
	 */
	public static Date annoMeseToDate(String annoMese, int gg) {
		// nullo o insufficiente? via...
		if(annoMese==null) return null;
		if(annoMese.length()!=6) return null;
		
		try {
			// anno
			int a = Integer.parseInt(annoMese.substring(0, 4));
			// mese
			int m = Integer.parseInt(annoMese.substring(4));
			// crea il date con i dati specificati
			return toDate(gg, m, a);
		}
		catch(Exception e) {
			// errore... null
			return null;
		}
	}

	/**
	 * Formatta una data (java.util.Date) in stringa nel formato gg-mm-aaaa.
	 * 
	 * @param date la data
	 * @return la versione stringa
	 */
	public static String formatDate(Date date) {
		// � buona??          si! converti       no, stringa vuota  
		return (date!=null) ? sdf.format(date) : "";
	}

	/**
	 * Formatta un double in stringa con 2 decimali fissi.
	 * 
	 * @param d un double
	 * @return la versione stringa corrispondente
	 */
	public static String formatDouble(double d) {
		
		// arrotonda a 2 cifre con un bigdecimal, regola HALF_UP
		BigDecimal bd = new BigDecimal(d).setScale(2, BigDecimal.ROUND_HALF_UP);
		// in stringa...
		return bd.toString();
/*
		// per miglioramento arrotondamento sostituire con ...
		
	    double bd = Math.round(d * Math.pow(10, 2 ))/Math.pow(10, 2);		
		return String.valueOf(bd);
*/		
	}
	
	/**
	 * Formatta un double in stringa con 2 decimali fissi.
	 * 
	 * @param d un double
	 * @return la versione stringa corrispondente
	 */
	public static String formatDoubleDown(double d) {
		
		// arrotonda a 2 cifre con un bigdecimal, regola HALF_UP
		BigDecimal bd = new BigDecimal(d).setScale(2, BigDecimal.ROUND_DOWN);
		// in stringa...
		return bd.toString();
/*
		// per miglioramento arrotondamento sostituire con ...
		
	    double bd = Math.round(d * Math.pow(10, 2 ))/Math.pow(10, 2);		
		return String.valueOf(bd);
*/		
	}

	/**
	 * Converte un Double in stringa con 2 decimali fissi.
	 * Restituisce null se l'argomento era null.
	 *  
	 * @param d un Double
	 * @return la stringa corrispondente
	 */
	public static String formatDouble(Double d) {
	
		// se non null, usa la versione con double tipo base altrimenti null
		return (d!=null) ? formatDouble(d.doubleValue()) : null;
/*
		// per miglioramento arrotondamento sostituire con ...
 		
		double dNew = roundTo(d, 2);
		return String.valueOf(dNew);		
*/		
	}

	/**
	 * Formatta un numero double con 2 cifre decimali fisse e separatore delle migliaia.
	 * 
	 * @param d il numero da formattare
	 * @return in formato stringa
	 */
	public static String formatNumber(double d) {
		// formatta
		return df.format(d);
	}

	/**
	 * Formatta un numero double con 2 cifre decimali fisse e separatore delle migalia.
	 * In pi� appone il segno + se positivo e - se negativo in qualsiasi caso.
	 * 
	 * @param d il numero fa formattare 
	 * @return in formato stringa
	 */
	public static String formatSignedNumber(double d) {
		// formatta con segno
		return sgndf.format(d);
	}

	/**
	 * Esegue un pad a sinistra (aggiunge un carattere) in modo che la lunghezza di s arrivni a num.
	 * Il metodo non fa nulla se s.length()>=num.
	 * 
	 * @param s la stringa
	 * @param c il carattere di padding
	 * @param num lunghezza finale voluta
	 * @return la stringa paddata.
	 */
	public static String padLeft(String s, char c, int num) {
		// Vuoto? Via
		if(s==null) return null;
		
		// Gi� + grande? Via
		if(s.length()>=num) return s;
		// Quanti ne mancano
		int max = s.length()-num;
		// Aggiunge
		for(int i=0;i<max;i++) s=(c+s);
		// Fine!
		return s;
	}

	/**
	 * Esegue un pad a destra (aggiunge un carattere) in modo che la lunghezza di s arrivni a num.
	 * Il metodo non fa nulla se s.length()>=num.
	 * 
	 * @param s la stringa
	 * @param c il carattere di padding
	 * @param num lunghezza finale voluta
	 * @return la stringa paddata.
	 */
	public static String padRight(String s, char c, int num) {
		// vuoto, via
		if(s==null) return null;
		
		// gi� + grande, via
		if(s.length()>=num) return s;
		// quanti ne mancano
		int max = s.length()-num;
		// accoda
		for(int i=0;i<max;i++) s+=c;
		// restituisce
		return s;
	}

	/**
	 * Arrotonda un numero decimale al numero di cifre volute. La regola � HALF_UP.
	 * 
	 * @param val numero da arrotondare
	 * @param digits numero di decimali voluti
	 * @return numero formattato
	 */
	public static double roundTo(double val, int digits) {
		
		// crea il bigdecimal del valore
		BigDecimal bd = new BigDecimal(val);
		// imposta la scala alle cifre volute
		bd = bd.setScale(digits, BigDecimal.ROUND_HALF_UP);
		// arrotonda e in formato stringa
		return bd.doubleValue();
/*		
		// per miglioramento arrotondamento sostituire con ...

		double bd = Math.round(val * Math.pow(10, digits ))/Math.pow(10, digits);
		return bd;		
*/		
	}

	/**
	 * Crea un oggetto java.util.Date partendo da 3 interi gg, mm, aaaa.
	 * 
	 * @param dd giorno (1..31)
	 * @param mm mese (1..12)
	 * @param yy anno (a 4 cifre)
	 * @return una java.util.Date corrispondente
	 */
	public static Date toDate(int dd, int mm, int yy) {
		// Calendario
		Calendar c = Calendar.getInstance();
		// Pulisci tutto
		c.clear();
		// Imposta i parametri... okkio, il mese per Calendar parte da 0!
		c.set(yy, mm-1, dd);
		// In date!
		return c.getTime();
	}

	/**
	 * Restituisce un date che rappresenta la data attuale.
	 * 
	 * @return data attuale
	 */
	public static Date today() {
		// ora...
		return new Date();
	}

	/**
	 * Restituisce in formato stringa (hh:mm:ss.ms) un tempo espresso in millisecondi.
	 *  
	 * @param time un tempo espresso in millisecondi
	 * @return la string corrispondente in formato hh:mm:ss.ms
	 */
	public static String toHMS(long time) {
		// Salva per dopo
		long tmp = time;
		// Riduce a secondi
		time/=1000;
		// Ore
		long h = time/3600;
		// toglie le ore
		time = time % 3600;
		// minuti
		long m = time/60;
		// toglie i minuti e ottiene i secondi
		long s = time % 60;
		// millisecondi restanti
		long ms = tmp % 1000;
		
		// Concatena
		String hms = ((h<10) ? "0" : "") + h + ":" +
		             ((m<10) ? "0" : "") + m + ":" +
		             ((s<10) ? "0" : "") + s + "." +
		             ms;
		
		// Restituisce
		return hms;
	}

	/**
	 * Converte una java.util.Date in una java.sql.Date
	 * 
	 * @param d una java.util.Date
	 * @return una java.sql.Date della data passata per argomento
	 */
	public static java.sql.Date toSQLDate(java.util.Date d) {
		// Complicato eh?
		// Semplice! d non � nullo? bene, � gi� una java.sql.Date? si, cast secco, no crea una java.sql.Date 
		// era nullo allora... restituisci null... easy.
		return (d!=null) ? ((d instanceof java.sql.Date) ? (java.sql.Date)d : new java.sql.Date(d.getTime())) : null;
	}
	
	/**
	 * Decodifica la sede dell'operatore restituendo DIREZIONE GENERALE se il codice della sede inizia con 00
	 * 
	 *	@param sedeCod
	 *	@param sedeDesc
	 *	@return La descrizione della sede
	 */
	public static String decodeSede(String sedeCod,String sedeDesc) {
		String result = sedeDesc;
		if((sedeCod==null)||(sedeCod.length()==0)) return result;
		String prefix = sedeCod.substring(0,2);
		if(prefix.equalsIgnoreCase("00")) result = "DIREZIONE GENERALE";
		return result;
	}
	/**
	 * Aggiunge un apostrofo a quello gi� presente nel nome o nel cognome per lettura db
	 */
	public static String aggiungiApostrofo(String stringaInput) {
	
		String stringaOutput = new String();
		
		for (int i = 0; i < stringaInput.length(); i++){
	
			if (stringaInput.substring(i,i+1).equalsIgnoreCase("'")) {
				stringaOutput = stringaOutput + stringaInput.substring(i,i+1) + "'";
			} else {
				stringaOutput = stringaOutput + stringaInput.substring(i,i+1);
			}	
		}
	
		return stringaOutput;
	}
	
//	/**
//	 * converte in euro
//	 */
//	public static String converteEuroString(double doubleInput) {
//		String PATTERN2 = "Euro #,##0.00;-#,##0.00";
//		DecimalFormat dfeuro = (DecimalFormat) DecimalFormat.getInstance();
//		dfeuro.applyPattern(PATTERN2);
//		String euro = dfeuro.format(doubleInput);
//		return euro;
//	}
//	
//	/**
//	 * converte in euro
//	 */
//	public static double converteEuroDouble(double doubleInput) {
//		String PATTERN2 = "#,##0.00;-#,##0.00";
//		DecimalFormat dfeuro = (DecimalFormat) DecimalFormat.getInstance();
//		dfeuro.applyPattern(PATTERN2);
//		double euro = new Double(dfeuro.format(doubleInput));
//		return euro;
//	}
	
		
}
