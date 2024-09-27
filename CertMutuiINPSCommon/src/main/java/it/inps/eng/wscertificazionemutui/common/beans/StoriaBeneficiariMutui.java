package it.inps.eng.wscertificazionemutui.common.beans;

import java.sql.Timestamp;
import java.util.Date;

public class StoriaBeneficiariMutui {
	
	private int indicePeriodo;
	private String mtr;
	private String anno_mutuo;
	private String prog_mutuo;
	private Date dtDecInizio;
	private Date dtDecFine;
	
	private Timestamp dtOraInser;
	private String stEvn;
	private String tpEvn;
	private double perc;
	private String flagInt;
	private String tpBen;
	private Date dtMor;
	
	private double percDetr;
	private String codFisc;
	
	private String annoCert;
	
	public String getMtr() {
		return mtr;
	}

	public void setMtr(String mtr) {
		this.mtr = mtr;
	}

	public String getAnno_mutuo() {
		return anno_mutuo;
	}

	public void setAnno_mutuo(String anno_mutuo) {
		this.anno_mutuo = anno_mutuo;
	}

	public String getProg_mutuo() {
		return prog_mutuo;
	}

	public void setProg_mutuo(String prog_mutuo) {
		this.prog_mutuo = prog_mutuo;
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

	public Timestamp getDtOraInser() {
		return dtOraInser;
	}

	public void setDtOraInser(Timestamp dtOraInser) {
		this.dtOraInser = dtOraInser;
	}

	public String getStEvn() {
		return stEvn;
	}

	public void setStEvn(String stEvn) {
		this.stEvn = stEvn;
	}

	public String getTpEvn() {
		return tpEvn;
	}

	public void setTpEvn(String tpEvn) {
		this.tpEvn = tpEvn;
	}

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

	public String getFlagInt() {
		return flagInt;
	}

	public void setFlagInt(String flagInt) {
		this.flagInt = flagInt;
	}

	public String getTpBen() {
		return tpBen;
	}

	public void setTpBen(String tpBen) {
		this.tpBen = tpBen;
	}

	public Date getDtMor() {
		return dtMor;
	}

	public void setDtMor(Date dtMor) {
		this.dtMor = dtMor;
	}

	public double getPercDetr() {
		return percDetr;
	}

	public void setPercDetr(double percDetr) {
		this.percDetr = percDetr;
	}

	public String getCodFisc() {
		return codFisc;
	}

	public void setCodFisc(String codFisc) {
		this.codFisc = codFisc;
	}

	public String getAnnoCert() {
		return annoCert;
	}

	public void setAnnoCert(String annoCert) {
		this.annoCert = annoCert;
	}

	public int getIndicePeriodo() {
		return indicePeriodo;
	}

	public void setIndicePeriodo(int indicePeriodo) {
		this.indicePeriodo = indicePeriodo;
	}    
	
	
	
}