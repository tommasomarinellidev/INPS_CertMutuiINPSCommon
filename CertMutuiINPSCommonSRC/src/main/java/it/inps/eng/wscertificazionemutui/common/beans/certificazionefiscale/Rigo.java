package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;
import it.inps.eng.wscertificazionemutui.common.beans.MutuoDaCertificare;
import it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale.Rimborsi;



public class Rigo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5840742177061237474L;
	
	
	private AnagraficaIntestatario benefCertif;
	private MutuoDaCertificare mutuoDaCertificare;
	private Date dtDecInizio;
	private Date dtDecFine;
	private double quotaCapitale;
	private double quotaInteressi;
	private double interessiPreamm;
	private double spesaIstruttoria;
	private double impostaSostitutiva;
	private String tpBen;
	private double percDetraz;
	private List<Rimborsi> rimborsiList;
	private Date dtDecesso;

	public AnagraficaIntestatario getBenefCertif() {
		return benefCertif;
	}


	public void setBenefCertif(AnagraficaIntestatario benefCertif) {
		this.benefCertif = benefCertif;
	}


	public Date getDtDecInizio() {
		return dtDecInizio;
	}


	public void setDtDecInizio(Date dtDecInizio) {
		this.dtDecInizio = dtDecInizio;
	}


	public Date getDtDecFine() {
		return dtDecFine;
	}


	public void setDtDecFine(Date dtDecFine) {
		this.dtDecFine = dtDecFine;
	}


	public double getQuotaCapitale() {
		return quotaCapitale;
	}


	public void setQuotaCapitale(double quotaCapitale) {
		this.quotaCapitale = quotaCapitale;
	}


	public double getQuotaInteressi() {
		return quotaInteressi;
	}


	public void setQuotaInteressi(double quotaInteressi) {
		this.quotaInteressi = quotaInteressi;
	}


	public double getInteressiPreamm() {
		return interessiPreamm;
	}


	public void setInteressiPreamm(double interessiPreamm) {
		this.interessiPreamm = interessiPreamm;
	}


	public double getSpesaIstruttoria() {
		return spesaIstruttoria;
	}


	public void setSpesaIstruttoria(double spesaIstruttoria) {
		this.spesaIstruttoria = spesaIstruttoria;
	}


	public double getImpostaSostitutiva() {
		return impostaSostitutiva;
	}


	public void setImpostaSostitutiva(double impostaSostitutiva) {
		this.impostaSostitutiva = impostaSostitutiva;
	}


	public String getTpBen() {
		return tpBen;
	}


	public void setTpBen(String tpBen) {
		this.tpBen = tpBen;
	}


	public List<Rimborsi> getRimborsiList() {
		return rimborsiList;
	}


	public void setRimborsiList(List<Rimborsi> rimborsiList) {
		this.rimborsiList = rimborsiList;
	}


	public double getPercDetraz() {
		return percDetraz;
	}


	public void setPercDetraz(double percDetraz) {
		this.percDetraz = percDetraz;
	}


	public MutuoDaCertificare getMutuoDaCertificare() {
		return mutuoDaCertificare;
	}


	public void setMutuoDaCertificare(MutuoDaCertificare mutuoDaCertificare) {
		this.mutuoDaCertificare = mutuoDaCertificare;
	}


	public Date getDtDecesso() {
		return dtDecesso;
	}


	public void setDtDecesso(Date dtDecesso) {
		this.dtDecesso = dtDecesso;
	}
}
