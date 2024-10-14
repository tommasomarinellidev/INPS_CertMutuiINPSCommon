package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FormalCheckUtilsTest {

    private final FormalCheckUtils utils = FormalCheckUtils.getInstance();

    @Test
    public void testIsNumeric() {
        assertTrue(utils.isNumeric("123"), "The input '123' should be considered numeric.");
        assertTrue(utils.isNumeric("-123.45"), "The input '-123.45' should be considered numeric.");
        assertFalse(utils.isNumeric("abc"), "The input 'abc' should not be considered numeric.");
        assertFalse(utils.isNumeric(null), "A null input should not be considered numeric.");
        assertFalse(utils.isNumeric(""), "An empty input should not be considered numeric.");
    }

    @Test
    public void testIsEmptyString() {
        assertTrue(FormalCheckUtils.isEmptyString(null), "A null string should be considered empty.");
        assertTrue(FormalCheckUtils.isEmptyString(""), "An empty string should be considered empty.");
        assertTrue(FormalCheckUtils.isEmptyString("   "), "A whitespace string should be considered empty.");
        assertFalse(FormalCheckUtils.isEmptyString("text"), "A non-empty string should not be considered empty.");
    }

    @Test
    public void testIsEmptyBlob() {
        assertTrue(FormalCheckUtils.isEmptyBlob(null), "A null byte array should be considered empty.");
        assertTrue(FormalCheckUtils.isEmptyBlob(new byte[0]), "An empty byte array should be considered empty.");
        assertFalse(FormalCheckUtils.isEmptyBlob(new byte[]{1, 2, 3}), "A non-empty byte array should not be considered empty.");
    }

    @Test
    public void testIsEmptyObject() {
        assertTrue(FormalCheckUtils.isEmptyObject(null), "A null object should be considered empty.");
        assertFalse(FormalCheckUtils.isEmptyObject(new Object()), "A non-null object should not be considered empty.");
    }

    @Test
    public void testIsEmptyBoolean() {
        assertTrue(FormalCheckUtils.isEmptyBoolean(null), "A null Boolean should be considered empty.");
        assertFalse(FormalCheckUtils.isEmptyBoolean(Boolean.TRUE), "A non-null Boolean should not be considered empty.");
        assertFalse(FormalCheckUtils.isEmptyBoolean(Boolean.FALSE), "A non-null Boolean should not be considered empty.");
    }

    @Test
    public void testIsEmptyStringList() {
        assertTrue(FormalCheckUtils.isEmptyStringList(null), "A null list should be considered empty.");
        assertTrue(FormalCheckUtils.isEmptyStringList(Collections.emptyList()), "An empty list should be considered empty.");
        assertTrue(FormalCheckUtils.isEmptyStringList(Arrays.asList("")), "A list with an empty string should be considered empty.");
        assertFalse(FormalCheckUtils.isEmptyStringList(Arrays.asList("text")), "A list with a non-empty string should not be considered empty.");
    }

    @Test
    public void testIsListaVuota() {
        assertTrue(utils.isListaVuota(null), "A null list should be considered empty.");
        assertTrue(utils.isListaVuota(Collections.emptyList()), "An empty list should be considered empty.");
        assertFalse(utils.isListaVuota(Arrays.asList("item")), "A non-empty list should not be considered empty.");
    }

    @Test
    public void testIsExtValida() {
        List<String> extensions = Arrays.asList("jpg", "png", "gif");
        assertTrue(utils.isExtValida("photo.jpg", extensions), "The extension 'jpg' should be considered valid.");
        assertFalse(utils.isExtValida("document.pdf", extensions), "The extension 'pdf' should not be considered valid.");
        assertFalse(utils.isExtValida(null, extensions), "A null file name should not be considered valid.");
        assertFalse(utils.isExtValida("file", extensions), "A file name without an extension should not be considered valid.");
    }

    @Test
    public void testNNull() {
        assertEquals("test", utils.nNull("test"), "A non-null string should be returned as is.");
        assertEquals("", utils.nNull(null), "A null input should return an empty string.");
        assertEquals("123", utils.nNull(123), "An integer input should be converted to its string representation.");
    }
}