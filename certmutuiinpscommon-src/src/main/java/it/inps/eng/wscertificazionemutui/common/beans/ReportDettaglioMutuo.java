package it.inps.eng.wscertificazionemutui.common.beans;



import java.io.Serializable;
import java.util.Date;


public class ReportDettaglioMutuo implements Serializable {
	private static final long serialVersionUID = -6098255224776572144L;
	private String annoMutuo;
	private String progressivoMutuo;
	private Double importoMutuo;
	private Integer numRateTotali;
	private Integer numRateResidue;
	private String tipoMutuo;
	private Double tassoAttuale;
	private Double importoRata;

	private String mtrInt;
	private String mtrCoInt;	
	private Double importoImpostaSostitutivaInt;
	private Double importoImpostaSostitutivaCoInt;	
	private Date dataPagImpostaSostInt;	
	private Date dataPagImpostaSostCoInt;

	private Date dataStipula;
	private Double speseIstruttoria;
	private Double importoEstinzioneAnticipata;
	private Date dataScadenzaPrevista;
	private Integer frequenzaRate;
	private String voceContabile;
	private String tipoTasso;
	private Date dataNascitaMutuo;
	private Date dataErogazione;
	private Double interessiPreammortamento;
	private Date dataChiusura;
// *********************************************	
	private Double importoMutuoEcd;
	private Double tassoAttualeEcd;
	private Double importoRataEcd;
	private Double importoEstinzioneAnticipataEcd;
	private String tipoTassoEcd;
	private Double interessiPreammortamentoEcd;	
// *********************************************	

	private Double importoMutuoPriAcc;
	private Date dataErogazionePriAcc;
	private Double interessiPreammortamentoPriAcc;	
	private Double importoMutuoSecAcc;	
	private Date dataErogazioneSecAcc;
	private Double interessiPreammortamentoSecAcc;		
	private Double importoMutuoSaldo;	
	private Date dataErogazioneSaldo;	
	private Double interessiPreammortamentoSaldo;		
	
	private Double interessiPreammortamentoRimborso;		
	private Double interessiPreammortamentoTrattenuta;			
	private Double interessiRimborso;		
	private Double interessiTrattenuta;	
	
	private boolean detrazioneFiscale;
	
	private String email="";
	private String tel="";
	private String cell="";
	private String note;
	
	private String AnnoInizioErogazione;
	private String MeseInizioErogazione;
	
	//private TipoComunicazione tipoComunicazione;
	
	//Mutui-48
	private boolean flagGestAcconti;

	public boolean isFlagGestAcconti() {
		return flagGestAcconti;
	}

	public void setFlagGestAcconti(boolean flagGestAcconti) {
		this.flagGestAcconti = flagGestAcconti;
	}

	public String getAnnoInizioErogazione() {
		return AnnoInizioErogazione;
	}

	public void setAnnoInizioErogazione(String annoInizioErogazione) {
		AnnoInizioErogazione = annoInizioErogazione;
	}

	public String getMeseInizioErogazione() {
		return MeseInizioErogazione;
	}

	public void setMeseInizioErogazione(String meseInizioErogazione) {
		MeseInizioErogazione = meseInizioErogazione;
	}
	
	public String getAnnoMutuo() {
		return annoMutuo;
	}

	public void setAnnoMutuo(String annoMutuo) {
		this.annoMutuo = annoMutuo;
	}
	
	public Date getDataChiusura() {
		return dataChiusura;
	}
	
	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}
	
	public Date getDataErogazione() {
		return dataErogazione;
	}
	
	public void setDataErogazione(Date dataErogazione) {
		this.dataErogazione = dataErogazione;
	}
	
	public Date getDataNascitaMutuo() {
		return dataNascitaMutuo;
	}
	
	public void setDataNascitaMutuo(Date dataNascitaMutuo) {
		this.dataNascitaMutuo = dataNascitaMutuo;
	}
	
	public Date getDataScadenzaPrevista() {
		return dataScadenzaPrevista;
	}
	
	public void setDataScadenzaPrevista(Date dataScadenzaPrevista) {
		this.dataScadenzaPrevista = dataScadenzaPrevista;
	}
	
	public Date getDataStipula() {
		return dataStipula;
	}
	
	public void setDataStipula(Date dataStipula) {
		this.dataStipula = dataStipula;
	}
	
	public Integer getFrequenzaRate() {
		return frequenzaRate;
	}
	
	public void setFrequenzaRate(Integer frequenzaRate) {
		this.frequenzaRate = frequenzaRate;
	}
	
	public Double getImportoEstinzioneAnticipata() {
		return importoEstinzioneAnticipata;
	}
	
	public void setImportoEstinzioneAnticipata(Double importoEstinzioneAnticipata) {
		this.importoEstinzioneAnticipata = importoEstinzioneAnticipata;
	}
	
	public Double getImportoMutuo() {
		return importoMutuo;
	}
	
	public void setImportoMutuo(Double importoMutuo) {
		this.importoMutuo = importoMutuo;
	}
	
	public Double getImportoRata() {
		return importoRata;
	}
	
	public void setImportoRata(Double importoRata) {
		this.importoRata = importoRata;
	}
	
	public Double getInteressiPreammortamento() {
		return interessiPreammortamento;
	}
	
	public void setInteressiPreammortamento(Double interessiPreammortamento) {
		this.interessiPreammortamento = interessiPreammortamento;
	}
	
	public Integer getNumRateResidue() {
		return numRateResidue;
	}
	
	public void setNumRateResidue(Integer numRateResidue) {
		this.numRateResidue = numRateResidue;
	}
	
	public Integer getNumRateTotali() {
		return numRateTotali;
	}
	
	public void setNumRateTotali(Integer numRateTotali) {
		this.numRateTotali = numRateTotali;
	}
	
	public String getProgressivoMutuo() {
		return progressivoMutuo;
	}
	
	public void setProgressivoMutuo(String progressivoMutuo) {
		this.progressivoMutuo = progressivoMutuo;
	}
	
	public Double getSpeseIstruttoria() {
		return speseIstruttoria;
	}
	
	public void setSpeseIstruttoria(Double speseIstruttoria) {
		this.speseIstruttoria = speseIstruttoria;
	}
	
	public Double getTassoAttuale() {
		return tassoAttuale;
	}
	
	public void setTassoAttuale(Double tassoAttuale) {
		this.tassoAttuale = tassoAttuale;		
	}
	
	public String getTipoMutuo() {
		return tipoMutuo;
	}
	
	public void setTipoMutuo(String tipoMutuo) {
		this.tipoMutuo = tipoMutuo;
	}
	
	public String getTipoTasso() {
		return tipoTasso;
	}
	
	public void setTipoTasso(String tipoTasso) {
		this.tipoTasso = tipoTasso;
	}
	
	public String getVoceContabile() {
		return voceContabile;
	}
	
	public void setVoceContabile(String voceContabile) {
		this.voceContabile = voceContabile;
	}
	/**
	 * Returns the importoEstinzioneAnticipataEcd.
	 * @return Double
	 */
	public Double getImportoEstinzioneAnticipataEcd() {
		return importoEstinzioneAnticipataEcd;
	}

/**
 * Returns the importoMutuoEcd.
 * @return Double
 */
public Double getImportoMutuoEcd() {
	return importoMutuoEcd;
}

	/**
	 * Returns the importoRataEcd.
	 * @return Double
	 */
	public Double getImportoRataEcd() {
		return importoRataEcd;
	}

	/**
	 * Returns the interessiPreammortamentoEcd.
	 * @return Double
	 */
	public Double getInteressiPreammortamentoEcd() {
		return interessiPreammortamentoEcd;
	}

	/**
	 * Returns the tassoAttualeEcd.
	 * @return Double
	 */
	public Double getTassoAttualeEcd() {
		return tassoAttualeEcd;
	}

	/**
	 * Returns the tipoTassoEcd.
	 * @return String
	 */
	public String getTipoTassoEcd() {
		return tipoTassoEcd;
	}

	/**
	 * Sets the importoEstinzioneAnticipataEcd.
	 * @param importoEstinzioneAnticipataEcd The importoEstinzioneAnticipataEcd to set
	 */
	public void setImportoEstinzioneAnticipataEcd(Double importoEstinzioneAnticipataEcd) {
		this.importoEstinzioneAnticipataEcd = importoEstinzioneAnticipataEcd;
	}

/**
 * Sets the importoMutuoEcd.
 * @param importoMutuoEcd The importoMutuoEcd to set
 */
public void setImportoMutuoEcd(Double importoMutuoEcd) {
	this.importoMutuoEcd = importoMutuoEcd;
}

	/**
	 * Sets the importoRataEcd.
	 * @param importoRataEcd The importoRataEcd to set
	 */
	public void setImportoRataEcd(Double importoRataEcd) {
		this.importoRataEcd = importoRataEcd;
	}

	/**
	 * Sets the interessiPreammortamentoEcd.
	 * @param interessiPreammortamentoEcd The interessiPreammortamentoEcd to set
	 */
	public void setInteressiPreammortamentoEcd(Double interessiPreammortamentoEcd) {
		this.interessiPreammortamentoEcd = interessiPreammortamentoEcd;
	}

	/**
	 * Sets the tassoAttualeEcd.
	 * @param tassoAttualeEcd The tassoAttualeEcd to set
	 */
	public void setTassoAttualeEcd(Double tassoAttualeEcd) {
		this.tassoAttualeEcd = tassoAttualeEcd;
	}

	/**
	 * Sets the tipoTassoEcd.
	 * @param tipoTassoEcd The tipoTassoEcd to set
	 */
	public void setTipoTassoEcd(String tipoTassoEcd) {
		this.tipoTassoEcd = tipoTassoEcd;
	}

	/**
	 * Returns the dataPagImpostaSostCoInt.
	 * @return Date
	 */
	public Date getDataPagImpostaSostCoInt() {
		return dataPagImpostaSostCoInt;
	}

	/**
	 * Returns the dataPagImpostaSostInt.
	 * @return Date
	 */
	public Date getDataPagImpostaSostInt() {
		return dataPagImpostaSostInt;
	}

	/**
	 * Returns the importoImpostaSostitutivaCoInt.
	 * @return Double
	 */
	public Double getImportoImpostaSostitutivaCoInt() {
		return importoImpostaSostitutivaCoInt;
	}

	/**
	 * Returns the importoImpostaSostitutivaInt.
	 * @return Double
	 */
	public Double getImportoImpostaSostitutivaInt() {
		return importoImpostaSostitutivaInt;
	}

	/**
	 * Sets the dataPagImpostaSostCoInt.
	 * @param dataPagImpostaSostCoInt The dataPagImpostaSostCoInt to set
	 */
	public void setDataPagImpostaSostCoInt(Date dataPagImpostaSostCoInt) {
		this.dataPagImpostaSostCoInt = dataPagImpostaSostCoInt;
	}

	/**
	 * Sets the dataPagImpostaSostInt.
	 * @param dataPagImpostaSostInt The dataPagImpostaSostInt to set
	 */
	public void setDataPagImpostaSostInt(Date dataPagImpostaSostInt) {
		this.dataPagImpostaSostInt = dataPagImpostaSostInt;
	}

	/**
	 * Sets the importoImpostaSostitutivaCoInt.
	 * @param importoImpostaSostitutivaCoInt The importoImpostaSostitutivaCoInt to set
	 */
	public void setImportoImpostaSostitutivaCoInt(Double importoImpostaSostitutivaCoInt) {
		this.importoImpostaSostitutivaCoInt = importoImpostaSostitutivaCoInt;
	}

	/**
	 * Sets the importoImpostaSostitutivaInt.
	 * @param importoImpostaSostitutivaInt The importoImpostaSostitutivaInt to set
	 */
	public void setImportoImpostaSostitutivaInt(Double importoImpostaSostitutivaInt) {
		this.importoImpostaSostitutivaInt = importoImpostaSostitutivaInt;
	}

	/**
	 * Returns the mtrCoInt.
	 * @return String
	 */
	public String getMtrCoInt() {
		return mtrCoInt;
	}

	/**
	 * Returns the mtrInt.
	 * @return String
	 */
	public String getMtrInt() {
		return mtrInt;
	}

	/**
	 * Sets the mtrCoInt.
	 * @param mtrCoInt The mtrCoInt to set
	 */
	public void setMtrCoInt(String mtrCoInt) {
		this.mtrCoInt = mtrCoInt;
	}

	/**
	 * Sets the mtrInt.
	 * @param mtrInt The mtrInt to set
	 */
	public void setMtrInt(String mtrInt) {
		this.mtrInt = mtrInt;
	}

	/**
	 * Returns the dataErogazionePriAcc.
	 * @return Date
	 */
	public Date getDataErogazionePriAcc() {
		return dataErogazionePriAcc;
	}

	/**
	 * Returns the dataErogazioneSaldo.
	 * @return Date
	 */
	public Date getDataErogazioneSaldo() {
		return dataErogazioneSaldo;
	}

	/**
	 * Returns the dataErogazioneSecAcc.
	 * @return Date
	 */
	public Date getDataErogazioneSecAcc() {
		return dataErogazioneSecAcc;
	}

/**
 * Returns the importoMutuoPriAcc.
 * @return Double
 */
public Double getImportoMutuoPriAcc() {
	return importoMutuoPriAcc;
}

	/**
	 * Returns the importoMutuoSaldo.
	 * @return Double
	 */
	public Double getImportoMutuoSaldo() {
		return importoMutuoSaldo;
	}

	/**
	 * Returns the importoMutuoSecAcc.
	 * @return Double
	 */
	public Double getImportoMutuoSecAcc() {
		return importoMutuoSecAcc;
	}

	/**
	 * Sets the dataErogazionePriAcc.
	 * @param dataErogazionePriAcc The dataErogazionePriAcc to set
	 */
	public void setDataErogazionePriAcc(Date dataErogazionePriAcc) {
		this.dataErogazionePriAcc = dataErogazionePriAcc;
	}

	/**
	 * Sets the dataErogazioneSaldo.
	 * @param dataErogazioneSaldo The dataErogazioneSaldo to set
	 */
	public void setDataErogazioneSaldo(Date dataErogazioneSaldo) {
		this.dataErogazioneSaldo = dataErogazioneSaldo;
	}

	/**
	 * Sets the dataErogazioneSecAcc.
	 * @param dataErogazioneSecAcc The dataErogazioneSecAcc to set
	 */
	public void setDataErogazioneSecAcc(Date dataErogazioneSecAcc) {
		this.dataErogazioneSecAcc = dataErogazioneSecAcc;
	}

/**
 * Sets the importoMutuoPriAcc.
 * @param importoMutuoPriAcc The importoMutuoPriAcc to set
 */
public void setImportoMutuoPriAcc(Double importoMutuoPriAcc) {
	this.importoMutuoPriAcc = importoMutuoPriAcc;
}

	/**
	 * Sets the importoMutuoSaldo.
	 * @param importoMutuoSaldo The importoMutuoSaldo to set
	 */
	public void setImportoMutuoSaldo(Double importoMutuoSaldo) {
		this.importoMutuoSaldo = importoMutuoSaldo;
	}

	/**
	 * Sets the importoMutuoSecAcc.
	 * @param importoMutuoSecAcc The importoMutuoSecAcc to set
	 */
	public void setImportoMutuoSecAcc(Double importoMutuoSecAcc) {
		this.importoMutuoSecAcc = importoMutuoSecAcc;
	}

	/**
	 * Returns the interessiPreammortamentoPriAcc.
	 * @return Double
	 */
	public Double getInteressiPreammortamentoPriAcc() {
		return interessiPreammortamentoPriAcc;
	}

	/**
	 * Returns the interessiPreammortamentoSaldo.
	 * @return Double
	 */
	public Double getInteressiPreammortamentoSaldo() {
		return interessiPreammortamentoSaldo;
	}

	/**
	 * Returns the interessiPreammortamentoSecAcc.
	 * @return Double
	 */
	public Double getInteressiPreammortamentoSecAcc() {
		return interessiPreammortamentoSecAcc;
	}

	/**
	 * Sets the interessiPreammortamentoPriAcc.
	 * @param interessiPreammortamentoPriAcc The interessiPreammortamentoPriAcc to set
	 */
	public void setInteressiPreammortamentoPriAcc(Double interessiPreammortamentoPriAcc) {
		this.interessiPreammortamentoPriAcc = interessiPreammortamentoPriAcc;
	}

	/**
	 * Sets the interessiPreammortamentoSaldo.
	 * @param interessiPreammortamentoSaldo The interessiPreammortamentoSaldo to set
	 */
	public void setInteressiPreammortamentoSaldo(Double interessiPreammortamentoSaldo) {
		this.interessiPreammortamentoSaldo = interessiPreammortamentoSaldo;
	}

	/**
	 * Sets the interessiPreammortamentoSecAcc.
	 * @param interessiPreammortamentoSecAcc The interessiPreammortamentoSecAcc to set
	 */
	public void setInteressiPreammortamentoSecAcc(Double interessiPreammortamentoSecAcc) {
		this.interessiPreammortamentoSecAcc = interessiPreammortamentoSecAcc;
	}

	/**
	 * Returns the interessiPreammortamentoRimborso.
	 * @return Double
	 */
	public Double getInteressiPreammortamentoRimborso() {
		return interessiPreammortamentoRimborso;
	}

	/**
	 * Returns the interessiPreammortamentoTrattenuta.
	 * @return Double
	 */
	public Double getInteressiPreammortamentoTrattenuta() {
		return interessiPreammortamentoTrattenuta;
	}

	/**
	 * Returns the interessiRimborso.
	 * @return Double
	 */
	public Double getInteressiRimborso() {
		return interessiRimborso;
	}

	/**
	 * Returns the interessiTrattenuta.
	 * @return Double
	 */
	public Double getInteressiTrattenuta() {
		return interessiTrattenuta;
	}

	/**
	 * Sets the interessiPreammortamentoRimborso.
	 * @param interessiPreammortamentoRimborso The interessiPreammortamentoRimborso to set
	 */
	public void setInteressiPreammortamentoRimborso(Double interessiPreammortamentoRimborso) {
		this.interessiPreammortamentoRimborso =
			interessiPreammortamentoRimborso;
	}

	/**
	 * Sets the interessiPreammortamentoTrattenuta.
	 * @param interessiPreammortamentoTrattenuta The interessiPreammortamentoTrattenuta to set
	 */
	public void setInteressiPreammortamentoTrattenuta(Double interessiPreammortamentoTrattenuta) {
		this.interessiPreammortamentoTrattenuta =
			interessiPreammortamentoTrattenuta;
	}

	/**
	 * Sets the interessiRimborso.
	 * @param interessiRimborso The interessiRimborso to set
	 */
	public void setInteressiRimborso(Double interessiRimborso) {
		this.interessiRimborso = interessiRimborso;
	}

	/**
	 * Sets the interessiTrattenuta.
	 * @param interessiTrattenuta The interessiTrattenuta to set
	 */
	public void setInteressiTrattenuta(Double interessiTrattenuta) {
		this.interessiTrattenuta = interessiTrattenuta;
	}

//	public TipoComunicazione getTipoComunicazione() {
//		return tipoComunicazione;
//	}
//
//	public void setTipoComunicazione(TipoComunicazione tipoComunicazione) {
//		this.tipoComunicazione = tipoComunicazione;
//	}

	/**
	 * @return the detrazioneFiscale
	 */
	public boolean isDetrazioneFiscale() {
		return detrazioneFiscale;
	}

	/**
	 * @param detrazioneFiscale the detrazioneFiscale to set
	 */
	public void setDetrazioneFiscale(boolean detrazioneFiscale) {
		this.detrazioneFiscale = detrazioneFiscale;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

}
