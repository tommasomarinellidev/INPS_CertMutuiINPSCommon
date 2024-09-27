package it.inps.eng.wscertificazionemutui.common.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatiWorkflowEnumTest {

    @Test
    void testGetStato() {
        assertEquals(1L, StatiWorkflowEnum.IN_REDAZIONE.getStato());
        assertEquals(2L, StatiWorkflowEnum.IN_APPROVAZIONE.getStato());
        assertEquals(3L, StatiWorkflowEnum.IN_PUBBLICAZIONE.getStato());
        assertEquals(-1L, StatiWorkflowEnum.STATO_NON_PERMESSO.getStato());
    }

    @Test
    void testGetDescrizione() {
        assertEquals("in redazione", StatiWorkflowEnum.IN_REDAZIONE.getDescrizione());
        assertEquals("in approvazione", StatiWorkflowEnum.IN_APPROVAZIONE.getDescrizione());
        assertEquals("in pubblicazione", StatiWorkflowEnum.IN_PUBBLICAZIONE.getDescrizione());
        assertEquals("STATO NON PERMESSO", StatiWorkflowEnum.STATO_NON_PERMESSO.getDescrizione());
    }

    @Test
    void testDecode() {
        assertEquals(StatiWorkflowEnum.IN_REDAZIONE, StatiWorkflowEnum.decode(1L));
        assertEquals(StatiWorkflowEnum.IN_APPROVAZIONE, StatiWorkflowEnum.decode(2L));
        assertEquals(StatiWorkflowEnum.IN_PUBBLICAZIONE, StatiWorkflowEnum.decode(3L));
        assertEquals(StatiWorkflowEnum.STATO_NON_PERMESSO, StatiWorkflowEnum.decode(-1L));
        assertEquals(StatiWorkflowEnum.STATO_NON_PERMESSO, StatiWorkflowEnum.decode(999L)); // Test con stato non esistente
    }

    @Test
    void testDecodeWithInvalidValue() {
        // Test with a value not in the enum
        assertEquals(StatiWorkflowEnum.STATO_NON_PERMESSO, StatiWorkflowEnum.decode(-999L));
        assertEquals(StatiWorkflowEnum.STATO_NON_PERMESSO, StatiWorkflowEnum.decode(1000L));
    }
}
