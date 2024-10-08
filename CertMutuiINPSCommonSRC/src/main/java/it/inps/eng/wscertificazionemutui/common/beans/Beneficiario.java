package it.inps.eng.wscertificazionemutui.common.beans;

import java.util.Date;

/**
 * 
 * @author Sistemi2000 : Iovenitti Riccardo, Camorchia Michele
 *
 * Bean che rappresenta un beneficiario.
 */
public class Beneficiario extends UpdateTags {	
	private static final long serialVersionUID = -3841880144978918020L;
	private String mtr;
	private String sede;
	private String cognome;
	private String nome;
	private Date dt_cess;
	private String mot_cess;
	private Date dt_mor;	
	private String desc_cess;

	/**
	 * Costruttore di default.
	 *
	 */
	public Beneficiario() {
		super();
	}

	public Date getDt_cess() {
		return dt_cess;
	}

	public void setDt_cess(Date dt_cess) {
		this.dt_cess = dt_cess;
	}

	public Date getDt_mor() {
		return dt_mor;
	}

	public void setDt_mor(Date dt_mor) {
		this.dt_mor = dt_mor;
	}

	public String getMot_cess() {
		return mot_cess;
	}

	public void setMot_cess(String mot_cess) {
		this.mot_cess = mot_cess;
	}

	public String getMtr() {
		return mtr;
	}

	public void setMtr(String mtr) {
		this.mtr = mtr;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
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

	public String toString() {		
		return getMtr()+" ("+getCognome()+" "+getNome()+")";
	}	
	/**
	 * Returns the desc_cess.
	 * @return String
	 */
	public String getDesc_cess() {
		return desc_cess;
	}

	/**
	 * Sets the desc_cess.
	 * @param desc_cess The desc_cess to set
	 */
	public void setDesc_cess(String desc_cess) {
		this.desc_cess = desc_cess;
	}

}
