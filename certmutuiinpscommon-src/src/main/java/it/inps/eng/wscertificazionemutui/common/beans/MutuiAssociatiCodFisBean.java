package it.inps.eng.wscertificazionemutui.common.beans;


import java.util.Date;



public class MutuiAssociatiCodFisBean {
	
	private String sedeDesc;//sede
	private String cognome;
	private String nome;
	private String matricola;
	private String sede;
	private String annoMutuo;
	private String progMutuo;
	private String numeroDomanda;//annoMuto/progMutuo=numeroDomanda					
	private String voceContabile;
	private String statoMutuo;
	private String descStatoMutuo;
	private String tpEvn; 
	private String tpBen; 
	private String tipologiaMutuo;
	private String descTipologiaMutuo;//tipologiaMutuo ==> prendere la descdrizione dalla tipologica
	private String motCess;				
	private String descCess;
	private String statoIntestatario;
	private String descTipoEvento;
	private String descStatoEvento;
	private String descTipoTasso;
	private String descTipoBeneficiario;
	private String descTipoPagamento;
	private String intestatarioPrincipale;
	private String frequenzaRate; //frequenza Rate
	private String annnoMeseRiferimento;
	private String annoMeseOperazione;	
	private String ST_MOV;
	private String TP_MOV;
	private String descStatoMov;				
	private String descTipoMov;
	private String segnoMov;
	private String dtPgm;
	private String tpPgm;	
    protected String dataScadenzaPrimaDellEstinzione;
    protected String nuovoImportoRata;
    protected String dataScadenzaDopoEstinzione;
    protected String nuovoNumeroRateResidue;
    protected String residenza;	
    protected String fraseResidenza;
    
	private Double debitoResiduo;
	private Double importoRata;
	private Double rateTotali;
	private Double importoEstinzioni;	//Importo Est. Anticipata
	private Double prossimaRata;
	private Double tasso;
	private Double percentualeDiIntestazione;
	private Double importoMutuo;
	private Double numeroRate;
	private Double impostaSostitutivaIntestatario;
	private Double interessiPreammortamento;
	private String interessiPreammortamentoTrattenuta;
	private Double speseIstruttoria;
	private Double importoPrimoAcconto;
	private Double importoSecondoAcconto;
	private Double importoSaldo;
	private Double importoMov;
	private Double intPreamPrimoAcconto;
	private Double intPreamSecondoAcconto;
	private Double intPreamSaldo;
	private String interessi;
	private Double numeroProtocollo;
	private Double detrazioneFiscale;
	private Double progressivoRata;
	 
	private Date   dataScadenza; //Data Scadenza Prevista
	private Date   dataDecorrenza;
	private Date   dataStipula;
	private Date   dataNascitaMutuo;
	private Date   dataErogazione;
	private Date   dataChiusura; //presente se il mutuo è chiuso
	private Date   dataErogPrimoAcconto;
	private Date   dataErogSecondoAcconto;
    private Date   dataErogSaldo;
    private Date   dataProtocollo;
    
    
    
    
	
    public String getDataScadenzaPrimaDellEstinzione() {
		return dataScadenzaPrimaDellEstinzione;
	}
	public void setDataScadenzaPrimaDellEstinzione(String dataScadenzaPrimaDellEstinzione) {
		this.dataScadenzaPrimaDellEstinzione = dataScadenzaPrimaDellEstinzione;
	}
	public String getNuovoImportoRata() {
		return nuovoImportoRata;
	}
	public void setNuovoImportoRata(String nuovoImportoRata) {
		this.nuovoImportoRata = nuovoImportoRata;
	}
	public String getDataScadenzaDopoEstinzione() {
		return dataScadenzaDopoEstinzione;
	}
	public void setDataScadenzaDopoEstinzione(String dataScadenzaDopoEstinzione) {
		this.dataScadenzaDopoEstinzione = dataScadenzaDopoEstinzione;
	}
	public String getNuovoNumeroRateResidue() {
		return nuovoNumeroRateResidue;
	}
	public void setNuovoNumeroRateResidue(String nuovoNumeroRateResidue) {
		this.nuovoNumeroRateResidue = nuovoNumeroRateResidue;
	}
    public String getST_MOV() {
		return ST_MOV;
	}
	public void setST_MOV(String sT_MOV) {
		ST_MOV = sT_MOV;
	}
	public String getTP_MOV() {
		return TP_MOV;
	}
	public void setTP_MOV(String tP_MOV) {
		TP_MOV = tP_MOV;
	}
	public String getDescStatoMov() {
		return descStatoMov;
	}
	public void setDescStatoMov(String descStatoMov) {
		this.descStatoMov = descStatoMov;
	}
	public String getDescTipoMov() {
		return descTipoMov;
	}
	public void setDescTipoMov(String descTipoMov) {
		this.descTipoMov = descTipoMov;
	}
	public String getSegnoMov() {
		return segnoMov;
	}
	public void setSegnoMov(String segnoMov) {
		this.segnoMov = segnoMov;
	}
	public String getDtPgm() {
		return dtPgm;
	}
	public void setDtPgm(String dtPgm) {
		this.dtPgm = dtPgm;
	}
	public String getTpPgm() {
		return tpPgm;
	}
	public void setTpPgm(String tpPgm) {
		this.tpPgm = tpPgm;
	}
    public String getAnnoMeseOperazione() {
		return annoMeseOperazione;
	}
	public void setAnnoMeseOperazione(String annoMeseOperazione) {
		this.annoMeseOperazione = annoMeseOperazione;
	}
    public Double getDetrazioneFiscale() {
		return detrazioneFiscale;
	}
	
    public void setDetrazioneFiscale(Double detrazioneFiscale) {
		this.detrazioneFiscale = detrazioneFiscale;
	}
	public String getDescTipoPagamento() {
		return descTipoPagamento;
	}
	public void setDescTipoPagamento(String descTipoPagamento) {
		this.descTipoPagamento = descTipoPagamento;
	}
    public String getDescTipoBeneficiario() {
		return descTipoBeneficiario;
	}
	public void setDescTipoBeneficiario(String descTipoBeneficiario) {
		this.descTipoBeneficiario = descTipoBeneficiario;
	}
    public Double getImportoMov() {
		return importoMov;
	}
	public void setImportoMov(Double importoMov) {
		this.importoMov = importoMov;
	}
	public Double getImportoMutuo() {
		return importoMutuo;
	}
	public void setImportoMutuo(Double importoMutuo) {
		this.importoMutuo = importoMutuo;
	}
	public Double getNumeroRate() {
		return numeroRate;
	}
	public void setNumeroRate(Double numeroRate) {
		this.numeroRate = numeroRate;
	}
	public Double getImpostaSostitutivaIntestatario() {
		return impostaSostitutivaIntestatario;
	}
	public void setImpostaSostitutivaIntestatario(Double impostaSostitutivaIntestatario) {
		this.impostaSostitutivaIntestatario = impostaSostitutivaIntestatario;
	}
	public Double getSpeseIstruttoria() {
		return speseIstruttoria;
	}
	public void setSpeseIstruttoria(Double speseIstruttoria) {
		this.speseIstruttoria = speseIstruttoria;
	}
	public Double getImportoPrimoAcconto() {
		return importoPrimoAcconto;
	}
	public void setImportoPrimoAcconto(Double importoPrimoAcconto) {
		this.importoPrimoAcconto = importoPrimoAcconto;
	}
	public Double getImportoSecondoAcconto() {
		return importoSecondoAcconto;
	}
	public void setImportoSecondoAcconto(Double importoSecondoAcconto) {
		this.importoSecondoAcconto = importoSecondoAcconto;
	}
	public Double getImportoSaldo() {
		return importoSaldo;
	}
	public void setImportoSaldo(Double importoSaldo) {
		this.importoSaldo = importoSaldo;
	}
	public Double getIntPreamPrimoAcconto() {
		return intPreamPrimoAcconto;
	}
	public void setIntPreamPrimoAcconto(Double intPreamPrimoAcconto) {
		this.intPreamPrimoAcconto = intPreamPrimoAcconto;
	}
	public Double getIntPreamSecondoAcconto() {
		return intPreamSecondoAcconto;
	}
	public void setIntPreamSecondoAcconto(Double intPreamSecondoAcconto) {
		this.intPreamSecondoAcconto = intPreamSecondoAcconto;
	}
	public Double getIntPreamSaldo() {
		return intPreamSaldo;
	}
	public void setIntPreamSaldo(Double intPreamSaldo) {
		this.intPreamSaldo = intPreamSaldo;
	}
	public String getInteressi() {
		return interessi;
	}
	public void setInteressi(String interessi) {
		this.interessi = interessi;
	}
	public Double getNumeroProtocollo() {
		return numeroProtocollo;
	}
	public void setNumeroProtocollo(Double numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}
	public Date getDataStipula() {
		return dataStipula;
	}
	public void setDataStipula(Date dataStipula) {
		this.dataStipula = dataStipula;
	}
	public Date getDataNascitaMutuo() {
		return dataNascitaMutuo;
	}
	public void setDataNascitaMutuo(Date dataNascitaMutuo) {
		this.dataNascitaMutuo = dataNascitaMutuo;
	}
	public Date getDataErogazione() {
		return dataErogazione;
	}
	public void setDataErogazione(Date dataErogazione) {
		this.dataErogazione = dataErogazione;
	}
	public Date getDataChiusura() {
		return dataChiusura;
	}
	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}
	public Date getDataErogPrimoAcconto() {
		return dataErogPrimoAcconto;
	}
	public void setDataErogPrimoAcconto(Date dataErogPrimoAcconto) {
		this.dataErogPrimoAcconto = dataErogPrimoAcconto;
	}
	public Date getDataErogSecondoAcconto() {
		return dataErogSecondoAcconto;
	}
	public void setDataErogSecondoAcconto(Date dataErogSecondoAcconto) {
		this.dataErogSecondoAcconto = dataErogSecondoAcconto;
	}
	public Date getDataErogSaldo() {
		return dataErogSaldo;
	}
	public void setDataErogSaldo(Date dataErogSaldo) {
		this.dataErogSaldo = dataErogSaldo;
	}
	public Date getDataProtocollo() {
		return dataProtocollo;
	}
	public void setDataProtocollo(Date dataProtocollo) {
		this.dataProtocollo = dataProtocollo;
	}

	public String getDescTipoEvento() {
		return descTipoEvento;
	}
	public void setDescTipoEvento(String descTipoEvento) {
		this.descTipoEvento = descTipoEvento;
	}
	public String getDescStatoEvento() {
		return descStatoEvento;
	}
	public void setDescStatoEvento(String descStatoEvento) {
		this.descStatoEvento = descStatoEvento;
	}
	public Double getDebitoResiduo() {
		return debitoResiduo;
	}
	public void setDebitoResiduo(Double debitoResiduo) {
		this.debitoResiduo = debitoResiduo;
	}
	public String getDescTipoTasso() {
		return descTipoTasso;
	}
	public void setDescTipoTasso(String descTipoTasso) {
		this.descTipoTasso = descTipoTasso;
	}
	public String getFrequenzaRate() {
		return frequenzaRate;
	}
	public void setFrequenzaRate(String frequenzarate) {
		this.frequenzaRate = frequenzarate;
	}
	public Double getImportoRata() {
		return importoRata;
	}
	public void setImportoRata(Double importoRata) {
		this.importoRata = importoRata;
	}
	public Double getRateTotali() {
		return rateTotali;
	}
	public void setRateTotali(Double rateTotali) {
		this.rateTotali = rateTotali;
	}
	public Double getImportoEstinzioni() {
		return importoEstinzioni;
	}
	public void setImportoEstinzioni(Double importoEstinzioni) {
		this.importoEstinzioni = importoEstinzioni;
	}
	public Date getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	public Double getProssimaRata() {
		return prossimaRata;
	}
	public void setProssimaRata(Double prossimaRata) {
		this.prossimaRata = prossimaRata;
	}
	public String getSedeDesc() {
		return sedeDesc;
	}
	public void setSedeDesc(String sedeDesc) {
		this.sedeDesc = sedeDesc;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
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
	public String getTpEvn() {
		return tpEvn;
	}
	public void setTpEvn(String tpEvn) {
		this.tpEvn = tpEvn;
	}
		public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getNumeroDomanda() {
		return numeroDomanda;
	}
	public void setNumeroDomanda(String numeroDomanda) {
		this.numeroDomanda = numeroDomanda;
	}
	public Double getTasso() {
		return tasso;
	}
	public void setTasso(Double tasso) {
		this.tasso = tasso;
	}
	public Double getPercentualeDiIntestazione() {
		return percentualeDiIntestazione;
	}
	public void setPercentualeDiIntestazione(Double percentualeDiIntestazione) {
		this.percentualeDiIntestazione = percentualeDiIntestazione;
	}
	public String getVoceContabile() {
		return voceContabile;
	}
	public void setVoceContabile(String voceContabile) {
		this.voceContabile = voceContabile;
	}
	public String getStatoMutuo() {
		return statoMutuo;
	}
	public void setStatoMutuo(String statoMutuo) {
		this.statoMutuo = statoMutuo;
	}
	public String getTipologiaMutuo() {
		return tipologiaMutuo;
	}
	public void setTipologiaMutuo(String tipologiaMutuo) {
		this.tipologiaMutuo = tipologiaMutuo;
	}
	public String getStatoIntestatario() {
		return statoIntestatario;
	}
	public void setStatoIntestatario(String statoIntestatario) {
		this.statoIntestatario = statoIntestatario;
	}
		public String getMotCess() {
		return motCess;
	}
	public void setMotCess(String motCess) {
		this.motCess = motCess;
	}
	public String getDescCess() {
		return descCess;
	}
	public void setDescCess(String descCess) {
		this.descCess = descCess;
	}
	public String getDescStatoMutuo() {
		return descStatoMutuo;
	}
	public void setDescStatoMutuo(String descStatoMutuo) {
		this.descStatoMutuo = descStatoMutuo;
	}
	public String getDescTipologiaMutuo() {
		return descTipologiaMutuo;
	}
	public void setDescTipologiaMutuo(String descTipologiaMutuo) {
		this.descTipologiaMutuo = descTipologiaMutuo;
	}
	public Date getDataDecorrenza() {
		return dataDecorrenza;
	}
	public void setDataDecorrenza(Date dataDecorrenza) {
		this.dataDecorrenza = dataDecorrenza;
	}
	public String getTpBen() {
		return tpBen;
	}
	public void setTpBen(String tpBen) {
		this.tpBen = tpBen;
	}
	public String getIntestatarioPrincipale() {
		return intestatarioPrincipale;
	}
	public void setIntestatarioPrincipale(String intestatarioPrincipale) {
		this.intestatarioPrincipale = intestatarioPrincipale;
	}
	public Double getInteressiPreammortamento() {
		return interessiPreammortamento;
	}
	public void setInteressiPreammortamento(Double interessiPreammortamento) {
		this.interessiPreammortamento = interessiPreammortamento;
	}
	public String getInteressiPreammortamentoTrattenuta() {
		return interessiPreammortamentoTrattenuta;
	}
	public void setInteressiPreammortamentoTrattenuta(String interessiPreammortamentoTrattenuta) {
		this.interessiPreammortamentoTrattenuta = interessiPreammortamentoTrattenuta;
	}
	public Double getProgressivoRata() {
		return progressivoRata;
	}
	public void setProgressivoRata(Double progressivoRata) {
		this.progressivoRata = progressivoRata;
	}
	public String getAnnnoMeseRiferimento() {
		return annnoMeseRiferimento;
	}
	public void setAnnnoMeseRiferimento(String annnoMeseRiferimento) {
		this.annnoMeseRiferimento = annnoMeseRiferimento;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	
	public String getFraseResidenza() {
		return fraseResidenza;
	}
	public void setFraseResidenza(String fraseResidenza) {
		this.fraseResidenza = fraseResidenza;
	}
	
}