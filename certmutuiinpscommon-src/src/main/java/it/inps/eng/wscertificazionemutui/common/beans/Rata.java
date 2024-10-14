package it.inps.eng.wscertificazionemutui.common.beans;

import java.util.Date;

public class Rata {
	
	private String anno_mutuo;
	private String prog_mutuo;
	private String matricola; //mtr
	private Integer numeroRata; //progressivoRata //prog_rt
	private Date dt_ora_inser;
	private String annoMeseRif; //am_rif
	private String stato; //st_rt
	private String descrizioneStatoRata; 
	private String sede;
	private Double debitoResiduo; //imp_deb_rsd 
	private Double imp_deb_rsd_ecd;
	private Double importoRata; //imp_rt
	private Double imp_rt_ecd;
	private Double capitale; //imp_capi_rt
	private Double imp_capi_rt_ecd;
	private Double interessi; //imp_its_rt
	private Double imp_its_rt_ecd;
	private Double mora; //imp_its_mora_rt
	private Double imp_its_mora_rt_ecd;
	private Double tasso; //tas
	private Double tas_ecd;
	private String tp_pgm;
	private Integer frq_rt; 
	private Date dataPagamentoRata; //dt_pgm_rt
	private Date dt_pgm_mora_rt;
	private Double perc;
	
	
	
	
	public Rata() {
		super(); 
	}

	public Rata(String anno_mutuo, String prog_mutuo, String mtr, Integer prog_rt, Date dt_ora_inser,
			String am_rif, String st_rt, String sede, Double imp_deb_rsd, Double imp_deb_rsd_ecd, Double imp_rt,
			Double imp_rt_ecd, Double imp_capi_rt, Double imp_capi_rt_ecd, Double imp_its_rt, Double imp_its_rt_ecd,
			Double imp_its_mora_rt, Double imp_its_mora_rt_ecd, Double tas, Double tas_ecd, String tp_pgm,
			Integer frq_rt, Date dt_pgm_rt, Date dt_pgm_mora_rt, Double perc,String descStatoRata) {
		super();
		this.anno_mutuo = anno_mutuo;
		this.prog_mutuo = prog_mutuo;
		this.matricola = mtr;
		this.numeroRata = prog_rt;
		this.dt_ora_inser = dt_ora_inser;
		this.annoMeseRif = am_rif;
		this.stato = st_rt;
		this.descrizioneStatoRata = descStatoRata;
		this.sede = sede;
		this.debitoResiduo = imp_deb_rsd;
		this.imp_deb_rsd_ecd = imp_deb_rsd_ecd;
		this.importoRata = imp_rt;
		this.imp_rt_ecd = imp_rt_ecd;
		this.capitale = imp_capi_rt;
		this.imp_capi_rt_ecd = imp_capi_rt_ecd;
		this.interessi = imp_its_rt;
		this.imp_its_rt_ecd = imp_its_rt_ecd;
		this.mora = imp_its_mora_rt;
		this.imp_its_mora_rt_ecd = imp_its_mora_rt_ecd;
		this.tasso = tas;
		this.tas_ecd = tas_ecd;
		this.tp_pgm = tp_pgm;
		this.frq_rt = frq_rt;
		this.dataPagamentoRata = dt_pgm_rt;
		this.dt_pgm_mora_rt = dt_pgm_mora_rt;
		this.perc = perc;
	}
	
	public Rata(Rata rata) {
		super();
		this.anno_mutuo = rata.getAnno_mutuo();
		this.prog_mutuo = rata.getProg_mutuo();
		this.matricola = rata.getMatricola();
		this.numeroRata = rata.getNumeroRata();
		this.dt_ora_inser = rata.getDt_ora_inser();
		this.annoMeseRif = rata.getAnnoMeseRif();
		this.stato = rata.getStato();
		this.descrizioneStatoRata = rata.getDescrizioneStatoRata();
		this.sede = rata.getSede();
		this.debitoResiduo = rata.getDebitoResiduo();
		this.imp_deb_rsd_ecd = rata.getImp_deb_rsd_ecd();
		this.importoRata = rata.getImportoRata();
		this.imp_rt_ecd = rata.getImp_rt_ecd();
		this.capitale = rata.getCapitale();
		this.imp_capi_rt_ecd = rata.getImp_capi_rt_ecd();
		this.interessi = rata.getInteressi();
		this.imp_its_rt_ecd = rata.getImp_its_rt_ecd();
		this.mora = rata.getMora();
		this.imp_its_mora_rt_ecd = rata.getImp_its_mora_rt_ecd();
		this.tasso = rata.getTasso();
		this.tas_ecd = rata.getTas_ecd();
		this.tp_pgm = rata.getTp_pgm();
		this.frq_rt = rata.getFrq_rt();
		this.dataPagamentoRata = rata.getDataPagamentoRata();
		this.dt_pgm_mora_rt = rata.getDt_pgm_mora_rt();
		this.perc = rata.getPerc();
	}

	public Integer getNumeroRata() {
		return numeroRata;
	}

	public void setNumeroRata(Integer numeroRata) {
		this.numeroRata = numeroRata;
	}
	public String getAnno_mutuo() {
		return anno_mutuo;
	}

	public void setAnno_mutuo(String anno_mutuo) {
		this.anno_mutuo = anno_mutuo;
	}

	public Date getDt_ora_inser() {
		return dt_ora_inser;
	}

	public void setDt_ora_inser(Date dt_ora_inser) {
		this.dt_ora_inser = dt_ora_inser;
	}

	public Date getDt_pgm_mora_rt() {
		return dt_pgm_mora_rt;
	}

	public void setDt_pgm_mora_rt(Date dt_pgm_mora_rt) {
		this.dt_pgm_mora_rt = dt_pgm_mora_rt;
	}

	public Integer getFrq_rt() {
		return frq_rt;
	}

	public void setFrq_rt(Integer frq_rt) {
		this.frq_rt = frq_rt;
	}

	public String getProg_mutuo() {
		return prog_mutuo;
	}

	public void setProg_mutuo(String prog_mutuo) {
		this.prog_mutuo = prog_mutuo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public Double getDebitoResiduo() {
		return debitoResiduo;
	}

	public void setDebitoResiduo(Double debitoResiduo) {
		this.debitoResiduo = debitoResiduo;
	}

	public String getTp_pgm() {
		return tp_pgm;
	}

	public void setTp_pgm(String tp_pgm) {
		this.tp_pgm = tp_pgm;
	}

	public Double getPerc() {
		// Metodo getter di perc
		return perc;
	}

	public void setPerc(Double perc) {
		// Metodo setter di this.perc
		this.perc = perc;
	}
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getAnnoMeseRif() {
		return annoMeseRif;
	}

	public void setAnnoMeseRif(String annoMeseRif) {
		this.annoMeseRif = annoMeseRif;
	}
	
	public Double getImportoRata() {
		return importoRata;
	}

	public void setImportoRata(Double importoRata) {
		this.importoRata = importoRata;
	}
	
	public Double getCapitale() {
		return capitale;
	}

	public void setCapitale(Double capitale) {
		this.capitale = capitale;
	}
	
	public Double getInteressi() {
		return interessi;
	}

	public void setInteressi(Double interessi) {
		this.interessi = interessi;
	}
	
	public Double getTasso() {
		return tasso;
	}

	public void setTasso(Double tasso) {
		this.tasso = tasso;
	}
	
	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}
	
	public String getDescrizioneStatoRata() {
		return descrizioneStatoRata;
	}

	public void setDescrizioneStatoRata(String descrizioneStatoRata) {
		this.descrizioneStatoRata = descrizioneStatoRata;
	}
	
	public Double getMora() {
		return mora;
	}

	public void setMora(Double mora) {
		this.mora = mora;
	}
	
	public Date getDataPagamentoRata() {
		return dataPagamentoRata;
	}

	public void setDataPagamentoRata(Date dataPagamentoRata) {
		this.dataPagamentoRata = dataPagamentoRata;
	}
	
	/**
	 * Returns the imp_capi_rt_ecd.
	 * @return Double
	 */
	public Double getImp_capi_rt_ecd() {
		return imp_capi_rt_ecd;
	}

	/**
	 * Returns the imp_deb_rsd_ecd.
	 * @return Double
	 */
	public Double getImp_deb_rsd_ecd() {
		return imp_deb_rsd_ecd;
	}

	/**
	 * Returns the imp_its_mora_rt_ecd.
	 * @return Double
	 */
	public Double getImp_its_mora_rt_ecd() {
		return imp_its_mora_rt_ecd;
	}

	/**
	 * Returns the imp_its_rt_ecd.
	 * @return Double
	 */
	public Double getImp_its_rt_ecd() {
		return imp_its_rt_ecd;
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
	 * Sets the imp_capi_rt_ecd.
	 * @param imp_capi_rt_ecd The imp_capi_rt_ecd to set
	 */
	public void setImp_capi_rt_ecd(Double imp_capi_rt_ecd) {
		this.imp_capi_rt_ecd = imp_capi_rt_ecd;
	}

	/**
	 * Sets the imp_deb_rsd_ecd.
	 * @param imp_deb_rsd_ecd The imp_deb_rsd_ecd to set
	 */
	public void setImp_deb_rsd_ecd(Double imp_deb_rsd_ecd) {
		this.imp_deb_rsd_ecd = imp_deb_rsd_ecd;
	}

	/**
	 * Sets the imp_its_mora_rt_ecd.
	 * @param imp_its_mora_rt_ecd The imp_its_mora_rt_ecd to set
	 */
	public void setImp_its_mora_rt_ecd(Double imp_its_mora_rt_ecd) {
		this.imp_its_mora_rt_ecd = imp_its_mora_rt_ecd;
	}

	/**
	 * Sets the imp_its_rt_ecd.
	 * @param imp_its_rt_ecd The imp_its_rt_ecd to set
	 */
	public void setImp_its_rt_ecd(Double imp_its_rt_ecd) {
		this.imp_its_rt_ecd = imp_its_rt_ecd;
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

	@Override
	public String toString() {
		return "Rata [imp_deb_rsd=" + debitoResiduo 
				+ ", imp_rt=" + importoRata
				+ ", imp_capi_rt=" + capitale
				+ ", imp_its_rt=" + interessi 
				+ ", tas=" + tasso 
				+ "]";
	}
	
	
	
}