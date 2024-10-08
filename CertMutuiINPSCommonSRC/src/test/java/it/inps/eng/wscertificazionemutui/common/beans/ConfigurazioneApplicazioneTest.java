package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConfigurazioneApplicazioneTest {

    private ConfigurazioneApplicazione configurazione;

    @BeforeEach
    public void setUp() {
        configurazione = new ConfigurazioneApplicazione();
    }

    @Test
    public void testGetAndSetChiave() {
        configurazione.setChiave("chiaveTest");
        assertEquals("chiaveTest", configurazione.getChiave(), "Il metodo getChiave() non restituisce il valore atteso.");
    }

    @Test
    public void testGetAndSetValore() {
        configurazione.setValore("valoreTest");
        assertEquals("valoreTest", configurazione.getValore(), "Il metodo getValore() non restituisce il valore atteso.");
    }

    @Test
    public void testChiaveNotNullAfterSet() {
        configurazione.setChiave("chiaveNonNulla");
        assertNotNull(configurazione.getChiave(), "Il metodo getChiave() restituisce null nonostante sia stato impostato un valore.");
    }

    @Test
    public void testValoreNotNullAfterSet() {
        configurazione.setValore("valoreNonNullo");
        assertNotNull(configurazione.getValore(), "Il metodo getValore() restituisce null nonostante sia stato impostato un valore.");
    }

    @Test
    public void testChiaveIsNullByDefault() {
        assertNull(configurazione.getChiave(), "Il valore predefinito di chiave dovrebbe essere null.");
    }

    @Test
    public void testValoreIsNullByDefault() {
        assertNull(configurazione.getValore(), "Il valore predefinito di valore dovrebbe essere null.");
    }
}
