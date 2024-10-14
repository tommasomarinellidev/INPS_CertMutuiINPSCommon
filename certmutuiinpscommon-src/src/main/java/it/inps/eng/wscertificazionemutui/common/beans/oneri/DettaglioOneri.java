package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import java.math.BigDecimal;
import java.sql.Timestamp;


/***********************************************************
 * ISSUE MUTUI-86
 */
public class DettaglioOneri{

 	private String annoCertificazione;
 	private Timestamp dataEsecuzione;
 	private String annoMutuo;
 	private String progressivoMutuo;
 	private String sottoProgressivoMutuo;
 	private String codFiscIntestatario;
 	private String matricola;
 	private Integer totaleRate;
 	private Integer totaleInteressi;
 	private BigDecimal percentualeIntestazione;
 	private Integer totRateSingoloInt;
 	private Integer totInteressiSingoloInt;
 	private String ente;
 	private Timestamp dataInizioPeriodo;
	private Timestamp dataFinePeriodo;
 	
 	public DettaglioOneri() {
 		super();
 	}
 	
 	public DettaglioOneri(String annoCertificazione, Timestamp dataEsecuzione, String annoMutuo, String progressivoMutuo, String sottoProgressivoMutuo,
 						String codFiscIntestatario, String matricola, Integer totaleRate, Integer totaleInteressi, BigDecimal percentualeIntestazione,
 						Integer totRateSingoloInt, Integer totInteressiSingoloInt,Timestamp dataInizioPeriodo, Timestamp dataFinePeriodo) {
 		
 		super();
 		
 		this.annoCertificazione = annoCertificazione;
 		this.dataEsecuzione = dataEsecuzione;
 		this.annoMutuo = annoMutuo;
 		this.progressivoMutuo = progressivoMutuo;
 		this.sottoProgressivoMutuo = sottoProgressivoMutuo;
 		this.codFiscIntestatario = codFiscIntestatario;
 		this.matricola = matricola;
 		this.totaleRate = totaleRate;
 		this.totaleInteressi = totaleInteressi;
 		this.percentualeIntestazione = percentualeIntestazione;
 		this.totRateSingoloInt = totRateSingoloInt;
 		this.totInteressiSingoloInt = totInteressiSingoloInt;
 		this.dataInizioPeriodo = dataInizioPeriodo;
 		this.dataFinePeriodo = dataFinePeriodo;
 	}
 	
 	public String getAnnoCertificazione() {
		return annoCertificazione;
	}
	public void setAnnoCertificazione(String annoCertificazione) {
		this.annoCertificazione = annoCertificazione;
	}
	public Timestamp getDataEsecuzione() {
		return dataEsecuzione;
	}
	public void setDataEsecuzione(Timestamp dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}
 	
	public String getAnnoMutuo() {
		return annoMutuo;
	}
	public void setAnnoMutuo(String annoMutuo) {
		this.annoMutuo = annoMutuo;
	}
	public String getProgressivoMutuo() {
		return progressivoMutuo;
	}
	public void setProgressivoMutuo(String progressivoMutuo) {
		this.progressivoMutuo = progressivoMutuo;
	}
	public String getSottoProgressivoMutuo() {
		return sottoProgressivoMutuo;
	}
	public void setSottoProgressivoMutuo(String sottoProgressivoMutuo) {
		this.sottoProgressivoMutuo = sottoProgressivoMutuo;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getCodFiscIntestatario() {
		return codFiscIntestatario;
	}
	public void setCodFiscIntestatario(String codFiscIntestatario) {
		this.codFiscIntestatario = codFiscIntestatario;
	}
	public Integer getTotaleInteressi() {
		return totaleInteressi;
	}
	public void setTotaleInteressi(Integer totaleInteressi) {
		this.totaleInteressi = totaleInteressi;
	}
	public Integer getTotaleRate() {
		return totaleRate;
	}
	public void setTotaleRate(Integer totaleRate) {
		this.totaleRate = totaleRate;
	}
	public Integer getTotRateSingoloInt() {
		return totRateSingoloInt;
	}
	public void setTotRateSingoloInt(Integer totRateSingoloInt) {
		this.totRateSingoloInt = totRateSingoloInt;
	}
	public BigDecimal getPercentualeIntestazione() {
		return percentualeIntestazione;
	}
	public void setPercentualeIntestazione(BigDecimal percentualeIntestazione) {
		this.percentualeIntestazione = percentualeIntestazione;
	}
	public Integer getTotInteressiSingoloInt() {
		return totInteressiSingoloInt;
	}
	public void setTotInteressiSingoloInt(Integer totInteressiSingoloInt) {
		this.totInteressiSingoloInt = totInteressiSingoloInt;
	}

	public String getEnte() {
		return ente;
	}

	public void setEnte(String ente) {
		this.ente = ente;
	}

	public Timestamp getDataInizioPeriodo() {
		return dataInizioPeriodo;
	}

	public void setDataInizioPeriodo(Timestamp dataInizioPeriodo) {
		this.dataInizioPeriodo = dataInizioPeriodo;
	}

	public Timestamp getDataFinePeriodo() {
		return dataFinePeriodo;
	}

	public void setDataFinePeriodo(Timestamp dataFinePeriodo) {
		this.dataFinePeriodo = dataFinePeriodo;
	}
	
}