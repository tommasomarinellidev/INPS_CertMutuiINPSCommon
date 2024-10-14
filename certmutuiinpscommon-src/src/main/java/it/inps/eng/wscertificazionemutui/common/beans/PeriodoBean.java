package it.inps.eng.wscertificazionemutui.common.beans;


//	ANNO_CERT della tabella CERTIFICAZIONI_FISCALI
//	ANNO_MUTUO della tabella CERTIFICAZIONI_FISCALI
//	PROG_MUTUO della tabella CERTIFICAZIONI_FISCALI
//	COD_LET della tabella CERTIFICAZIONI_FISCALI
//	DESC_LET (da recuperare dalla tabella TipoLettera in base al COD_LET)
//	CODFIS_CORR della tabella CERTIFICAZIONI_FISCALI, se presente
//	FL_RETT della tabella CERTIFICAZIONI_FISCALI
//	DESC_RETT 
//	ID della tabella CERTIFICAZIONI_FISCALI
//	COD_ERRORE 
//	DESC_ERRORE

public class PeriodoBean {

	String annoCert;
	String annoM;
	String progM;
	String codLet;
	String descLet;
	String codFisDec;
	String flRett;
	String descRett;
	String idCF;
	
	
	public String getAnnoCert() {
		return annoCert;
	}
	public void setAnnoCert(String annoCert) {
		this.annoCert = annoCert;
	}
	public String getAnnoM() {
		return annoM;
	}
	public void setAnnoM(String annoM) {
		this.annoM = annoM;
	}
	public String getProgM() {
		return progM;
	}
	public void setProgM(String progM) {
		this.progM = progM;
	}
	public String getCodLet() {
		return codLet;
	}
	public void setCodLet(String codLet) {
		this.codLet = codLet;
	}
	public String getDescLet() {
		return descLet;
	}
	public void setDescLet(String descLet) {
		this.descLet = descLet;
	}
	public String getCodFisDec() {
		return codFisDec;
	}
	public void setCodFisDec(String codFisDec) {
		this.codFisDec = codFisDec;
	}
	public String getFlRett() {
		return flRett;
	}
	public void setFlRett(String flRett) {
		this.flRett = flRett;
	}
	public String getDescRett() {
		return descRett;
	}
	public void setDescRett(String descRett) {
		this.descRett = descRett;
	}
	public String getIdCF() {
		return idCF;
	}
	public void setIdCF(String idCF) {
		this.idCF = idCF;
	}
	
}
