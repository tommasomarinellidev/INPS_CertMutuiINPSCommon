package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Sistemi2000 : Iovenitti Riccardo, Camorchia Michele
 *
 * Classe astratta che aggiunge i campi di "update" (matricola e data/ora).
 */
public abstract class UpdateTags implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3129532508213564914L;
	
	protected Date dt_ul_agg;
	protected String mtr_ul_agg;
	
	public Date getDt_ul_agg() {
		return dt_ul_agg;
	}
	
	public void setDt_ul_agg(Date dt_ul_agg) {
		this.dt_ul_agg = dt_ul_agg;
	}
	
	public String getMtr_ul_agg() {
		return mtr_ul_agg;
	}
	
	public void setMtr_ul_agg(String mtr_ul_agg) {
		this.mtr_ul_agg = mtr_ul_agg;
	}
}
