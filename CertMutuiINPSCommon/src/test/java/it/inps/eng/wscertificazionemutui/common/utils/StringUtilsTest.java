package it.inps.eng.wscertificazionemutui.common.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
//
//    @Test
//    void testRiempimentoConZeri() {
//        assertEquals("000123", StringUtils.riempimentoConZeri("123", 6));
//        assertEquals("0000123", StringUtils.riempimentoConZeri("123", 7));
//        assertEquals("123", StringUtils.riempimentoConZeri("123", 3)); // Caso con lunghezza uguale
//        assertEquals("000", StringUtils.riempimentoConZeri("", 3)); // Caso con stringa vuota
//    }
//
//    @Test
//    void testNotNull() {
//        assertEquals("test", StringUtils.notNull("test"));
//        assertEquals("", StringUtils.notNull(null));
//    }
//
//    @Test
//    void testCapitalizer() {
//        assertEquals("Hello World", StringUtils.capitalizer("hello world"));
//        assertEquals("Ciao Amico", StringUtils.capitalizer("ciao amico"));
//        assertEquals("Là Dove", StringUtils.capitalizer("là dove"));
//        assertEquals("È Un Test", StringUtils.capitalizer("è un test"));
//    }
//    
//    @Test
//    public void testTipoSedeResult_Aquila() {
//        String tipo = "azienda";
//        String sede = "L’AQUILA";
//
//        // Il risultato atteso è "Azienda L'Aquila" con la corretta capitalizzazione
//        String expected = "Azienda L'Aquila";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_Aosta() {
//        String tipo = "ente";
//        String sede = "AOSTA";
//
//        // Il risultato atteso è "Ente Valle d'Aosta"
//        String expected = "Ente Valle d'Aosta";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeConParentesi() {
//        String tipo = "azienda";
//        String sede = "Milano (sede centrale)";
//
//        // Il risultato atteso è che la parte tra parentesi venga rimossa
//        String expected = "Azienda Milano";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeConTrattino() {
//        String tipo = "ufficio";
//        String sede = "Torino-ovest";
//
//        // Il risultato atteso è che la parola dopo il trattino sia capitalizzata
//        String expected = "Ufficio Torino-Ovest";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeConDi() {
//        String tipo = "società";
//        String sede = "San Giovanni Di Napoli";
//
//        // Il risultato atteso è che "Di" venga sostituito con "di"
//        String expected = "Società San Giovanni di Napoli";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeGenerica() {
//        String tipo = "azienda";
//        String sede = "Firenze";
//
//        // Il risultato atteso è "Azienda Firenze" senza modifiche particolari
//        String expected = "Azienda Firenze";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_TipoNull() {
//        String tipo = null;
//        String sede = "Roma";
//
//        // Ci aspettiamo che venga lanciato un NullPointerException se tipo è null
//        assertThrows(NullPointerException.class, () -> {
//            StringUtils.tipoSedeResult(tipo, sede);
//        });
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeNull() {
//        String tipo = "azienda";
//        String sede = null;
//
//        // Ci aspettiamo che venga lanciato un NullPointerException se sede è null
//        assertThrows(NullPointerException.class, () -> {
//            StringUtils.tipoSedeResult(tipo, sede);
//        });
//    }
//
//    @Test
//    public void testTipoSedeResult_TipoVuoto() {
//        String tipo = "";
//        String sede = "Napoli";
//
//        // Il risultato atteso è che venga concatenato solo la sede
//        String expected = " Napoli"; // "tipo" è vuoto
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeVuota() {
//        String tipo = "azienda";
//        String sede = "";
//
//        // Il risultato atteso è che venga concatenato solo il tipo
//        String expected = "Azienda "; // sede è vuota
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_SedeContieneApostrofo() {
//        String tipo = "società";
//        String sede = "L'AQUILA";
//
//        // Il risultato atteso è che la sede venga formattata correttamente senza modifiche
//        String expected = "Società L'Aquila";
//        String actual = StringUtils.tipoSedeResult(tipo, sede);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTipoSedeResult_Eccezione() {
//        String tipo = "azienda";
//        String sede = "sede che causa eccezione";
//
//        // Verifica che il metodo non lanci eccezioni non gestite dal blocco try-catch
//        assertDoesNotThrow(() -> {
//            StringUtils.tipoSedeResult(tipo, sede);
//        });
//    }
//    
//    @Test
//    public void testFormattaDoubleString_ValoreConVirgolaEDueDecimali() {
//        String val = "123,45";
//
//        // Il valore ha già due decimali, quindi dovrebbe rimanere invariato
//        String expected = "123,45";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFormattaDoubleString_ValoreConVirgolaEUnDecimale() {
//        String val = "123,4";
//
//        // Dovrebbe aggiungere uno zero dopo il decimale, diventando "123,40"
//        String expected = "123,40";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFormattaDoubleString_ValoreSenzaVirgola() {
//        String val = "123";
//
//        // Dovrebbe aggiungere ",00" al valore, diventando "123,00"
//        String expected = "123,00";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFormattaDoubleString_ValoreConZeroVirgola() {
//        String val = "0,5";
//
//        // Dovrebbe aggiungere uno zero dopo il decimale, diventando "0,50"
//        String expected = "0,50";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFormattaDoubleString_ValoreIntero() {
//        String val = "100";
//
//        // Dovrebbe aggiungere ",00", diventando "100,00"
//        String expected = "100,00";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFormattaDoubleString_ValoreConPiùDiDueDecimali() {
//        String val = "123,456";
//
//        // Il valore ha più di due decimali, quindi dovrebbe rimanere invariato
//        String expected = "123,456";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFormattaDoubleString_ValoreConVirgolaAllaFine() {
//        String val = "123,";
//
//        // Se c'è solo la virgola, dovrebbe aggiungere due zeri, diventando "123,00"
//        String expected = "123,00";
//        String actual = StringUtils.formattaDoubleString(val);
//
//        assertEquals(expected, actual);
//    }
}
