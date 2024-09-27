package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;
import it.inps.eng.wscertificazionemutui.common.beans.MutuoDaCertificare;
import it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale.Rimborsi;

public class RigoTest {

    @Test
    public void testGettersAndSetters() {
        Rigo rigo = new Rigo();

        // Test getter e setter per benefCertif
        AnagraficaIntestatario benefCertif = new AnagraficaIntestatario("123");
        rigo.setBenefCertif(benefCertif);
        assertEquals(benefCertif, rigo.getBenefCertif());

        // Test getter e setter per mutuoDaCertificare
        MutuoDaCertificare mutuoDaCertificare = new MutuoDaCertificare();
        rigo.setMutuoDaCertificare(mutuoDaCertificare);
        assertEquals(mutuoDaCertificare, rigo.getMutuoDaCertificare());

        // Test getter e setter per dtDecInizio
        Date dtDecInizio = new Date();
        rigo.setDtDecInizio(dtDecInizio);
        assertEquals(dtDecInizio, rigo.getDtDecInizio());

        // Test getter e setter per dtDecFine
        Date dtDecFine = new Date();
        rigo.setDtDecFine(dtDecFine);
        assertEquals(dtDecFine, rigo.getDtDecFine());

        // Test getter e setter per quotaCapitale
        double quotaCapitale = 1000.50;
        rigo.setQuotaCapitale(quotaCapitale);
        assertEquals(quotaCapitale, rigo.getQuotaCapitale(), 0.01);

        // Test getter e setter per quotaInteressi
        double quotaInteressi = 500.75;
        rigo.setQuotaInteressi(quotaInteressi);
        assertEquals(quotaInteressi, rigo.getQuotaInteressi(), 0.01);

        // Test getter e setter per interessiPreamm
        double interessiPreamm = 150.25;
        rigo.setInteressiPreamm(interessiPreamm);
        assertEquals(interessiPreamm, rigo.getInteressiPreamm(), 0.01);

        // Test getter e setter per spesaIstruttoria
        double spesaIstruttoria = 75.0;
        rigo.setSpesaIstruttoria(spesaIstruttoria);
        assertEquals(spesaIstruttoria, rigo.getSpesaIstruttoria(), 0.01);

        // Test getter e setter per impostaSostitutiva
        double impostaSostitutiva = 200.0;
        rigo.setImpostaSostitutiva(impostaSostitutiva);
        assertEquals(impostaSostitutiva, rigo.getImpostaSostitutiva(), 0.01);

        // Test getter e setter per tpBen
        String tpBen = "TipoBeneficiario";
        rigo.setTpBen(tpBen);
        assertEquals(tpBen, rigo.getTpBen());

        // Test getter e setter per percDetraz
        double percDetraz = 15.5;
        rigo.setPercDetraz(percDetraz);
        assertEquals(percDetraz, rigo.getPercDetraz(), 0.01);

        // Test getter e setter per rimborsiList
        List<Rimborsi> rimborsiList = new ArrayList<>();
        rigo.setRimborsiList(rimborsiList);
        assertEquals(rimborsiList, rigo.getRimborsiList());

        // Test getter e setter per dtDecesso
        Date dtDecesso = new Date();
        rigo.setDtDecesso(dtDecesso);
        assertEquals(dtDecesso, rigo.getDtDecesso());
    }

    @Test
    public void testDefaultConstructor() {
        Rigo rigo = new Rigo();
        assertNotNull(rigo);

        assertNull(rigo.getBenefCertif());
        assertNull(rigo.getMutuoDaCertificare());
        assertNull(rigo.getDtDecInizio());
        assertNull(rigo.getDtDecFine());
        assertEquals(0.0, rigo.getQuotaCapitale(), 0.01);
        assertEquals(0.0, rigo.getQuotaInteressi(), 0.01);
        assertEquals(0.0, rigo.getInteressiPreamm(), 0.01);
        assertEquals(0.0, rigo.getSpesaIstruttoria(), 0.01);
        assertEquals(0.0, rigo.getImpostaSostitutiva(), 0.01);
        assertNull(rigo.getTpBen());
        assertEquals(0.0, rigo.getPercDetraz(), 0.01);
        assertNull(rigo.getRimborsiList());
        assertNull(rigo.getDtDecesso());
    }

    @Test
    public void testSettersWithNull() {
        Rigo rigo = new Rigo();

        rigo.setBenefCertif(null);
        assertNull(rigo.getBenefCertif());

        rigo.setMutuoDaCertificare(null);
        assertNull(rigo.getMutuoDaCertificare());

        rigo.setDtDecInizio(null);
        assertNull(rigo.getDtDecInizio());

        rigo.setDtDecFine(null);
        assertNull(rigo.getDtDecFine());

        rigo.setTpBen(null);
        assertNull(rigo.getTpBen());

        rigo.setRimborsiList(null);
        assertNull(rigo.getRimborsiList());

        rigo.setDtDecesso(null);
        assertNull(rigo.getDtDecesso());
    }

    @Test
    public void testSettersWithValues() {
        Rigo rigo = new Rigo();

        rigo.setQuotaCapitale(1234.56);
        assertEquals(1234.56, rigo.getQuotaCapitale(), 0.01);

        rigo.setQuotaInteressi(789.01);
        assertEquals(789.01, rigo.getQuotaInteressi(), 0.01);

        rigo.setInteressiPreamm(345.67);
        assertEquals(345.67, rigo.getInteressiPreamm(), 0.01);

        rigo.setSpesaIstruttoria(89.12);
        assertEquals(89.12, rigo.getSpesaIstruttoria(), 0.01);

        rigo.setImpostaSostitutiva(456.78);
        assertEquals(456.78, rigo.getImpostaSostitutiva(), 0.01);

        rigo.setPercDetraz(10.5);
        assertEquals(10.5, rigo.getPercDetraz(), 0.01);
    }
}

