package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Finsiel Illuminati Maria Luisa
 *
 * Report di istruttoria.Certificazione Fiscale
 * La classe esiste solo per coerenza.
 */
public class CertPdfObj extends PdfObj implements Serializable {

	private static final long serialVersionUID = -1326443414192670281L;
	private CertFisBean certFisBean;
	private String intestazioneSede;
	private Date dataUltAgg;
	private String annoCert;
	private boolean certProva;
	
	public CertFisBean getCertFisBean() {
		return certFisBean;
	}
	public void setCertFisBean(CertFisBean certFisBean) {
		this.certFisBean = certFisBean;
	}
	public String getIntestazioneSede() {
		return intestazioneSede;
	}
	public void setIntestazioneSede(String intestazioneSede) {
		this.intestazioneSede = intestazioneSede;
	}
	public Date getDataUltAgg() {
		return dataUltAgg;
	}
	public void setDataUltAgg(Date dataUltAgg) {
		this.dataUltAgg = dataUltAgg;
	}
	public String getAnnoCert() {
		return annoCert;
	}
	public void setAnnoCert(String annoCert) {
		this.annoCert = annoCert;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean isCertProva() {
		return certProva;
	}
	public void setCertProva(boolean certProva) {
		this.certProva = certProva;
	}
	
	
	}	
