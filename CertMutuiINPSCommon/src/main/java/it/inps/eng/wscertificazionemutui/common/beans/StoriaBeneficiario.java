package it.inps.eng.wscertificazionemutui.common.beans;

import java.sql.Timestamp;
import java.util.Date;

public class StoriaBeneficiario {
	private String mtr;
	private String anno_mutuo;
	private String prog_mutuo;
	private Date dt_dec;
	private Timestamp dt_ul_agg;
	private String mtr_ul_agg;
	private String flag_int;
	private double perc;
	private String st_evn;
	private String tp_ben;
	private String tp_pgm;
	private String tp_evn;
	private double perc_detr;    //Aggiornamento 20150305
	
	
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
	public Date getDt_dec() {
		return dt_dec;
	}
	public void setDt_dec(Date dt_dec) {
		this.dt_dec = dt_dec;
	}
	public Timestamp getDt_ul_agg() {
		return dt_ul_agg;
	}
	public void setDt_ul_agg(Timestamp dt_ul_agg) {
		this.dt_ul_agg = dt_ul_agg;
	}
	public String getMtr_ul_agg() {
		return mtr_ul_agg;
	}
	public void setMtr_ul_agg(String mtr_ul_agg) {
		this.mtr_ul_agg = mtr_ul_agg;
	}
	public String getFlag_int() {
		return flag_int;
	}
	public void setFlag_int(String flag_int) {
		this.flag_int = flag_int;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	public String getSt_evn() {
		return st_evn;
	}
	public void setSt_evn(String st_evn) {
		this.st_evn = st_evn;
	}
	public String getTp_ben() {
		return tp_ben;
	}
	public void setTp_ben(String tp_ben) {
		this.tp_ben = tp_ben;
	}
	public String getTp_pgm() {
		return tp_pgm;
	}
	public void setTp_pgm(String tp_pgm) {
		this.tp_pgm = tp_pgm;
	}
	public String getTp_evn() {
		return tp_evn;
	}
	public void setTp_evn(String tp_evn) {
		this.tp_evn = tp_evn;
	}
	public double getPerc_detr() {
		return perc_detr;
	}
	public void setPerc_detr(double perc_detr) {
		this.perc_detr = perc_detr;
	}
}