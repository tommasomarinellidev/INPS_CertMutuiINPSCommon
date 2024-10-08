package it.inps.eng.wscertificazionemutui.common.beans.oneri;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OneriPeriodoBeanTest {

    @Test
    public void testGetAndSetNumBenef() {
        OneriPeriodoBean oneriPeriodoBean = new OneriPeriodoBean();
        oneriPeriodoBean.setNumBenef(10);
        assertEquals(10, oneriPeriodoBean.getNumBenef());
    }

    @Test
    public void testGetAndSetTotRatePagate() {
        OneriPeriodoBean oneriPeriodoBean = new OneriPeriodoBean();
        oneriPeriodoBean.setTotRatePagate(200.5);
        assertEquals(200.5, oneriPeriodoBean.getTotRatePagate(), 0.001);
    }

    @Test
    public void testGetAndSetTotInteressiPagati() {
        OneriPeriodoBean oneriPeriodoBean = new OneriPeriodoBean();
        oneriPeriodoBean.setTotInteressiPagati(150.75);
        assertEquals(150.75, oneriPeriodoBean.getTotInteressiPagati(), 0.001);
    }

    @Test
    public void testGetAndSetSituazioneInvariata() {
        OneriPeriodoBean oneriPeriodoBean = new OneriPeriodoBean();
        oneriPeriodoBean.setSituazioneInvariata(true);
        assertTrue(oneriPeriodoBean.isSituazioneInvariata());
    }

    @Test
    public void testGetAndSetSottoProgMTemp() {
        OneriPeriodoBean oneriPeriodoBean = new OneriPeriodoBean();
        oneriPeriodoBean.setSottoProgMTemp("SP001");
        assertEquals("SP001", oneriPeriodoBean.getSottoProgMTemp());
    }
}

