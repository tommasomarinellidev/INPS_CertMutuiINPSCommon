package it.inps.eng.wscertificazionemutui.common.utils;

import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 
 * @author Sistemi2000 : Iovenitti Riccardo, Camorchia Michele
 *
 * La classe contiene alcuni metodi di utilit� per la formattazione di numeri, valute e date.
 */
public class Formatter {
	private static SimpleDateFormat sdf = null;
	private static SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static NumberFormat nf = null;
	private static Calendar cal = null;
	private static String[] Months = {"gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre"};
	private final static String[] base = {"uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove"};
	private final static String[] special = {"dieci", "undici", "dodici", "tredici", "quattordici", "quindici", "sedici", "diciassette", "diciotto", "diciannove"};
	private final static String[] tenth = {"vent", "trent", "quarant", "cinquant", "sessant", "settant", "ottant", "novant"};
	private final static String[] power = {"", "mila", "milion", "miliard"};
	private final static Locale locale = Locale.ITALIAN;
	
	
	
	/**
	 * Previene le new
	 *
	 */
	private Formatter() {
		// nessuna istanza
	}
	
	/**
	 * Formatta una data nel formato dd/mm/yyyy.
	 * 
	 * @param d la data da formattare
	 * @return la data formattata o stringa vuota in casso sia null
	 */
	public static String formatDate(Date d) {
		return (d!=null) ? sdf.format(d) : "";
	}
	
	public static String formatDateNew(Date d) {
		return (d!=null) ? sdfNew.format(d) : "";
	}
	
	public static String formatDateToStringFromSDF(Date d, String sdfString) {
		SimpleDateFormat sdf = new SimpleDateFormat(sdfString);
		return (d!=null) ? sdf.format(d) : "";
	}
	
	/**
	 * Formatta un Double (wrapper type) con 2 cifre decimali fisse e separatore delle migliaia.
	 * 
	 * @param d il valore
	 * @return la versione formattata o vuoto se null
	 */
	public static String formatDouble(Double d) {
		return (d!=null) ? formatDouble(d.doubleValue()) : "";
	}
	
	/**
	 * Formatta un double (tipo primitivo) con 2 cifre decimali fisse e separatore delle migliaia.
	 * 
	 * @param d il valore
	 * @return la versione formattata o vuoto se null
	 */
	public static String formatDouble(double d) {
		String format = nf.format(d);
		int ind = format.indexOf(",");
		if(ind!=-1) {
			String sub = format.substring(ind+1);
			if(sub.length()<2) format = format+"0";
		}
		else {
			format = format+",00";
		}
		return format;
	}

	/**
	 * Restituisce un oggetto "stringa vuota" se null, altrimento l'oggetto stesso.
	 * 
	 * @param o l'oggetto
	 * @return se stesso o una stringa vuota
	 */
	public static Object notNull(Object o) {
		return (o!=null) ? o : "";
	}
	
	/**
	 * Formatta una coppia anno, mese in una stringa di 6 cifre (aaaamm).
	 * 
	 * @param anno l'anno
	 * @param mese il mese
	 * @return la stringa concatenata 
	 */
	public static String annoMeseToString(int anno, int mese) {
		if(anno==0 || mese==0) return null;
		return anno + (((""+mese).length()<2) ? ("0"+mese) : (""+mese));	
	}
	
	public static String meseAnnoToString(int anno, int mese) {
		if(anno==0 || mese==0) return null;
		return (((""+mese).length()<2) ? ("0"+mese) : (""+mese)) + "/" +anno;	
	}
	
	public static String timestampToStringDate(Timestamp t) {
		if(t==null) return "";
		Date d = new Date(t.getTime());
		return formatDate(d);
	}
	
	public static String timestampToStringDateNew(Timestamp t) {
		if(t==null) return "";
		Date d = new Date(t.getTime());
		return formatDateNew(d);
	}
	
	/**
	 * Formatta un Date in una stringa aaaa/mm
	 *	@param date
	 *	@return
	 */
	public static String formatAnnoMese(Date date) {
		cal.setTime(date);
		return annoMeseToString(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1);
	}
	
	public static String formatMeseAnno(Date date) {
		cal.setTime(date);
		return meseAnnoToString(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1);
	}
	
	/**
	 * Formatta una coppia anno mese di una stringa (aaaamm) in una stringa separata (aaaa/mm).
	 * 
	 * @param annoMese l'anno e il mese (aaaamm)
	 * @return la stringa separata (aaaa/mm)
	 */
	public static String formatAnnoMese(String annoMese) {
		// nullo -> vuoto
		if(annoMese==null) return "";
		// non sono 6 cifre? va bene cos�
		if(annoMese.length()<6) return annoMese;
		// fraziona e concatena
		return annoMese.substring(0, 4)+"/"+annoMese.substring(4);
	}
	 /**
	  * Formatta una Stringa annoMese in mese/anno
	  *	@param annoMese
	  *	@return
	  */
	public static String formatMeseAnno(String annoMese) {
		// nullo -> vuoto
		if(annoMese==null) return "";
		// non sono 6 cifre? va bene cos�
		if(annoMese.length()<6) return annoMese;
		// fraziona e concatena
		return annoMese.substring(4)+"/"+annoMese.substring(0, 4);
	}
	
	/**
	 * Restituisce il mese in formato letterale dal suo ordinale.
	 * 
	 * @param nMese l'ordinale del mese (1 � gennaio)
	 * @return il mese letterale (e.g. gennaio)
	 */
	
	public static String getMese(int nMese) {
		// Controllo sulla validit� del numero passato
		if(nMese>12 && nMese<1) return "Mese errato";
		// Restituisco il mese associato al numero
		return Months[nMese-1];
	}
	
	public static String getEnglishData(Date d) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
		return simple.format(d);
	}
	
	/**
	 *  Restituisce una stringa formattata im modo che sia sempre di due caratteri. 
	 *  Es. : 1 -> "01"  12 -> "12"
	 *	@param nMese
	 *	@return La stringa formattata
	 */
	public static String getMeseWithZero(int nMese) {
		if(nMese>0 && nMese<9) return "0"+nMese;
		return Integer.toString(nMese);
	}
	/**
	 * Restituisce una stringa composta da data e ora.
	 * 
	 * @param La data da formattare
	 * @return la stringa formattatta
	 */
	
	public static String getDataOra(Date d) {
		// Costruisce il SimpleDateFormat con il pattern
		SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		// Controlla se la data passata � null. Se � null ritorna una stringa vuota
		if(d==null) return "";
		// Ritorna la data passata formattatata secondo il pattern
		return simple.format(d);
	}
	
	/**
	 * Restituisce una stringa composta da data e ora in formato yyyyMMdd hh.mm.
	 *	@param d
	 *	@return
	 */
	
	public static String getDataOraEnglish(Date d) {
		// Costruisce il SimpleDateFormat con il pattern
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd hh.mm");
		// Controlla se la data passata � null. Se � null ritorna una stringa vuota
		if(d==null) return "";
		// Ritorna la data passata formattatata secondo il pattern
		return simple.format(d);
	}
	
	
	/**
	 * Restituisce una stringa con la data formattata gg-mm-yyyy.
	 * 
	 * @param La data da formattare
	 * @return la stringa formattatta
	 */
	
	public static String getData(Date d) {
		// Controlla se la data passata � null. Se � null ritorna una stringa vuota
		if(d==null) return "";
		// Ritorna la data passata formattatata secondo il pattern
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		return sdf2.format(d);
	}
	
	/**
	 * Inverte una stringa del codice e descrizione sede dalla forma <codice>/<desc> alla forma
	 * <desc>/<codice> o viceversa. Il separatore delle essere uno slash "/",
	 * 
	 * @param codSed la coppia <codice>/<desc> o vice versa.
	 * @return la stringa invertita
	 */
	public static String swapCodiceSede(String codSed) {
		// nulla?? cos� com'�
		if(codSed==null) return null;
		
		// Cerca l'occorenza del primo /
		int idx = codSed.indexOf('/');
		// non trovato?? cos� com'�
		if(idx==-1) return codSed;
		// scambia posizioni
		return (codSed.substring(idx+1) + "/" + codSed.substring(0, idx));
	}
	
	public static String n2l(double d) {
        String s = formatDouble(d);
        String decPart = getDecimalPart(s);
        String intPart = getIntegerPart(s);

        if (intPart.length() == 0) {
            intPart = "zero";
        }
        return intPart + "/" + decPart;
    }

    private static String getDecimalPart(String s) {
        return s.substring(s.indexOf(',') + 1);
    }

    private static String getIntegerPart(String s) {
        String intPart = "";
        StringTokenizer tok = new StringTokenizer(s.substring(0, s.indexOf(',')), ".");
        Stack<String> stk = new Stack<>();
        while (tok.hasMoreTokens()) {
            stk.add(tok.nextToken());
        }

        int idxPwr = 0;
        while (!stk.empty()) {
            String x = stk.pop();
            int value = Integer.parseInt(x);

            if (value != 0) {
                intPart = buildPart(x, idxPwr, value) + intPart;
            }
            idxPwr++;
        }

        return intPart;
    }

    private static String buildPart(String x, int idxPwr, int value) {
        String part = buildHundreds(x);
        String last = buildTensAndOnes(x);

        String p = power[idxPwr];
        switch (idxPwr) {
            case 1:
                if (value == 1) {
                    last = "mille";
                    p = "";
                }
                break;
            case 2:
            case 3:
                p = adjustPowerForLargeNumbers(value, last, p, idxPwr);
                break;
            default:
        }

        return part + last + p;
    }

    private static String buildHundreds(String x) {
        if (x.length() == 3) {
            String digit = x.substring(0, 1);
            int digitValue = Integer.parseInt(digit);

            if (digitValue > 0) {
                return (digitValue > 1 ? base[digitValue - 1] : "") + "cento";
            }
        }
        return "";
    }

    private static String buildTensAndOnes(String x) {
        if (x.length() == 2) {
            int digitValue = Integer.parseInt(x.substring(0, 1));
            int blockValue = Integer.parseInt(x);
            if (blockValue < 20) {
                return special[blockValue - 10];
            } else {
                return buildTenth(digitValue);
            }
        } else if (x.length() == 1) {
            int digitValue = Integer.parseInt(x);
            if (digitValue > 0) {
                return base[digitValue - 1];
            }
        }
        return "";
    }

    private static String buildTenth(int digitValue) {
        String part = tenth[digitValue - 2];
        return part + (digitValue == 2 ? "i" : "a");
    }

    private static String adjustPowerForLargeNumbers(int value, String last, String p, int idxPwr) {
        if (value == 1) {
            last = last.substring(0, 2);
            p += (idxPwr == 2 ? "e" : "o");
        } else {
            p += "i";
        }
        return p;
    }
	
	/*
	 * public static String n2l(double d) {
	 * 
	 * String s = formatDouble(d); //s = (s.indexOf(',')!=-1) ? s : s+",00"; String
	 * decPart = s.substring(s.indexOf(',')+1); s = s.substring(0, s.indexOf(','));
	 * StringTokenizer tok = new StringTokenizer(s, "."); Stack stk = new Stack();
	 * while(tok.hasMoreTokens()) stk.add(tok.nextToken());
	 * 
	 * String intPart = ""; int idxPwr = 0; while(!stk.empty()) { String x =
	 * (String)stk.pop(); int value = Integer.parseInt(x);
	 * 
	 * if(value==0) { idxPwr++; continue; }
	 * 
	 * String part = ""; String last = ""; switch(x.length()) { case 3: { String
	 * digit = x.substring(0, 1); int digitValue = Integer.parseInt(digit);
	 * 
	 * if(digitValue>0) { if(digitValue>1) { part = base[digitValue-1]; } part +=
	 * "cento"; } x = x.substring(1); break; } case 2: { String digit =
	 * x.substring(0, 1); int digitValue = Integer.parseInt(digit); int blockValue =
	 * Integer.parseInt(x);
	 * 
	 * if(digitValue>0) { if(blockValue<20) { part += special[blockValue-10];;
	 * break; } else { part += tenth[digitValue-2]; String end = "a";
	 * if(digitValue==2) { end="i"; }
	 * 
	 * part+=end; } }
	 * 
	 * x = x.substring(1); break; } case 1: { String digit = x.substring(0); int
	 * digitValue = Integer.parseInt(digit);
	 * 
	 * if(digitValue>0) { last = base[digitValue-1]; if(isVocal(last.substring(0,
	 * 1))) { if(part.length()>0) part = part.substring(0, part.length()-1); } }
	 * break; } default: } // switch
	 * 
	 * String p = power[idxPwr]; switch(idxPwr) { case 1: { if(value==1) { last =
	 * "mille"; p = ""; } break; } case 2: { if(value==1) { last = last.substring(0,
	 * 2); p+="e"; } else { p+="i"; } break; } case 3: { if(value==1) { last =
	 * last.substring(0, 2); p+="o"; } else { p+="i"; } break; } default: } //
	 * switch
	 * 
	 * intPart = part+last+p+intPart; idxPwr++; }
	 * 
	 * if(intPart.length()==0) intPart = "zero"; return intPart+"/"+decPart; }
	 */
	
	private static boolean isVocal(String s) {
		if(s==null || s.length()==0) return false;
		s = s.substring(0, 1);
		if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i")
		   || s.equalsIgnoreCase("o")  || s.equalsIgnoreCase("u")) return true;
		return false;
	}
	
	/**
	 * Inzializzatore statico.
	 */
	static {
		// formato date
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		// formato numerico
		nf = NumberFormat.getInstance(locale);
		nf.setGroupingUsed(true);
		cal = Calendar.getInstance();
	}
}
