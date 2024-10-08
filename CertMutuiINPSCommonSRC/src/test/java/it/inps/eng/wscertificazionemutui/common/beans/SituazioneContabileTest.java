package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class SituazioneContabileTest {

    @Test
    public void testGettersAndSetters() {
        SituazioneContabile situazione = new SituazioneContabile();

        // Test per i metodi setter e getter per ogni proprietà
        situazione.setAnno_mutuo("2023");
        assertEquals("2023", situazione.getAnno_mutuo());

        situazione.setProg_mutuo("001");
        assertEquals("001", situazione.getProg_mutuo());

        situazione.setMtr("MTR001");
        assertEquals("MTR001", situazione.getMtr());

        situazione.setProg_rt(123);
        assertEquals(123, situazione.getProg_rt());

        Timestamp now = new Timestamp(System.currentTimeMillis());
        situazione.setDt_ora_inser(now);
        assertEquals(now, situazione.getDt_ora_inser());

        situazione.setAm_rif(456);
        assertEquals(456, situazione.getAm_rif());

        situazione.setAm_ope(789);
        assertEquals(789, situazione.getAm_ope());

        situazione.setSt_mov("STMOV");
        assertEquals("STMOV", situazione.getSt_mov());

        situazione.setTp_mov("TPMOV");
        assertEquals("TPMOV", situazione.getTp_mov());

        situazione.setVoce("VOCE");
        assertEquals("VOCE", situazione.getVoce());

        situazione.setSede("SEDE");
        assertEquals("SEDE", situazione.getSede());

        situazione.setImp_mov(1000.50);
        assertEquals(1000.50, situazione.getImp_mov());

        situazione.setImp_mov_ecd(2000.75);
        assertEquals(2000.75, situazione.getImp_mov_ecd());

        Date date = new Date();
        situazione.setDt_pgm(date);
        assertEquals(date, situazione.getDt_pgm());

        situazione.setTp_pgm("TPPGM");
        assertEquals("TPPGM", situazione.getTp_pgm());

        situazione.setPerc(12.5);
        assertEquals(12.5, situazione.getPerc());

        situazione.setSgn("SGN");
        assertEquals("SGN", situazione.getSgn());

        situazione.setVoce_mutuo("VOCE_MUTUO");
        assertEquals("VOCE_MUTUO", situazione.getVoce_mutuo());

        situazione.setCau_mov("CAU_MOV");
        assertEquals("CAU_MOV", situazione.getCau_mov());

        situazione.setDt_ul_agg(now);
        assertEquals(now, situazione.getDt_ul_agg());

        situazione.setMtr_ul_agg("MTR_UL_AGG");
        assertEquals("MTR_UL_AGG", situazione.getMtr_ul_agg());

        situazione.setSgn_ecd("SGN_ECD");
        assertEquals("SGN_ECD", situazione.getSgn_ecd());
    }

    @Test
    public void testEquals() {
        SituazioneContabile situazione1 = new SituazioneContabile();
        situazione1.setAnno_mutuo("2023");
        situazione1.setProg_mutuo("001");
        situazione1.setSede("SEDE");

        SituazioneContabile situazione2 = new SituazioneContabile();
        situazione2.setAnno_mutuo("2023");
        situazione2.setProg_mutuo("001");
        situazione2.setSede("SEDE");

        SituazioneContabile situazione3 = new SituazioneContabile();
        situazione3.setAnno_mutuo("2024");
        situazione3.setProg_mutuo("002");
        situazione3.setSede("SEDE");

        // Test per oggetti uguali
        assertTrue(situazione1.equals(situazione2));

        // Test per oggetti diversi
        assertFalse(situazione1.equals(situazione3));

        // Test per oggetti con tipi diversi
        assertFalse(situazione1.equals("String"));
    }

    @Test
    public void testDefaultConstructor() {
        SituazioneContabile situazione = new SituazioneContabile();
        assertNotNull(situazione);
    }
}
