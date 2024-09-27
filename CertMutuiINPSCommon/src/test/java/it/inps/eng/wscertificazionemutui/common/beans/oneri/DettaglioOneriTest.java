package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.junit.jupiter.api.Test;

public class DettaglioOneriTest {

    @Test
    public void testDefaultConstructor() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        assertNull(dettaglioOneri.getAnnoCertificazione());
        assertNull(dettaglioOneri.getDataEsecuzione());
        assertNull(dettaglioOneri.getAnnoMutuo());
        assertNull(dettaglioOneri.getProgressivoMutuo());
        assertNull(dettaglioOneri.getSottoProgressivoMutuo());
        assertNull(dettaglioOneri.getCodFiscIntestatario());
        assertNull(dettaglioOneri.getMatricola());
        assertNull(dettaglioOneri.getTotaleRate());
        assertNull(dettaglioOneri.getTotaleInteressi());
        assertNull(dettaglioOneri.getPercentualeIntestazione());
        assertNull(dettaglioOneri.getTotRateSingoloInt());
        assertNull(dettaglioOneri.getTotInteressiSingoloInt());
        assertNull(dettaglioOneri.getDataInizioPeriodo());
        assertNull(dettaglioOneri.getDataFinePeriodo());
        assertNull(dettaglioOneri.getEnte());
    }

    @Test
    public void testParameterizedConstructor() {
        Timestamp dataEsecuzione = new Timestamp(System.currentTimeMillis());
        Timestamp dataInizioPeriodo = new Timestamp(System.currentTimeMillis() - 1000000);
        Timestamp dataFinePeriodo = new Timestamp(System.currentTimeMillis() + 1000000);
        BigDecimal percentualeIntestazione = new BigDecimal("50.5");

        DettaglioOneri dettaglioOneri = new DettaglioOneri(
            "2023", dataEsecuzione, "2022", "001", "002", 
            "ABC123XYZ", "12345", 12, 5000, 
            percentualeIntestazione, 6, 3000, dataInizioPeriodo, dataFinePeriodo
        );

        assertEquals("2023", dettaglioOneri.getAnnoCertificazione());
        assertEquals(dataEsecuzione, dettaglioOneri.getDataEsecuzione());
        assertEquals("2022", dettaglioOneri.getAnnoMutuo());
        assertEquals("001", dettaglioOneri.getProgressivoMutuo());
        assertEquals("002", dettaglioOneri.getSottoProgressivoMutuo());
        assertEquals("ABC123XYZ", dettaglioOneri.getCodFiscIntestatario());
        assertEquals("12345", dettaglioOneri.getMatricola());
        assertEquals(12, dettaglioOneri.getTotaleRate());
        assertEquals(5000, dettaglioOneri.getTotaleInteressi());
        assertEquals(percentualeIntestazione, dettaglioOneri.getPercentualeIntestazione());
        assertEquals(6, dettaglioOneri.getTotRateSingoloInt());
        assertEquals(3000, dettaglioOneri.getTotInteressiSingoloInt());
        assertEquals(dataInizioPeriodo, dettaglioOneri.getDataInizioPeriodo());
        assertEquals(dataFinePeriodo, dettaglioOneri.getDataFinePeriodo());
    }

    @Test
    public void testGetAndSetAnnoCertificazione() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setAnnoCertificazione("2023");
        assertEquals("2023", dettaglioOneri.getAnnoCertificazione());
    }

    @Test
    public void testGetAndSetDataEsecuzione() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        Timestamp dataEsecuzione = new Timestamp(System.currentTimeMillis());
        dettaglioOneri.setDataEsecuzione(dataEsecuzione);
        assertEquals(dataEsecuzione, dettaglioOneri.getDataEsecuzione());
    }

    @Test
    public void testGetAndSetAnnoMutuo() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setAnnoMutuo("2022");
        assertEquals("2022", dettaglioOneri.getAnnoMutuo());
    }

    @Test
    public void testGetAndSetProgressivoMutuo() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setProgressivoMutuo("001");
        assertEquals("001", dettaglioOneri.getProgressivoMutuo());
    }

    @Test
    public void testGetAndSetSottoProgressivoMutuo() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setSottoProgressivoMutuo("002");
        assertEquals("002", dettaglioOneri.getSottoProgressivoMutuo());
    }

    @Test
    public void testGetAndSetCodFiscIntestatario() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setCodFiscIntestatario("ABC123XYZ");
        assertEquals("ABC123XYZ", dettaglioOneri.getCodFiscIntestatario());
    }

    @Test
    public void testGetAndSetMatricola() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setMatricola("12345");
        assertEquals("12345", dettaglioOneri.getMatricola());
    }

    @Test
    public void testGetAndSetTotaleRate() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setTotaleRate(12);
        assertEquals(12, dettaglioOneri.getTotaleRate());
    }

    @Test
    public void testGetAndSetTotaleInteressi() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setTotaleInteressi(5000);
        assertEquals(5000, dettaglioOneri.getTotaleInteressi());
    }

    @Test
    public void testGetAndSetPercentualeIntestazione() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        BigDecimal percentuale = new BigDecimal("50.5");
        dettaglioOneri.setPercentualeIntestazione(percentuale);
        assertEquals(percentuale, dettaglioOneri.getPercentualeIntestazione());
    }

    @Test
    public void testGetAndSetTotRateSingoloInt() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setTotRateSingoloInt(6);
        assertEquals(6, dettaglioOneri.getTotRateSingoloInt());
    }

    @Test
    public void testGetAndSetTotInteressiSingoloInt() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setTotInteressiSingoloInt(3000);
        assertEquals(3000, dettaglioOneri.getTotInteressiSingoloInt());
    }

    @Test
    public void testGetAndSetEnte() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        dettaglioOneri.setEnte("Comune di Milano");
        assertEquals("Comune di Milano", dettaglioOneri.getEnte());
    }

    @Test
    public void testGetAndSetDataInizioPeriodo() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        Timestamp dataInizio = new Timestamp(System.currentTimeMillis());
        dettaglioOneri.setDataInizioPeriodo(dataInizio);
        assertEquals(dataInizio, dettaglioOneri.getDataInizioPeriodo());
    }

    @Test
    public void testGetAndSetDataFinePeriodo() {
        DettaglioOneri dettaglioOneri = new DettaglioOneri();
        Timestamp dataFine = new Timestamp(System.currentTimeMillis());
        dettaglioOneri.setDataFinePeriodo(dataFine);
        assertEquals(dataFine, dettaglioOneri.getDataFinePeriodo());
    }
}
