package it.inps.eng.wscertificazionemutui.common.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 
 * @author Sistemi2000 : Iovenitti Riccardo, Camorchia Michele
 *
 * Bean che rappresenta una situazione contabile.
 */
public class SituazioneContabile {	
	private String anno_mutuo;
	private String prog_mutuo;
	private String mtr;
	private Integer prog_rt;
	private Timestamp dt_ora_inser;
	private Integer am_rif;
	private Integer am_ope;
	private String st_mov;
	private String tp_mov;
	private String voce;
	private String sede;
	private Double imp_mov;
	private Double imp_mov_ecd;
	private Date dt_pgm;
	private String tp_pgm;
	private Double perc;
	private String sgn;
	private String voce_mutuo;
	private String cau_mov;
	private Timestamp dt_ul_agg;
	private String mtr_ul_agg;
	private String sgn_ecd;
	
	
	/**
	 * Costruttore base
	 *
	 */
	public SituazioneContabile() {
		// costruttore base
		super();
	}

	public Integer getAm_ope() {
		return am_ope;
	}

	public void setAm_ope(Integer am_ope) {
		this.am_ope = am_ope;
	}

	public Integer getAm_rif() {
		return am_rif;
	}

	public void setAm_rif(Integer am_rif) {
		this.am_rif = am_rif;
	}

	public String getAnno_mutuo() {
		return anno_mutuo;
	}

	public void setAnno_mutuo(String anno_mutuo) {
		this.anno_mutuo = anno_mutuo;
	}

	public Timestamp getDt_ora_inser() {
		return dt_ora_inser;
	}

	public void setDt_ora_inser(Timestamp dt_ora_inser) {
		this.dt_ora_inser = dt_ora_inser;
	}

	public Date getDt_pgm() {
		return dt_pgm;
	}

	public void setDt_pgm(Date dt_pgm) {
		this.dt_pgm = dt_pgm;
	}

	public Double getImp_mov() {
		return imp_mov;
	}

	public void setImp_mov(Double imp_mov) {
		this.imp_mov = imp_mov;
	}

	public String getMtr() {
		return mtr;
	}

	public void setMtr(String mtr) {
		this.mtr = mtr;
	}

	public String getProg_mutuo() {
		return prog_mutuo;
	}

	public void setProg_mutuo(String prog_mutuo) {
		this.prog_mutuo = prog_mutuo;
	}

	public Integer getProg_rt() {
		return prog_rt;
	}

	public void setProg_rt(Integer prog_rt) {
		this.prog_rt = prog_rt;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getSt_mov() {
		return st_mov;
	}

	public void setSt_mov(String st_mov) {
		this.st_mov = st_mov;
	}

	public String getTp_mov() {
		return tp_mov;
	}

	public void setTp_mov(String tp_mov) {
		this.tp_mov = tp_mov;
	}

	public String getTp_pgm() {
		return tp_pgm;
	}

	public void setTp_pgm(String tp_pgm) {
		this.tp_pgm = tp_pgm;
	}

	public String getVoce() {
		return voce;
	}

	public void setVoce(String voce) {
		this.voce = voce;
	}

	public Double getPerc() {
		return perc;
	}

	public void setPerc(Double perc) {
		this.perc = perc;
	}

	public String getSgn() {
		return sgn;
	}

	public void setSgn(String sgn) {
		this.sgn = sgn;
	}

	public String getVoce_mutuo() {
		return voce_mutuo;
	}

	public void setVoce_mutuo(String voce_mutuo) {
		this.voce_mutuo = voce_mutuo;
	}

	public String getCau_mov() {
		// Metodo getter di cau_mov
		return cau_mov;
	}

	public void setCau_mov(String cau_mov) {
		// Metodo setter di this.cau_mov
		this.cau_mov = cau_mov;
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

	public String getSgn_ecd() {
		return sgn_ecd;
	}

	public void setSgn_ecd(String sgn_ecd) {
		this.sgn_ecd = sgn_ecd;
	}

	/**
	 * Returns the imp_mov_ecd.
	 * @return Double
	 */
	public Double getImp_mov_ecd() {
		return imp_mov_ecd;
	}

	/**
	 * Sets the imp_mov_ecd.
	 * @param imp_mov_ecd The imp_mov_ecd to set
	 */
	public void setImp_mov_ecd(Double imp_mov_ecd) {
		this.imp_mov_ecd = imp_mov_ecd;
	}

	
	
	 @Override
	    public boolean equals(Object anObject) {
	        if (!(anObject instanceof SituazioneContabile)) {
	            return false;
	        }
	        SituazioneContabile other = (SituazioneContabile)anObject;
	        return ( other.getAnno_mutuo().equals(getAnno_mutuo()) && 
	        		 other.getProg_mutuo().equals(getProg_mutuo()) &&
	        		 other.getSede().equals(getSede()) );
	    }
}
