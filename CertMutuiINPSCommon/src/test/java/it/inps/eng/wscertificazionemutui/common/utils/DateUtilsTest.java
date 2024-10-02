package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class DateUtilsTest {

    @Test
    public void testGetNormalizatedDate() {
        Date date = new Date(0); // 01/01/1970
        String format = "yyyy-MM-dd";
        String expected = "1970-01-01";
        String actual = DateUtils.getNormalizatedDate(date, format);
        assertEquals(expected, actual, "Formatted date should match the expected format.");
    }

    @Test
    public void testGetDataCorrente() {
        Date date = new Date(0); // 01/01/1970
        String format = "dd/MM/yyyy";
        String expected = "01/01/1970";
        String actual = DateUtils.getDataCorrente(date, format);
        assertEquals(expected, actual, "Current date format should be correct.");
    }

    @Test
    public void testToXMLGregorianCalendar_NullDate() {
        XMLGregorianCalendar xmlCalendar = new DateUtils().toXMLGregorianCalendar(null);
        assertNull(xmlCalendar, "XMLGregorianCalendar should be null when input date is null.");
    }

    @Test
    public void testGetAnnoCert() {
        String annoCert = DateUtils.getAnnoCert();
        int expectedYear = Calendar.getInstance().get(Calendar.YEAR) - 1;
        assertEquals(String.valueOf(expectedYear), annoCert, "The year should be last year.");
    }

    @Test
    public void testUtilDateToSqlDate() throws ParseException {
        String dateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date utilDate = sdf.parse("2024-09-15");
        java.sql.Date sqlDate = DateUtils.utilDateToSqlDate(dateFormat, utilDate);
        assertEquals(java.sql.Date.valueOf("2024-09-15"), sqlDate, "SQL Date should be correctly converted from util date.");
    }

    @Test
    public void testGetEnglishData() {
        Date date = new Date(0); // 01/01/1970
        String expected = "19700101";
        String actual = DateUtils.getEnglishData(date);
        assertEquals(expected, actual, "Date in English format should be correct.");
    }

    @Test
    public void testGetDataOraEnglish() {
        Date date = new Date(0); // 01/01/1970
        String expected = "19700101 12.00.00.000";
        String actual = DateUtils.getDataOraEnglish(date);
        assertEquals(expected, actual, "Date and time in English format should be correct.");
    }

    @Test
    public void testGetDataOraEnglish_NullDate() {
        String actual = DateUtils.getDataOraEnglish(null);
        assertEquals("", actual, "If date is null, it should return an empty string.");
    }

    @Test
    public void testAddDays() {
        Date date = new Date(0); // 01/01/1970
        Date expectedDate = new Date(5 * 24 * 60 * 60 * 1000L); // 06/01/1970
        Date actualDate = DateUtils.addDays(date, 5);
        assertEquals(expectedDate, actualDate, "Adding days should be correct.");
    }
    
    @Test
    public void testToXMLGregorianCalendar() {
        // Test per il metodo toXMLGregorianCalendar
        DateUtils dateUtils = new DateUtils();

        // Test con una data valida
        Date date = new GregorianCalendar(2024, 8, 11).getTime(); // 11 Settembre 2024
        XMLGregorianCalendar xmlGregorianCalendar = dateUtils.toXMLGregorianCalendar(date);
        assertNotNull(xmlGregorianCalendar);
        assertEquals(2024, xmlGregorianCalendar.getYear());
        assertEquals(9, xmlGregorianCalendar.getMonth());
        assertEquals(11, xmlGregorianCalendar.getDay());

        // Test con data nulla
        assertNull(dateUtils.toXMLGregorianCalendar(null));
    }

    @Test
    public void testGetAnnoMeseDataSucc() {
        // Test per il metodo getAnnoMeseDataSucc
        assertEquals("202401", DateUtils.getAnnoMeseDataSucc("202312"));
        assertEquals("202401", DateUtils.getAnnoMeseDataSucc("2023/12"));
        assertEquals("202309", DateUtils.getAnnoMeseDataSucc("202308"));
        assertEquals("202310", DateUtils.getAnnoMeseDataSucc("202309"));
        assertEquals("202310", DateUtils.getAnnoMeseDataSucc("2023/09"));
    }

    @Test
    public void testGetAnnoMeseDataPrec() {
        // Test per il metodo getAnnoMeseDataPrec
        assertEquals("202311", DateUtils.getAnnoMeseDataPrec("202312"));
        assertEquals("202311", DateUtils.getAnnoMeseDataPrec("2023/12"));
        assertEquals("202308", DateUtils.getAnnoMeseDataPrec("202309"));
        assertEquals("202308", DateUtils.getAnnoMeseDataPrec("2023/09"));
        assertEquals("202312", DateUtils.getAnnoMeseDataPrec("202301"));
    }

    @Test
    public void testGetNomeMese() {
        // Test per il metodo getNomeMese
        assertEquals("gennaio", DateUtils.getNomeMese(1));
        assertEquals("febbraio", DateUtils.getNomeMese(2));
        assertEquals("marzo", DateUtils.getNomeMese(3));
        assertEquals("aprile", DateUtils.getNomeMese(4));
        assertEquals("maggio", DateUtils.getNomeMese(5));
        assertEquals("giugno", DateUtils.getNomeMese(6));
        assertEquals("luglio", DateUtils.getNomeMese(7));
        assertEquals("agosto", DateUtils.getNomeMese(8));
        assertEquals("settembre", DateUtils.getNomeMese(9));
        assertEquals("ottobre", DateUtils.getNomeMese(10));
        assertEquals("novembre", DateUtils.getNomeMese(11));
        assertEquals("dicembre", DateUtils.getNomeMese(12));

        // Test per valore non valido
        assertNull(DateUtils.getNomeMese(13));
    }
}

