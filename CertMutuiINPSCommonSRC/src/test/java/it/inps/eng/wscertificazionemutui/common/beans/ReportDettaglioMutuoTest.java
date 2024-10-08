package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportDettaglioMutuoTest {
    
    private ReportDettaglioMutuo report;

    @BeforeEach
    public void setUp() {
        report = new ReportDettaglioMutuo();
    }

    @Test
    public void testGettersAndSetters() {
        // Prepare test data
        String annoMutuo = "2024";
        String progressivoMutuo = "001";
        Double importoMutuo = 100000.00;
        Integer numRateTotali = 12;
        Integer numRateResidue = 8;
        String tipoMutuo = "Standard";
        Double tassoAttuale = 3.5;
        Double importoRata = 850.00;

        String mtrInt = "12345";
        String mtrCoInt = "67890";
        Double importoImpostaSostitutivaInt = 1500.00;
        Double importoImpostaSostitutivaCoInt = 2000.00;
        Date dataPagImpostaSostInt = new Date();
        Date dataPagImpostaSostCoInt = new Date();
        Date dataStipula = new Date();
        Double speseIstruttoria = 1000.00;
        Double importoEstinzioneAnticipata = 50000.00;
        Date dataScadenzaPrevista = new Date();
        Integer frequenzaRate = 6;
        String voceContabile = "Voce 1";
        String tipoTasso = "Fisso";
        Date dataNascitaMutuo = new Date();
        Date dataErogazione = new Date();
        Double interessiPreammortamento = 2000.00;
        Date dataChiusura = new Date();
        
        Double importoMutuoEcd = 120000.00;
        Double tassoAttualeEcd = 3.8;
        Double importoRataEcd = 900.00;
        Double importoEstinzioneAnticipataEcd = 60000.00;
        String tipoTassoEcd = "Variabile";
        Double interessiPreammortamentoEcd = 2500.00;

        Double importoMutuoPriAcc = 30000.00;
        Date dataErogazionePriAcc = new Date();
        Double interessiPreammortamentoPriAcc = 1000.00;
        Double importoMutuoSecAcc = 20000.00;
        Date dataErogazioneSecAcc = new Date();
        Double interessiPreammortamentoSecAcc = 800.00;
        Double importoMutuoSaldo = 50000.00;
        Date dataErogazioneSaldo = new Date();
        Double interessiPreammortamentoSaldo = 1500.00;

        Double interessiPreammortamentoRimborso = 500.00;
        Double interessiPreammortamentoTrattenuta = 200.00;
        Double interessiRimborso = 1000.00;
        Double interessiTrattenuta = 300.00;

        boolean detrazioneFiscale = true;

        String email = "test@example.com";
        String tel = "1234567890";
        String cell = "0987654321";
        String note = "Note di test";

        String annoInizioErogazione = "2024";
        String meseInizioErogazione = "09";

        boolean flagGestAcconti = false;

        // Set values
        report.setAnnoMutuo(annoMutuo);
        report.setProgressivoMutuo(progressivoMutuo);
        report.setImportoMutuo(importoMutuo);
        report.setNumRateTotali(numRateTotali);
        report.setNumRateResidue(numRateResidue);
        report.setTipoMutuo(tipoMutuo);
        report.setTassoAttuale(tassoAttuale);
        report.setImportoRata(importoRata);

        report.setMtrInt(mtrInt);
        report.setMtrCoInt(mtrCoInt);
        report.setImportoImpostaSostitutivaInt(importoImpostaSostitutivaInt);
        report.setImportoImpostaSostitutivaCoInt(importoImpostaSostitutivaCoInt);
        report.setDataPagImpostaSostInt(dataPagImpostaSostInt);
        report.setDataPagImpostaSostCoInt(dataPagImpostaSostCoInt);
        report.setDataStipula(dataStipula);
        report.setSpeseIstruttoria(speseIstruttoria);
        report.setImportoEstinzioneAnticipata(importoEstinzioneAnticipata);
        report.setDataScadenzaPrevista(dataScadenzaPrevista);
        report.setFrequenzaRate(frequenzaRate);
        report.setVoceContabile(voceContabile);
        report.setTipoTasso(tipoTasso);
        report.setDataNascitaMutuo(dataNascitaMutuo);
        report.setDataErogazione(dataErogazione);
        report.setInteressiPreammortamento(interessiPreammortamento);
        report.setDataChiusura(dataChiusura);

        report.setImportoMutuoEcd(importoMutuoEcd);
        report.setTassoAttualeEcd(tassoAttualeEcd);
        report.setImportoRataEcd(importoRataEcd);
        report.setImportoEstinzioneAnticipataEcd(importoEstinzioneAnticipataEcd);
        report.setTipoTassoEcd(tipoTassoEcd);
        report.setInteressiPreammortamentoEcd(interessiPreammortamentoEcd);

        report.setImportoMutuoPriAcc(importoMutuoPriAcc);
        report.setDataErogazionePriAcc(dataErogazionePriAcc);
        report.setInteressiPreammortamentoPriAcc(interessiPreammortamentoPriAcc);
        report.setImportoMutuoSecAcc(importoMutuoSecAcc);
        report.setDataErogazioneSecAcc(dataErogazioneSecAcc);
        report.setInteressiPreammortamentoSecAcc(interessiPreammortamentoSecAcc);
        report.setImportoMutuoSaldo(importoMutuoSaldo);
        report.setDataErogazioneSaldo(dataErogazioneSaldo);
        report.setInteressiPreammortamentoSaldo(interessiPreammortamentoSaldo);

        report.setInteressiPreammortamentoRimborso(interessiPreammortamentoRimborso);
        report.setInteressiPreammortamentoTrattenuta(interessiPreammortamentoTrattenuta);
        report.setInteressiRimborso(interessiRimborso);
        report.setInteressiTrattenuta(interessiTrattenuta);

        report.setDetrazioneFiscale(detrazioneFiscale);

        report.setEmail(email);
        report.setTel(tel);
        report.setCell(cell);
        report.setNote(note);

        report.setAnnoInizioErogazione(annoInizioErogazione);
        report.setMeseInizioErogazione(meseInizioErogazione);

        report.setFlagGestAcconti(flagGestAcconti);

        // Assertions
        assertEquals(annoMutuo, report.getAnnoMutuo());
        assertEquals(progressivoMutuo, report.getProgressivoMutuo());
        assertEquals(importoMutuo, report.getImportoMutuo());
        assertEquals(numRateTotali, report.getNumRateTotali());
        assertEquals(numRateResidue, report.getNumRateResidue());
        assertEquals(tipoMutuo, report.getTipoMutuo());
        assertEquals(tassoAttuale, report.getTassoAttuale());
        assertEquals(importoRata, report.getImportoRata());

        assertEquals(mtrInt, report.getMtrInt());
        assertEquals(mtrCoInt, report.getMtrCoInt());
        assertEquals(importoImpostaSostitutivaInt, report.getImportoImpostaSostitutivaInt());
        assertEquals(importoImpostaSostitutivaCoInt, report.getImportoImpostaSostitutivaCoInt());
        assertEquals(dataPagImpostaSostInt, report.getDataPagImpostaSostInt());
        assertEquals(dataPagImpostaSostCoInt, report.getDataPagImpostaSostCoInt());
        assertEquals(dataStipula, report.getDataStipula());
        assertEquals(speseIstruttoria, report.getSpeseIstruttoria());
        assertEquals(importoEstinzioneAnticipata, report.getImportoEstinzioneAnticipata());
        assertEquals(dataScadenzaPrevista, report.getDataScadenzaPrevista());
        assertEquals(frequenzaRate, report.getFrequenzaRate());
        assertEquals(voceContabile, report.getVoceContabile());
        assertEquals(tipoTasso, report.getTipoTasso());
        assertEquals(dataNascitaMutuo, report.getDataNascitaMutuo());
        assertEquals(dataErogazione, report.getDataErogazione());
        assertEquals(interessiPreammortamento, report.getInteressiPreammortamento());
        assertEquals(dataChiusura, report.getDataChiusura());

        assertEquals(importoMutuoEcd, report.getImportoMutuoEcd());
        assertEquals(tassoAttualeEcd, report.getTassoAttualeEcd());
        assertEquals(importoRataEcd, report.getImportoRataEcd());
        assertEquals(importoEstinzioneAnticipataEcd, report.getImportoEstinzioneAnticipataEcd());
        assertEquals(tipoTassoEcd, report.getTipoTassoEcd());
        assertEquals(interessiPreammortamentoEcd, report.getInteressiPreammortamentoEcd());

        assertEquals(importoMutuoPriAcc, report.getImportoMutuoPriAcc());
        assertEquals(dataErogazionePriAcc, report.getDataErogazionePriAcc());
        assertEquals(interessiPreammortamentoPriAcc, report.getInteressiPreammortamentoPriAcc());
        assertEquals(importoMutuoSecAcc, report.getImportoMutuoSecAcc());
        assertEquals(dataErogazioneSecAcc, report.getDataErogazioneSecAcc());
        assertEquals(interessiPreammortamentoSecAcc, report.getInteressiPreammortamentoSecAcc());
        assertEquals(importoMutuoSaldo, report.getImportoMutuoSaldo());
        assertEquals(dataErogazioneSaldo, report.getDataErogazioneSaldo());
        assertEquals(interessiPreammortamentoSaldo, report.getInteressiPreammortamentoSaldo());

        assertEquals(interessiPreammortamentoRimborso, report.getInteressiPreammortamentoRimborso());
        assertEquals(interessiPreammortamentoTrattenuta, report.getInteressiPreammortamentoTrattenuta());
        assertEquals(interessiRimborso, report.getInteressiRimborso());
        assertEquals(interessiTrattenuta, report.getInteressiTrattenuta());

        assertTrue(report.isDetrazioneFiscale());

        assertEquals(email, report.getEmail());
        assertEquals(tel, report.getTel());
        assertEquals(cell, report.getCell());
        assertEquals(note, report.getNote());

        assertEquals(annoInizioErogazione, report.getAnnoInizioErogazione());
        assertEquals(meseInizioErogazione, report.getMeseInizioErogazione());
        
        
        // Assert that the default value of flagGestAcconti is false
        assertFalse(report.isFlagGestAcconti(), "Default value of flagGestAcconti should be false");
        

    }

}
