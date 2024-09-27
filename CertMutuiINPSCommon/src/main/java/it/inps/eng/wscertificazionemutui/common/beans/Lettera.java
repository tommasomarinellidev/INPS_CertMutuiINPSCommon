package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;

/**
 * 
 * @author Sistemi2000 : Camorchia Michele
 *
 * Bean che rappresenta una Lettera (dati per il pdf).
 */
public class Lettera implements Serializable {
	private static final long serialVersionUID = 746668062408082083L;
	private String cognomeNome="";
	private String indirizzoVia="";
	private String capCitta="";
	private String cap="";
	private String citta="";
	private String prov="";
	private String dataStipula="";
	private String dataDecorrenza="";
	private String meseAnnoDecorrenza="";
	private String numeroRate="0";
	private String importoRata="0,00";
	private String importoRataNew="0,00";
	private String numeroFax="";
	private String meseAnnoInizioPagamento="";
	private String dataValuta="";
	private String meseAnnoRata="";
	private String dataAccredito="";
	private String dataPagamento="";
	private String dataErogazione="";
	private String dataProvvedimento="";
	private String tipoVariazione="";
	private String tassoUfficiale="";
	private String nuovoTasso="";
	private String tipoVariazione2="";
	private String dataDecorrenzaDebito="";
	private String numeroTel="";
	private String sede2="";
	private String debitoResiduo = "";
	private String rateResidue = "0";
	private String contoCorrente="";
	private String intestatarioConto="";
	private String datiBanca="";
	private String datiAgenzia="";
	private String indirizzoBanca="";
	private String abi="";
	private String cab="";
	private String cin="";
	private String importoPreamm="0,00";
	private String dataInizioPreamm="n/d";
	private String importoRimborsoSpese="0,00";
	private String tipoFirmatario="";
	private String tipoFirmatarioLogo="";
	private String sede="";
	private String comuneIntestatarioRid="";
	private String denoSedeRid="";
	private String indSedeRid="";
	private String capRid="";
	private String cittaRid="";
	private String faxRid="";
	private String faxRid1="";
	private String nomeRid="";
	private String codFiscRid="";
	private String importoRataRid="0,00";
	private String importoRataExtRid="";
	private String contoCorrenteRid="";
	private String intestatarioContoRid="";
	private String datiBancaRid="";
	private String datiAgenziaRid="";
	private String indirizzoBancaRid="";
	private String abiRid="";
	private String cabRid="";
	private String cinRid="";
	private String nomeCausaleRid="";
	private String meseAnnoPrimaRataRid="";
	private String meseAnnoRataRid="";
	private String dataOdierna="";
	private String comuneSede="";
	private String sedeDescr="";
	private String sedeDescr1="";
	private String sedeDescr2="";
	private String provSede="";
	private String indSedeRid1="";
	private String capRid1="";
	private String cittaRid1="";
	private String Stringa="";
	private String Iban="";
	private String Iban1="";
	private String descTUR="";
	private String email="";
	private String firma="";
	private String bancaVia="";
	private String bancaCitta="";
	
	
	public String getCapCitta() {
		return capCitta;
	}
	
	public void setCapCitta(String capCitta) {
		this.capCitta = capCitta;
	}
	
	public String getCognomeNome() {
		return cognomeNome;
	}
	
	public void setCognomeNome(String cognomeNome) {
		this.cognomeNome = cognomeNome;
	}
	
	public String getDataAccredito() {
		return dataAccredito;
	}
	
	public void setDataAccredito(String dataAccredito) {
		this.dataAccredito = dataAccredito;
	}
	
	public String getDataInizioPreamm() {
		return dataInizioPreamm;
	}
	
	public void setDataInizioPreamm(String dataInizioPreamm) {
		this.dataInizioPreamm = dataInizioPreamm;
	}
	
	public String getDataStipula() {
		return dataStipula;
	}
	
	public void setDataStipula(String dataStipula) {
		this.dataStipula = dataStipula;
	}
	
	
	public String getIndirizzoVia() {
		return indirizzoVia;
	}
	
	public void setIndirizzoVia(String indirizzoVia) {
		this.indirizzoVia = indirizzoVia;
	}
	
	public String getMeseAnnoInizioPagamento() {
		return meseAnnoInizioPagamento;
	}
	
	public void setMeseAnnoInizioPagamento(String meseAnnoInizioPagamento) {
		this.meseAnnoInizioPagamento = meseAnnoInizioPagamento;
	}
	
	public String getMeseAnnoRata() {
		return meseAnnoRata;
	}
	
	public void setMeseAnnoRata(String meseAnnoRata) {
		this.meseAnnoRata = meseAnnoRata;
	}
	
	public String getImportoPreamm() {
		// Metodo getter di importoPreamm
		return importoPreamm;
	}

	public void setImportoPreamm(String importoPreamm) {
		// Metodo setter di this.importoPreamm
		this.importoPreamm = importoPreamm;
	}

	public String getImportoRata() {
		// Metodo getter di importoRata
		return importoRata;
	}

	public void setImportoRata(String importoRata) {
		// Metodo setter di this.importoRata
		this.importoRata = importoRata;
	}

	public String getImportoRimborsoSpese() {
		// Metodo getter di importoRimborsoSpese
		return importoRimborsoSpese;
	}

	public void setImportoRimborsoSpese(String importoRimborsoSpese) {
		// Metodo setter di this.importoRimborsoSpese
		this.importoRimborsoSpese = importoRimborsoSpese;
	}

	public String getNumeroRate() {
		// Metodo getter di numeroRate
		return numeroRate;
	}

	public void setNumeroRate(String numeroRate) {
		// Metodo setter di this.numeroRate
		this.numeroRate = numeroRate;
	}

	public String getTipoFirmatario() {
		return tipoFirmatario;
	}
	
	public void setTipoFirmatario(String tipoFirmatario) {
		this.tipoFirmatario = tipoFirmatario;
	}
	
	public String getSede() {
		return sede;
	}
	
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	public String getTipoFirmatarioLogo() {
		return tipoFirmatarioLogo;
	}
	
	public void setTipoFirmatarioLogo(String tipoFirmatarioLogo) {
		this.tipoFirmatarioLogo = tipoFirmatarioLogo;
	}

	public String getAbi() {
		// Metodo getter di abi
		return abi;
	}

	public void setAbi(String abi) {
		// Metodo setter di this.abi
		this.abi = abi;
	}

	public String getCab() {
		// Metodo getter di cab
		return cab;
	}

	public void setCab(String cab) {
		// Metodo setter di this.cab
		this.cab = cab;
	}

	public String getCin() {
		// Metodo getter di cin
		return cin;
	}

	public void setCin(String cin) {
		// Metodo setter di this.cin
		this.cin = cin;
	}

	public String getContoCorrente() {
		// Metodo getter di contoCorrente
		return contoCorrente;
	}

	public void setContoCorrente(String contoCorrente) {
		// Metodo setter di this.contoCorrente
		this.contoCorrente = contoCorrente;
	}

	public String getDatiBanca() {
		// Metodo getter di datiBanca
		return datiBanca;
	}

	public void setDatiBanca(String datiBanca) {
		// Metodo setter di this.datiBanca
		this.datiBanca = datiBanca;
	}

	public String getIndirizzoBanca() {
		// Metodo getter di indirizzoBanca
		return indirizzoBanca;
	}

	public void setIndirizzoBanca(String indirizzoBanca) {
		// Metodo setter di this.indirizzoBanca
		this.indirizzoBanca = indirizzoBanca;
	}

	public String getIntestatarioConto() {
		// Metodo getter di intestatarioConto
		return intestatarioConto;
	}

	public void setIntestatarioConto(String intestatarioConto) {
		// Metodo setter di this.intestatarioConto
		this.intestatarioConto = intestatarioConto;
	}

	public String getAbiRid() {
		// Metodo getter di abiRid
		return abiRid;
	}

	public void setAbiRid(String abiRid) {
		// Metodo setter di this.abiRid
		this.abiRid = abiRid;
	}

	public String getCabRid() {
		// Metodo getter di cabRid
		return cabRid;
	}

	public void setCabRid(String cabRid) {
		// Metodo setter di this.cabRid
		this.cabRid = cabRid;
	}

	public String getCinRid() {
		// Metodo getter di cinRid
		return cinRid;
	}

	public void setCinRid(String cinRid) {
		// Metodo setter di this.cinRid
		this.cinRid = cinRid;
	}

	public String getCodFiscRid() {
		// Metodo getter di codFiscRid
		return codFiscRid;
	}

	public void setCodFiscRid(String codFiscRid) {
		// Metodo setter di this.codFiscRid
		this.codFiscRid = codFiscRid;
	}

	public String getComuneIntestatarioRid() {
		// Metodo getter di comuneIntestatarioRid
		return comuneIntestatarioRid;
	}

	public void setComuneIntestatarioRid(String comuneIntestatarioRid) {
		// Metodo setter di this.comuneIntestatarioRid
		this.comuneIntestatarioRid = comuneIntestatarioRid;
	}

	public String getContoCorrenteRid() {
		// Metodo getter di contoCorrenteRid
		return contoCorrenteRid;
	}

	public void setContoCorrenteRid(String contoCorrenteRid) {
		// Metodo setter di this.contoCorrenteRid
		this.contoCorrenteRid = contoCorrenteRid;
	}

	public String getDatiAgenzia() {
		// Metodo getter di datiAgenzia
		return datiAgenzia;
	}

	public void setDatiAgenzia(String datiAgenzia) {
		// Metodo setter di this.datiAgenzia
		this.datiAgenzia = datiAgenzia;
	}

	public String getDatiAgenziaRid() {
		// Metodo getter di datiAgenziaRid
		return datiAgenziaRid;
	}

	public void setDatiAgenziaRid(String datiAgenziaRid) {
		// Metodo setter di this.datiAgenziaRid
		this.datiAgenziaRid = datiAgenziaRid;
	}

	public String getDatiBancaRid() {
		// Metodo getter di datiBancaRid
		return datiBancaRid;
	}

	public void setDatiBancaRid(String datiBancaRid) {
		// Metodo setter di this.datiBancaRid
		this.datiBancaRid = datiBancaRid;
	}

	public String getImportoRataExtRid() {
		// Metodo getter di importoRataExtRid
		return importoRataExtRid;
	}

	public void setImportoRataExtRid(String importoRataExtRid) {
		// Metodo setter di this.importoRataExtRid
		this.importoRataExtRid = importoRataExtRid;
	}

	public String getImportoRataRid() {
		// Metodo getter di importoRataRid
		return importoRataRid;
	}

	public void setImportoRataRid(String importoRataRid) {
		// Metodo setter di this.importoRataRid
		this.importoRataRid = importoRataRid;
	}

	public String getIndirizzoBancaRid() {
		// Metodo getter di indirizzoBancaRid
		return indirizzoBancaRid;
	}

	public void setIndirizzoBancaRid(String indirizzoBancaRid) {
		// Metodo setter di this.indirizzoBancaRid
		this.indirizzoBancaRid = indirizzoBancaRid;
	}

	public String getIntestatarioContoRid() {
		// Metodo getter di intestatarioContoRid
		return intestatarioContoRid;
	}

	public void setIntestatarioContoRid(String intestatarioContoRid) {
		// Metodo setter di this.intestatarioContoRid
		this.intestatarioContoRid = intestatarioContoRid;
	}

	public String getMeseAnnoPrimaRataRid() {
		// Metodo getter di meseAnnoPrimaRataRid
		return meseAnnoPrimaRataRid;
	}

	public void setMeseAnnoPrimaRataRid(String meseAnnoPrimaRataRid) {
		// Metodo setter di this.meseAnnoPrimaRataRid
		this.meseAnnoPrimaRataRid = meseAnnoPrimaRataRid;
	}

	public String getMeseAnnoRataRid() {
		// Metodo getter di meseAnnoRataRid
		return meseAnnoRataRid;
	}

	public void setMeseAnnoRataRid(String meseAnnoRataRid) {
		// Metodo setter di this.meseAnnoRataRid
		this.meseAnnoRataRid = meseAnnoRataRid;
	}

	public String getNomeCausaleRid() {
		// Metodo getter di nomeCausaleRid
		return nomeCausaleRid;
	}

	public void setNomeCausaleRid(String nomeCausaleRid) {
		// Metodo setter di this.nomeCausaleRid
		this.nomeCausaleRid = nomeCausaleRid;
	}

	public String getNomeRid() {
		// Metodo getter di nomeRid
		return nomeRid;
	}

	public void setNomeRid(String nomeRid) {
		// Metodo setter di this.nomeRid
		this.nomeRid = nomeRid;
	}

	public String getDataOdierna() {
		// Metodo getter di dataOdierna
		return dataOdierna;
	}

	public void setDataOdierna(String dataOdierna) {
		// Metodo setter di this.dataOdierna
		this.dataOdierna = dataOdierna;
	}

	public String getComuneSede() {
		// Metodo getter di comuneSede
		return comuneSede;
	}

	public void setComuneSede(String comuneSede) {
		// Metodo setter di this.comuneSede
		this.comuneSede = comuneSede;
	}

	public String getCapRid() {
		// Metodo getter di capRid
		return capRid;
	}

	public void setCapRid(String capRid) {
		// Metodo setter di this.capRid
		this.capRid = capRid;
	}

	public String getCittaRid() {
		// Metodo getter di cittaRid
		return cittaRid;
	}

	public void setCittaRid(String cittaRid) {
		// Metodo setter di this.cittaRid
		this.cittaRid = cittaRid;
	}

	public String getDenoSedeRid() {
		// Metodo getter di denoSedeRid
		return denoSedeRid;
	}

	public void setDenoSedeRid(String denoSedeRid) {
		// Metodo setter di this.denoSedeRid
		this.denoSedeRid = denoSedeRid;
	}

	public String getFaxRid() {
		// Metodo getter di faxRid
		return faxRid;
	}

	public void setFaxRid(String faxRid) {
		// Metodo setter di this.faxRid
		this.faxRid = faxRid;
	}

	public String getIndSedeRid() {
		// Metodo getter di indSedeRid
		return indSedeRid;
	}

	public void setIndSedeRid(String indSedeRid) {
		// Metodo setter di this.indSedeRid
		this.indSedeRid = indSedeRid;
	}

	public String getDataDecorrenza() {
		// Metodo getter di dataDecorrenza
		return dataDecorrenza;
	}

	public void setDataDecorrenza(String dataDecorrenza) {
		// Metodo setter di this.dataDecorrenza
		this.dataDecorrenza = dataDecorrenza;
	}

	public String getMeseAnnoDecorrenza() {
		// Metodo getter di meseAnnoDecorrenza
		return meseAnnoDecorrenza;
	}

	public void setMeseAnnoDecorrenza(String meseAnnoDecorrenza) {
		// Metodo setter di this.meseAnnoDecorrenza
		this.meseAnnoDecorrenza = meseAnnoDecorrenza;
	}

	public String getNumeroFax() {
		// Metodo getter di numeroFax
		return numeroFax;
	}

	public void setNumeroFax(String numeroFax) {
		// Metodo setter di this.numeroFax
		this.numeroFax = numeroFax;
	}

	public String getDataPagamento() {
		// Metodo getter di dataPagamento
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		// Metodo setter di this.dataPagamento
		this.dataPagamento = dataPagamento;
	}

	public String getImportoRataNew() {
		// Metodo getter di importoRataNew
		return importoRataNew;
	}

	public void setImportoRataNew(String importoRataNew) {
		// Metodo setter di this.importoRataNew
		this.importoRataNew = importoRataNew;
	}

	public String getDataDecorrenzaDebito() {
		// Metodo getter di dataDecorrenzaDebito
		return dataDecorrenzaDebito;
	}

	public void setDataDecorrenzaDebito(String dataDecorrenzaDebito) {
		// Metodo setter di this.dataDecorrenzaDebito
		this.dataDecorrenzaDebito = dataDecorrenzaDebito;
	}

	public String getDataProvvedimento() {
		// Metodo getter di dataProvvedimento
		return dataProvvedimento;
	}

	public void setDataProvvedimento(String dataProvvedimento) {
		// Metodo setter di this.dataProvvedimento
		this.dataProvvedimento = dataProvvedimento;
	}

	public String getNumeroTel() {
		// Metodo getter di numeroTel
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		// Metodo setter di this.numeroTel
		this.numeroTel = numeroTel;
	}

	public String getNuovoTasso() {
		// Metodo getter di nuovoTasso
		return nuovoTasso;
	}

	public void setNuovoTasso(String nuovoTasso) {
		// Metodo setter di this.nuovoTasso
		this.nuovoTasso = nuovoTasso;
	}

	public String getSede2() {
		// Metodo getter di sede2
		return sede2;
	}

	public void setSede2(String sede2) {
		// Metodo setter di this.sede2
		this.sede2 = sede2;
	}

	public String getTassoUfficiale() {
		// Metodo getter di tassoUfficiale
		return tassoUfficiale;
	}

	public void setTassoUfficiale(String tassoUfficiale) {
		// Metodo setter di this.tassoUfficiale
		this.tassoUfficiale = tassoUfficiale;
	}

	public String getTipoVariazione() {
		// Metodo getter di tipoVariazione
		return tipoVariazione;
	}

	public void setTipoVariazione(String tipoVariazione) {
		// Metodo setter di this.tipoVariazione
		this.tipoVariazione = tipoVariazione;
	}

	public String getTipoVariazione2() {
		// Metodo getter di tipoVariazione2
		return tipoVariazione2;
	}

	public void setTipoVariazione2(String tipoVariazione2) {
		// Metodo setter di this.tipoVariazione2
		this.tipoVariazione2 = tipoVariazione2;
	}

	public String getDataValuta() {
		// Metodo getter di dataValuta
		return dataValuta;
	}

	public void setDataValuta(String dataValuta) {
		// Metodo setter di this.dataValuta
		this.dataValuta = dataValuta;
	}

	public String getDebitoResiduo() {
		// Metodo getter di debitoResiduo
		return debitoResiduo;
	}

	public void setDebitoResiduo(String debitoResiduo) {
		// Metodo setter di this.debitoResiduo
		this.debitoResiduo = debitoResiduo;
	}

	public String getRateResidue() {
		// Metodo getter di rateResidue
		return rateResidue;
	}

	public void setRateResidue(String rateResidue) {
		// Metodo setter di this.rateResidue
		this.rateResidue = rateResidue;
	}

	public String getDataErogazione() {
		// Metodo getter di dataErogazione
		return dataErogazione;
	}

	public void setDataErogazione(String dataErogazione) {
		// Metodo setter di this.dataErogazione
		this.dataErogazione = dataErogazione;
	}
	/**
	 * Returns the cap.
	 * @return String
	 */
	public String getCap() {
		return cap;
	}

	/**
	 * Returns the citta.
	 * @return String
	 */
	public String getCitta() {
		return citta;
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
	 * Sets the citta.
	 * @param citta The citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * Sets the prov.
	 * @param prov The prov to set
	 */
	public void setProv(String prov) {
		this.prov = prov;
	}

	/**
	 * Returns the sedeDescr.
	 * @return String
	 */
	public String getSedeDescr() {
		return sedeDescr;
	}

	/**
	 * Returns the sedeDescr1.
	 * @return String
	 */
	public String getSedeDescr1() {
		return sedeDescr1;
	}

	/**
	 * Returns the sedeDescr2.
	 * @return String
	 */
	public String getSedeDescr2() {
		return sedeDescr2;
	}

	/**
	 * Sets the sedeDescr.
	 * @param sedeDescr The sedeDescr to set
	 */
	public void setSedeDescr(String sedeDescr) {
		this.sedeDescr = sedeDescr;
	}

	/**
	 * Sets the sedeDescr1.
	 * @param sedeDescr1 The sedeDescr1 to set
	 */
	public void setSedeDescr1(String sedeDescr1) {
		this.sedeDescr1 = sedeDescr1;
	}

	/**
	 * Sets the sedeDescr2.
	 * @param sedeDescr2 The sedeDescr2 to set
	 */
	public void setSedeDescr2(String sedeDescr2) {
		this.sedeDescr2 = sedeDescr2;
	}

	/**
	 * Returns the provSede.
	 * @return String
	 */
	public String getProvSede() {
		return provSede;
	}

	/**
	 * Sets the provSede.
	 * @param provSede The provSede to set
	 */
	public void setProvSede(String provSede) {
		this.provSede = provSede;
	}

	/**
	 * Returns the stringa.
	 * @return String
	 */
	public String getStringa() {
		return Stringa;
	}

	/**
	 * Sets the stringa.
	 * @param stringa The stringa to set
	 */
	public void setStringa(String stringa) {
		Stringa = stringa;
	}

	/**
	 * Returns the capRid1.
	 * @return String
	 */
	public String getCapRid1() {
		return capRid1;
	}

	/**
	 * Returns the cittaRid1.
	 * @return String
	 */
	public String getCittaRid1() {
		return cittaRid1;
	}

	/**
	 * Returns the indSedeRid1.
	 * @return String
	 */
	public String getIndSedeRid1() {
		return indSedeRid1;
	}

	/**
	 * Sets the capRid1.
	 * @param capRid1 The capRid1 to set
	 */
	public void setCapRid1(String capRid1) {
		this.capRid1 = capRid1;
	}

	/**
	 * Sets the cittaRid1.
	 * @param cittaRid1 The cittaRid1 to set
	 */
	public void setCittaRid1(String cittaRid1) {
		this.cittaRid1 = cittaRid1;
	}

	/**
	 * Sets the indSedeRid1.
	 * @param indSedeRid1 The indSedeRid1 to set
	 */
	public void setIndSedeRid1(String indSedeRid1) {
		this.indSedeRid1 = indSedeRid1;
	}

	
	/**
	 * Returns the iban.
	 * @return String
	 */
	public String getIban() {
		return Iban;
	}

	/**
	 * Sets the iban.
	 * @param iban The iban to set
	 */
	public void setIban(String iban) {
		Iban = iban;
	}

	/**
	 * Returns the iban1.
	 * @return String
	 */
	public String getIban1() {
		return Iban1;
	}

	/**
	 * Sets the iban1.
	 * @param iban1 The iban1 to set
	 */
	public void setIban1(String iban1) {
		Iban1 = iban1;
	}

	/**
	 * Returns the faxRid1.
	 * @return String
	 */
	public String getFaxRid1() {
		return faxRid1;
	}

	/**
	 * Sets the faxRid1.
	 * @param faxRid1 The faxRid1 to set
	 */
	public void setFaxRid1(String faxRid1) {
		this.faxRid1 = faxRid1;
	}

	/**
	 * Returns the descTUR.
	 * @return String
	 */
	public String getDescTUR() {
		return descTUR;
	}

	/**
	 * Sets the descTUR.
	 * @param descTUR The descTUR to set
	 */
	public void setDescTUR(String descTUR) {
		this.descTUR = descTUR;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	

	public String getBancaVia() {
		return bancaVia;
	}

	public void setBancaVia(String bancaVia) {
		this.bancaVia = bancaVia;
	}

	public String getBancaCitta() {
		return bancaCitta;
	}

	public void setBancaCitta(String bancaCitta) {
		this.bancaCitta = bancaCitta;
	}

	@Override
	public String toString() {
		return "Lettera [cognomeNome=" + cognomeNome + ", indirizzoVia=" + indirizzoVia + ", capCitta=" + capCitta
				+ ", cap=" + cap + ", citta=" + citta + ", prov=" + prov + ", dataStipula=" + dataStipula
				+ ", dataDecorrenza=" + dataDecorrenza + ", meseAnnoDecorrenza=" + meseAnnoDecorrenza + ", numeroRate="
				+ numeroRate + ", importoRata=" + importoRata + ", importoRataNew=" + importoRataNew + ", numeroFax="
				+ numeroFax + ", meseAnnoInizioPagamento=" + meseAnnoInizioPagamento + ", dataValuta=" + dataValuta
				+ ", meseAnnoRata=" + meseAnnoRata + ", dataAccredito=" + dataAccredito + ", dataPagamento="
				+ dataPagamento + ", dataErogazione=" + dataErogazione + ", dataProvvedimento=" + dataProvvedimento
				+ ", tipoVariazione=" + tipoVariazione + ", tassoUfficiale=" + tassoUfficiale + ", nuovoTasso="
				+ nuovoTasso + ", tipoVariazione2=" + tipoVariazione2 + ", dataDecorrenzaDebito=" + dataDecorrenzaDebito
				+ ", numeroTel=" + numeroTel + ", sede2=" + sede2 + ", debitoResiduo=" + debitoResiduo
				+ ", rateResidue=" + rateResidue + ", contoCorrente=" + contoCorrente + ", intestatarioConto="
				+ intestatarioConto + ", datiBanca=" + datiBanca + ", datiAgenzia=" + datiAgenzia + ", indirizzoBanca="
				+ indirizzoBanca + ", abi=" + abi + ", cab=" + cab + ", cin=" + cin + ", importoPreamm=" + importoPreamm
				+ ", dataInizioPreamm=" + dataInizioPreamm + ", importoRimborsoSpese=" + importoRimborsoSpese
				+ ", tipoFirmatario=" + tipoFirmatario + ", tipoFirmatarioLogo=" + tipoFirmatarioLogo + ", sede=" + sede
				+ ", comuneIntestatarioRid=" + comuneIntestatarioRid + ", denoSedeRid=" + denoSedeRid + ", indSedeRid="
				+ indSedeRid + ", capRid=" + capRid + ", cittaRid=" + cittaRid + ", faxRid=" + faxRid + ", faxRid1="
				+ faxRid1 + ", nomeRid=" + nomeRid + ", codFiscRid=" + codFiscRid + ", importoRataRid=" + importoRataRid
				+ ", importoRataExtRid=" + importoRataExtRid + ", contoCorrenteRid=" + contoCorrenteRid
				+ ", intestatarioContoRid=" + intestatarioContoRid + ", datiBancaRid=" + datiBancaRid
				+ ", datiAgenziaRid=" + datiAgenziaRid + ", indirizzoBancaRid=" + indirizzoBancaRid + ", abiRid="
				+ abiRid + ", cabRid=" + cabRid + ", cinRid=" + cinRid + ", nomeCausaleRid=" + nomeCausaleRid
				+ ", meseAnnoPrimaRataRid=" + meseAnnoPrimaRataRid + ", meseAnnoRataRid=" + meseAnnoRataRid
				+ ", dataOdierna=" + dataOdierna + ", comuneSede=" + comuneSede + ", sedeDescr=" + sedeDescr
				+ ", sedeDescr1=" + sedeDescr1 + ", sedeDescr2=" + sedeDescr2 + ", provSede=" + provSede
				+ ", indSedeRid1=" + indSedeRid1 + ", capRid1=" + capRid1 + ", cittaRid1=" + cittaRid1 + ", Stringa="
				+ Stringa + ", Iban=" + Iban + ", Iban1=" + Iban1 + ", descTUR=" + descTUR + ", email=" + email
				+ ", firma=" + firma + ", bancaVia=" + bancaVia + ", bancaCitta=" + bancaCitta + "]";
	}	


}
