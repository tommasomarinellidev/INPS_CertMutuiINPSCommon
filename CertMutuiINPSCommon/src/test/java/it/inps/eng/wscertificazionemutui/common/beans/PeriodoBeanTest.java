package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PeriodoBeanTest {

    @Test
    public void testGettersAndSetters() {
        // Create an instance of the bean
        PeriodoBean bean = new PeriodoBean();
        
        // Test setter and getter for annoCert
        bean.setAnnoCert("2024");
        assertEquals("2024", bean.getAnnoCert());

        // Test setter and getter for annoM
        bean.setAnnoM("2024");
        assertEquals("2024", bean.getAnnoM());

        // Test setter and getter for progM
        bean.setProgM("001");
        assertEquals("001", bean.getProgM());

        // Test setter and getter for codLet
        bean.setCodLet("LET123");
        assertEquals("LET123", bean.getCodLet());

        // Test setter and getter for descLet
        bean.setDescLet("Description of letter");
        assertEquals("Description of letter", bean.getDescLet());

        // Test setter and getter for codFisDec
        bean.setCodFisDec("CF123456789");
        assertEquals("CF123456789", bean.getCodFisDec());

        // Test setter and getter for flRett
        bean.setFlRett("FlagRet");
        assertEquals("FlagRet", bean.getFlRett());

        // Test setter and getter for descRett
        bean.setDescRett("Description of correction");
        assertEquals("Description of correction", bean.getDescRett());

        // Test setter and getter for idCF
        bean.setIdCF("ID12345");
        assertEquals("ID12345", bean.getIdCF());
    }
}
