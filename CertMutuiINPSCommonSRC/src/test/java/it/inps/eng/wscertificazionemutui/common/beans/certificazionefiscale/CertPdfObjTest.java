package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;


public class CertPdfObjTest {

    @Test
    public void testGettersAndSetters() {
        CertPdfObj certPdfObj = new CertPdfObj();

        // Test setter e getter per certFisBean
        CertFisBean certFisBean = new CertFisBean();
        certPdfObj.setCertFisBean(certFisBean);
        assertEquals(certFisBean, certPdfObj.getCertFisBean());

        // Test setter e getter per intestazioneSede
        String intestazioneSede = "Sede Centrale";
        certPdfObj.setIntestazioneSede(intestazioneSede);
        assertEquals(intestazioneSede, certPdfObj.getIntestazioneSede());

        // Test setter e getter per dataUltAgg
        Date dataUltAgg = new Date();
        certPdfObj.setDataUltAgg(dataUltAgg);
        assertEquals(dataUltAgg, certPdfObj.getDataUltAgg());

        // Test setter e getter per annoCert
        String annoCert = "2024";
        certPdfObj.setAnnoCert(annoCert);
        assertEquals(annoCert, certPdfObj.getAnnoCert());

        // Test setter e getter per certProva
        boolean certProva = true;
        certPdfObj.setCertProva(certProva);
        assertTrue(certPdfObj.isCertProva());
    }

    @Test
    public void testDefaultConstructor() {
        CertPdfObj certPdfObj = new CertPdfObj();
        assertNotNull(certPdfObj);
        assertNull(certPdfObj.getCertFisBean());
        assertNull(certPdfObj.getIntestazioneSede());
        assertNull(certPdfObj.getDataUltAgg());
        assertNull(certPdfObj.getAnnoCert());
        assertFalse(certPdfObj.isCertProva());
    }

    @Test
    public void testSettersWithNull() {
        CertPdfObj certPdfObj = new CertPdfObj();

        certPdfObj.setCertFisBean(null);
        assertNull(certPdfObj.getCertFisBean());

        certPdfObj.setIntestazioneSede(null);
        assertNull(certPdfObj.getIntestazioneSede());

        certPdfObj.setDataUltAgg(null);
        assertNull(certPdfObj.getDataUltAgg());

        certPdfObj.setAnnoCert(null);
        assertNull(certPdfObj.getAnnoCert());
    }
    
    @Test
    public void testGetSerialversionuid() {
        // Expected serialVersionUID value
        long expectedSerialVersionUID = -1326443414192670281L;

        // Assert that the method returns the correct serialVersionUID
        assertEquals(expectedSerialVersionUID, CertPdfObj.getSerialversionuid(), 
            "Il valore restituito da getSerialversionuid() dovrebbe essere uguale al serialVersionUID atteso.");
    }
}
