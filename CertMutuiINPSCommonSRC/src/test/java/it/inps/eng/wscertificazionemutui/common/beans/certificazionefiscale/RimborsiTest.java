package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RimborsiTest {

    @Test
    public void testGettersAndSetters() {
        Rimborsi rimborsi = new Rimborsi();

        // Test getter e setter per tp_mov
        String tpMov = "MOV1";
        rimborsi.setTp_mov(tpMov);
        assertEquals(tpMov, rimborsi.getTp_mov());

        // Test getter e setter per desc
        String desc = "Descrizione del rimborso";
        rimborsi.setDesc(desc);
        assertEquals(desc, rimborsi.getDesc());

        // Test getter e setter per imp_mov
        Double impMov = 250.75;
        rimborsi.setImp_mov(impMov);
        assertEquals(impMov, rimborsi.getImp_mov());

        // Test getter e setter per anno
        String anno = "2023";
        rimborsi.setAnno(anno);
        assertEquals(anno, rimborsi.getAnno());
    }

    @Test
    public void testDefaultConstructor() {
        Rimborsi rimborsi = new Rimborsi();
        assertNotNull(rimborsi);

        assertNull(rimborsi.getTp_mov());
        assertNull(rimborsi.getDesc());
        assertNull(rimborsi.getImp_mov());
        assertNull(rimborsi.getAnno());
    }

    @Test
    public void testSettersWithNull() {
        Rimborsi rimborsi = new Rimborsi();

        rimborsi.setTp_mov(null);
        assertNull(rimborsi.getTp_mov());

        rimborsi.setDesc(null);
        assertNull(rimborsi.getDesc());

        rimborsi.setImp_mov(null);
        assertNull(rimborsi.getImp_mov());

        rimborsi.setAnno(null);
        assertNull(rimborsi.getAnno());
    }

    @Test
    public void testSettersWithValues() {
        Rimborsi rimborsi = new Rimborsi();

        rimborsi.setTp_mov("RIMB");
        assertEquals("RIMB", rimborsi.getTp_mov());

        rimborsi.setDesc("Rimborso spese");
        assertEquals("Rimborso spese", rimborsi.getDesc());

        rimborsi.setImp_mov(100.0);
        assertEquals(100.0, rimborsi.getImp_mov(), 0.01);

        rimborsi.setAnno("2022");
        assertEquals("2022", rimborsi.getAnno());
    }
}
