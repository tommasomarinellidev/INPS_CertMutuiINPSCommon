package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.Test;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;

public class OneriBeanTest {

    @Test
    public void testGetAndSetTipoRecord() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setTipoRecord(1);
        assertEquals(1, oneriBean.getTipoRecord());
    }

    @Test
    public void testGetAndSetBenCertificazione() {
        OneriBean oneriBean = new OneriBean();
        AnagraficaIntestatario anagrafica = new AnagraficaIntestatario("123");
        oneriBean.setBenCertificazione(anagrafica);
        assertEquals(anagrafica, oneriBean.getBenCertificazione());
    }

    @Test
    public void testGetAndSetAnnoM() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setAnnoM("2023");
        assertEquals("2023", oneriBean.getAnnoM());
    }

    @Test
    public void testGetAndSetProgM() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setProgM("001");
        assertEquals("001", oneriBean.getProgM());
    }

    @Test
    public void testGetAndSetSottoProgM() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setSottoProgM("002");
        assertEquals("002", oneriBean.getSottoProgM());
    }

    @Test
    public void testGetAndSetTotRate() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setTotRate(100.5);
        assertEquals(100.5, oneriBean.getTotRate());
    }

    @Test
    public void testGetAndSetTotInteressi() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setTotInteressi(500.25);
        assertEquals(500.25, oneriBean.getTotInteressi());
    }

    @Test
    public void testGetAndSetPercIntestaz() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setPercIntestaz(75.0);
        assertEquals(75.0, oneriBean.getPercIntestaz());
    }

    @Test
    public void testGetAndSetAmmontRateBenef() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setAmmontRateBenef(200.0);
        assertEquals(200.0, oneriBean.getAmmontRateBenef());
    }

    @Test
    public void testGetAndSetAmmontInteressiBenef() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setAmmontInteressiBenef(300.0);
        assertEquals(300.0, oneriBean.getAmmontInteressiBenef());
    }

    @Test
    public void testGetAndSetImpMutuo() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setImpMutuo(10000.0);
        assertEquals(10000.0, oneriBean.getImpMutuo());
    }

    @Test
    public void testGetAndSetProgBenef() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setProgBenef(5);
        assertEquals(5, oneriBean.getProgBenef());
    }

    @Test
    public void testGetAndSetTpAgenziaEntrate() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setTpAgenziaEntrate("AE001");
        assertEquals("AE001", oneriBean.getTpAgenziaEntrate());
    }

    @Test
    public void testGetAndSetSituazioneInvariata() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setSituazioneInvariata(true);
        assertTrue(oneriBean.isSituazioneInvariata());
    }

    @Test
    public void testGetAndSetOneriPeriodo() {
        OneriBean oneriBean = new OneriBean();
        OneriPeriodoBean oneriPeriodo = new OneriPeriodoBean();
        oneriBean.setOneriPeriodo(oneriPeriodo);
        assertEquals(oneriPeriodo, oneriBean.getOneriPeriodo());
    }

    @Test
    public void testGetAndSetDataInizioPeriodo() {
        OneriBean oneriBean = new OneriBean();
        Timestamp dataInizio = new Timestamp(System.currentTimeMillis());
        oneriBean.setDataInizioPeriodo(dataInizio);
        assertEquals(dataInizio, oneriBean.getDataInizioPeriodo());
    }

    @Test
    public void testGetAndSetDataFinePeriodo() {
        OneriBean oneriBean = new OneriBean();
        Timestamp dataFine = new Timestamp(System.currentTimeMillis());
        oneriBean.setDataFinePeriodo(dataFine);
        assertEquals(dataFine, oneriBean.getDataFinePeriodo());
    }

    @Test
    public void testGetAndSetDataStipula() {
        OneriBean oneriBean = new OneriBean();
        Date dataStipula = new Date();
        oneriBean.setDataStipula(dataStipula);
        assertEquals(dataStipula, oneriBean.getDataStipula());
    }

    @Test
    public void testGetAndSetCartolarizzato() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setCartolarizzato(true);
        assertTrue(oneriBean.isCartolarizzato());
    }

    @Test
    public void testGetAndSetAccollo() {
        OneriBean oneriBean = new OneriBean();
        oneriBean.setAccollo(true);
        assertTrue(oneriBean.isAccollo());
    }
}

