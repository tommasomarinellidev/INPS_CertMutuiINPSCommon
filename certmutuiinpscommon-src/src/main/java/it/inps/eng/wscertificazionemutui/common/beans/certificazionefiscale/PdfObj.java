package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.util.Date;

import it.inps.eng.wscertificazionemutui.common.beans.Sedi;

public abstract class PdfObj {
	
	private String codSede;
	private String descSede;
	private Date dataStipula;
	private String dataStipulaStr;
	private String dataPagamento;
	private String tipoMutuo;
	private String tipoPagamento;
	private String descrMutuo;
	private String direttoreSede;
	private Double importoBonifico;
	private Double importoMutuo;
	private Double importoEstinzione;
	private Double importoResiduoMutuo;
	private Double importoRata;
	private Integer rateResidue;
	private Sedi sedeFiliali;
	private boolean dirGenerale;
	private String livelloDirettore;
	private String mutuoPadre;
	
	public String getLivelloDirettore() {
		return livelloDirettore;
	}
	public void setLivelloDirettore(String livelloDirettore) {
		this.livelloDirettore = livelloDirettore;
	}
	public String getCodSede() {
		return codSede;
	}
	public void setCodSede(String codSede) {
		this.codSede = codSede;
	}
	public String getDescSede() {
		return descSede;
	}
	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}
	public Date getDataStipula() {
		return dataStipula;
	}
	public void setDataStipula(Date dataStipula) {
		this.dataStipula = dataStipula;
	}
	public String getDataStipulaStr() {
		return dataStipulaStr;
	}
	public void setDataStipulaStr(String dataStipulaStr) {
		this.dataStipulaStr = dataStipulaStr;
	}
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getTipoMutuo() {
		return tipoMutuo;
	}
	public void setTipoMutuo(String tipoMutuo) {
		this.tipoMutuo = tipoMutuo;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public String getDescrMutuo() {
		return descrMutuo;
	}
	public void setDescrMutuo(String descrMutuo) {
		this.descrMutuo = descrMutuo;
	}
	public String getDirettoreSede() {
		return direttoreSede;
	}
	public void setDirettoreSede(String direttoreSede) {
		this.direttoreSede = direttoreSede;
	}
	public Sedi getSedeFiliali() {
		return sedeFiliali;
	}
	public void setSedeFiliali(Sedi sedeFiliali) {
		this.sedeFiliali = sedeFiliali;
	}
	public boolean isDirGenerale() {
		return dirGenerale;
	}
	public void setDirGenerale(boolean dirGenerale) {
		this.dirGenerale = dirGenerale;
	}
	public Double getImportoBonifico() {
		return importoBonifico;
	}
	public void setImportoBonifico(Double importoBonifico) {
		this.importoBonifico = importoBonifico;
	}
	public Double getImportoMutuo() {
		return importoMutuo;
	}
	public void setImportoMutuo(Double importoMutuo) {
		this.importoMutuo = importoMutuo;
	}
	public Double getImportoResiduoMutuo() {
		return importoResiduoMutuo;
	}
	public void setImportoResiduoMutuo(Double importoResiduoMutuo) {
		this.importoResiduoMutuo = importoResiduoMutuo;
	}
	public Double getImportoEstinzione() {
		return importoEstinzione;
	}
	public void setImportoEstinzione(Double importoEstinzione) {
		this.importoEstinzione = importoEstinzione;
	}
	public Double getImportoRata() {
		return importoRata;
	}
	public void setImportoRata(Double importoRata) {
		this.importoRata = importoRata;
	}
	public Integer getRateResidue() {
		return rateResidue;
	}
	public void setRateResidue(Integer rateResidue) {
		this.rateResidue = rateResidue;
	}
	public String getMutuoPadre() {
		return mutuoPadre;
	}
	public void setMutuoPadre(String mutuoPadre) {
		this.mutuoPadre = mutuoPadre;
	}

}
