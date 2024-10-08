package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelperUtilsTest {
//
//    @Test
//    void testGetInstance() {
//        // Testiamo che getInstance() ritorni sempre la stessa istanza (Singleton pattern)
//        HelperUtils instance1 = HelperUtils.getInstance();
//        HelperUtils instance2 = HelperUtils.getInstance();
//        assertNotNull(instance1);
//        assertNotNull(instance2);
//        assertSame(instance1, instance2);
//    }
//
//    @Test
//    void testStringReplaceLast() {
//        HelperUtils helper = HelperUtils.getInstance();
//        
//        // Caso base: sostituzione dell'ultima occorrenza
//        String result1 = helper.stringReplaceLast("abc def abc", "abc", "xyz");
//        assertEquals("abc def xyz", result1);
//
//        // Caso: stringa senza il pattern da sostituire
//        String result2 = helper.stringReplaceLast("abc def abc", "ghi", "xyz");
//        assertEquals("abc def abc", result2);
//
//        // Caso: sostituzione in una stringa vuota
//        String result3 = helper.stringReplaceLast("", "abc", "xyz");
//        assertEquals("", result3);
//
//        // Caso: sostituzione con stringa vuota
//        String result4 = helper.stringReplaceLast("abc abc abc", "abc", "");
//        assertEquals("abc abc ", result4);
//
//        // Caso: sostituzione con from vuoto
//        String result5 = helper.stringReplaceLast("test", "", "xyz");
//        assertEquals("test", result5);
//
//    }
//
//    @Test
//    void testGetFileExtension() {
//        HelperUtils helper = HelperUtils.getInstance();
//        
//        // Caso base: estensione presente
//        String result1 = helper.getFileExtension("document.txt");
//        assertEquals("txt", result1);
//
//        // Caso: file senza estensione
//        String result2 = helper.getFileExtension("document");
//        assertEquals("", result2);
//
//        // Caso: file con estensione e percorso
//        String result3 = helper.getFileExtension("/path/to/document.pdf");
//        assertEquals("pdf", result3);
//
//        // Caso: file con percorso e senza estensione
//        String result4 = helper.getFileExtension("/path/to/document");
//        assertEquals("", result4);
//
//        // Caso: file con più punti nel nome
//        String result5 = helper.getFileExtension("archive.tar.gz");
//        assertEquals("gz", result5);
//
//        // Caso: nome file con separatori misti
//        String result6 = helper.getFileExtension("C:\\path\\to\\file.doc");
//        assertEquals("doc", result6);
//    }
//
//    @Test
//    void testGetStringFromBoolean() {
//        HelperUtils helper = HelperUtils.getInstance();
//        
//        // Caso: valore Boolean TRUE
//        String result1 = helper.getStringFromBoolean(Boolean.TRUE);
//        assertEquals("S", result1);
//
//        // Caso: valore Boolean FALSE
//        String result2 = helper.getStringFromBoolean(Boolean.FALSE);
//        assertEquals("N", result2);
//
//        // Caso: valore Boolean NULL
//        String result3 = helper.getStringFromBoolean(null);
//        assertEquals("N", result3);
//    }
}
