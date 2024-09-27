package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.io.Serializable;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;

public class CessazionePdfObj extends PdfObj implements Serializable {
	
	private static final long serialVersionUID = 8847198426672062945L;
	
	private AnagraficaIntestatario benefPrincipale;
	private String annoMutuo;
	private String progMutuo;
	private String indirizzoEmail;
	private String numFax;
	private String dataCessazione;
	private String dataDecorrenza;
	private boolean flagRate;
	private String tasso;
	private boolean ciSonoEredi;
	private boolean intestatarioDeceduto;
	private String NomeIntestatarioDeceduto;
	private String CognomeIntestatarioDeceduto;
	private String codFiscaleIntestatarioDeceduto;
	private String dataDecessoIntestatarioDeceduto;
	private String tipoMutuo;

	
	public AnagraficaIntestatario getBenefPrincipale() {
		return benefPrincipale;
	}
	public void setBenefPrincipale(AnagraficaIntestatario benefPrincipale) {
		this.benefPrincipale = benefPrincipale;
	}
	public String getIndirizzoEmail() {
		return indirizzoEmail;
	}
	public void setIndirizzoEmail(String indirizzoEmail) {
		this.indirizzoEmail = indirizzoEmail;
	}
	public String getNumFax() {
		return numFax;
	}
	public void setNumFax(String numFax) {
		this.numFax = numFax;
	}
	public String getDataCessazione() {
		return dataCessazione;
	}
	public void setDataCessazione(String dataCessazione) {
		this.dataCessazione = dataCessazione;
	}
	public String getDataDecorrenza() {
		return dataDecorrenza;
	}
	public void setDataDecorrenza(String dataDecorrenza) {
		this.dataDecorrenza = dataDecorrenza;
	}
	public String getAnnoMutuo() {
		return annoMutuo;
	}
	public void setAnnoMutuo(String annoMutuo) {
		this.annoMutuo = annoMutuo;
	}
	public String getProgMutuo() {
		return progMutuo;
	}
	public void setProgMutuo(String progMutuo) {
		this.progMutuo = progMutuo;
	}
	public boolean isFlagRate() {
		return flagRate;
	}
	public void setFlagRate(boolean flagRate) {
		this.flagRate = flagRate;
	}

	public String getTasso() {
		return tasso;
	}

	public void setTasso(String tasso) {
		this.tasso = tasso;
	}
	public boolean isCiSonoEredi() {
		return ciSonoEredi;
	}
	public void setCiSonoEredi(boolean ciSonoEredi) {
		this.ciSonoEredi = ciSonoEredi;
	}
	public String getNomeIntestatarioDeceduto() {
		return NomeIntestatarioDeceduto;
	}
	public void setNomeIntestatarioDeceduto(String nomeIntestatarioDeceduto) {
		NomeIntestatarioDeceduto = nomeIntestatarioDeceduto;
	}
	public String getCognomeIntestatarioDeceduto() {
		return CognomeIntestatarioDeceduto;
	}
	public void setCognomeIntestatarioDeceduto(String cognomeIntestatarioDeceduto) {
		CognomeIntestatarioDeceduto = cognomeIntestatarioDeceduto;
	}
	/**
	 * @return the codFiscaleIntestatarioDeceduto
	 */
	public String getCodFiscaleIntestatarioDeceduto() {
		return codFiscaleIntestatarioDeceduto;
	}
	/**
	 * @param codFiscaleIntestatarioDeceduto the codFiscaleIntestatarioDeceduto to set
	 */
	public void setCodFiscaleIntestatarioDeceduto(String codFiscaleIntestatarioDeceduto) {
		this.codFiscaleIntestatarioDeceduto = codFiscaleIntestatarioDeceduto;
	}
	/**
	 * @return the dataDecessoIntestatarioDeceduto
	 */
	public String getDataDecessoIntestatarioDeceduto() {
		return dataDecessoIntestatarioDeceduto;
	}
	/**
	 * @param dataDecessoIntestatarioDeceduto the dataDecessoIntestatarioDeceduto to set
	 */
	public void setDataDecessoIntestatarioDeceduto(String dataDecessoIntestatarioDeceduto) {
		this.dataDecessoIntestatarioDeceduto = dataDecessoIntestatarioDeceduto;
	}
	public String getTipoMutuo() {
		return tipoMutuo;
	}
	public void setTipoMutuo(String tipoMutuo) {
		this.tipoMutuo = tipoMutuo;
	}
	/**
	 * @return the intestatarioDeceduto
	 */
	public boolean isIntestatarioDeceduto() {
		return intestatarioDeceduto;
	}
	/**
	 * @param intestatarioDeceduto the intestatarioDeceduto to set
	 */
	public void setIntestatarioDeceduto(boolean intestatarioDeceduto) {
		this.intestatarioDeceduto = intestatarioDeceduto;
	}

}
