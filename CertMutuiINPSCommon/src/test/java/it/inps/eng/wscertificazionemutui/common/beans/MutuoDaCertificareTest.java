package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class MutuoDaCertificareTest {

    @Test
    public void testGettersAndSetters() {
        // Create an instance of the bean
        MutuoDaCertificare bean = new MutuoDaCertificare();
        
        // Test setter and getter for annoMutuo
        bean.setAnnoMutuo("2024");
        assertEquals("2024", bean.getAnnoMutuo());

        // Test setter and getter for progMutuo
        bean.setProgMutuo("001");
        assertEquals("001", bean.getProgMutuo());

        // Test setter and getter for stMutuo
        bean.setStMutuo("Status");
        assertEquals("Status", bean.getStMutuo());

        // Test setter and getter for tpMutuo
        bean.setTpMutuo(1);
        assertEquals(1, bean.getTpMutuo());

        // Test setter and getter for impMutuo
        bean.setImpMutuo(1000.50);
        assertEquals(1000.50, bean.getImpMutuo());

        // Test setter and getter for dtSti
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.SEPTEMBER, 6);
        Date dateSti = cal.getTime();
        bean.setDtSti(dateSti);
        assertEquals(dateSti, bean.getDtSti());

        // Test setter and getter for dtChs
        cal.set(2024, Calendar.OCTOBER, 10);
        Date dateChs = cal.getTime();
        bean.setDtChs(dateChs);
        assertEquals(dateChs, bean.getDtChs());

        // Test setter and getter for flagGestAcconti
        bean.setFlagGestAcconti(true);
        assertTrue(bean.getFlagGestAcconti());
        bean.setFlagGestAcconti(false);
        assertFalse(bean.getFlagGestAcconti());

        // Test setter and getter for tpAgenziaEntrate
        bean.setTpAgenziaEntrate("AgenziaType");
        assertEquals("AgenziaType", bean.getTpAgenziaEntrate());

        // Test setter and getter for cartolarizzato
        bean.setCartolarizzato(true);
        assertTrue(bean.isCartolarizzato());
        bean.setCartolarizzato(false);
        assertFalse(bean.isCartolarizzato());
    }
}
