package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import it.inps.eng.wscertificazionemutui.common.beans.AnagraficaIntestatario;

public class CessazionePdfObjTest {

    @Test
    public void testGettersAndSetters() {
        CessazionePdfObj obj = new CessazionePdfObj();
        
        // Test setter e getter per benefPrincipale
        AnagraficaIntestatario benefPrincipale = new AnagraficaIntestatario("123");
        obj.setBenefPrincipale(benefPrincipale);
        assertEquals(benefPrincipale, obj.getBenefPrincipale());

        // Test setter e getter per annoMutuo
        String annoMutuo = "2023";
        obj.setAnnoMutuo(annoMutuo);
        assertEquals(annoMutuo, obj.getAnnoMutuo());

        // Test setter e getter per progMutuo
        String progMutuo = "001";
        obj.setProgMutuo(progMutuo);
        assertEquals(progMutuo, obj.getProgMutuo());

        // Test setter e getter per indirizzoEmail
        String indirizzoEmail = "example@example.com";
        obj.setIndirizzoEmail(indirizzoEmail);
        assertEquals(indirizzoEmail, obj.getIndirizzoEmail());

        // Test setter e getter per numFax
        String numFax = "123456789";
        obj.setNumFax(numFax);
        assertEquals(numFax, obj.getNumFax());

        // Test setter e getter per dataCessazione
        String dataCessazione = "01/01/2024";
        obj.setDataCessazione(dataCessazione);
        assertEquals(dataCessazione, obj.getDataCessazione());

        // Test setter e getter per dataDecorrenza
        String dataDecorrenza = "01/02/2024";
        obj.setDataDecorrenza(dataDecorrenza);
        assertEquals(dataDecorrenza, obj.getDataDecorrenza());

        // Test setter e getter per flagRate
        boolean flagRate = true;
        obj.setFlagRate(flagRate);
        assertTrue(obj.isFlagRate());

        // Test setter e getter per tasso
        String tasso = "5.5%";
        obj.setTasso(tasso);
        assertEquals(tasso, obj.getTasso());

        // Test setter e getter per ciSonoEredi
        boolean ciSonoEredi = false;
        obj.setCiSonoEredi(ciSonoEredi);
        assertFalse(obj.isCiSonoEredi());

        // Test setter e getter per intestatarioDeceduto
        boolean intestatarioDeceduto = true;
        obj.setIntestatarioDeceduto(intestatarioDeceduto);
        assertTrue(obj.isIntestatarioDeceduto());

        // Test setter e getter per NomeIntestatarioDeceduto
        String nomeIntestatarioDeceduto = "Mario";
        obj.setNomeIntestatarioDeceduto(nomeIntestatarioDeceduto);
        assertEquals(nomeIntestatarioDeceduto, obj.getNomeIntestatarioDeceduto());

        // Test setter e getter per CognomeIntestatarioDeceduto
        String cognomeIntestatarioDeceduto = "Rossi";
        obj.setCognomeIntestatarioDeceduto(cognomeIntestatarioDeceduto);
        assertEquals(cognomeIntestatarioDeceduto, obj.getCognomeIntestatarioDeceduto());

        // Test setter e getter per codFiscaleIntestatarioDeceduto
        String codFiscaleIntestatarioDeceduto = "MRARSS88M01H501Z";
        obj.setCodFiscaleIntestatarioDeceduto(codFiscaleIntestatarioDeceduto);
        assertEquals(codFiscaleIntestatarioDeceduto, obj.getCodFiscaleIntestatarioDeceduto());

        // Test setter e getter per dataDecessoIntestatarioDeceduto
        String dataDecessoIntestatarioDeceduto = "01/01/2023";
        obj.setDataDecessoIntestatarioDeceduto(dataDecessoIntestatarioDeceduto);
        assertEquals(dataDecessoIntestatarioDeceduto, obj.getDataDecessoIntestatarioDeceduto());

        // Test setter e getter per tipoMutuo
        String tipoMutuo = "Mutuo ipotecario";
        obj.setTipoMutuo(tipoMutuo);
        assertEquals(tipoMutuo, obj.getTipoMutuo());
    }

    @Test
    public void testDefaultConstructor() {
        CessazionePdfObj obj = new CessazionePdfObj();
        assertNotNull(obj);
        assertNull(obj.getBenefPrincipale());
        assertNull(obj.getAnnoMutuo());
        assertNull(obj.getProgMutuo());
        assertNull(obj.getIndirizzoEmail());
        assertNull(obj.getNumFax());
        assertNull(obj.getDataCessazione());
        assertNull(obj.getDataDecorrenza());
        assertFalse(obj.isFlagRate());
        assertNull(obj.getTasso());
        assertFalse(obj.isCiSonoEredi());
        assertFalse(obj.isIntestatarioDeceduto());
        assertNull(obj.getNomeIntestatarioDeceduto());
        assertNull(obj.getCognomeIntestatarioDeceduto());
        assertNull(obj.getCodFiscaleIntestatarioDeceduto());
        assertNull(obj.getDataDecessoIntestatarioDeceduto());
        assertNull(obj.getTipoMutuo());
    }

    @Test
    public void testSettersWithNull() {
        CessazionePdfObj obj = new CessazionePdfObj();
        
        obj.setBenefPrincipale(null);
        assertNull(obj.getBenefPrincipale());

        obj.setAnnoMutuo(null);
        assertNull(obj.getAnnoMutuo());

        obj.setProgMutuo(null);
        assertNull(obj.getProgMutuo());

        obj.setIndirizzoEmail(null);
        assertNull(obj.getIndirizzoEmail());

        obj.setNumFax(null);
        assertNull(obj.getNumFax());

        obj.setDataCessazione(null);
        assertNull(obj.getDataCessazione());

        obj.setDataDecorrenza(null);
        assertNull(obj.getDataDecorrenza());

        obj.setTasso(null);
        assertNull(obj.getTasso());

        obj.setNomeIntestatarioDeceduto(null);
        assertNull(obj.getNomeIntestatarioDeceduto());

        obj.setCognomeIntestatarioDeceduto(null);
        assertNull(obj.getCognomeIntestatarioDeceduto());

        obj.setCodFiscaleIntestatarioDeceduto(null);
        assertNull(obj.getCodFiscaleIntestatarioDeceduto());

        obj.setDataDecessoIntestatarioDeceduto(null);
        assertNull(obj.getDataDecessoIntestatarioDeceduto());

        obj.setTipoMutuo(null);
        assertNull(obj.getTipoMutuo());
    }
}
