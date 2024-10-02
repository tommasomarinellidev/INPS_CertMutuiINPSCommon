package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;

public class CertFisBeanTest {

    @Test
    public void testGettersAndSetters() {
        CertFisBean certFisBean = new CertFisBean();

        // Creare un oggetto AnagraficaIntestatario fittizio
        AnagraficaIntestatario anagrafica = new AnagraficaIntestatario("123");

        // Test setter e getter per benefPrincipale
        certFisBean.setBenefPrincipale(anagrafica);
        assertEquals(anagrafica, certFisBean.getBenefPrincipale());

        // Test setter e getter per tipoCertif
        String tipoCertif = "Certificato Tipo A";
        certFisBean.setTipoCertif(tipoCertif);
        assertEquals(tipoCertif, certFisBean.getTipoCertif());

        // Test setter e getter per numRigo
        int numRigo = 5;
        certFisBean.setNumRigo(numRigo);
        assertEquals(numRigo, certFisBean.getNumRigo());

        // Test setter e getter per rigo
        Rigo rigo1 = new Rigo();
        Rigo rigo2 = new Rigo();
        List<Rigo> rigoList = Arrays.asList(rigo1, rigo2);
        certFisBean.setRigo(rigoList);
        assertEquals(rigoList, certFisBean.getRigo());
    }

    @Test
    public void testDefaultConstructor() {
        CertFisBean certFisBean = new CertFisBean();
        assertNotNull(certFisBean);
        assertNull(certFisBean.getBenefPrincipale());
        assertNull(certFisBean.getTipoCertif());
        assertEquals(0, certFisBean.getNumRigo());
        assertNull(certFisBean.getRigo());
    }

    @Test
    public void testSettersWithNull() {
        CertFisBean certFisBean = new CertFisBean();
        
        certFisBean.setBenefPrincipale(null);
        assertNull(certFisBean.getBenefPrincipale());

        certFisBean.setTipoCertif(null);
        assertNull(certFisBean.getTipoCertif());

        certFisBean.setRigo(null);
        assertNull(certFisBean.getRigo());
    }
}


