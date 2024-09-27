package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class StoriaBeneficiarioTest {

    @Test
    public void testGettersAndSetters() {
        StoriaBeneficiario storia = new StoriaBeneficiario();

        // Test per i metodi setter e getter per ogni proprietà
        storia.setMtr("MTR123");
        assertEquals("MTR123", storia.getMtr());

        storia.setAnno_mutuo("2024");
        assertEquals("2024", storia.getAnno_mutuo());

        storia.setProg_mutuo("P123");
        assertEquals("P123", storia.getProg_mutuo());

        Date dtDec = new Date();
        storia.setDt_dec(dtDec);
        assertEquals(dtDec, storia.getDt_dec());

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        storia.setDt_ul_agg(timestamp);
        assertEquals(timestamp, storia.getDt_ul_agg());

        storia.setMtr_ul_agg("MTRULAGG");
        assertEquals("MTRULAGG", storia.getMtr_ul_agg());

        storia.setFlag_int("FLAG");
        assertEquals("FLAG", storia.getFlag_int());

        storia.setPerc(12.5);
        assertEquals(12.5, storia.getPerc());

        storia.setSt_evn("STEVN");
        assertEquals("STEVN", storia.getSt_evn());

        storia.setTp_ben("TPBEN");
        assertEquals("TPBEN", storia.getTp_ben());

        storia.setTp_pgm("TPPGM");
        assertEquals("TPPGM", storia.getTp_pgm());

        storia.setTp_evn("TPEVN");
        assertEquals("TPEVN", storia.getTp_evn());

        storia.setPerc_detr(8.0);
        assertEquals(8.0, storia.getPerc_detr());
    }

    @Test
    public void testDefaultConstructor() {
        StoriaBeneficiario storia = new StoriaBeneficiario();
        assertNotNull(storia);
    }
}
