package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;

public class Residenza implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String indirizzo;
	private String numeroCiv;
	private String cap;		
	private String citta;	
	private String codSede;
	private String prSede;
	
	
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getNumeroCiv() {
		return numeroCiv;
	}
	public void setNumeroCiv(String numeroCiv) {
		this.numeroCiv = numeroCiv;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCodSede() {
		return codSede;
	}
	public void setCodSede(String codSede) {
		this.codSede = codSede;
	}
	public String getPrSede() {
		return prSede;
	}
	public void setPrSede(String prSede) {
		this.prSede = prSede;
	}		
}
