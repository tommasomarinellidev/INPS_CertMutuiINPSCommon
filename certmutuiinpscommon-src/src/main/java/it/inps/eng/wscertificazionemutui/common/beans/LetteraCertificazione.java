package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;

/**
 * 
 * @author Sistemi2000 : Camorchia Michele
 *
 * Bean che rappresenta Lettera Certificazione Fiscale (dati per il pdf).
 */
public class LetteraCertificazione implements Serializable {
	
	private static final long serialVersionUID = 746668062408082083L;
	
	private String numMutuo="";	
	private String descMutuo="";	
	private String cognomeNome="";
	private String indirizzoVia="";
	private String capCitta="";
	private String cap="";
	private String localita="";
	private String prov="";
	private String citta="";
	private String codiceFisc="";
	private String numCivico="";
	private String capitale="0,00";
	private String interessi="0,00";
	private String mora="0,00";
	private String preammortamento="0,00";
	private String spese="0,00";
	private String totale="0,00";
	private String perc_detr = "";
	private String cognNomeErede1="";
	private String indirErede1="";
	private String capErede1="";
	private String cittaErede1="";
	private String codiceFiscErede1="";
	private String perc_detr1 = "";
	private String cognNomeErede2="";
	private String indirErede2="";
	private String capErede2="";
	private String cittaErede2="";
	private String codiceFiscErede2="";
	private String perc_detr2 = "";
	private String cognNomeErede3="";
	private String indirErede3="";
	private String capErede3="";
	private String cittaErede3="";
	private String codiceFiscErede3="";
	private String perc_detr3 = "";
	private String cognNomeErede4="";
	private String indirErede4="";
	private String capErede4="";
	private String cittaErede4="";
	private String codiceFiscErede4="";
	private String perc_detr4 = "";
	private String cognNomeErede5="";
	private String indirErede5="";
	private String capErede5="";
	private String cittaErede5="";
	private String codiceFiscErede5="";
	private String perc_detr5 = "";
	private String cognNomeErede6="";
	private String indirErede6="";
	private String capErede6="";
	private String cittaErede6="";
	private String codiceFiscErede6="";
	private String perc_detr6 = "";
	private String cognEredeDi="";
	private String dataCessazione="";
	private String tipoFirmatario="";
	private String tipoFirmatarioLogo="";
	private String sede="";
	private String annoCertificazione="";
	private String annoCorrente="";
	private String indSedeRid="";
    private String capRid="";
	private String cittaRid="";
	private String faxRid="";
    private String numeroTel="";
    private String dataOdierna="";
	
	private String nomeDirigente="";	
	private String indSede="";		
	private String capSede="";		
	private String cittaSede="";			
	private String prSede="";			
	private String dataCertificazione;
	private String impostaSostitutiva="0.00";		
	private String dataStipula;	
	
	private String tipoMutuo;		
	private String conguagliCP1="0.00";			
	private String conguagliCP2="0.00";			
	private String conguagliCP3="0.00";		
	private String conguagliCP4="0.00";			
	private String conguagliCP5="0.00";			
	private String conguagliCP6="0.00";		
	private String annoConguagliCP1="";				
	private String annoConguagliCP2="";				
	private String annoConguagliCP3="";		
	private String annoConguagliCP4="";				
	private String annoConguagliCP5="";				
	private String annoConguagliCP6="";	
	private String inizioTesto="";
	
	private Boolean flagGestAcconti;
	
	/**
	 * Returns the serialVersionUID.
	 * @return long
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * Returns the annoCertificazione.
	 * @return String
	 */
	public String getAnnoCertificazione() {
		return annoCertificazione;
	}

	

	/**
	 * Returns the capCitta.
	 * @return String
	 */
	public String getCapCitta() {
		return capCitta;
	}

	/**
	 * Returns the capErede1.
	 * @return String
	 */
	public String getCapErede1() {
		return capErede1;
	}

	/**
	 * Returns the capErede2.
	 * @return String
	 */
	public String getCapErede2() {
		return capErede2;
	}

	/**
	 * Returns the capErede3.
	 * @return String
	 */
	public String getCapErede3() {
		return capErede3;
	}

	/**
	 * Returns the capErede4.
	 * @return String
	 */
	public String getCapErede4() {
		return capErede4;
	}

	/**
	 * Returns the capErede5.
	 * @return String
	 */
	public String getCapErede5() {
		return capErede5;
	}

	/**
	 * Returns the capErede6.
	 * @return String
	 */
	public String getCapErede6() {
		return capErede6;
	}

	/**
	 * Returns the capitale.
	 * @return String
	 */
	public String getCapitale() {
		return capitale;
	}

	/**
	 * Returns the citta.
	 * @return String
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * Returns the cittaErede1.
	 * @return String
	 */
	public String getCittaErede1() {
		return cittaErede1;
	}

	/**
	 * Returns the cittaErede2.
	 * @return String
	 */
	public String getCittaErede2() {
		return cittaErede2;
	}

	/**
	 * Returns the cittaErede3.
	 * @return String
	 */
	public String getCittaErede3() {
		return cittaErede3;
	}

	/**
	 * Returns the cittaErede4.
	 * @return String
	 */
	public String getCittaErede4() {
		return cittaErede4;
	}

	/**
	 * Returns the cittaErede5.
	 * @return String
	 */
	public String getCittaErede5() {
		return cittaErede5;
	}

	/**
	 * Returns the cittaErede6.
	 * @return String
	 */
	public String getCittaErede6() {
		return cittaErede6;
	}

	/**
	 * Returns the codiceFisc.
	 * @return String
	 */
	public String getCodiceFisc() {
		return codiceFisc;
	}

	/**
	 * Returns the codiceFiscErede1.
	 * @return String
	 */
	public String getCodiceFiscErede1() {
		return codiceFiscErede1;
	}

	/**
	 * Returns the codiceFiscErede2.
	 * @return String
	 */
	public String getCodiceFiscErede2() {
		return codiceFiscErede2;
	}

	/**
	 * Returns the codiceFiscErede3.
	 * @return String
	 */
	public String getCodiceFiscErede3() {
		return codiceFiscErede3;
	}

	/**
	 * Returns the codiceFiscErede4.
	 * @return String
	 */
	public String getCodiceFiscErede4() {
		return codiceFiscErede4;
	}

	/**
	 * Returns the codiceFiscErede5.
	 * @return String
	 */
	public String getCodiceFiscErede5() {
		return codiceFiscErede5;
	}

	/**
	 * Returns the codiceFiscErede6.
	 * @return String
	 */
	public String getCodiceFiscErede6() {
		return codiceFiscErede6;
	}

	/**
	 * Returns the cognNomeErede1.
	 * @return String
	 */
	public String getCognNomeErede1() {
		return cognNomeErede1;
	}

	/**
	 * Returns the cognNomeErede2.
	 * @return String
	 */
	public String getCognNomeErede2() {
		return cognNomeErede2;
	}

	/**
	 * Returns the cognNomeErede3.
	 * @return String
	 */
	public String getCognNomeErede3() {
		return cognNomeErede3;
	}

	/**
	 * Returns the cognNomeErede4.
	 * @return String
	 */
	public String getCognNomeErede4() {
		return cognNomeErede4;
	}

	/**
	 * Returns the cognNomeErede5.
	 * @return String
	 */
	public String getCognNomeErede5() {
		return cognNomeErede5;
	}

	/**
	 * Returns the cognNomeErede6.
	 * @return String
	 */
	public String getCognNomeErede6() {
		return cognNomeErede6;
	}

	/**
	 * Returns the cognomeNome.
	 * @return String
	 */
	public String getCognomeNome() {
		return cognomeNome;
	}

	/**
	 * Returns the indirErede1.
	 * @return String
	 */
	public String getIndirErede1() {
		return indirErede1;
	}

	/**
	 * Returns the indirErede2.
	 * @return String
	 */
	public String getIndirErede2() {
		return indirErede2;
	}

	/**
	 * Returns the indirErede3.
	 * @return String
	 */
	public String getIndirErede3() {
		return indirErede3;
	}

	/**
	 * Returns the indirErede4.
	 * @return String
	 */
	public String getIndirErede4() {
		return indirErede4;
	}

	/**
	 * Returns the indirErede5.
	 * @return String
	 */
	public String getIndirErede5() {
		return indirErede5;
	}

	/**
	 * Returns the indirErede6.
	 * @return String
	 */
	public String getIndirErede6() {
		return indirErede6;
	}

	/**
	 * Returns the indirizzoVia.
	 * @return String
	 */
	public String getIndirizzoVia() {
		return indirizzoVia;
	}

	/**
	 * Returns the interessi.
	 * @return String
	 */
	public String getInteressi() {
		return interessi;
	}

	/**
	 * Returns the mora.
	 * @return String
	 */
	public String getMora() {
		return mora;
	}

	/**
	 * Returns the preammortamento.
	 * @return String
	 */
	public String getPreammortamento() {
		return preammortamento;
	}

	

	/**
	 * Returns the sede.
	 * @return String
	 */
	public String getSede() {
		return sede;
	}

	/**
	 * Returns the tipoFirmatario.
	 * @return String
	 */
	public String getTipoFirmatario() {
		return tipoFirmatario;
	}

	/**
	 * Returns the tipoFirmatarioLogo.
	 * @return String
	 */
	public String getTipoFirmatarioLogo() {
		return tipoFirmatarioLogo;
	}

	/**
	 * Returns the totale.
	 * @return String
	 */
	public String getTotale() {
		return totale;
	}

	/**
	 * Sets the annoCertificazione.
	 * @param annoCertificazione The annoCertificazione to set
	 */
	public void setAnnoCertificazione(String annoCertificazione) {
		this.annoCertificazione = annoCertificazione;
	}

	

	/**
	 * Sets the capCitta.
	 * @param capCitta The capCitta to set
	 */
	public void setCapCitta(String capCitta) {
		this.capCitta = capCitta;
	}

	/**
	 * Sets the capErede1.
	 * @param capErede1 The capErede1 to set
	 */
	public void setCapErede1(String capErede1) {
		this.capErede1 = capErede1;
	}

	/**
	 * Sets the capErede2.
	 * @param capErede2 The capErede2 to set
	 */
	public void setCapErede2(String capErede2) {
		this.capErede2 = capErede2;
	}

	/**
	 * Sets the capErede3.
	 * @param capErede3 The capErede3 to set
	 */
	public void setCapErede3(String capErede3) {
		this.capErede3 = capErede3;
	}

	/**
	 * Sets the capErede4.
	 * @param capErede4 The capErede4 to set
	 */
	public void setCapErede4(String capErede4) {
		this.capErede4 = capErede4;
	}

	/**
	 * Sets the capErede5.
	 * @param capErede5 The capErede5 to set
	 */
	public void setCapErede5(String capErede5) {
		this.capErede5 = capErede5;
	}

	/**
	 * Sets the capErede6.
	 * @param capErede6 The capErede6 to set
	 */
	public void setCapErede6(String capErede6) {
		this.capErede6 = capErede6;
	}

	/**
	 * Sets the capitale.
	 * @param capitale The capitale to set
	 */
	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	/**
	 * Sets the citta.
	 * @param citta The citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * Sets the cittaErede1.
	 * @param cittaErede1 The cittaErede1 to set
	 */
	public void setCittaErede1(String cittaErede1) {
		this.cittaErede1 = cittaErede1;
	}

	/**
	 * Sets the cittaErede2.
	 * @param cittaErede2 The cittaErede2 to set
	 */
	public void setCittaErede2(String cittaErede2) {
		this.cittaErede2 = cittaErede2;
	}

	/**
	 * Sets the cittaErede3.
	 * @param cittaErede3 The cittaErede3 to set
	 */
	public void setCittaErede3(String cittaErede3) {
		this.cittaErede3 = cittaErede3;
	}

	/**
	 * Sets the cittaErede4.
	 * @param cittaErede4 The cittaErede4 to set
	 */
	public void setCittaErede4(String cittaErede4) {
		this.cittaErede4 = cittaErede4;
	}

	/**
	 * Sets the cittaErede5.
	 * @param cittaErede5 The cittaErede5 to set
	 */
	public void setCittaErede5(String cittaErede5) {
		this.cittaErede5 = cittaErede5;
	}

	/**
	 * Sets the cittaErede6.
	 * @param cittaErede6 The cittaErede6 to set
	 */
	public void setCittaErede6(String cittaErede6) {
		this.cittaErede6 = cittaErede6;
	}

	/**
	 * Sets the codiceFisc.
	 * @param codiceFisc The codiceFisc to set
	 */
	public void setCodiceFisc(String codiceFisc) {
		this.codiceFisc = codiceFisc;
	}

	/**
	 * Sets the codiceFiscErede1.
	 * @param codiceFiscErede1 The codiceFiscErede1 to set
	 */
	public void setCodiceFiscErede1(String codiceFiscErede1) {
		this.codiceFiscErede1 = codiceFiscErede1;
	}

	/**
	 * Sets the codiceFiscErede2.
	 * @param codiceFiscErede2 The codiceFiscErede2 to set
	 */
	public void setCodiceFiscErede2(String codiceFiscErede2) {
		this.codiceFiscErede2 = codiceFiscErede2;
	}

	/**
	 * Sets the codiceFiscErede3.
	 * @param codiceFiscErede3 The codiceFiscErede3 to set
	 */
	public void setCodiceFiscErede3(String codiceFiscErede3) {
		this.codiceFiscErede3 = codiceFiscErede3;
	}

	/**
	 * Sets the codiceFiscErede4.
	 * @param codiceFiscErede4 The codiceFiscErede4 to set
	 */
	public void setCodiceFiscErede4(String codiceFiscErede4) {
		this.codiceFiscErede4 = codiceFiscErede4;
	}

	/**
	 * Sets the codiceFiscErede5.
	 * @param codiceFiscErede5 The codiceFiscErede5 to set
	 */
	public void setCodiceFiscErede5(String codiceFiscErede5) {
		this.codiceFiscErede5 = codiceFiscErede5;
	}

	/**
	 * Sets the codiceFiscErede6.
	 * @param codiceFiscErede6 The codiceFiscErede6 to set
	 */
	public void setCodiceFiscErede6(String codiceFiscErede6) {
		this.codiceFiscErede6 = codiceFiscErede6;
	}

	/**
	 * Sets the cognNomeErede1.
	 * @param cognNomeErede1 The cognNomeErede1 to set
	 */
	public void setCognNomeErede1(String cognNomeErede1) {
		this.cognNomeErede1 = cognNomeErede1;
	}

	/**
	 * Sets the cognNomeErede2.
	 * @param cognNomeErede2 The cognNomeErede2 to set
	 */
	public void setCognNomeErede2(String cognNomeErede2) {
		this.cognNomeErede2 = cognNomeErede2;
	}

	/**
	 * Sets the cognNomeErede3.
	 * @param cognNomeErede3 The cognNomeErede3 to set
	 */
	public void setCognNomeErede3(String cognNomeErede3) {
		this.cognNomeErede3 = cognNomeErede3;
	}

	/**
	 * Sets the cognNomeErede4.
	 * @param cognNomeErede4 The cognNomeErede4 to set
	 */
	public void setCognNomeErede4(String cognNomeErede4) {
		this.cognNomeErede4 = cognNomeErede4;
	}

	/**
	 * Sets the cognNomeErede5.
	 * @param cognNomeErede5 The cognNomeErede5 to set
	 */
	public void setCognNomeErede5(String cognNomeErede5) {
		this.cognNomeErede5 = cognNomeErede5;
	}

	/**
	 * Sets the cognNomeErede6.
	 * @param cognNomeErede6 The cognNomeErede6 to set
	 */
	public void setCognNomeErede6(String cognNomeErede6) {
		this.cognNomeErede6 = cognNomeErede6;
	}

	/**
	 * Sets the cognomeNome.
	 * @param cognomeNome The cognomeNome to set
	 */
	public void setCognomeNome(String cognomeNome) {
		this.cognomeNome = cognomeNome;
	}

	/**
	 * Sets the indirErede1.
	 * @param indirErede1 The indirErede1 to set
	 */
	public void setIndirErede1(String indirErede1) {
		this.indirErede1 = indirErede1;
	}

	/**
	 * Sets the indirErede2.
	 * @param indirErede2 The indirErede2 to set
	 */
	public void setIndirErede2(String indirErede2) {
		this.indirErede2 = indirErede2;
	}

	/**
	 * Sets the indirErede3.
	 * @param indirErede3 The indirErede3 to set
	 */
	public void setIndirErede3(String indirErede3) {
		this.indirErede3 = indirErede3;
	}

	/**
	 * Sets the indirErede4.
	 * @param indirErede4 The indirErede4 to set
	 */
	public void setIndirErede4(String indirErede4) {
		this.indirErede4 = indirErede4;
	}

	/**
	 * Sets the indirErede5.
	 * @param indirErede5 The indirErede5 to set
	 */
	public void setIndirErede5(String indirErede5) {
		this.indirErede5 = indirErede5;
	}

	/**
	 * Sets the indirErede6.
	 * @param indirErede6 The indirErede6 to set
	 */
	public void setIndirErede6(String indirErede6) {
		this.indirErede6 = indirErede6;
	}

	/**
	 * Sets the indirizzoVia.
	 * @param indirizzoVia The indirizzoVia to set
	 */
	public void setIndirizzoVia(String indirizzoVia) {
		this.indirizzoVia = indirizzoVia;
	}

	/**
	 * Sets the interessi.
	 * @param interessi The interessi to set
	 */
	public void setInteressi(String interessi) {
		this.interessi = interessi;
	}

	/**
	 * Sets the mora.
	 * @param mora The mora to set
	 */
	public void setMora(String mora) {
		this.mora = mora;
	}

	/**
	 * Sets the preammortamento.
	 * @param preammortamento The preammortamento to set
	 */
	public void setPreammortamento(String preammortamento) {
		this.preammortamento = preammortamento;
	}


	/**
	 * Sets the sede.
	 * @param sede The sede to set
	 */
	public void setSede(String sede) {
		this.sede = sede;
	}

	/**
	 * Sets the tipoFirmatario.
	 * @param tipoFirmatario The tipoFirmatario to set
	 */
	public void setTipoFirmatario(String tipoFirmatario) {
		this.tipoFirmatario = tipoFirmatario;
	}

	/**
	 * Sets the tipoFirmatarioLogo.
	 * @param tipoFirmatarioLogo The tipoFirmatarioLogo to set
	 */
	public void setTipoFirmatarioLogo(String tipoFirmatarioLogo) {
		this.tipoFirmatarioLogo = tipoFirmatarioLogo;
	}

	/**
	 * Sets the totale.
	 * @param totale The totale to set
	 */
	public void setTotale(String totale) {
		this.totale = totale;
	}
	/**
	 * Returns the numMutuo.
	 * @return String
	 */
	public String getNumMutuo() {
		return numMutuo;
	}

	/**
	 * Sets the numMutuo.
	 * @param numMutuo The numMutuo to set
	 */
	public void setNumMutuo(String numMutuo) {
		this.numMutuo = numMutuo;
	}

	/**
	 * Returns the spese.
	 * @return String
	 */
	public String getSpese() {
		return spese;
	}

	/**
	 * Sets the spese.
	 * @param spese The spese to set
	 */
	public void setSpese(String spese) {
		this.spese = spese;
	}

	/**
	 * Returns the capRid.
	 * @return String
	 */
	public String getCapRid() {
		return capRid;
	}

	/**
	 * Returns the cittaRid.
	 * @return String
	 */
	public String getCittaRid() {
		return cittaRid;
	}

	/**
	 * Returns the faxRid.
	 * @return String
	 */
	public String getFaxRid() {
		return faxRid;
	}

	/**
	 * Returns the indSedeRid.
	 * @return String
	 */
	public String getIndSedeRid() {
		return indSedeRid;
	}

	/**
	 * Returns the numeroTel.
	 * @return String
	 */
	public String getNumeroTel() {
		return numeroTel;
	}

	/**
	 * Sets the capRid.
	 * @param capRid The capRid to set
	 */
	public void setCapRid(String capRid) {
		this.capRid = capRid;
	}

	/**
	 * Sets the cittaRid.
	 * @param cittaRid The cittaRid to set
	 */
	public void setCittaRid(String cittaRid) {
		this.cittaRid = cittaRid;
	}

	/**
	 * Sets the faxRid.
	 * @param faxRid The faxRid to set
	 */
	public void setFaxRid(String faxRid) {
		this.faxRid = faxRid;
	}

	/**
	 * Sets the indSedeRid.
	 * @param indSedeRid The indSedeRid to set
	 */
	public void setIndSedeRid(String indSedeRid) {
		this.indSedeRid = indSedeRid;
	}

	/**
	 * Sets the numeroTel.
	 * @param numeroTel The numeroTel to set
	 */
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	/**
	 * Returns the dataOdierna.
	 * @return String
	 */
	public String getDataOdierna() {
		return dataOdierna;
	}

	/**
	 * Sets the dataOdierna.
	 * @param dataOdierna The dataOdierna to set
	 */
	public void setDataOdierna(String dataOdierna) {
		this.dataOdierna = dataOdierna;
	}

	/**
	 * Returns the annoCorrente.
	 * @return String
	 */
	public String getAnnoCorrente() {
		return annoCorrente;
	}

	/**
	 * Sets the annoCorrente.
	 * @param annoCorrente The annoCorrente to set
	 */
	public void setAnnoCorrente(String annoCorrente) {
		this.annoCorrente = annoCorrente;
	}

	
	/**
	 * Returns the numCivico.
	 * @return String
	 */
	public String getNumCivico() {
		return numCivico;
	}

	/**
	 * Sets the numCivico.
	 * @param numCivico The numCivico to set
	 */
	public void setNumCivico(String numCivico) {
		this.numCivico = numCivico;
	}

	/**
	 * Returns the dataCessazione.
	 * @return String
	 */
	public String getDataCessazione() {
		return dataCessazione;
	}

	
	/**
	 * Sets the dataCessazione.
	 * @param dataCessazione The dataCessazione to set
	 */
	public void setDataCessazione(String dataCessazione) {
		this.dataCessazione = dataCessazione;
	}

	

	/**
	 * Returns the cognEredeDi.
	 * @return String
	 */
	public String getCognEredeDi() {
		return cognEredeDi;
	}

	/**
	 * Sets the cognEredeDi.
	 * @param cognEredeDi The cognEredeDi to set
	 */
	public void setCognEredeDi(String cognEredeDi) {
		this.cognEredeDi = cognEredeDi;
	}

	/**
	 * Returns the descMutuo.
	 * @return String
	 */
	public String getDescMutuo() {
		return descMutuo;
	}

	/**
	 * Sets the descMutuo.
	 * @param tipologia The descMutuo to set
	 */
	public void setDescMutuo(String descMutuo) {
		this.descMutuo = descMutuo;
	}

	/**
	 * Returns the nomeDirigente.
	 * @return String
	 */
	public String getNomeDirigente() {
		return nomeDirigente;
	}

	/**
	 * Sets the nomeDirigente.
	 * @param nomeDirigente The nomeDirigente to set
	 */
	public void setNomeDirigente(String nomeDirigente) {
		this.nomeDirigente = nomeDirigente;
	}

	/**
	 * Returns the capSede.
	 * @return String
	 */
	public String getCapSede() {
		return capSede;
	}

	/**
	 * Returns the cittaSede.
	 * @return String
	 */
	public String getCittaSede() {
		return cittaSede;
	}

	/**
	 * Returns the indSede.
	 * @return String
	 */
	public String getIndSede() {
		return indSede;
	}

	/**
	 * Returns the prSede.
	 * @return String
	 */
	public String getPrSede() {
		return prSede;
	}

	/**
	 * Sets the capSede.
	 * @param capSede The capSede to set
	 */
	public void setCapSede(String capSede) {
		this.capSede = capSede;
	}

	/**
	 * Sets the cittaSede.
	 * @param cittaSede The cittaSede to set
	 */
	public void setCittaSede(String cittaSede) {
		this.cittaSede = cittaSede;
	}

	/**
	 * Sets the indSede.
	 * @param indSede The indSede to set
	 */
	public void setIndSede(String indSede) {
		this.indSede = indSede;
	}

	/**
	 * Sets the prSede.
	 * @param prSede The prSede to set
	 */
	public void setPrSede(String prSede) {
		this.prSede = prSede;
	}

	/**
	 * Returns the dataCertificazione.
	 * @return Date
	 */
	public String getDataCertificazione() {
		return dataCertificazione;
	}

	/**
	 * Sets the dataCertificazione.
	 * @param dataCertificazione The dataCertificazione to set
	 */
	public void setDataCertificazione(String dataCertificazione) {
		this.dataCertificazione = dataCertificazione;
	}

	/**
	 * Returns the impostaSostitutiva.
	 * @return String
	 */
	public String getImpostaSostitutiva() {
		return impostaSostitutiva;
	}

	/**
	 * Sets the impostaSostitutiva.
	 * @param impostaSostitutiva The impostaSostitutiva to set
	 */
	public void setImpostaSostitutiva(String impostaSostitutiva) {
		this.impostaSostitutiva = impostaSostitutiva;
	}

	/**
	 * Returns the dataStipula.
	 * @return String
	 */
	public String getDataStipula() {
		return dataStipula;
	}

	/**
	 * Sets the dataStipula.
	 * @param dataStipula The dataStipula to set
	 */
	public void setDataStipula(String dataStipula) {
		this.dataStipula = dataStipula;
	}

	/**
	 * Returns the cap.
	 * @return String
	 */
	public String getCap() {
		return cap;
	}

	/**
	 * Returns the localita.
	 * @return String
	 */
	public String getLocalita() {
		return localita;
	}

	/**
	 * Returns the prov.
	 * @return String
	 */
	public String getProv() {
		return prov;
	}

	/**
	 * Sets the cap.
	 * @param cap The cap to set
	 */
	public void setCap(String cap) {
		this.cap = cap;
	}

	/**
	 * Sets the localita.
	 * @param localita The localita to set
	 */
	public void setLocalita(String localita) {
		this.localita = localita;
	}

	/**
	 * Sets the prov.
	 * @param prov The prov to set
	 */
	public void setProv(String prov) {
		this.prov = prov;
	}

	/**
	 * Returns the annoConguagliCP1.
	 * @return String
	 */
	public String getAnnoConguagliCP1() {
		return annoConguagliCP1;
	}

	/**
	 * Returns the annoConguagliCP2.
	 * @return String
	 */
	public String getAnnoConguagliCP2() {
		return annoConguagliCP2;
	}

	/**
	 * Returns the annoConguagliCP3.
	 * @return String
	 */
	public String getAnnoConguagliCP3() {
		return annoConguagliCP3;
	}

	/**
	 * Returns the conguagliCP1.
	 * @return String
	 */
	public String getConguagliCP1() {
		return conguagliCP1;
	}

	/**
	 * Returns the conguagliCP2.
	 * @return String
	 */
	public String getConguagliCP2() {
		return conguagliCP2;
	}

	/**
	 * Returns the conguagliCP3.
	 * @return String
	 */
	public String getConguagliCP3() {
		return conguagliCP3;
	}

	/**
	 * Sets the annoConguagliCP1.
	 * @param annoConguagliCP1 The annoConguagliCP1 to set
	 */
	public void setAnnoConguagliCP1(String annoConguagliCP1) {
		this.annoConguagliCP1 = annoConguagliCP1;
	}

	/**
	 * Sets the annoConguagliCP2.
	 * @param annoConguagliCP2 The annoConguagliCP2 to set
	 */
	public void setAnnoConguagliCP2(String annoConguagliCP2) {
		this.annoConguagliCP2 = annoConguagliCP2;
	}

	/**
	 * Sets the annoConguagliCP3.
	 * @param annoConguagliCP3 The annoConguagliCP3 to set
	 */
	public void setAnnoConguagliCP3(String annoConguagliCP3) {
		this.annoConguagliCP3 = annoConguagliCP3;
	}

	/**
	 * Sets the conguagliCP1.
	 * @param conguagliCP1 The conguagliCP1 to set
	 */
	public void setConguagliCP1(String conguagliCP1) {
		this.conguagliCP1 = conguagliCP1;
	}

	/**
	 * Sets the conguagliCP2.
	 * @param conguagliCP2 The conguagliCP2 to set
	 */
	public void setConguagliCP2(String conguagliCP2) {
		this.conguagliCP2 = conguagliCP2;
	}

	/**
	 * Sets the conguagliCP3.
	 * @param conguagliCP3 The conguagliCP3 to set
	 */
	public void setConguagliCP3(String conguagliCP3) {
		this.conguagliCP3 = conguagliCP3;
	}

	/**
	 * Returns the tipoMutuo.
	 * @return String
	 */
	public String getTipoMutuo() {
		return tipoMutuo;
	}

	/**
	 * Sets the tipoMutuo.
	 * @param tipoMutuo The tipoMutuo to set
	 */
	public void setTipoMutuo(String tipoMutuo) {
		this.tipoMutuo = tipoMutuo;
	}

	/**
	 * @return the perc_detr
	 */
	public String getPerc_detr() {
		return perc_detr;
	}

	/**
	 * @param perc_detr the perc_detr to set
	 */
	public void setPerc_detr(String perc_detr) {
		this.perc_detr = perc_detr;
	}

	/**
	 * @return the perc_detr1
	 */
	public String getPerc_detr1() {
		return perc_detr1;
	}

	/**
	 * @param perc_detr1 the perc_detr1 to set
	 */
	public void setPerc_detr1(String perc_detr1) {
		this.perc_detr1 = perc_detr1;
	}

	/**
	 * @return the perc_detr2
	 */
	public String getPerc_detr2() {
		return perc_detr2;
	}

	/**
	 * @param perc_detr2 the perc_detr2 to set
	 */
	public void setPerc_detr2(String perc_detr2) {
		this.perc_detr2 = perc_detr2;
	}

	/**
	 * @return the perc_detr3
	 */
	public String getPerc_detr3() {
		return perc_detr3;
	}

	/**
	 * @param perc_detr3 the perc_detr3 to set
	 */
	public void setPerc_detr3(String perc_detr3) {
		this.perc_detr3 = perc_detr3;
	}

	/**
	 * @return the perc_detr4
	 */
	public String getPerc_detr4() {
		return perc_detr4;
	}

	/**
	 * @param perc_detr4 the perc_detr4 to set
	 */
	public void setPerc_detr4(String perc_detr4) {
		this.perc_detr4 = perc_detr4;
	}

	/**
	 * @return the perc_detr5
	 */
	public String getPerc_detr5() {
		return perc_detr5;
	}

	/**
	 * @param perc_detr5 the perc_detr5 to set
	 */
	public void setPerc_detr5(String perc_detr5) {
		this.perc_detr5 = perc_detr5;
	}

	/**
	 * @return the perc_detr6
	 */
	public String getPerc_detr6() {
		return perc_detr6;
	}

	/**
	 * @param perc_detr6 the perc_detr6 to set
	 */
	public void setPerc_detr6(String perc_detr6) {
		this.perc_detr6 = perc_detr6;
	}

	public String getConguagliCP4() {
		return conguagliCP4;
	}

	public void setConguagliCP4(String conguagliCP4) {
		this.conguagliCP4 = conguagliCP4;
	}

	public String getConguagliCP5() {
		return conguagliCP5;
	}

	public void setConguagliCP5(String conguagliCP5) {
		this.conguagliCP5 = conguagliCP5;
	}

	public String getConguagliCP6() {
		return conguagliCP6;
	}

	public void setConguagliCP6(String conguagliCP6) {
		this.conguagliCP6 = conguagliCP6;
	}

	public String getAnnoConguagliCP4() {
		return annoConguagliCP4;
	}

	public void setAnnoConguagliCP4(String annoConguagliCP4) {
		this.annoConguagliCP4 = annoConguagliCP4;
	}

	public String getAnnoConguagliCP5() {
		return annoConguagliCP5;
	}

	public void setAnnoConguagliCP5(String annoConguagliCP5) {
		this.annoConguagliCP5 = annoConguagliCP5;
	}

	public String getAnnoConguagliCP6() {
		return annoConguagliCP6;
	}

	public void setAnnoConguagliCP6(String annoConguagliCP6) {
		this.annoConguagliCP6 = annoConguagliCP6;
	}

	public Boolean getFlagGestAcconti() {
		return flagGestAcconti;
	}

	public void setFlagGestAcconti(Boolean flagGestAcconti) {
		this.flagGestAcconti = flagGestAcconti;
	}

	public String getInizioTesto() {
		return inizioTesto;
	}

	public void setInizioTesto(String inizioTesto) {
		this.inizioTesto = inizioTesto;
	}

}
	
