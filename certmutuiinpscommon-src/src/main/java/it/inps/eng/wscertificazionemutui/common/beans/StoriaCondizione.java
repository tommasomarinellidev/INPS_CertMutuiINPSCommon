package it.inps.eng.wscertificazionemutui.common.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 
 * @author Sistemi2000 : Iovenitti Riccardo, Camorchia Michele
 *
 * Bean che rappresenta una storia condizione.
 */
public class StoriaCondizione extends UpdateTags {
	
	private static final long serialVersionUID = -6997972082467924248L;
	
	private Date dt_dec;
	private Timestamp dt_ora_inser;
	private String st_evn;
	private String tp_evn;
	private Double imp_deb;
	private Double imp_deb_ecd;
	private String tp_tas;
	private String tp_tas_ecd;
	private Double tas;
	private Double tas_ecd;
	private Integer num_rt_rsd;
	private Integer num_rt_tot;
	private Integer frq_rt;
	private Integer prog_rt;
	private Double imp_rt;
	private Double imp_rt_ecd;
	private Double imp_estin;
	private Double imp_estin_ecd;
	private String tp_varz;
	private Date data_scadenza;
	private String anno_mutuo;
	private String prog_mutuo;
	
	/**
	 * Costruttore base
	 *
	 */
	public StoriaCondizione() {
		// superclasse
		super();
	}

	public Date getDt_dec() {
		return dt_dec;
	}

	public void setDt_dec(Date dt_dec) {
		this.dt_dec = dt_dec;
	}

	public Timestamp getDt_ora_inser() {
		return dt_ora_inser;
	}

	public void setDt_ora_inser(Timestamp dt_ora_inser) {
		this.dt_ora_inser = dt_ora_inser;
	}

	public Integer getFrq_rt() {
		return frq_rt;
	}

	public void setFrq_rt(Integer frq_rt) {
		this.frq_rt = frq_rt;
	}

	public Double getImp_deb() {
		return imp_deb;
	}

	public void setImp_deb(Double imp_deb) {
		this.imp_deb = imp_deb;
	}

	public Double getImp_estin() {
		return imp_estin;
	}

	public void setImp_estin(Double imp_estin) {
		this.imp_estin = imp_estin;
	}

	public Double getImp_rt() {
		return imp_rt;
	}

	public void setImp_rt(Double imp_rt) {
		this.imp_rt = imp_rt;
	}

	public Integer getNum_rt_rsd() {
		return num_rt_rsd;
	}

	public void setNum_rt_rsd(Integer num_rt_rsd) {
		this.num_rt_rsd = num_rt_rsd;
	}

	public Integer getProg_rt() {
		return prog_rt;
	}

	public void setProg_rt(Integer prog_rt) {
		this.prog_rt = prog_rt;
	}

	public String getSt_evn() {
		return st_evn;
	}

	public void setSt_evn(String st_evn) {
		this.st_evn = st_evn;
	}

	public Double getTas() {
		return tas;
	}

	public void setTas(Double tas) {
		this.tas = tas;
	}

	public String getTp_evn() {
		return tp_evn;
	}

	public void setTp_evn(String tp_evn) {
		this.tp_evn = tp_evn;
	}

	public String getTp_tas() {
		return tp_tas;
	}

	public void setTp_tas(String tp_tas) {
		this.tp_tas = tp_tas;
	}

	public String getTp_varz() {
		return tp_varz;
	}

	public void setTp_varz(String tp_varz) {
		this.tp_varz = tp_varz;
	}

	public Integer getNum_rt_tot() {
		return num_rt_tot;
	}

	public void setNum_rt_tot(Integer num_rt_tot) {
		this.num_rt_tot = num_rt_tot;
	}

	public Date getData_scadenza() {
		return data_scadenza;
	}

	public void setData_scadenza(Date data_scadenza) {
		this.data_scadenza = data_scadenza;
	}

	public String getAnno_mutuo() {
		// Metodo getter di anno_mutuo
		return anno_mutuo;
	}

	public void setAnno_mutuo(String anno_mutuo) {
		// Metodo setter di this.anno_mutuo
		this.anno_mutuo = anno_mutuo;
	}

	public String getProg_mutuo() {
		// Metodo getter di prog_mutuo
		return prog_mutuo;
	}

	public void setProg_mutuo(String prog_mutuo) {
		// Metodo setter di this.prog_mutuo
		this.prog_mutuo = prog_mutuo;
	}
	/**
	 * Returns the imp_deb_ecd.
	 * @return Double
	 */
	public Double getImp_deb_ecd() {
		return imp_deb_ecd;
	}

	/**
	 * Returns the imp_estin_ecd.
	 * @return Double
	 */
	public Double getImp_estin_ecd() {
		return imp_estin_ecd;
	}

	/**
	 * Returns the imp_rt_ecd.
	 * @return Double
	 */
	public Double getImp_rt_ecd() {
		return imp_rt_ecd;
	}

	/**
	 * Returns the tas_ecd.
	 * @return Double
	 */
	public Double getTas_ecd() {
		return tas_ecd;
	}

	/**
	 * Returns the tp_tas_ecd.
	 * @return String
	 */
	public String getTp_tas_ecd() {
		return tp_tas_ecd;
	}

	/**
	 * Sets the imp_deb_ecd.
	 * @param imp_deb_ecd The imp_deb_ecd to set
	 */
	public void setImp_deb_ecd(Double imp_deb_ecd) {
		this.imp_deb_ecd = imp_deb_ecd;
	}

	/**
	 * Sets the imp_estin_ecd.
	 * @param imp_estin_ecd The imp_estin_ecd to set
	 */
	public void setImp_estin_ecd(Double imp_estin_ecd) {
		this.imp_estin_ecd = imp_estin_ecd;
	}

	/**
	 * Sets the imp_rt_ecd.
	 * @param imp_rt_ecd The imp_rt_ecd to set
	 */
	public void setImp_rt_ecd(Double imp_rt_ecd) {
		this.imp_rt_ecd = imp_rt_ecd;
	}

	/**
	 * Sets the tas_ecd.
	 * @param tas_ecd The tas_ecd to set
	 */
	public void setTas_ecd(Double tas_ecd) {
		this.tas_ecd = tas_ecd;
	}

	/**
	 * Sets the tp_tas_ecd.
	 * @param tp_tas_ecd The tp_tas_ecd to set
	 */
	public void setTp_tas_ecd(String tp_tas_ecd) {
		this.tp_tas_ecd = tp_tas_ecd;
	}

}
