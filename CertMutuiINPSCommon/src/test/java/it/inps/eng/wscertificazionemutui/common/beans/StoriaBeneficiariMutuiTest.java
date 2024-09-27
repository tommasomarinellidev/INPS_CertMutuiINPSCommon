package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class StoriaBeneficiariMutuiTest {

    @Test
    public void testGettersAndSetters() {
        StoriaBeneficiariMutui storia = new StoriaBeneficiariMutui();

        // Test per i metodi setter e getter per ogni proprietà
        storia.setMtr("MTR001");
        assertEquals("MTR001", storia.getMtr());

        storia.setAnno_mutuo("2023");
        assertEquals("2023", storia.getAnno_mutuo());

        storia.setProg_mutuo("001");
        assertEquals("001", storia.getProg_mutuo());

        Date dateInizio = new Date();
        storia.setDtDecInizio(dateInizio);
        assertEquals(dateInizio, storia.getDtDecInizio());

        Date dateFine = new Date();
        storia.setDtDecFine(dateFine);
        assertEquals(dateFine, storia.getDtDecFine());

        Timestamp now = new Timestamp(System.currentTimeMillis());
        storia.setDtOraInser(now);
        assertEquals(now, storia.getDtOraInser());

        storia.setStEvn("STEVN");
        assertEquals("STEVN", storia.getStEvn());

        storia.setTpEvn("TPEVN");
        assertEquals("TPEVN", storia.getTpEvn());

        storia.setPerc(15.5);
        assertEquals(15.5, storia.getPerc());

        storia.setFlagInt("FLAG");
        assertEquals("FLAG", storia.getFlagInt());

        storia.setTpBen("TPBEN");
        assertEquals("TPBEN", storia.getTpBen());

        Date dateMor = new Date();
        storia.setDtMor(dateMor);
        assertEquals(dateMor, storia.getDtMor());

        storia.setPercDetr(10.0);
        assertEquals(10.0, storia.getPercDetr());

        storia.setCodFisc("CF123456");
        assertEquals("CF123456", storia.getCodFisc());

        storia.setAnnoCert("2023");
        assertEquals("2023", storia.getAnnoCert());

        storia.setIndicePeriodo(1);
        assertEquals(1, storia.getIndicePeriodo());
    }

    @Test
    public void testDefaultConstructor() {
        StoriaBeneficiariMutui storia = new StoriaBeneficiariMutui();
        assertNotNull(storia);
    }
}
