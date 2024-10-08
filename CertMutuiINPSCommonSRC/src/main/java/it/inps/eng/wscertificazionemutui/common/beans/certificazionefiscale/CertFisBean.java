package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.io.Serializable;
import java.util.List;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;



public class CertFisBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5840742177061237474L;
	
	
	private AnagraficaIntestatario benefPrincipale;
	private String tipoCertif;
	private int numRigo;
	private List<Rigo> rigo;
	

	public AnagraficaIntestatario getBenefPrincipale() {
		return benefPrincipale;
	}


	public void setBenefPrincipale(AnagraficaIntestatario benefPrincipale) {
		this.benefPrincipale = benefPrincipale;
	}


	public String getTipoCertif() {
		return tipoCertif;
	}


	public void setTipoCertif(String tipoCertif) {
		this.tipoCertif = tipoCertif;
	}


	public int getNumRigo() {
		return numRigo;
	}


	public void setNumRigo(int numRigo) {
		this.numRigo = numRigo;
	}


	public List<Rigo> getRigo() {
		return rigo;
	}


	public void setRigo(List<Rigo> rigo) {
		this.rigo = rigo;
	}

}
