package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import java.sql.Timestamp;

public class ReportOneriDeducibili2010 {
	
	private String annoMutuo = null;
	private String progressivoMutuo = null;	
	private String sede = null;
	private String progressivoIntestatari = null;
	private String dataStipula = null;
	private String ammontareOrigiario = null;
	private String rate = null;	
	private double rateDouble;
	private double totRateDouble;
	private String interessiOneri = null;
	private double interessiDouble;
	private double totInteressiDouble;
	private String numeroIntestatari = null;
	private String matricola = null;
	private String codiceFiscale = null;
	private String cognome = null;
	private String nome = null;		
	private String sesso = null;		
	private String dataNascita = null;		
	private String luogoNascita = null;			
	private String provinciaNascita = null;				
	private String segnalazione = null;		
	private String progressivoRecord = null;
	private String percentuale = null;
	private String erede = null;
	private String tipologiaMutuo = null;	
	private String dataDecesso = null;

	private String tipoRecord;
	private Timestamp dataInizioPeriodo;
	private Timestamp dataFinePeriodo;
	
	private String ammontarePenali;
	
	private String cartolarizzato;
	private boolean accollo;
	
	public ReportOneriDeducibili2010() {
		super();
	}
	
	public String getAmmontareOrigiario() {
		return ammontareOrigiario;
	}
	public void setAmmontareOrigiario(String ammontareOrigiario) {
		this.ammontareOrigiario = ammontareOrigiario;
	}
	public String getAnnoMutuo() {
		return annoMutuo;
	}
	public void setAnnoMutuo(String annoMutuo) {
		this.annoMutuo = annoMutuo;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getDataStipula() {
		return dataStipula;
	}
	public void setDataStipula(String dataStipula) {
		this.dataStipula = dataStipula;
	}
	public String getInteressiOneri() {
		return interessiOneri;
	}
	public void setInteressiOneri(String interessiOneri) {
		this.interessiOneri = interessiOneri;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroIntestatari() {
		return numeroIntestatari;
	}
	public void setNumeroIntestatari(String numeroIntestatari) {
		this.numeroIntestatari = numeroIntestatari;
	}
	public String getProgressivoIntestatari() {
		return progressivoIntestatari;
	}
	public void setProgressivoIntestatari(String progressivoIntestatari) {
		this.progressivoIntestatari = progressivoIntestatari;
	}
	public String getProgressivoMutuo() {
		return progressivoMutuo;
	}
	public void setProgressivoMutuo(String progressivoMutuo) {
		this.progressivoMutuo = progressivoMutuo;
	}
	public String getProgressivoRecord() {
		return progressivoRecord;
	}
	public void setProgressivoRecord(String progressivoRecord) {
		this.progressivoRecord = progressivoRecord;
	}
	public String getProvinciaNascita() {
		return provinciaNascita;
	}
	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getSegnalazione() {
		return segnalazione;
	}
	public void setSegnalazione(String segnalazione) {
		this.segnalazione = segnalazione;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getPercentuale() {
		return percentuale;
	}
	public void setPercentuale(String percentuale) {
		this.percentuale = percentuale;
	}
	public String getErede() {
		return erede;
	}
	public void setErede(String erede) {
		this.erede = erede;
	}
	public String getTipologiaMutuo() {
		return tipologiaMutuo;
	}
	public void setTipologiaMutuo(String tipologiaMutuo) {
		this.tipologiaMutuo = tipologiaMutuo;
	}
	public String getDataDecesso() {
		return dataDecesso;
	}
	public void setDataDecesso(String dataDecesso) {
		this.dataDecesso = dataDecesso;
	}

	public Timestamp getDataInizioPeriodo() {
		return dataInizioPeriodo;
	}

	public void setDataInizioPeriodo(Timestamp dataInizioPeriodo) {
		this.dataInizioPeriodo = dataInizioPeriodo;
	}

	public Timestamp getDataFinePeriodo() {
		return dataFinePeriodo;
	}

	public void setDataFinePeriodo(Timestamp dataFinePeriodo) {
		this.dataFinePeriodo = dataFinePeriodo;
	}

	public double getRateDouble() {
		return rateDouble;
	}

	public void setRateDouble(double rateDouble) {
		this.rateDouble = rateDouble;
	}

	public double getInteressiDouble() {
		return interessiDouble;
	}

	public void setInteressiDouble(double interessiDouble) {
		this.interessiDouble = interessiDouble;
	}

	public String getTipoRecord() {
		return tipoRecord;
	}

	public void setTipoRecord(String tipoRecord) {
		this.tipoRecord = tipoRecord;
	}

	public double getTotRateDouble() {
		return totRateDouble;
	}

	public void setTotRateDouble(double totRateDouble) {
		this.totRateDouble = totRateDouble;
	}

	public double getTotInteressiDouble() {
		return totInteressiDouble;
	}

	public void setTotInteressiDouble(double totInteressiDouble) {
		this.totInteressiDouble = totInteressiDouble;
	}

	public String getAmmontarePenali() {
		return ammontarePenali;
	}

	public void setAmmontarePenali(String ammontarePenali) {
		this.ammontarePenali = ammontarePenali;
	}

	public String getCartolarizzato() {
		return cartolarizzato;
	}

	public void setCartolarizzato(String cartolarizzato) {
		this.cartolarizzato = cartolarizzato;
	}

	public boolean isAccollo() {
		return accollo;
	}

	public void setAccollo(boolean accollo) {
		this.accollo = accollo;
	}

}