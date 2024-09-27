package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import it.inps.eng.wscertificazionemutui.common.beans.Sedi;

class PdfObjTestImpl extends PdfObj {
    // Classe concreta per testare la classe astratta PdfObj
}

public class PdfObjTest {

    @Test
    public void testGettersAndSetters() {
        PdfObj pdfObj = new PdfObjTestImpl();
        
        // Test setter e getter per codSede
        String codSede = "123";
        pdfObj.setCodSede(codSede);
        assertEquals(codSede, pdfObj.getCodSede());

        // Test setter e getter per descSede
        String descSede = "Sede Centrale";
        pdfObj.setDescSede(descSede);
        assertEquals(descSede, pdfObj.getDescSede());

        // Test setter e getter per dataStipula
        Date dataStipula = new Date();
        pdfObj.setDataStipula(dataStipula);
        assertEquals(dataStipula, pdfObj.getDataStipula());

        // Test setter e getter per dataStipulaStr
        String dataStipulaStr = "01/01/2024";
        pdfObj.setDataStipulaStr(dataStipulaStr);
        assertEquals(dataStipulaStr, pdfObj.getDataStipulaStr());

        // Test setter e getter per dataPagamento
        String dataPagamento = "15/01/2024";
        pdfObj.setDataPagamento(dataPagamento);
        assertEquals(dataPagamento, pdfObj.getDataPagamento());

        // Test setter e getter per tipoMutuo
        String tipoMutuo = "Ordinario";
        pdfObj.setTipoMutuo(tipoMutuo);
        assertEquals(tipoMutuo, pdfObj.getTipoMutuo());

        // Test setter e getter per tipoPagamento
        String tipoPagamento = "Bonifico";
        pdfObj.setTipoPagamento(tipoPagamento);
        assertEquals(tipoPagamento, pdfObj.getTipoPagamento());

        // Test setter e getter per descrMutuo
        String descrMutuo = "Descrizione del Mutuo";
        pdfObj.setDescrMutuo(descrMutuo);
        assertEquals(descrMutuo, pdfObj.getDescrMutuo());

        // Test setter e getter per direttoreSede
        String direttoreSede = "Mario Rossi";
        pdfObj.setDirettoreSede(direttoreSede);
        assertEquals(direttoreSede, pdfObj.getDirettoreSede());

        // Test setter e getter per importoBonifico
        Double importoBonifico = 1000.00;
        pdfObj.setImportoBonifico(importoBonifico);
        assertEquals(importoBonifico, pdfObj.getImportoBonifico());

        // Test setter e getter per importoMutuo
        Double importoMutuo = 50000.00;
        pdfObj.setImportoMutuo(importoMutuo);
        assertEquals(importoMutuo, pdfObj.getImportoMutuo());

        // Test setter e getter per importoEstinzione
        Double importoEstinzione = 2000.00;
        pdfObj.setImportoEstinzione(importoEstinzione);
        assertEquals(importoEstinzione, pdfObj.getImportoEstinzione());

        // Test setter e getter per importoResiduoMutuo
        Double importoResiduoMutuo = 30000.00;
        pdfObj.setImportoResiduoMutuo(importoResiduoMutuo);
        assertEquals(importoResiduoMutuo, pdfObj.getImportoResiduoMutuo());

        // Test setter e getter per importoRata
        Double importoRata = 500.00;
        pdfObj.setImportoRata(importoRata);
        assertEquals(importoRata, pdfObj.getImportoRata());

        // Test setter e getter per rateResidue
        Integer rateResidue = 60;
        pdfObj.setRateResidue(rateResidue);
        assertEquals(rateResidue, pdfObj.getRateResidue());

        // Test setter e getter per sedeFiliali
        Sedi sedeFiliali = new Sedi();
        pdfObj.setSedeFiliali(sedeFiliali);
        assertEquals(sedeFiliali, pdfObj.getSedeFiliali());

        // Test setter e getter per dirGenerale
        boolean dirGenerale = true;
        pdfObj.setDirGenerale(dirGenerale);
        assertTrue(pdfObj.isDirGenerale());

        // Test setter e getter per livelloDirettore
        String livelloDirettore = "Dirigente";
        pdfObj.setLivelloDirettore(livelloDirettore);
        assertEquals(livelloDirettore, pdfObj.getLivelloDirettore());
    }

    @Test
    public void testDefaultConstructor() {
        PdfObj pdfObj = new PdfObjTestImpl();
        assertNotNull(pdfObj);
        assertNull(pdfObj.getCodSede());
        assertNull(pdfObj.getDescSede());
        assertNull(pdfObj.getDataStipula());
        assertNull(pdfObj.getDataStipulaStr());
        assertNull(pdfObj.getDataPagamento());
        assertNull(pdfObj.getTipoMutuo());
        assertNull(pdfObj.getTipoPagamento());
        assertNull(pdfObj.getDescrMutuo());
        assertNull(pdfObj.getDirettoreSede());
        assertNull(pdfObj.getImportoBonifico());
        assertNull(pdfObj.getImportoMutuo());
        assertNull(pdfObj.getImportoEstinzione());
        assertNull(pdfObj.getImportoResiduoMutuo());
        assertNull(pdfObj.getImportoRata());
        assertNull(pdfObj.getRateResidue());
        assertNull(pdfObj.getSedeFiliali());
        assertFalse(pdfObj.isDirGenerale());
        assertNull(pdfObj.getLivelloDirettore());
    }

    @Test
    public void testSettersWithNull() {
        PdfObj pdfObj = new PdfObjTestImpl();

        pdfObj.setCodSede(null);
        assertNull(pdfObj.getCodSede());

        pdfObj.setDescSede(null);
        assertNull(pdfObj.getDescSede());

        pdfObj.setDataStipula(null);
        assertNull(pdfObj.getDataStipula());

        pdfObj.setDataStipulaStr(null);
        assertNull(pdfObj.getDataStipulaStr());

        pdfObj.setDataPagamento(null);
        assertNull(pdfObj.getDataPagamento());

        pdfObj.setTipoMutuo(null);
        assertNull(pdfObj.getTipoMutuo());

        pdfObj.setTipoPagamento(null);
        assertNull(pdfObj.getTipoPagamento());

        pdfObj.setDescrMutuo(null);
        assertNull(pdfObj.getDescrMutuo());

        pdfObj.setDirettoreSede(null);
        assertNull(pdfObj.getDirettoreSede());

        pdfObj.setImportoBonifico(null);
        assertNull(pdfObj.getImportoBonifico());

        pdfObj.setImportoMutuo(null);
        assertNull(pdfObj.getImportoMutuo());

        pdfObj.setImportoEstinzione(null);
        assertNull(pdfObj.getImportoEstinzione());

        pdfObj.setImportoResiduoMutuo(null);
        assertNull(pdfObj.getImportoResiduoMutuo());

        pdfObj.setImportoRata(null);
        assertNull(pdfObj.getImportoRata());

        pdfObj.setRateResidue(null);
        assertNull(pdfObj.getRateResidue());

        pdfObj.setSedeFiliali(null);
        assertNull(pdfObj.getSedeFiliali());

        pdfObj.setDirGenerale(false);
        assertFalse(pdfObj.isDirGenerale());

        pdfObj.setLivelloDirettore(null);
        assertNull(pdfObj.getLivelloDirettore());
    }
}
