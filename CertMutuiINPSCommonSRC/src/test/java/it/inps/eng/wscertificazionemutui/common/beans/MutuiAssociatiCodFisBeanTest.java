package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class MutuiAssociatiCodFisBeanTest {
	
	// Create an instance of the bean
    private MutuiAssociatiCodFisBean bean = new MutuiAssociatiCodFisBean();

    @Test
    public void testGettersAndSetters() {
        
        // Test setter and getter for sedeDesc
        bean.setSedeDesc("Head Office");
        assertEquals("Head Office", bean.getSedeDesc());

        // Test setter and getter for cognome
        bean.setCognome("Rossi");
        assertEquals("Rossi", bean.getCognome());

        // Test setter and getter for nome
        bean.setNome("Mario");
        assertEquals("Mario", bean.getNome());

        // Test setter and getter for matricola
        bean.setMatricola("123456");
        assertEquals("123456", bean.getMatricola());

        // Test setter and getter for sede
        bean.setSede("Branch A");
        assertEquals("Branch A", bean.getSede());

        // Test setter and getter for annoMutuo
        bean.setAnnoMutuo("2024");
        assertEquals("2024", bean.getAnnoMutuo());

        // Test setter and getter for progMutuo
        bean.setProgMutuo("001");
        assertEquals("001", bean.getProgMutuo());

        // Test setter and getter for numeroDomanda
        bean.setNumeroDomanda("2024/001");
        assertEquals("2024/001", bean.getNumeroDomanda());

        // Test setter and getter for voceContabile
        bean.setVoceContabile("Account 1");
        assertEquals("Account 1", bean.getVoceContabile());

        // Test setter and getter for statoMutuo
        bean.setStatoMutuo("Active");
        assertEquals("Active", bean.getStatoMutuo());

        // Test setter and getter for descStatoMutuo
        bean.setDescStatoMutuo("Mutuo attivo");
        assertEquals("Mutuo attivo", bean.getDescStatoMutuo());

        // Test setter and getter for tpEvn
        bean.setTpEvn("Type1");
        assertEquals("Type1", bean.getTpEvn());

        // Test setter and getter for tpBen
        bean.setTpBen("TypeB");
        assertEquals("TypeB", bean.getTpBen());

        // Test setter and getter for tipologiaMutuo
        bean.setTipologiaMutuo("Personal");
        assertEquals("Personal", bean.getTipologiaMutuo());

        // Test setter and getter for descTipologiaMutuo
        bean.setDescTipologiaMutuo("Mutuo personale");
        assertEquals("Mutuo personale", bean.getDescTipologiaMutuo());

        // Test setter and getter for motCess
        bean.setMotCess("Reason1");
        assertEquals("Reason1", bean.getMotCess());

        // Test setter and getter for descCess
        bean.setDescCess("Descrizione cessazione");
        assertEquals("Descrizione cessazione", bean.getDescCess());

        // Test setter and getter for statoIntestatario
        bean.setStatoIntestatario("Attivo");
        assertEquals("Attivo", bean.getStatoIntestatario());

        // Test setter and getter for descTipoEvento
        bean.setDescTipoEvento("Evento tipo 1");
        assertEquals("Evento tipo 1", bean.getDescTipoEvento());

        // Test setter and getter for descStatoEvento
        bean.setDescStatoEvento("Stato evento 1");
        assertEquals("Stato evento 1", bean.getDescStatoEvento());

        // Test setter and getter for descTipoTasso
        bean.setDescTipoTasso("Tipo Tasso 1");
        assertEquals("Tipo Tasso 1", bean.getDescTipoTasso());

        // Test setter and getter for descTipoBeneficiario
        bean.setDescTipoBeneficiario("Beneficiario 1");
        assertEquals("Beneficiario 1", bean.getDescTipoBeneficiario());

        // Test setter and getter for descTipoPagamento
        bean.setDescTipoPagamento("Pagamento 1");
        assertEquals("Pagamento 1", bean.getDescTipoPagamento());

        // Test setter and getter for intestatarioPrincipale
        bean.setIntestatarioPrincipale("Giovanni");
        assertEquals("Giovanni", bean.getIntestatarioPrincipale());

        // Test setter and getter for frequenzaRate
        bean.setFrequenzaRate("Mensile");
        assertEquals("Mensile", bean.getFrequenzaRate());

        // Test setter and getter for annnoMeseRiferimento
        bean.setAnnnoMeseRiferimento("2024-09");
        assertEquals("2024-09", bean.getAnnnoMeseRiferimento());

        // Test setter and getter for annoMeseOperazione
        bean.setAnnoMeseOperazione("2024-09");
        assertEquals("2024-09", bean.getAnnoMeseOperazione());

        // Test setter and getter for ST_MOV
        bean.setST_MOV("MOV001");
        assertEquals("MOV001", bean.getST_MOV());

        // Test setter and getter for TP_MOV
        bean.setTP_MOV("MOV_TYPE1");
        assertEquals("MOV_TYPE1", bean.getTP_MOV());

        // Test setter and getter for descStatoMov
        bean.setDescStatoMov("Stato Movimento 1");
        assertEquals("Stato Movimento 1", bean.getDescStatoMov());

        // Test setter and getter for descTipoMov
        bean.setDescTipoMov("Tipo Movimento 1");
        assertEquals("Tipo Movimento 1", bean.getDescTipoMov());

        // Test setter and getter for segnoMov
        bean.setSegnoMov("Positivo");
        assertEquals("Positivo", bean.getSegnoMov());

        // Test setter and getter for dtPgm
        bean.setDtPgm("2024-09-01");
        assertEquals("2024-09-01", bean.getDtPgm());

        // Test setter and getter for tpPgm
        bean.setTpPgm("TypePGM1");
        assertEquals("TypePGM1", bean.getTpPgm());

        // Test setter and getter for dataScadenzaPrimaDellEstinzione
        bean.setDataScadenzaPrimaDellEstinzione("2024-12-31");
        assertEquals("2024-12-31", bean.getDataScadenzaPrimaDellEstinzione());

        // Test setter and getter for nuovoImportoRata
        bean.setNuovoImportoRata("500.00");
        assertEquals("500.00", bean.getNuovoImportoRata());

        // Test setter and getter for dataScadenzaDopoEstinzione
        bean.setDataScadenzaDopoEstinzione("2025-12-31");
        assertEquals("2025-12-31", bean.getDataScadenzaDopoEstinzione());

        // Test setter and getter for nuovoNumeroRateResidue
        bean.setNuovoNumeroRateResidue("24");
        assertEquals("24", bean.getNuovoNumeroRateResidue());

        // Test setter and getter for debitoResiduo
        bean.setDebitoResiduo(10000.00);
        assertEquals(10000.00, bean.getDebitoResiduo());

        // Test setter and getter for importoRata
        bean.setImportoRata(1500.00);
        assertEquals(1500.00, bean.getImportoRata());

        // Test setter and getter for rateTotali
        bean.setRateTotali(120.00);
        assertEquals(120.00, bean.getRateTotali());

        // Test setter and getter for importoEstinzioni
        bean.setImportoEstinzioni(1000.00);
        assertEquals(1000.00, bean.getImportoEstinzioni());

        // Test setter and getter for prossimaRata
        bean.setProssimaRata(800.00);
        assertEquals(800.00, bean.getProssimaRata());

        // Test setter and getter for tasso
        bean.setTasso(5.00);
        assertEquals(5.00, bean.getTasso());

        // Test setter and getter for percentualeDiIntestazione
        bean.setPercentualeDiIntestazione(25.00);
        assertEquals(25.00, bean.getPercentualeDiIntestazione());

        // Test setter and getter for importoMutuo
        bean.setImportoMutuo(50000.00);
        assertEquals(50000.00, bean.getImportoMutuo());

        // Test setter and getter for numeroRate
        bean.setNumeroRate(30.00);
        assertEquals(30.00, bean.getNumeroRate());

        // Test setter and getter for impostaSostitutivaIntestatario
        bean.setImpostaSostitutivaIntestatario(2000.00);
        assertEquals(2000.00, bean.getImpostaSostitutivaIntestatario());

        // Test setter and getter for interessiPreammortamento
        bean.setInteressiPreammortamento(500.00);
        assertEquals(500.00, bean.getInteressiPreammortamento());

        // Test setter and getter for intestatarioPrincipale
        bean.setIntestatarioPrincipale("John Doe");
        assertEquals("John Doe", bean.getIntestatarioPrincipale());

        // Test setter and getter for dataStipula
        Date dataStipula = new Date();
        bean.setDataStipula(dataStipula);
        assertEquals(dataStipula, bean.getDataStipula());

        // Test setter and getter for numeroProtocollo
        bean.setNumeroProtocollo(12345.00);
        assertEquals(12345.00, bean.getNumeroProtocollo());

        // Test setter and getter for importoEstinzioni
        bean.setImportoEstinzioni(1000.00);
        assertEquals(1000.00, bean.getImportoEstinzioni());

        // Test setter and getter for dataScadenza
        Date now = new Date();
        bean.setDataScadenza(now);
        assertEquals(now, bean.getDataScadenza());

        // Additional tests can be added as needed
    }
    
    @Test
    public void testSetGetDetrazioneFiscale() {
        Double detrazioneFiscale = 1234.56;
        bean.setDetrazioneFiscale(detrazioneFiscale);
        assertEquals(detrazioneFiscale, bean.getDetrazioneFiscale());
    }

    @Test
    public void testSetGetImportoMov() {
        Double importoMov = 7890.12;
        bean.setImportoMov(importoMov);
        assertEquals(importoMov, bean.getImportoMov());
    }

    @Test
    public void testSetGetSpeseIstruttoria() {
        Double speseIstruttoria = 100.50;
        bean.setSpeseIstruttoria(speseIstruttoria);
        assertEquals(speseIstruttoria, bean.getSpeseIstruttoria());
    }

    @Test
    public void testSetGetImportoPrimoAcconto() {
        Double importoPrimoAcconto = 2000.00;
        bean.setImportoPrimoAcconto(importoPrimoAcconto);
        assertEquals(importoPrimoAcconto, bean.getImportoPrimoAcconto());
    }

    @Test
    public void testSetGetImportoSecondoAcconto() {
        Double importoSecondoAcconto = 3000.00;
        bean.setImportoSecondoAcconto(importoSecondoAcconto);
        assertEquals(importoSecondoAcconto, bean.getImportoSecondoAcconto());
    }

    @Test
    public void testSetGetImportoSaldo() {
        Double importoSaldo = 500.00;
        bean.setImportoSaldo(importoSaldo);
        assertEquals(importoSaldo, bean.getImportoSaldo());
    }

    @Test
    public void testSetGetIntPreamPrimoAcconto() {
        Double intPreamPrimoAcconto = 100.00;
        bean.setIntPreamPrimoAcconto(intPreamPrimoAcconto);
        assertEquals(intPreamPrimoAcconto, bean.getIntPreamPrimoAcconto());
    }

    @Test
    public void testSetGetIntPreamSecondoAcconto() {
        Double intPreamSecondoAcconto = 150.00;
        bean.setIntPreamSecondoAcconto(intPreamSecondoAcconto);
        assertEquals(intPreamSecondoAcconto, bean.getIntPreamSecondoAcconto());
    }

    @Test
    public void testSetGetIntPreamSaldo() {
        Double intPreamSaldo = 200.00;
        bean.setIntPreamSaldo(intPreamSaldo);
        assertEquals(intPreamSaldo, bean.getIntPreamSaldo());
    }

    @Test
    public void testSetGetInteressi() {
        String interessi = "Interessi Variabili";
        bean.setInteressi(interessi);
        assertEquals(interessi, bean.getInteressi());
    }

    @Test
    public void testSetGetDataNascitaMutuo() {
        Date dataNascitaMutuo = new Date();
        bean.setDataNascitaMutuo(dataNascitaMutuo);
        assertEquals(dataNascitaMutuo, bean.getDataNascitaMutuo());
    }

    @Test
    public void testSetGetDataErogazione() {
        Date dataErogazione = new Date();
        bean.setDataErogazione(dataErogazione);
        assertEquals(dataErogazione, bean.getDataErogazione());
    }

    @Test
    public void testSetGetDataChiusura() {
        Date dataChiusura = new Date();
        bean.setDataChiusura(dataChiusura);
        assertEquals(dataChiusura, bean.getDataChiusura());
    }

    @Test
    public void testSetGetDataErogPrimoAcconto() {
        Date dataErogPrimoAcconto = new Date();
        bean.setDataErogPrimoAcconto(dataErogPrimoAcconto);
        assertEquals(dataErogPrimoAcconto, bean.getDataErogPrimoAcconto());
    }

    @Test
    public void testSetGetDataErogSecondoAcconto() {
        Date dataErogSecondoAcconto = new Date();
        bean.setDataErogSecondoAcconto(dataErogSecondoAcconto);
        assertEquals(dataErogSecondoAcconto, bean.getDataErogSecondoAcconto());
    }

    @Test
    public void testSetGetDataErogSaldo() {
        Date dataErogSaldo = new Date();
        bean.setDataErogSaldo(dataErogSaldo);
        assertEquals(dataErogSaldo, bean.getDataErogSaldo());
    }

    @Test
    public void testSetGetDataProtocollo() {
        Date dataProtocollo = new Date();
        bean.setDataProtocollo(dataProtocollo);
        assertEquals(dataProtocollo, bean.getDataProtocollo());
    }

    @Test
    public void testSetGetDataDecorrenza() {
        Date dataDecorrenza = new Date();
        bean.setDataDecorrenza(dataDecorrenza);
        assertEquals(dataDecorrenza, bean.getDataDecorrenza());
    }

    @Test
    public void testSetGetInteressiPreammortamentoTrattenuta() {
        String interessiPreammortamentoTrattenuta = "Trattenuta";
        bean.setInteressiPreammortamentoTrattenuta(interessiPreammortamentoTrattenuta);
        assertEquals(interessiPreammortamentoTrattenuta, bean.getInteressiPreammortamentoTrattenuta());
    }

    @Test
    public void testSetGetProgressivoRata() {
        Double progressivoRata = 10.0;
        bean.setProgressivoRata(progressivoRata);
        assertEquals(progressivoRata, bean.getProgressivoRata());
    }

    @Test
    public void testSetGetResidenza() {
        String residenza = "Via Roma 1";
        bean.setResidenza(residenza);
        assertEquals(residenza, bean.getResidenza());
    }

    @Test
    public void testSetGetFraseResidenza() {
        String fraseResidenza = "Residente a Roma";
        bean.setFraseResidenza(fraseResidenza);
        assertEquals(fraseResidenza, bean.getFraseResidenza());
    }
}
