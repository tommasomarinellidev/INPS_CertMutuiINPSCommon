package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class ReportOneriDeducibili2010Test {

    @Test
    public void testGetAndSetAnnoMutuo() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setAnnoMutuo("2020");
        assertEquals("2020", report.getAnnoMutuo());
    }

    @Test
    public void testGetAndSetProgressivoMutuo() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setProgressivoMutuo("001");
        assertEquals("001", report.getProgressivoMutuo());
    }

    @Test
    public void testGetAndSetSede() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setSede("Roma");
        assertEquals("Roma", report.getSede());
    }

    @Test
    public void testGetAndSetProgressivoIntestatari() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setProgressivoIntestatari("01");
        assertEquals("01", report.getProgressivoIntestatari());
    }

    @Test
    public void testGetAndSetDataStipula() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setDataStipula("2020-01-01");
        assertEquals("2020-01-01", report.getDataStipula());
    }

    @Test
    public void testGetAndSetAmmontareOrigiario() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setAmmontareOrigiario("100000");
        assertEquals("100000", report.getAmmontareOrigiario());
    }

    @Test
    public void testGetAndSetRate() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setRate("12");
        assertEquals("12", report.getRate());
    }

    @Test
    public void testGetAndSetRateDouble() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setRateDouble(1200.50);
        assertEquals(1200.50, report.getRateDouble(), 0.001);
    }

    @Test
    public void testGetAndSetTotRateDouble() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setTotRateDouble(1500.75);
        assertEquals(1500.75, report.getTotRateDouble(), 0.001);
    }

    @Test
    public void testGetAndSetInteressiOneri() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setInteressiOneri("500");
        assertEquals("500", report.getInteressiOneri());
    }

    @Test
    public void testGetAndSetInteressiDouble() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setInteressiDouble(200.25);
        assertEquals(200.25, report.getInteressiDouble(), 0.001);
    }

    @Test
    public void testGetAndSetTotInteressiDouble() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setTotInteressiDouble(300.75);
        assertEquals(300.75, report.getTotInteressiDouble(), 0.001);
    }

    @Test
    public void testGetAndSetNumeroIntestatari() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setNumeroIntestatari("2");
        assertEquals("2", report.getNumeroIntestatari());
    }

    @Test
    public void testGetAndSetMatricola() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setMatricola("12345");
        assertEquals("12345", report.getMatricola());
    }

    @Test
    public void testGetAndSetCodiceFiscale() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setCodiceFiscale("RSSMRA85M01H501Z");
        assertEquals("RSSMRA85M01H501Z", report.getCodiceFiscale());
    }

    @Test
    public void testGetAndSetCognome() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setCognome("Rossi");
        assertEquals("Rossi", report.getCognome());
    }

    @Test
    public void testGetAndSetNome() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setNome("Mario");
        assertEquals("Mario", report.getNome());
    }

    @Test
    public void testGetAndSetSesso() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setSesso("M");
        assertEquals("M", report.getSesso());
    }

    @Test
    public void testGetAndSetDataNascita() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setDataNascita("1985-05-01");
        assertEquals("1985-05-01", report.getDataNascita());
    }

    @Test
    public void testGetAndSetLuogoNascita() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setLuogoNascita("Milano");
        assertEquals("Milano", report.getLuogoNascita());
    }

    @Test
    public void testGetAndSetProvinciaNascita() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setProvinciaNascita("MI");
        assertEquals("MI", report.getProvinciaNascita());
    }

    @Test
    public void testGetAndSetSegnalazione() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setSegnalazione("NO");
        assertEquals("NO", report.getSegnalazione());
    }

    @Test
    public void testGetAndSetProgressivoRecord() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setProgressivoRecord("001");
        assertEquals("001", report.getProgressivoRecord());
    }

    @Test
    public void testGetAndSetPercentuale() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setPercentuale("100%");
        assertEquals("100%", report.getPercentuale());
    }

    @Test
    public void testGetAndSetErede() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setErede("SI");
        assertEquals("SI", report.getErede());
    }

    @Test
    public void testGetAndSetTipologiaMutuo() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setTipologiaMutuo("Prima Casa");
        assertEquals("Prima Casa", report.getTipologiaMutuo());
    }

    @Test
    public void testGetAndSetDataDecesso() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setDataDecesso("2020-06-15");
        assertEquals("2020-06-15", report.getDataDecesso());
    }

    @Test
    public void testGetAndSetTipoRecord() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setTipoRecord("T");
        assertEquals("T", report.getTipoRecord());
    }

    @Test
    public void testGetAndSetDataInizioPeriodo() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        report.setDataInizioPeriodo(timestamp);
        assertEquals(timestamp, report.getDataInizioPeriodo());
    }

    @Test
    public void testGetAndSetDataFinePeriodo() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        report.setDataFinePeriodo(timestamp);
        assertEquals(timestamp, report.getDataFinePeriodo());
    }

    @Test
    public void testGetAndSetAmmontarePenali() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setAmmontarePenali("5000");
        assertEquals("5000", report.getAmmontarePenali());
    }

    @Test
    public void testGetAndSetCartolarizzato() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setCartolarizzato("NO");
        assertEquals("NO", report.getCartolarizzato());
    }

    @Test
    public void testGetAndSetAccollo() {
        ReportOneriDeducibili2010 report = new ReportOneriDeducibili2010();
        report.setAccollo(true);
        assertTrue(report.isAccollo());
    }
}

