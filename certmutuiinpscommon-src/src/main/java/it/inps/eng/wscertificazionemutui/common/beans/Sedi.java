package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;
import java.sql.*;

public class Sedi implements Serializable {
	
	private static final long serialVersionUID = 8169514628839040495L;
	private String sede="";
	private String ind="";
	private String cap="";
	private String citta="";
	private String pr="";
	private String tel="";
	private String telMob="";
	private String fax="";
	private String abi="";
	private String cab="";
	private String cin="";
	private String cc="";
	private String email="";
	private String deno_banca="";
	private String deno_agenzia="";
	private String ind_agenzia="";
	private String cap_agenzia="";
	private String citta_agenzia="";
	private String pr_agenzia="";
	private Date   dt_ult_agg=null;
	private String matr_ult_agg="";
	
	private String nomeDirettore="";
	private String codicePaese="";	
	private String cinEuro="";
	private String iban="";
	private String regione="";
	
	public Sedi()  {
		dt_ult_agg = new Date(System.currentTimeMillis());	
	}	

	/**
	 * Returns the abi.
	 * @return int
	 */
	public String getAbi() {
		return abi;
	}

	/**
	 * Returns the cab.
	 * @return int
	 */
	public String getCab() {
		return cab;
	}

	/**
	 * Returns the cap.
	 * @return int
	 */
	public String getCap() {
		return cap;
	}

	/**
	 * Returns the cap_agenzia.
	 * @return int
	 */
	public String getCap_agenzia() {
		return cap_agenzia;
	}

/**
	 * Returns the cc.
	 * @return String
	 */
	public String getCc() {
		return cc;
	}


	/**
	 * Returns the cin.
	 * @return int
	 */
	public String getCin() {
		return cin;
	}

	/**
	 * Returns the citta.
	 * @return String
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * Returns the citta_agenzia.
	 * @return String
	 */
	public String getCitta_agenzia() {
		return citta_agenzia;
	}

	/**
	 * Returns the deno_agenzia.
	 * @return String
	 */
	public String getDeno_agenzia() {
		return deno_agenzia;
	}

	/**
	 * Returns the deno_banca.
	 * @return String
	 */
	public String getDeno_banca() {
		return deno_banca;
	}

	/**
	 * Returns the dt_ult_agg.
	 * @return Date
	 */
	public Date getDt_ult_agg() {
		return dt_ult_agg;
	}

	/**
	 * Returns the fax.
	 * @return String
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Returns the ind.
	 * @return String
	 */
	public String getInd() {
		return ind;
	}

	/**
	 * Returns the ind_agenzia.
	 * @return String
	 */
	public String getInd_agenzia() {
		return ind_agenzia;
	}

	/**
	 * Returns the matr_ult_agg.
	 * @return int
	 */
	public String getMatr_ult_agg() {
		return matr_ult_agg;
	}

	/**
	 * Returns the pr.
	 * @return String
	 */
	public String getPr() {
		return pr;
	}

	/**
	 * Returns the pr_agenzia.
	 * @return String
	 */
	public String getPr_agenzia() {
		return pr_agenzia;
	}

	/**
	 * Returns the sede.
	 * @return String
	 */
	public String getSede() {
		return sede;
	}

	/**
	 * Returns the tel.
	 * @return String
	 */
	public String getTel() {
		return tel;
	}

	public String getTelMob() {
		return telMob;
	}

	public void setTelMob(String telMob) {
		this.telMob = telMob;
	}

	/**
	 * Sets the abi.
	 * @param abi The abi to set
	 */
	public void setAbi(String abi) {
		this.abi = abi;
	}

	/**
	 * Sets the cab.
	 * @param cab The cab to set
	 */
	public void setCab(String cab) {
		this.cab = cab;
	}

	/**
	 * Sets the cap.
	 * @param cap The cap to set
	 */
	public void setCap(String cap) {
		this.cap = cap;
	}

	/**
	 * Sets the cap_agenzia.
	 * @param cap_agenzia The cap_agenzia to set
	 */
	public void setCap_agenzia(String cap_agenzia) {
		this.cap_agenzia = cap_agenzia;
	}

	/**
	 * Sets the cc.
	 * @param cc The cc to set
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}

	/**
	 * Sets the cin.
	 * @param cin The cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}

	/**
	 * Sets the citta.
	 * @param citta The citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * Sets the citta_agenzia.
	 * @param citta_agenzia The citta_agenzia to set
	 */
	public void setCitta_agenzia(String citta_agenzia) {
		this.citta_agenzia = citta_agenzia;
	}

	/**
	 * Sets the deno_agenzia.
	 * @param deno_agenzia The deno_agenzia to set
	 */
	public void setDeno_agenzia(String deno_agenzia) {
		this.deno_agenzia = deno_agenzia;
	}

	/**
	 * Sets the deno_banca.
	 * @param deno_banca The deno_banca to set
	 */
	public void setDeno_banca(String deno_banca) {
		this.deno_banca = deno_banca;
	}

	/**
	 * Sets the dt_ult_agg.
	 * @param dt_ult_agg The dt_ult_agg to set
	 */
	public void setDt_ult_agg(Date dt_ult_agg) {
		this.dt_ult_agg = dt_ult_agg;
	}

	/**
	 * Sets the fax.
	 * @param fax The fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Sets the ind.
	 * @param ind The ind to set
	 */
	public void setInd(String ind) {
		this.ind = ind;
	}

	/**
	 * Sets the ind_agenzia.
	 * @param ind_agenzia The ind_agenzia to set
	 */
	public void setInd_agenzia(String ind_agenzia) {
		this.ind_agenzia = ind_agenzia;
	}

	/**
	 * Sets the matr_ult_agg.
	 * @param matr_ult_agg The matr_ult_agg to set
	 */
	public void setMatr_ult_agg(String matr_ult_agg) {
		this.matr_ult_agg = matr_ult_agg;
	}

	/**
	 * Sets the pr.
	 * @param pr The pr to set
	 */
	public void setPr(String pr) {
		this.pr = pr;
	}

	/**
	 * Sets the pr_agenzia.
	 * @param pr_agenzia The pr_agenzia to set
	 */
	public void setPr_agenzia(String pr_agenzia) {
		this.pr_agenzia = pr_agenzia;
	}

	/**
	 * Sets the sede.
	 * @param sede The sede to set
	 */
	public void setSede(String sede) {
		this.sede = sede;
	}

	/**
	 * Sets the tel.
	 * @param tel The tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * Returns the cinEuro.
	 * @return String
	 */
	public String getCinEuro() {
		return cinEuro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns the codicePaese.
	 * @return String
	 */
	public String getCodicePaese() {
		return codicePaese;
	}

	/**
	 * Returns the iban.
	 * @return String
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * Returns the nomeDirettore.
	 * @return String
	 */
	public String getNomeDirettore() {
		return nomeDirettore;
	}

	/**
	 * Sets the cinEuro.
	 * @param cinEuro The cinEuro to set
	 */
	public void setCinEuro(String cinEuro) {
		this.cinEuro = cinEuro;
	}

	/**
	 * Sets the codicePaese.
	 * @param codicePaese The codicePaese to set
	 */
	public void setCodicePaese(String codicePaese) {
		this.codicePaese = codicePaese;
	}

	/**
	 * Sets the iban.
	 * @param iban The iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * Sets the nomeDirettore.
	 * @param nomeDirettore The nomeDirettore to set
	 */
	public void setNomeDirettore(String nomeDirettore) {
		this.nomeDirettore = nomeDirettore;
	}

	/**
	 * Returns the regione.
	 * @return String
	 */
	public String getRegione() {
		return regione;
	}

	/**
	 * Sets the regione.
	 * @param regione The regione to set
	 */
	public void setRegione(String regione) {
		this.regione = regione;
	}

}
