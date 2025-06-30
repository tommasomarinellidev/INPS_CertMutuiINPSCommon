package it.inps.eng.wscertificazionemutui.common.beans.insolvenze;

import java.util.List;

import it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale.PdfObj;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe che rappresenta i dettagli di un mutuo per la generazione delle lettere M001, M003 e M004.
 * Contiene tutti i campi necessari per tutte e tre le tipologie di lettere:
 * - M001: Lettera di comunicazione
 * - M003: Lettera di messa in mora  
 * - M004: Lettera di comunicazione debito residuo
 */
public class DettaglioMutuo extends PdfObj implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /**
     * Classe interna per rappresentare una singola rata insoluta
     */
    public static class RataInsoluta {
        private String riferimentoRata; // es. 200601 = anno 2006, mese gennaio 01
        private int numeroRataProgressivo;
        private double valoreRata;
        private double valoreMoraPercentuale;
        
        public RataInsoluta() {}
        
        public RataInsoluta(String riferimentoRata, int numeroRataProgressivo, double valoreRata, double valoreMoraPercentuale) {
            this.riferimentoRata = riferimentoRata;
            this.numeroRataProgressivo = numeroRataProgressivo;
            this.valoreRata = valoreRata;
            this.valoreMoraPercentuale = valoreMoraPercentuale;
        }
        
        // === GETTER E SETTER ===
        public String getRiferimentoRata() { return riferimentoRata; }
        public void setRiferimentoRata(String riferimentoRata) { this.riferimentoRata = riferimentoRata; }
        
        public int getNumeroRataProgressivo() { return numeroRataProgressivo; }
        public void setNumeroRataProgressivo(int numeroRataProgressivo) { this.numeroRataProgressivo = numeroRataProgressivo; }
        
        public double getValoreRata() { return valoreRata; }
        public void setValoreRata(double valoreRata) { this.valoreRata = valoreRata; }
        
        public double getValoreMoraPercentuale() { return valoreMoraPercentuale; }
        public void setValoreMoraPercentuale(double valoreMoraPercentuale) { this.valoreMoraPercentuale = valoreMoraPercentuale; }
    }
    
    // === CAMPI DELLA CLASSE ===
    
    // === CAMPI DELLA LETTERA M001 ===
    private String nome;
    private String cognome;
    private String indirizzo;
    private String citta;
    private String cap;
    private String dataInizio;
    private String dataFine;
    private String dataAccredito;
    private String dataValuta;
    private String importo;
    
    // Dati per lettera M003
    
    // Dati del mutuo
    private String numeroMutuo;
    private String periodoRiferimento;
    private List<RataInsoluta> rateInsolute;
    
    // Dati del mutuario
    private String cognomeMutuario;
    private String nomeMutuario;
    
    // Indirizzo immobile
    private String viaImmobile;
    private String capImmobile;
    private String cittaImmobile;
    
    // Dati degli eredi
    private String cognomeErede;
    private String nomeErede;
    private int numeroEredi;
    
    // Dati del firmatario
    private String tipoFirmatario;
    private String firmatario;
    
    // Altri campi
    private String rateScadute;
    private String iban;
    
    // Dati per lettera M004
    private String destinatarioLettera;
    private String enteConcedente;
    private String codiceFiscaleMutuario;
    private String provinciaImmobile;
    private String civicoImmobile;
    private String dataRiferimentoDebito;
    private double debitoResiduoCapitale;
    
    // === COSTRUTTORE ===
    
    public DettaglioMutuo() {
        this.numeroEredi = 0;
        this.rateInsolute = new ArrayList<>();
    }
    
    // === GETTER E SETTER - CAMPI LETTERA M001 ===
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCognome() {
        return cognome;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public String getIndirizzo() {
        return indirizzo;
    }
    
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    public String getCitta() {
        return citta;
    }
    
    public void setCitta(String citta) {
        this.citta = citta;
    }
    
    public String getCap() {
        return cap;
    }
    
    public void setCap(String cap) {
        this.cap = cap;
    }
    
    public String getDataInizio() {
        return dataInizio;
    }
    
    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }
    
    public String getDataFine() {
        return dataFine;
    }
    
    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }
    
    public String getDataAccredito() {
        return dataAccredito;
    }
    
    public void setDataAccredito(String dataAccredito) {
        this.dataAccredito = dataAccredito;
    }
    
    public String getDataValuta() {
        return dataValuta;
    }
    
    public void setDataValuta(String dataValuta) {
        this.dataValuta = dataValuta;
    }
    
    public String getImporto() {
        return importo;
    }
    
    public void setImporto(String importo) {
        this.importo = importo;
    }
    
    // === GETTER E SETTER - DATI MUTUO ===
    
    public String getNumeroMutuo() {
        return numeroMutuo;
    }
    
    public void setNumeroMutuo(String numeroMutuo) {
        this.numeroMutuo = numeroMutuo;
    }
    
    public String getPeriodoRiferimento() {
        return periodoRiferimento;
    }
    
    public void setPeriodoRiferimento(String periodoRiferimento) {
        this.periodoRiferimento = periodoRiferimento;
    }
    
    // === GETTER E SETTER - DATI MUTUARIO ===
    
    public String getCognomeMutuario() {
        return cognomeMutuario;
    }
    
    public void setCognomeMutuario(String cognomeMutuario) {
        this.cognomeMutuario = cognomeMutuario;
    }
    
    public String getNomeMutuario() {
        return nomeMutuario;
    }
    
    public void setNomeMutuario(String nomeMutuario) {
        this.nomeMutuario = nomeMutuario;
    }
    
    // === GETTER E SETTER - INDIRIZZO IMMOBILE ===
    
    public String getViaImmobile() {
        return viaImmobile;
    }
    
    public void setViaImmobile(String viaImmobile) {
        this.viaImmobile = viaImmobile;
    }
    
    public String getCapImmobile() {
        return capImmobile;
    }
    
    public void setCapImmobile(String capImmobile) {
        this.capImmobile = capImmobile;
    }
    
    public String getCittaImmobile() {
        return cittaImmobile;
    }
    
    public void setCittaImmobile(String cittaImmobile) {
        this.cittaImmobile = cittaImmobile;
    }
    
    // === GETTER E SETTER - DATI EREDI ===
    
    public String getCognomeErede() {
        return cognomeErede;
    }
    
    public void setCognomeErede(String cognomeErede) {
        this.cognomeErede = cognomeErede;
    }
    
    public String getNomeErede() {
        return nomeErede;
    }
    
    public void setNomeErede(String nomeErede) {
        this.nomeErede = nomeErede;
    }
    
    public int getNumeroEredi() {
        return numeroEredi;
    }
    
    public void setNumeroEredi(int numeroEredi) {
        this.numeroEredi = numeroEredi;
    }
    
    // === GETTER E SETTER - FIRMATARIO ===
    
    public String getTipoFirmatario() {
        return tipoFirmatario;
    }
    
    public String getFirmatario() {
        return firmatario;
    }
    
    public void setFirmatario(String tipoFirmatario, String firmatario) {
        this.tipoFirmatario = tipoFirmatario;
        this.firmatario = firmatario;
    }
    
    // === GETTER E SETTER - ALTRI CAMPI ===
    
    public String getRateScadute() {
        return rateScadute;
    }
    
    public void setRateScadute(String rateScadute) {
        this.rateScadute = rateScadute;
    }
    
    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    // === GETTER E SETTER - DATI M004 ===
    public String getDestinatarioLettera() { return destinatarioLettera; }
    public void setDestinatarioLettera(String destinatarioLettera) { this.destinatarioLettera = destinatarioLettera; }

    public String getEnteConcedente() { return enteConcedente; }
    public void setEnteConcedente(String enteConcedente) { this.enteConcedente = enteConcedente; }

    public String getCodiceFiscaleMutuario() { return codiceFiscaleMutuario; }
    public void setCodiceFiscaleMutuario(String codiceFiscaleMutuario) { this.codiceFiscaleMutuario = codiceFiscaleMutuario; }

    public String getProvinciaImmobile() { return provinciaImmobile; }
    public void setProvinciaImmobile(String provinciaImmobile) { this.provinciaImmobile = provinciaImmobile; }

    public String getCivicoImmobile() { return civicoImmobile; }
    public void setCivicoImmobile(String civicoImmobile) { this.civicoImmobile = civicoImmobile; }

    public String getDataRiferimentoDebito() { return dataRiferimentoDebito; }
    public void setDataRiferimentoDebito(String dataRiferimentoDebito) { this.dataRiferimentoDebito = dataRiferimentoDebito; }

    public double getDebitoResiduoCapitale() { return debitoResiduoCapitale; }
    public void setDebitoResiduoCapitale(double debitoResiduoCapitale) { this.debitoResiduoCapitale = debitoResiduoCapitale; }
    
    // === METODI PER GESTIRE LE RATE INSOLUTE ===
    
    public List<RataInsoluta> getRateInsolute() {
        return rateInsolute;
    }
    
    public void setRateInsolute(List<RataInsoluta> rateInsolute) {
        this.rateInsolute = rateInsolute != null ? rateInsolute : new ArrayList<>();
    }
    
    public void aggiungiRataInsoluta(String riferimentoRata, int numeroRataProgressivo, double valoreRata, double valoreMoraPercentuale) {
        if (this.rateInsolute == null) {
            this.rateInsolute = new ArrayList<>();
        }
        this.rateInsolute.add(new RataInsoluta(riferimentoRata, numeroRataProgressivo, valoreRata, valoreMoraPercentuale));
    }
    
    public void aggiungiRataInsoluta(RataInsoluta rata) {
        if (this.rateInsolute == null) {
            this.rateInsolute = new ArrayList<>();
        }
        this.rateInsolute.add(rata);
    }
} 