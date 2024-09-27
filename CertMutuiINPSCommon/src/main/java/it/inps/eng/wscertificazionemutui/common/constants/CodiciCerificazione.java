package it.inps.eng.wscertificazionemutui.common.constants;

import java.text.NumberFormat;
import java.util.Locale;


public interface CodiciCerificazione {
	
	
	public static final String TIPO_CERT1 ="C001";
	public static final String TIPO_CERT2 ="C002";
	public static final String TIPO_CERT3 ="C003";
	public static final String TIPO_CERT4 ="C004";
	public static final String TIPO_CERT5 ="C005";
	
	public static final String TIPO_LETTERA002 ="L002";
	public static final String TIPO_LETTERA003 ="L003";
	public static final String TIPO_LETTERA004 ="L004";
	public static final String TIPO_LETTERA005 ="L005";
	public static final String TIPO_LETTERA006 ="L006";
	public static final String TIPO_LETTERA007 ="L007";
	public static final String TIPO_LETTERA010 ="L010";
	
	public static final String DECESSO_EVN = "07";
	public static final String DECESSO_EREDE = "05";
	public static final String TITOLARE = "T";
	public static final String EREDE = "E";
	
	public static final String COD_IMPOSTA_SOSTITUTIVA = "10";
	public static final String COD_INTERESSI_PREAMM = "03";
	public static final String COD_QUOTA_CAPITALE = "01";
	public static final String COD_QUOTA_INTERESSI = "02";
	public static final String COD_SPESA_ISTRUTTORIA = "04";
	public static final int TIPO_REC_PIU_INTESTAT = 2;
	public static final int TIPO_REC_SING_INTESTAT = 1;
	public static final int SCARTO_MAX = -1;
	public static final String TP_MOV_CAPITALE = "01";
	
	public static final String STATO_LAV_DEFINITIVO = "D";
	
	public static final String ID_FORNITURA = "MIP00";
	
	public static final String CARTOLARIZZATO = "CAR";
	public static final String NON_CARTOLARIZZATO = "ZZZ";
	
	public static final String COD_FIS_INPS = "80078750587";
	
	public static NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALIAN);
	
	public static final String FONT_NAME = "verdana.ttf";
	
	public static final String NEW_INPS_IMG_NAME = "ImmagineNewInps.png";
	public static final String LINEAVERTICALE_PROVA_IMG_NAME = "LineaVerticale.png";
	public static final String LINEAORIZZONTALE_PROVA_IMG_NAME = "LineaOrizzontale.png";
	public static final String INPS_AGGIORNA_IMG_NAME = "INPS_Aggiorna.png";
	public static final String STAMPA_PROVA_IMG_NAME = "StampaDiProva.jpg";

	public static final String BATCH_ONERI_NAME ="IT528";
}
