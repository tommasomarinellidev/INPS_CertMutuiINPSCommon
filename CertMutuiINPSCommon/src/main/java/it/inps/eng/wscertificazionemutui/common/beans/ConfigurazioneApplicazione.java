package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;

public class ConfigurazioneApplicazione implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String chiave;
	private String valore;
	
	
	public String getChiave() {
		return chiave;
	}
	public void setChiave(String chiave) {
		this.chiave = chiave;
	}
	public String getValore() {
		return valore;
	}
	public void setValore(String valore) {
		this.valore = valore;
	}
	
}
