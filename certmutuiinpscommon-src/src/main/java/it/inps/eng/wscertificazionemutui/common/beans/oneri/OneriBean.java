package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;



public class OneriBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5840742177061237474L;
	
	
	private int tipoRecord;
	private AnagraficaIntestatario benCertificazione;
	private String annoM;
	private String progM;
	private String sottoProgM;
	private double totRate;
	private double totInteressi;
	private double percIntestaz;
	private double ammontRateBenef;
	private double ammontInteressiBenef;
	private double impMutuo;
	private int progBenef;
	private String tpAgenziaEntrate; 
	private boolean situazioneInvariata;
	private OneriPeriodoBean oneriPeriodo;
	private Timestamp dataInizioPeriodo;
	private Timestamp dataFinePeriodo;
	private Date dataStipula;
	private boolean cartolarizzato;
	private boolean accollo;
	
	public int getTipoRecord() {
		return tipoRecord;
	}
	public void setTipoRecord(int tipoRecord) {
		this.tipoRecord = tipoRecord;
	}
	public AnagraficaIntestatario getBenCertificazione() {
		return benCertificazione;
	}
	public void setBenCertificazione(AnagraficaIntestatario benCertificazione) {
		this.benCertificazione = benCertificazione;
	}
	public String getAnnoM() {
		return annoM;
	}
	public void setAnnoM(String annoM) {
		this.annoM = annoM;
	}
	public String getProgM() {
		return progM;
	}
	public void setProgM(String progM) {
		this.progM = progM;
	}
	public double getTotRate() {
		return totRate;
	}
	public void setTotRate(double totRate) {
		this.totRate = totRate;
	}
	public double getTotInteressi() {
		return totInteressi;
	}
	public void setTotInteressi(double totInteressi) {
		this.totInteressi = totInteressi;
	}
	public double getPercIntestaz() {
		return percIntestaz;
	}
	public void setPercIntestaz(double percIntestaz) {
		this.percIntestaz = percIntestaz;
	}
	public double getAmmontRateBenef() {
		return ammontRateBenef;
	}
	public void setAmmontRateBenef(double ammontRateBenef) {
		this.ammontRateBenef = ammontRateBenef;
	}
	public double getAmmontInteressiBenef() {
		return ammontInteressiBenef;
	}
	public void setAmmontInteressiBenef(double ammontInteressiBenef) {
		this.ammontInteressiBenef = ammontInteressiBenef;
	}
	public int getProgBenef() {
		return progBenef;
	}
	public void setProgBenef(int i) {
		this.progBenef = i;
	}
	public boolean isSituazioneInvariata() {
		return situazioneInvariata;
	}
	public void setSituazioneInvariata(boolean situazioneInvariata) {
		this.situazioneInvariata = situazioneInvariata;
	}
	public OneriPeriodoBean getOneriPeriodo() {
		return oneriPeriodo;
	}
	public void setOneriPeriodo(OneriPeriodoBean oneriPeriodo) {
		this.oneriPeriodo = oneriPeriodo;
	}
	public double getImpMutuo() {
		return impMutuo;
	}
	public void setImpMutuo(double impMutuo) {
		this.impMutuo = impMutuo;
	}
	public String getTpAgenziaEntrate() {
		return tpAgenziaEntrate;
	}
	public void setTpAgenziaEntrate(String tpAgenziaEntrate) {
		this.tpAgenziaEntrate = tpAgenziaEntrate;
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
	public Date getDataStipula() {
		return dataStipula;
	}
	public void setDataStipula(Date dataStipula) {
		this.dataStipula = dataStipula;
	}
	public String getSottoProgM() {
		return sottoProgM;
	}
	public void setSottoProgM(String sottoProgM) {
		this.sottoProgM = sottoProgM;
	}
	public boolean isCartolarizzato() {
		return cartolarizzato;
	}
	public void setCartolarizzato(boolean cartolarizzato) {
		this.cartolarizzato = cartolarizzato;
	}
	public boolean isAccollo() {
		return accollo;
	}
	public void setAccollo(boolean accollo) {
		this.accollo = accollo;
	}
	
	
	}
