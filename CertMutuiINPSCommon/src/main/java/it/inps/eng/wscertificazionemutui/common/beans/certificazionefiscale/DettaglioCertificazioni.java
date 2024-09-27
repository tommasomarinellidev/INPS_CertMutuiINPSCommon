package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.sql.Timestamp;

public class DettaglioCertificazioni {

	private String annoCertificazione;
	private Timestamp dataEsecuzione;
	private String annoMutuo;
	private String progressivoMutuo;
	private String matricola;
	private Double quotaCapitaleCertFisc;
	private Double interessiPassiviCertFisc;
	private Double interessiPreammCertFisc;
	private Double speseIstruttoriaCertFisc;
	private Double impostaSostitutivaCertFisc;
	private Double percentualeIntestazione;
	private String tipoBeneficiario;
	private String codLet;
	private Timestamp dataInizioPeriodo;
	private Timestamp dataFinePeriodo;
	
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
	public String getMatricola() {
		return this.matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public Double getQuotaCapitaleCertFisc() {
		return quotaCapitaleCertFisc;
	}
	public void setQuotaCapitaleCertFisc(Double quotaCapitaleCertFisc) {
		this.quotaCapitaleCertFisc = quotaCapitaleCertFisc;
	}
	public Double getInteressiPassiviCertFisc() {
		return this.interessiPassiviCertFisc;
	}
	public void setInteressiPassiviCertFisc(Double interessiPassiviCertFisc) {
		this.interessiPassiviCertFisc = interessiPassiviCertFisc;
	}
	public Double getInteressiPreammCertFisc() {
		return this.interessiPreammCertFisc;
	}
	public void setInteressiPreammCertFisc(Double interessiPreammCertFisc) {
		this.interessiPreammCertFisc = interessiPreammCertFisc;
	}
	public Double getSpeseIstruttoriaCertFisc() {
		return speseIstruttoriaCertFisc;
	}
	public void setSpeseIstruttoriaCertFisc(Double speseIstruttoriaCertFisc) {
		this.speseIstruttoriaCertFisc = speseIstruttoriaCertFisc;
	}
	public Double getImpostaSostitutivaCertFisc() {
		return impostaSostitutivaCertFisc;
	}
	public void setImpostaSostitutivaCertFisc(Double impostaSostitutivaCertFisc) {
		this.impostaSostitutivaCertFisc = impostaSostitutivaCertFisc;
	}
	public Double getPercentualeIntestazione() {
		return percentualeIntestazione;
	}
	public void setPercentualeIntestazione(Double percentualeIntestazione) {
		this.percentualeIntestazione = percentualeIntestazione;
	}
	public String getTipoBeneficiario() {
		return tipoBeneficiario;
	}
	public void setTipoBeneficiario(String tipoBeneficiario) {
		this.tipoBeneficiario = tipoBeneficiario;
	}
	public String getCodLet() {
		return codLet;
	}
	public void setCodLet(String codLet) {
		this.codLet = codLet;
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

