package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class DettaglioCertificazioniTest {

    @Test
    public void testGettersAndSetters() {
        DettaglioCertificazioni dettagli = new DettaglioCertificazioni();
        
        // Test setter e getter per annoCertificazione
        String annoCertificazione = "2023";
        dettagli.setAnnoCertificazione(annoCertificazione);
        assertEquals(annoCertificazione, dettagli.getAnnoCertificazione());

        // Test setter e getter per dataEsecuzione
        Timestamp dataEsecuzione = Timestamp.valueOf("2024-01-01 10:00:00");
        dettagli.setDataEsecuzione(dataEsecuzione);
        assertEquals(dataEsecuzione, dettagli.getDataEsecuzione());

        // Test setter e getter per annoMutuo
        String annoMutuo = "2022";
        dettagli.setAnnoMutuo(annoMutuo);
        assertEquals(annoMutuo, dettagli.getAnnoMutuo());

        // Test setter e getter per progressivoMutuo
        String progressivoMutuo = "001";
        dettagli.setProgressivoMutuo(progressivoMutuo);
        assertEquals(progressivoMutuo, dettagli.getProgressivoMutuo());

        // Test setter e getter per matricola
        String matricola = "ABC123";
        dettagli.setMatricola(matricola);
        assertEquals(matricola, dettagli.getMatricola());

        // Test setter e getter per quotaCapitaleCertFisc
        Double quotaCapitaleCertFisc = 10000.50;
        dettagli.setQuotaCapitaleCertFisc(quotaCapitaleCertFisc);
        assertEquals(quotaCapitaleCertFisc, dettagli.getQuotaCapitaleCertFisc());

        // Test setter e getter per interessiPassiviCertFisc
        Double interessiPassiviCertFisc = 150.75;
        dettagli.setInteressiPassiviCertFisc(interessiPassiviCertFisc);
        assertEquals(interessiPassiviCertFisc, dettagli.getInteressiPassiviCertFisc());

        // Test setter e getter per interessiPreammCertFisc
        Double interessiPreammCertFisc = 75.30;
        dettagli.setInteressiPreammCertFisc(interessiPreammCertFisc);
        assertEquals(interessiPreammCertFisc, dettagli.getInteressiPreammCertFisc());

        // Test setter e getter per speseIstruttoriaCertFisc
        Double speseIstruttoriaCertFisc = 200.00;
        dettagli.setSpeseIstruttoriaCertFisc(speseIstruttoriaCertFisc);
        assertEquals(speseIstruttoriaCertFisc, dettagli.getSpeseIstruttoriaCertFisc());

        // Test setter e getter per impostaSostitutivaCertFisc
        Double impostaSostitutivaCertFisc = 50.00;
        dettagli.setImpostaSostitutivaCertFisc(impostaSostitutivaCertFisc);
        assertEquals(impostaSostitutivaCertFisc, dettagli.getImpostaSostitutivaCertFisc());

        // Test setter e getter per percentualeIntestazione
        Double percentualeIntestazione = 100.0;
        dettagli.setPercentualeIntestazione(percentualeIntestazione);
        assertEquals(percentualeIntestazione, dettagli.getPercentualeIntestazione());

        // Test setter e getter per tipoBeneficiario
        String tipoBeneficiario = "Persona Fisica";
        dettagli.setTipoBeneficiario(tipoBeneficiario);
        assertEquals(tipoBeneficiario, dettagli.getTipoBeneficiario());

        // Test setter e getter per codLet
        String codLet = "XYZ";
        dettagli.setCodLet(codLet);
        assertEquals(codLet, dettagli.getCodLet());

        // Test setter e getter per dataInizioPeriodo
        Timestamp dataInizioPeriodo = Timestamp.valueOf("2023-01-01 00:00:00");
        dettagli.setDataInizioPeriodo(dataInizioPeriodo);
        assertEquals(dataInizioPeriodo, dettagli.getDataInizioPeriodo());

        // Test setter e getter per dataFinePeriodo
        Timestamp dataFinePeriodo = Timestamp.valueOf("2023-12-31 23:59:59");
        dettagli.setDataFinePeriodo(dataFinePeriodo);
        assertEquals(dataFinePeriodo, dettagli.getDataFinePeriodo());
    }

    @Test
    public void testDefaultConstructor() {
        DettaglioCertificazioni dettagli = new DettaglioCertificazioni();
        assertNotNull(dettagli);
        assertNull(dettagli.getAnnoCertificazione());
        assertNull(dettagli.getDataEsecuzione());
        assertNull(dettagli.getAnnoMutuo());
        assertNull(dettagli.getProgressivoMutuo());
        assertNull(dettagli.getMatricola());
        assertNull(dettagli.getQuotaCapitaleCertFisc());
        assertNull(dettagli.getInteressiPassiviCertFisc());
        assertNull(dettagli.getInteressiPreammCertFisc());
        assertNull(dettagli.getSpeseIstruttoriaCertFisc());
        assertNull(dettagli.getImpostaSostitutivaCertFisc());
        assertNull(dettagli.getPercentualeIntestazione());
        assertNull(dettagli.getTipoBeneficiario());
        assertNull(dettagli.getCodLet());
        assertNull(dettagli.getDataInizioPeriodo());
        assertNull(dettagli.getDataFinePeriodo());
    }

    @Test
    public void testSettersWithNull() {
        DettaglioCertificazioni dettagli = new DettaglioCertificazioni();
        
        dettagli.setAnnoCertificazione(null);
        assertNull(dettagli.getAnnoCertificazione());

        dettagli.setDataEsecuzione(null);
        assertNull(dettagli.getDataEsecuzione());

        dettagli.setAnnoMutuo(null);
        assertNull(dettagli.getAnnoMutuo());

        dettagli.setProgressivoMutuo(null);
        assertNull(dettagli.getProgressivoMutuo());

        dettagli.setMatricola(null);
        assertNull(dettagli.getMatricola());

        dettagli.setQuotaCapitaleCertFisc(null);
        assertNull(dettagli.getQuotaCapitaleCertFisc());

        dettagli.setInteressiPassiviCertFisc(null);
        assertNull(dettagli.getInteressiPassiviCertFisc());

        dettagli.setInteressiPreammCertFisc(null);
        assertNull(dettagli.getInteressiPreammCertFisc());

        dettagli.setSpeseIstruttoriaCertFisc(null);
        assertNull(dettagli.getSpeseIstruttoriaCertFisc());

        dettagli.setImpostaSostitutivaCertFisc(null);
        assertNull(dettagli.getImpostaSostitutivaCertFisc());

        dettagli.setPercentualeIntestazione(null);
        assertNull(dettagli.getPercentualeIntestazione());

        dettagli.setTipoBeneficiario(null);
        assertNull(dettagli.getTipoBeneficiario());

        dettagli.setCodLet(null);
        assertNull(dettagli.getCodLet());

        dettagli.setDataInizioPeriodo(null);
        assertNull(dettagli.getDataInizioPeriodo());

        dettagli.setDataFinePeriodo(null);
        assertNull(dettagli.getDataFinePeriodo());
    }
}
