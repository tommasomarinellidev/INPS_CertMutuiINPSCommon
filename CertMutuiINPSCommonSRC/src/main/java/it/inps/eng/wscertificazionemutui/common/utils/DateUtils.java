package it.inps.eng.wscertificazionemutui.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

public class DateUtils {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	public static String getNormalizatedDate(Date time, String format){
		DateFormat df = new SimpleDateFormat(format);
		String	date = df.format(time); 
		return date.toString();
	}
	
	public static String getDataCorrente(Date time, String format){
		DateFormat df = new SimpleDateFormat(format);
		String	date = df.format(time); 
		return date.toString();
	}
	
	public XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        XMLGregorianCalendar xmlCalendar = null;
        if(date == null) 	return xmlCalendar;
        gCalendar.setTime(date);
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
        	logger.error("errore nella trasformazione della data ",ex);
        }
        return xmlCalendar;
    }
	
	@SuppressWarnings("deprecation")
	public static String getAnnoCert(){

		String annoCert=""; 
		DateFormat dateFormat = new SimpleDateFormat("yyyy");
		long dataMilli = System.currentTimeMillis();
		Date date = new Date(dataMilli);
		date.setYear(date.getYear()-1);
		annoCert=dateFormat.format(date);
		return annoCert;
	}


	public static java.sql.Date utilDateToSqlDate(String dateFormat, Date data) throws ParseException{
		SimpleDateFormat dtFormat = new SimpleDateFormat(dateFormat);
		Date parsed = dtFormat.parse(dtFormat.format(data));
		java.sql.Date dataCert = new java.sql.Date(parsed.getTime());

		return dataCert;
	}
	
	public static String getEnglishData(Date d) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
		return simple.format(d);
	}
	
	/**
	 * Restituisce una stringa composta da data e ora in formato yyyyMMdd hh.mm.ss.SSS.
	 *	@param d
	 *	@return
	 */
	
	public static String getDataOraEnglish(Date d) {
		// Costruisce il SimpleDateFormat con il pattern
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd hh.mm.ss.SSS");
		// Controlla se la data passata è null. Se è null ritorna una stringa vuota
		if(d==null) return "";
		// Ritorna la data passata formattatata secondo il pattern
		return simple.format(d);
	}
	
	
	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); //minus number would decrement the days
		return cal.getTime();
	}
	
	public static String getAnnoMeseDataSucc(String dataCorrente) {
		String annoEstr=dataCorrente.substring(0, 4);
		String meseEstr=dataCorrente.substring(4, 6);
		
		if(dataCorrente.contains("/")){
			annoEstr=dataCorrente.substring(0, 4);
			meseEstr=dataCorrente.substring(5, 7);
		}
		if("12".equals(meseEstr)){
			meseEstr="01";
			annoEstr=String.valueOf((Integer.valueOf(annoEstr)+1));
		}
		else if(Integer.valueOf(meseEstr)>8)
			meseEstr=String.valueOf((Integer.valueOf(meseEstr)+1));
		else
			meseEstr="0"+String.valueOf((Integer.valueOf(meseEstr)+1));

		return annoEstr+meseEstr;
	}



	public static String getAnnoMeseDataPrec(String dataCorrente) { 
		String annoEstr=dataCorrente.substring(0, 4);
		String meseEstr=dataCorrente.substring(4, 6);
		
		if(dataCorrente.contains("/")){
			annoEstr=dataCorrente.substring(0, 4);
			meseEstr=dataCorrente.substring(5, 7);
		}
		
		if("01".equals(meseEstr)){
			meseEstr="12";
			annoEstr=String.valueOf((Integer.valueOf(annoEstr)-1));
		}
		else if(Integer.valueOf(meseEstr)>10)
			meseEstr=String.valueOf((Integer.valueOf(meseEstr)-1));
		else
			meseEstr="0" + String.valueOf((Integer.valueOf(meseEstr)-1));

		return annoEstr+meseEstr;
	}
	
	
	public static String getNomeMese(int m) { 
		switch (m) {
			case 1: return "gennaio";
			case 2: return "febbraio";
			case 3: return "marzo";
			case 4: return "aprile";
			case 5: return "maggio";
			case 6: return "giugno";
			case 7: return "luglio";
			case 8: return "agosto";
			case 9: return "settembre";
			case 10: return "ottobre";
			case 11: return "novembre";
			case 12: return "dicembre";
			default: return null;
		}
		//return null; // errore
	}
	
}