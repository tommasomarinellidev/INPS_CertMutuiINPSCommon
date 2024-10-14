package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;
import java.sql.*;

public class DataElaborazione implements Serializable {
	private static final long serialVersionUID = 8169514628839040495L;
	private String tipo_elaborazione="";
	private String anno_mese_elab="";
	private String anno_cert="";	
	private Date   dt_ult_agg=null;
	private String matr_ult_agg="";
	
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	public String getAnno_mese_elab() {
		return anno_mese_elab;
	}
	public void setAnno_mese_elab(String anno_mese_elab) {
		this.anno_mese_elab = anno_mese_elab;
	}
	public Date getDt_ult_agg() {
		return dt_ult_agg;
	}
	public void setDt_ult_agg(Date dt_ult_agg) {
		this.dt_ult_agg = dt_ult_agg;
	}
	public String getMatr_ult_agg() {
		return matr_ult_agg;
	}
	public void setMatr_ult_agg(String matr_ult_agg) {
		this.matr_ult_agg = matr_ult_agg;
	}
	public String getTipo_elaborazione() {
		return tipo_elaborazione;
	}
	public void setTipo_elaborazione(String tipo_elaborazione) {
		this.tipo_elaborazione = tipo_elaborazione;
	}

	public String getAnno_cert() {
		return anno_cert;
	}

	public void setAnno_cert(String anno_cert) {
		this.anno_cert = anno_cert;
	}	

}
