package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;

public class AnagraficaIntestatario implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String matricola;
	private String codiceFiscale;
	private String cognome;
	private String nome;
	private Residenza resid;
	
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public String getMatricola() {
		return matricola;
	}

	public AnagraficaIntestatario(String matricola) {
		this.matricola = matricola;
	}
	
	public AnagraficaIntestatario(String matricola, String codFisc) {
		this.matricola = matricola;
		this.codiceFiscale = codFisc;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Residenza getResidenza() {
		return resid;
	}

	public void setResidenza(Residenza resid) {
		this.resid = resid;
	}

}
