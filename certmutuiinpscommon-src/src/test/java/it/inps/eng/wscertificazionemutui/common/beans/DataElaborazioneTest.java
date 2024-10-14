package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class DataElaborazioneTest {

    private DataElaborazione dataElaborazione;

    @BeforeEach
    public void setUp() {
        dataElaborazione = new DataElaborazione();
    }

    @Test
    public void testGetAndSetTipoElaborazione() {
        dataElaborazione.setTipo_elaborazione("Mensile");
        assertEquals("Mensile", dataElaborazione.getTipo_elaborazione(), "Il metodo getTipo_elaborazione() non restituisce il valore atteso.");
    }

    @Test
    public void testGetAndSetAnnoMeseElab() {
        dataElaborazione.setAnno_mese_elab("202309");
        assertEquals("202309", dataElaborazione.getAnno_mese_elab(), "Il metodo getAnno_mese_elab() non restituisce il valore atteso.");
    }

    @Test
    public void testGetAndSetAnnoCert() {
        dataElaborazione.setAnno_cert("2023");
        assertEquals("2023", dataElaborazione.getAnno_cert(), "Il metodo getAnno_cert() non restituisce il valore atteso.");
    }

    @Test
    public void testGetAndSetDtUltAgg() {
        Date dtUltAgg = new Date(System.currentTimeMillis());
        dataElaborazione.setDt_ult_agg(dtUltAgg);
        assertEquals(dtUltAgg, dataElaborazione.getDt_ult_agg(), "Il metodo getDt_ult_agg() non restituisce il valore atteso.");
    }

    @Test
    public void testGetAndSetMatrUltAgg() {
        dataElaborazione.setMatr_ult_agg("123456");
        assertEquals("123456", dataElaborazione.getMatr_ult_agg(), "Il metodo getMatr_ult_agg() non restituisce il valore atteso.");
    }

    @Test
    public void testSerialVersionUID() {
        assertEquals(8169514628839040495L, DataElaborazione.getSerialVersionUID(), "Il metodo getSerialVersionUID() non restituisce il valore atteso.");
    }

    @Test
    public void testTipoElaborazioneIsEmptyByDefault() {
        assertEquals("", dataElaborazione.getTipo_elaborazione(), "Il valore predefinito di tipo_elaborazione dovrebbe essere una stringa vuota.");
    }

    @Test
    public void testAnnoMeseElabIsEmptyByDefault() {
        assertEquals("", dataElaborazione.getAnno_mese_elab(), "Il valore predefinito di anno_mese_elab dovrebbe essere una stringa vuota.");
    }

    @Test
    public void testAnnoCertIsEmptyByDefault() {
        assertEquals("", dataElaborazione.getAnno_cert(), "Il valore predefinito di anno_cert dovrebbe essere una stringa vuota.");
    }

    @Test
    public void testDtUltAggIsNullByDefault() {
        assertNull(dataElaborazione.getDt_ult_agg(), "Il valore predefinito di dt_ult_agg dovrebbe essere null.");
    }

    @Test
    public void testMatrUltAggIsEmptyByDefault() {
        assertEquals("", dataElaborazione.getMatr_ult_agg(), "Il valore predefinito di matr_ult_agg dovrebbe essere una stringa vuota.");
    }
}
