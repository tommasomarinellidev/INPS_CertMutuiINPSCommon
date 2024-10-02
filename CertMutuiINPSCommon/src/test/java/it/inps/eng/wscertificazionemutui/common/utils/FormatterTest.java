package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class FormatterTest {

    @Test
    void testFormatDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        assertEquals(sdf.format(date), Formatter.formatDate(date));
        assertEquals("", Formatter.formatDate(null));
    }

    @Test
    void testFormatDateNew() {
        Date date = new Date();
        SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        assertEquals(sdfNew.format(date), Formatter.formatDateNew(date));
        assertEquals("", Formatter.formatDateNew(null));
    }

    @Test
    void testFormatDateToStringFromSDF() {
        Date date = new Date();
        SimpleDateFormat sdfCustom = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals(sdfCustom.format(date), Formatter.formatDateToStringFromSDF(date, "yyyy-MM-dd"));
        assertEquals("", Formatter.formatDateToStringFromSDF(null, "yyyy-MM-dd"));
    }

    @Test
    void testFormatDouble() {
        assertEquals("1,00", Formatter.formatDouble(1.0));
        assertEquals("1,20", Formatter.formatDouble(1.2));
        assertEquals("1.000,00", Formatter.formatDouble(1000.0));
        assertEquals("", Formatter.formatDouble((Double) null));
    }

    @Test
    void testNotNull() {
        assertEquals("", Formatter.notNull(null));
        assertEquals("Test", Formatter.notNull("Test"));
        assertEquals(123, Formatter.notNull(123));
    }

    @Test
    void testAnnoMeseToString() {
        assertEquals("202309", Formatter.annoMeseToString(2023, 9));
        assertEquals("202312", Formatter.annoMeseToString(2023, 12));
        assertNull(Formatter.annoMeseToString(0, 0));
    }

    @Test
    void testMeseAnnoToString() {
        assertEquals("09/2023", Formatter.meseAnnoToString(2023, 9));
        assertEquals("12/2023", Formatter.meseAnnoToString(2023, 12));
        assertNull(Formatter.meseAnnoToString(0, 0));
    }

    @Test
    void testTimestampToStringDate() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        assertEquals(sdf.format(timestamp), Formatter.timestampToStringDate(timestamp));
        assertEquals("", Formatter.timestampToStringDate(null));
    }

    @Test
    void testTimestampToStringDateNew() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        assertEquals(sdfNew.format(timestamp), Formatter.timestampToStringDateNew(timestamp));
        assertEquals("", Formatter.timestampToStringDateNew(null));
    }

    @Test
    void testFormatAnnoMese() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String formattedDate = sdf.format(date);
        assertEquals(formattedDate, Formatter.formatAnnoMese(date));
    }

    @Test
    void testFormatMeseAnno() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        String formattedDate = sdf.format(date);
        assertEquals(formattedDate, Formatter.formatMeseAnno(date));
    }

    @Test
    void testFormatAnnoMeseString() {
        // Creiamo una data specifica da passare al metodo
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.MAY, 1);
        Date date = calendar.getTime();
        
        // Testiamo il metodo con input di tipo Date
        assertEquals("2023/05", Formatter.formatAnnoMese((Date) date)); // Cast esplicito a Date
    }

    @Test
    void testFormatMeseAnnoString() {
        // Creiamo una data specifica da passare al metodo
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.MAY, 1);
        Date date = calendar.getTime();
        
        // Testiamo il metodo con input di tipo Date
        assertEquals("05/2023", Formatter.formatMeseAnno((Date) date)); // Cast esplicito a Date
    }



    @Test
    void testGetMese() {
        assertEquals("gennaio", Formatter.getMese(1));
        assertEquals("Mese errato", Formatter.getMese(13));
    }

    @Test
    void testGetEnglishData() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        assertEquals(sdf.format(date), Formatter.getEnglishData(date));
    }

    @Test
    void testGetMeseWithZero() {
        assertEquals("01", Formatter.getMeseWithZero(1));
        assertEquals("09", Formatter.getMeseWithZero(9));
        assertEquals("10", Formatter.getMeseWithZero(10));
    }

    @Test
    void testGetDataOra() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        assertEquals(sdf.format(date), Formatter.getDataOra(date));
    }

    @Test
    void testGetDataOraEnglish() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd hh.mm");
        assertEquals(sdf.format(date), Formatter.getDataOraEnglish(date));
    }

    @Test
    void testGetData() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        assertEquals(sdf.format(date), Formatter.getData(date));
    }

    @Test
    void testSwapCodiceSede() {
        assertEquals("desc/codice", Formatter.swapCodiceSede("codice/desc"));
        assertEquals("codice/desc", Formatter.swapCodiceSede("desc/codice"));
        assertEquals("test", Formatter.swapCodiceSede("test"));
    }

    @Test
    void testN2l() {
        assertEquals("uno/00", Formatter.n2l(1.00));
        assertEquals("mille/00", Formatter.n2l(1000.00));
        assertEquals("duecento/00", Formatter.n2l(200.00));
    }

    @Test
    public void testFormatAnnoMese_InputTooShort() {
        // Test con input più corto di 6 caratteri
        String input = "2023";
        String result = Formatter.formatAnnoMese(input);
        assertEquals(input, result, "Il metodo deve restituire l'input se la lunghezza è inferiore a 6 caratteri.");
    }

    @Test
    public void testFormatAnnoMese_ValidInput() {
        // Test con input valido di esattamente 6 caratteri
        String input = "202309";
        String expectedOutput = "2023/09";
        String result = Formatter.formatAnnoMese(input);
        assertEquals(expectedOutput, result, "Il metodo deve formattare l'input nel formato 'yyyy/MM' se la lunghezza è esattamente 6 caratteri.");
    }

    @Test
    public void testFormatAnnoMese_InputLongerThan6() {
        // Test con input più lungo di 6 caratteri
        String input = "20230911";
        String result = Formatter.formatAnnoMese(input);
        assertEquals(input, result, "Il metodo deve restituire l'input così com'è se la lunghezza è maggiore di 6 caratteri.");
    }

    @Test
    public void testFormatAnnoMese_Exactly6Characters() {
        // Test con input esattamente di 6 caratteri che deve essere formattato correttamente
        String input = "202312";
        String expectedOutput = "2023/12";
        String result = Formatter.formatAnnoMese(input);
        assertEquals(expectedOutput, result, "Il metodo deve correttamente formattare l'input nel formato 'yyyy/MM' quando la lunghezza è esattamente 6 caratteri.");
    }

    @Test
    public void testFormatMeseAnno_ShortInput() {
        // Test con input meno di 6 caratteri
        String result = Formatter.formatMeseAnno("2024");
        assertEquals("2024", result, "Il metodo dovrebbe restituire l'input originale se la lunghezza è minore di 6.");
    }

    @Test
    public void testFormatMeseAnno_ValidInput() {
        // Test con input valido (formato corretto: YYYYMM)
        String result = Formatter.formatMeseAnno("202409");
        assertEquals("09/2024", result, "Il metodo dovrebbe restituire MM/YYYY con input valido.");
    }

    @Test
    public void testFormatMeseAnno_InvalidInput() {
        // Test con input non valido (lunghezza maggiore di 6)
        String result = Formatter.formatMeseAnno("20240999");
        assertEquals("999/2024", result, "Il metodo dovrebbe gestire input più lunghi di 6 caratteri e frazionare i primi 6.");
    }

    @Test
    public void testFormatMeseAnno_EmptyString() {
        // Test con stringa vuota
        String result = Formatter.formatMeseAnno("");
        assertEquals("", result, "Il metodo dovrebbe restituire una stringa vuota per input vuoto.");
    }
}
