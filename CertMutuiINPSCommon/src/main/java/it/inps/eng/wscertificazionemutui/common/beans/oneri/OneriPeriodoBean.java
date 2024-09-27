package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import java.io.Serializable;



public class OneriPeriodoBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5840742177061237474L;
	
	
	private int numBenef;
	private double totRatePagate;
	private double totInteressiPagati;
	private boolean situazioneInvariata;
	private String sottoProgMTemp;
	
	
	public int getNumBenef() {
		return numBenef;
	}
	public void setNumBenef(int numBenef) {
		this.numBenef = numBenef;
	}
	public double getTotRatePagate() {
		return totRatePagate;
	}
	public void setTotRatePagate(double totRatePagate) {
		this.totRatePagate = totRatePagate;
	}
	public double getTotInteressiPagati() {
		return totInteressiPagati;
	}
	public void setTotInteressiPagati(double totInteressiPagati) {
		this.totInteressiPagati = totInteressiPagati;
	}
	public boolean isSituazioneInvariata() {
		return situazioneInvariata;
	}
	public void setSituazioneInvariata(boolean situazioneInvariata) {
		this.situazioneInvariata = situazioneInvariata;
	}
	public String getSottoProgMTemp() {
		return sottoProgMTemp;
	}
	public void setSottoProgMTemp(String sottoProgMTemp) {
		this.sottoProgMTemp = sottoProgMTemp;
	}
}
