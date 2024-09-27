package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class RataTest {

    @Test
    public void testGettersAndSetters() {
        // Create an instance of the bean
        Rata rata = new Rata();

        // Set values
        rata.setAnno_mutuo("2024");
        rata.setProg_mutuo("001");
        rata.setMatricola("MTR001");
        rata.setNumeroRata(1);
        rata.setDt_ora_inser(new Date());
        rata.setAnnoMeseRif("2024-09");
        rata.setStato("ATTIVO");
        rata.setDescrizioneStatoRata("Stato attivo della rata");
        rata.setSede("Sede centrale");
        rata.setDebitoResiduo(10000.00);
        rata.setImp_deb_rsd_ecd(2000.00);
        rata.setImportoRata(500.00);
        rata.setImp_rt_ecd(50.00);
        rata.setCapitale(450.00);
        rata.setImp_capi_rt_ecd(45.00);
        rata.setInteressi(50.00);
        rata.setImp_its_rt_ecd(5.00);
        rata.setMora(10.00);
        rata.setImp_its_mora_rt_ecd(1.00);
        rata.setTasso(3.5);
        rata.setTas_ecd(0.5);
        rata.setTp_pgm("PGM1");
        rata.setFrq_rt(12);
        rata.setDataPagamentoRata(new Date());
        rata.setDt_pgm_mora_rt(new Date());
        rata.setPerc(0.05);

        // Test getters
        assertEquals("2024", rata.getAnno_mutuo());
        assertEquals("001", rata.getProg_mutuo());
        assertEquals("MTR001", rata.getMatricola());
        assertEquals(1, rata.getNumeroRata());
        assertNotNull(rata.getDt_ora_inser());
        assertEquals("2024-09", rata.getAnnoMeseRif());
        assertEquals("ATTIVO", rata.getStato());
        assertEquals("Stato attivo della rata", rata.getDescrizioneStatoRata());
        assertEquals("Sede centrale", rata.getSede());
        assertEquals(10000.00, rata.getDebitoResiduo());
        assertEquals(2000.00, rata.getImp_deb_rsd_ecd());
        assertEquals(500.00, rata.getImportoRata());
        assertEquals(50.00, rata.getImp_rt_ecd());
        assertEquals(450.00, rata.getCapitale());
        assertEquals(45.00, rata.getImp_capi_rt_ecd());
        assertEquals(50.00, rata.getInteressi());
        assertEquals(5.00, rata.getImp_its_rt_ecd());
        assertEquals(10.00, rata.getMora());
        assertEquals(1.00, rata.getImp_its_mora_rt_ecd());
        assertEquals(3.5, rata.getTasso());
        assertEquals(0.5, rata.getTas_ecd());
        assertEquals("PGM1", rata.getTp_pgm());
        assertEquals(12, rata.getFrq_rt());
        assertNotNull(rata.getDataPagamentoRata());
        assertNotNull(rata.getDt_pgm_mora_rt());
        assertEquals(0.05, rata.getPerc());
    }

    @Test
    public void testConstructorWithParameters() {
        // Set up date for testing
        Date date = new Date();

        // Create an instance of the bean using the constructor with parameters
        Rata rata = new Rata("2024", "001", "MTR001", 1, date, "2024-09", "ATTIVO", "Sede centrale", 
                              10000.00, 2000.00, 500.00, 50.00, 450.00, 45.00, 50.00, 5.00, 
                              10.00, 1.00, 3.5, 0.5, "PGM1", 12, date, date, 0.05, "Stato attivo della rata");

        // Test getters
        assertEquals("2024", rata.getAnno_mutuo());
        assertEquals("001", rata.getProg_mutuo());
        assertEquals("MTR001", rata.getMatricola());
        assertEquals(1, rata.getNumeroRata());
        assertEquals(date, rata.getDt_ora_inser());
        assertEquals("2024-09", rata.getAnnoMeseRif());
        assertEquals("ATTIVO", rata.getStato());
        assertEquals("Stato attivo della rata", rata.getDescrizioneStatoRata());
        assertEquals("Sede centrale", rata.getSede());
        assertEquals(10000.00, rata.getDebitoResiduo());
        assertEquals(2000.00, rata.getImp_deb_rsd_ecd());
        assertEquals(500.00, rata.getImportoRata());
        assertEquals(50.00, rata.getImp_rt_ecd());
        assertEquals(450.00, rata.getCapitale());
        assertEquals(45.00, rata.getImp_capi_rt_ecd());
        assertEquals(50.00, rata.getInteressi());
        assertEquals(5.00, rata.getImp_its_rt_ecd());
        assertEquals(10.00, rata.getMora());
        assertEquals(1.00, rata.getImp_its_mora_rt_ecd());
        assertEquals(3.5, rata.getTasso());
        assertEquals(0.5, rata.getTas_ecd());
        assertEquals("PGM1", rata.getTp_pgm());
        assertEquals(12, rata.getFrq_rt());
        assertEquals(date, rata.getDataPagamentoRata());
        assertEquals(date, rata.getDt_pgm_mora_rt());
        assertEquals(0.05, rata.getPerc());
    }

    @Test
    public void testCopyConstructor() {
        // Set up date for testing
        Date date = new Date();

        // Create an instance of the bean using the constructor with parameters
        Rata originalRata = new Rata("2024", "001", "MTR001", 1, date, "2024-09", "ATTIVO", "Sede centrale", 
                                     10000.00, 2000.00, 500.00, 50.00, 450.00, 45.00, 50.00, 5.00, 
                                     10.00, 1.00, 3.5, 0.5, "PGM1", 12, date, date, 0.05, "Stato attivo della rata");

        // Create a copy using the copy constructor
        Rata copiedRata = new Rata(originalRata);

        // Test that copiedRata has the same values as originalRata
        assertEquals(originalRata.getAnno_mutuo(), copiedRata.getAnno_mutuo());
        assertEquals(originalRata.getProg_mutuo(), copiedRata.getProg_mutuo());
        assertEquals(originalRata.getMatricola(), copiedRata.getMatricola());
        assertEquals(originalRata.getNumeroRata(), copiedRata.getNumeroRata());
        assertEquals(originalRata.getDt_ora_inser(), copiedRata.getDt_ora_inser());
        assertEquals(originalRata.getAnnoMeseRif(), copiedRata.getAnnoMeseRif());
        assertEquals(originalRata.getStato(), copiedRata.getStato());
        assertEquals(originalRata.getDescrizioneStatoRata(), copiedRata.getDescrizioneStatoRata());
        assertEquals(originalRata.getSede(), copiedRata.getSede());
        assertEquals(originalRata.getDebitoResiduo(), copiedRata.getDebitoResiduo());
        assertEquals(originalRata.getImp_deb_rsd_ecd(), copiedRata.getImp_deb_rsd_ecd());
        assertEquals(originalRata.getImportoRata(), copiedRata.getImportoRata());
        assertEquals(originalRata.getImp_rt_ecd(), copiedRata.getImp_rt_ecd());
        assertEquals(originalRata.getCapitale(), copiedRata.getCapitale());
        assertEquals(originalRata.getImp_capi_rt_ecd(), copiedRata.getImp_capi_rt_ecd());
        assertEquals(originalRata.getInteressi(), copiedRata.getInteressi());
        assertEquals(originalRata.getImp_its_rt_ecd(), copiedRata.getImp_its_rt_ecd());
        assertEquals(originalRata.getMora(), copiedRata.getMora());
        assertEquals(originalRata.getImp_its_mora_rt_ecd(), copiedRata.getImp_its_mora_rt_ecd());
        assertEquals(originalRata.getTasso(), copiedRata.getTasso());
        assertEquals(originalRata.getTas_ecd(), copiedRata.getTas_ecd());
        assertEquals(originalRata.getTp_pgm(), copiedRata.getTp_pgm());
        assertEquals(originalRata.getFrq_rt(), copiedRata.getFrq_rt());
        assertEquals(originalRata.getDataPagamentoRata(), copiedRata.getDataPagamentoRata());
        assertEquals(originalRata.getDt_pgm_mora_rt(), copiedRata.getDt_pgm_mora_rt());
        assertEquals(originalRata.getPerc(), copiedRata.getPerc());
    }

    @Test
    public void testToString() {
        // Set up date for testing
        Date date = new Date();

        // Create an instance of the bean
        Rata rata = new Rata("2024", "001", "MTR001", 1, date, "2024-09", "ATTIVO", "Sede centrale", 
                              10000.00, 2000.00, 500.00, 50.00, 450.00, 45.00, 50.00, 5.00, 
                              10.00, 1.00, 3.5, 0.5, "PGM1", 12, date, date, 0.05, "Stato attivo della rata");

        // Test toString method
        String expectedString = "Rata [imp_deb_rsd=10000.0, imp_rt=500.0, imp_capi_rt=450.0, imp_its_rt=50.0, tas=3.5]";
        assertEquals(expectedString, rata.toString());
    }
}
