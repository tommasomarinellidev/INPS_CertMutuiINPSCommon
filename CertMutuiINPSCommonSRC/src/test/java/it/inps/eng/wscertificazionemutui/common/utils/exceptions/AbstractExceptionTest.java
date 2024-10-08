package it.inps.eng.wscertificazionemutui.common.utils.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractExceptionTest {

    @Test
    void testConstructorWithAllParameters() {
        Throwable cause = new Throwable("Cause of exception");
        AbstractException exception = new AbstractException("E001", "Error message", cause);

        assertEquals("E001", exception.getExCode());
        assertEquals("Error message", exception.getExMessage());
        assertEquals(cause, exception.getWrappedException());
        assertEquals("Error message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testConstructorWithNullCause() {
        AbstractException exception = new AbstractException("E002", "Error message", null);

        assertEquals("E002", exception.getExCode());
        assertEquals("Error message", exception.getExMessage());
        assertNull(exception.getWrappedException());
        assertEquals("Error message", exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithNullExCode() {
        Throwable cause = new Throwable("Another cause");
        AbstractException exception = new AbstractException(null, "Error message", cause);

        assertNull(exception.getExCode());
        assertEquals("Error message", exception.getExMessage());
        assertEquals(cause, exception.getWrappedException());
        assertEquals("Error message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testConstructorWithNullExMessage() {
        Throwable cause = new Throwable("Yet another cause");
        AbstractException exception = new AbstractException("E003", null, cause);

        assertEquals("E003", exception.getExCode());
        assertNull(exception.getExMessage());
        assertEquals(cause, exception.getWrappedException());
        assertNull(exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testGetSerialversionuid() {
        assertEquals(1L, AbstractException.getSerialversionuid());
    }
}

