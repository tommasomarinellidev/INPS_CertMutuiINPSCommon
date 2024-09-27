// FrontEnd Plus GUI for JAD
// DeCompiled : Data.class

package it.inps.eng.wscertificazionemutui.common.utils;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

// Referenced classes of package it.finsiel.inpdai.M6.Util.control:
//            PropertyManager

public class Data
{
	private static final String FORMATO_DATA = "dd/MM/yyyy";
	
	/*public Data()
	{
		initialize();
	}*/

	public static Date getDate(String date)
	throws ParseException
{
	SimpleDateFormat formatter = new SimpleDateFormat(FORMATO_DATA);
	Date d = new Date(formatter.parse(date).getTime());
	return d;
}
	
	public static boolean dataIsValid(String data){
		String dateformat = FORMATO_DATA;
		SimpleDateFormat sdf = new SimpleDateFormat(dateformat);

		try {
			Date date = new Date(sdf.parse(data).getTime()); 
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static boolean dataIsValid2(String data){
		String dateformat = "yyyy-mm-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(dateformat);

		try {
			Date date = new Date(sdf.parse(data).getTime()); 
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static String convertiFormatoData(String data){
		System.out.println("Converto la data dal formato dd/mm/yyyy al formato aaaa-mm-gg");
		if(data==null)
			System.out.println("data null");
		String gg = data.substring(0, 2);
		String mm = data.substring(3, 5);
		String aaaa = data.substring(6, 10);

		String result = aaaa+"-"+mm+"-"+gg;

		return result;
	}
	
	public static String convertiFormatoData2(String data){
		System.out.println("Converto la data dal formato aaaa-mm-gg al formato dd/mm/yyyy");
		if(data==null)
			System.out.println("data null");
		String gg = data.substring(8, 10);
		String mm = data.substring(5, 7);
		String aaaa = data.substring(0, 4);

		String result = gg+"/"+mm+"/"+aaaa;

		return result;
	}
	
	public static Date aggiungiAnni(int numeroAnni, Date data)
		throws Exception
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(1, Math.abs(numeroAnni));
		return new Date(calendario.getTime().getTime());
	}

	public static Date aggiungiGiorni(int numeroGiorni, Date data)
		throws Exception
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(5, Math.abs(numeroGiorni));
		return new Date(calendario.getTime().getTime());
	}

	public static Date aggiungiMesi(int numeroMesi, Date data)
		throws Exception
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(2, Math.abs(numeroMesi));
		return new Date(calendario.getTime().getTime());
	}

	public static int anno(Date Data)
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(Data);
		int anno = calendario.get(1);
		return anno;
	}

	public static int calcolaEtaDecInAnniCompiuti(Date dataNascita, Date dataDecorrenza)
		throws Exception
	{
		int eta = anno(dataDecorrenza) - anno(dataNascita);
		if(mese(dataNascita) >= mese(dataDecorrenza) && giorno(dataNascita) >= giorno(dataDecorrenza))
			eta--;
		return eta;
	}

	public static String dataDiOggi()
	{
		SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-M-d");
		return formatoData.format(new Date(System.currentTimeMillis()));
	}

	public static long dataDiOggiInMillisecondi()
	{
		return System.currentTimeMillis();
	}

	public static String dataDiOggiPerDb2()
	{
		SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
		return formatoData.format(new Date(System.currentTimeMillis()));
	}

	public static String dataDiOggiPerVisualizzazione()
	{
		SimpleDateFormat formatoData = new SimpleDateFormat(FORMATO_DATA);
		return formatoData.format(new Date(System.currentTimeMillis()));
	}

	public static boolean dataValida(int anno, int mese, int giorno)
	{
		mese--;
		GregorianCalendar c = new GregorianCalendar(anno, mese, giorno);
		return c.get(1) == anno && c.get(2) == mese && c.get(5) == giorno;
	}

	public static boolean dataValida(Date data)
	{
		try
		{
			StringTokenizer st = new StringTokenizer(data.toString(), "-");
			int anno = Integer.parseInt(st.nextToken());
			int mese = Integer.parseInt(st.nextToken());
			int giorno = Integer.parseInt(st.nextToken());
			return dataValida(anno, mese, giorno);
		}
		catch(Throwable _ex)
		{
			return false;
		}
	}

	public static int distanzaInGiorni(Date dataInizio, Date dataFine)
		throws Exception
	{
		long time = Math.abs(dataFine.getTime() - dataInizio.getTime());
		Integer delta = new Integer(0x2932e00);
		Integer day = new Integer(0x5265c00);
		long dayInMillis = day.longValue();
		Long offset = new Long((time + delta.longValue()) / dayInMillis);
		int giorni = offset.intValue();
		return giorni;
	}

	public static int distanzaInMesi(Date dataInizio, Date dataFine)
		throws Exception
	{
		int numeroMesi = 0;
		int annoInizio = anno(dataInizio);
		int meseInizio = mese(dataInizio);
		int giornoInizio = giorno(dataInizio);
		int annoFine = anno(dataFine);
		int meseFine = mese(dataFine);
		int giornoFine = giorno(dataFine);
		numeroMesi += (annoFine - annoInizio) * 12;
		numeroMesi += meseFine - meseInizio;
		if((giorniMaxDelMese(meseInizio, annoInizio) - giornoInizio) + giornoFine < 15)
			numeroMesi--;
		else
		if(giornoFine - giornoInizio >= 15)
			numeroMesi++;
		return numeroMesi;
	}

	public static String estraiRuolo(Date data)
	{
		SimpleDateFormat formato = new SimpleDateFormat();
		formato.applyPattern("MM/yyyy");
		return formato.format(data);
	}

	public static int giorniMaxDelMese(int mese, int anno)
	{
		int giorni = 31;
		if(mese == 4 || mese == 6 || mese == 9 || mese == 11)
			giorni = 30;
		else
		if(mese == 2)
		{
			giorni = 28;
			if(anno % 4 == 0)
				giorni++;
		}
		return giorni;
	}

	public static int giorno(Date data)
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		int giorno = calendario.get(5);
		return giorno;
	}

	/*private void handleException(Throwable throwable)
	{
	}*/

	/*private void initialize()
	{
	}*/

	public static boolean isCompresoInPeriodo(Date dataInizioPeriodo, Date dataFinePeriodo, Date dataCompresa)
		throws Exception
	{
		boolean risposta = true;
		if(maggiore(dataInizioPeriodo, dataCompresa) || minore(dataFinePeriodo, dataCompresa))
			risposta = false;
		return risposta;
	}

	public static boolean isCompresoInPeriodo(Date dataInizioPeriodo, Date dataFinePeriodo, Date dataInizioCompresa, Date dataFineCompresa)
		throws Exception
	{
		boolean risposta = true;
		if(maggiore(dataInizioPeriodo, dataInizioCompresa) || minore(dataFinePeriodo, dataFineCompresa))
			risposta = false;
		return risposta;
	}

//	public static boolean isDataConvenzionale(Date input)
//		throws Exception
//	{
//		boolean output = true;
//		if(input != null && !uguale(input, valoreDataMinima()) && !uguale(input, valoreDataMassima()))
//			output = false;
//		return output;
//	}

	public static boolean isMaggioreUgualeAOggi(Date data)
		throws Exception
	{
		Date d = new Date(System.currentTimeMillis());
		return data.after(d) || data.toString().equals(d.toString());
	}

	public static boolean maggiore(Date dataMaggiore, Date dataMinore)
	{
		boolean risposta = false;
		try
		{
			if(anno(dataMaggiore) > anno(dataMinore))
				risposta = true;
			else
			if(anno(dataMaggiore) == anno(dataMinore))
				if(mese(dataMaggiore) > mese(dataMinore))
					risposta = true;
				else
				if(mese(dataMaggiore) == mese(dataMinore) && giorno(dataMaggiore) > giorno(dataMinore))
					risposta = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return risposta;
	}

//	public static String maxData()
//	{
//		return PropertyManager.getProperty("MAX_DATA");
//	}

	public static int mese(Date Data)
	{
		int mese = 0;
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(Data);
		mese = calendario.get(2) + 1;
		return mese;
	}

	public static String meseInLettere(Date data)
		throws Exception
	{
		SimpleDateFormat formato = new SimpleDateFormat();
		formato.applyPattern("MMMM");
		return formato.format(data);
	}

//	public static String minData()
//	{
//		return PropertyManager.getProperty("MIN_DATA");
//	}

	public static boolean minore(Date dataMinore, Date dataMaggiore)
	{
		boolean risposta = false;
		try
		{
			if(anno(dataMinore) < anno(dataMaggiore))
				risposta = true;
			else
			if(anno(dataMinore) == anno(dataMaggiore))
				if(mese(dataMinore) < mese(dataMaggiore))
					risposta = true;
				else
				if(mese(dataMinore) == mese(dataMaggiore) && giorno(dataMinore) < giorno(dataMaggiore))
					risposta = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return risposta;
	}

	public static int Oggi_anno()
		throws Exception
	{
		return anno(valoreDataOggi());
	}

	public static int Oggi_giorno()
		throws Exception
	{
		return giorno(valoreDataOggi());
	}

	public static int Oggi_mese()
		throws Exception
	{
		return mese(valoreDataOggi());
	}

	public static String Oggi_ora_millisecondi()
	{
		SimpleDateFormat form_data = new SimpleDateFormat("kk:mm:ss:SSS");
		return form_data.format(new java.util.Date(System.currentTimeMillis()));
	}

	public static String Oggi_ora_millisecondiT()
	{
		SimpleDateFormat form_data = new SimpleDateFormat("kk.mm_ss.SSS");
		return form_data.format(new java.util.Date(System.currentTimeMillis()));
	}
	
	public static String Oggi_ora_millisecondiT2()
	{
		SimpleDateFormat form_data = new SimpleDateFormat("kk:mm:ss.SSS");
		return form_data.format(new java.util.Date(System.currentTimeMillis()));
	}

	public static String oraCorrente()
	{
		SimpleDateFormat form_data = new SimpleDateFormat("kk:mm:ss");
		return form_data.format(new java.util.Date(System.currentTimeMillis()));
	}

	public static String oraMinima()
	{
		return "00:00:00";
	}

	public static Date quindiciMeseSucc(java.util.Date data)
	{
		Calendar newData = Calendar.getInstance();
		int anno = 0;
		newData.setTime(data);
		newData.roll(2, true);
		newData.set(5, 15);
		int gg = newData.get(5);
		int mese = newData.get(2);
		if(newData.get(2) == 0)
		{
			anno = newData.get(1) + 1;
			newData.set(1, anno);
		}
		return trasformaInData(newData.get(1), mese + 1, gg);
	}

	public static Date restituisciMaggioreUgualeFraDueDate(Date data1, Date data2)
		throws Exception
	{
		if(!minore(data1, data2))
			return data1;
		else
			return data2;
	}

	public static Date restituisciMinoreUgualeFraDueDate(Date data1, Date data2)
		throws Exception
	{
		if(!maggiore(data1, data2))
			return data1;
		else
			return data2;
	}

	public static Date sottraiAnni(int numeroAnni, Date data)
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(1, -Math.abs(numeroAnni));
		return new Date(calendario.getTime().getTime());
	}

	public static Date sottraiGiorni(int numeroGiorni, Date data)
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(5, -Math.abs(numeroGiorni));
		return new Date(calendario.getTime().getTime());
	}

	public static Date sottraiMesi(int numeroMesi, Date data)
	{
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(2, -Math.abs(numeroMesi));
		return new Date(calendario.getTime().getTime());
	}

	public static String toStringDateSql(java.util.Date data)
	{
		try
		{
			StringTokenizer st = new StringTokenizer(data.toString(), "-");
			int anno = Integer.parseInt(st.nextToken());
			anno += 10000;
			String out = (new Integer(anno)).toString().substring(1);
			out = out + "-" + st.nextToken() + "-" + st.nextToken();
			return out;
		}
		catch(Throwable _ex)
		{
			return data.toString();
		}
	}

	public static int trasformaDataInIntero(java.util.Date ora)
	{
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(ora);
		int oraRis = gc.get(11) * 10000;
		oraRis += gc.get(12) * 100;
		oraRis += gc.get(13);
		return oraRis;
	}

	public static String trasformaDataPerDb2(Date data)
	{
		SimpleDateFormat formato = new SimpleDateFormat();
		formato.applyPattern("yyyy-MM-dd");
		return formato.format(data);
	}

	public static String trasformaDataPerVisualizzazione(Date data)
	{
		SimpleDateFormat formato = new SimpleDateFormat();
		formato.applyPattern(FORMATO_DATA);
		return formato.format(data);
	}
//*****************************
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
	
//*****************************+


	public static Date trasformaInData(int anno, int mese, int giorno)
	{
		String mese_s;
		if(mese < 10)
			mese_s = "0" + String.valueOf(mese);
		else
			mese_s = String.valueOf(mese);
		String giorno_s;
		if(giorno < 10)
			giorno_s = "0" + String.valueOf(giorno);
		else
			giorno_s = String.valueOf(giorno);
		Date data_s = Date.valueOf(String.valueOf(anno) + "-" + mese_s + "-" + giorno_s);
		return data_s;
	}

	public static Date trasformaStringa(String Data)
	{
		StringTokenizer st = new StringTokenizer(Data, "-");
		String[] _tmp = new String[3];
		int anno = 0;
		int mese = 0;
		int giorno;
		for(giorno = 0; st.hasMoreTokens(); giorno = Integer.parseInt(st.nextToken().trim()))
		{
			anno = Integer.parseInt(st.nextToken().trim());
			mese = Integer.parseInt(st.nextToken().trim());
		}

		Date d = new Date(anno - 1900, mese - 1, giorno);
		return d;
	}

	public static boolean uguale(Date data1, Date data2)
	{
		boolean risposta = false;
		try
		{
			if(anno(data1) == anno(data2) && mese(data1) == mese(data2) && giorno(data1) == giorno(data2))
				risposta = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return risposta;
	}

//	public static Date valoreDataMassima()
//	{
//		return trasformaStringa(maxData());
//	}
//
//	public static Date valoreDataMinima()
//	{
//		return trasformaStringa(minData());
//	}

	public static Date valoreDataOggi()
		throws Exception
	{
		Date oggi = new Date(System.currentTimeMillis());
		return oggi;
	}

//	public static Timestamp valoreTimeStampMassimo()
//	{
//		Timestamp ts = new Timestamp(valoreDataMassima().getTime());
//		ts.setNanos(0);
//		return ts;
//	}

	public static Timestamp valoreTimeStampOggi()
	{
		return new Timestamp((new GregorianCalendar()).getTime().getTime());
	}

/***
Questo metodo restituisce il numero di giorni solari che intercorrono tra due date.
Per dataInizio si intende la data minore e per dataFine la maggiore.
@return int
@param dataInizio java.sql.Date
@param dataFine java.sql.Date
@exception java.lang.Exception La descrizione dell'eccezione.
 */


public static int distanzaInGiorniSolari(java.sql.Date dataInizio, java.sql.Date dataFine) throws Exception {

	long parseDataInizio = dataInizio.getTime();
	long parseDataFine = dataFine.getTime();

	long differenza = parseDataFine - parseDataInizio;
	int giorni = (int) (differenza / (1000 * 60 * 60 * 24));
	return giorni;
}
}