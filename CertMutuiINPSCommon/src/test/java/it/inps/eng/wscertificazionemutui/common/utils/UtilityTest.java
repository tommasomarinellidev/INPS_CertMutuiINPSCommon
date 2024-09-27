package it.inps.eng.wscertificazionemutui.common.utils;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {
//
//    @Test
//    void testNotNull() {
//        assertEquals("test", Utility.notNull("test"));
//        assertEquals("", Utility.notNull(null));
//    }
//
//    @Test
//    void testNotNullTrimmed() {
//        assertEquals("test", Utility.notNullTrimmed(" test "));
//        assertEquals("", Utility.notNullTrimmed(null));
//        assertEquals("", Utility.notNullTrimmed("   "));
//    }
//
//    @Test
//    void testCapitalize() {
//        assertEquals("Test", Utility.capitalize("test"));
//        assertEquals("Test", Utility.capitalize("TEST"));
//        assertEquals("Test", Utility.capitalize("TeSt"));
//        assertNull(Utility.capitalize(null));
//        assertEquals("", Utility.capitalize(""));
//    }
//
//    @Test
//    void testAnnoMeseToDate() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        // Test valido
//        try {
//            Date expectedDate = sdf.parse("2024-09-01");
//            assertEquals(expectedDate, Utility.annoMeseToDate("202409"));
//        } catch (ParseException e) {
//            fail("Date parsing failed");
//        }
//
//        // Test non valido
//        assertNull(Utility.annoMeseToDate(null));
//        assertNull(Utility.annoMeseToDate("20240901"));
//        assertNull(Utility.annoMeseToDate("2024"));
//        assertNull(Utility.annoMeseToDate("abcd"));
//    }
//
//    @Test
//    void testStringToDate() {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//        // Test valido
//        try {
//            Date expectedDate = sdf.parse("01/09/2024");
//            assertEquals(expectedDate, Utility.stringToDate("01/09/2024"));
//        } catch (ParseException e) {
//            fail("Date parsing failed");
//        }
//
//        // Test non valido
//        assertNull(Utility.stringToDate(null));
//        assertNull(Utility.stringToDate("01/09/2024/"));
//        assertNull(Utility.stringToDate("01-09-2024"));
//        assertNull(Utility.stringToDate("01/09/24"));
//    }
//
//    @Test
//    void testFormatDate() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//
//        // Test valido
//        try {
//            Date date = sdf.parse("20240901");
//            assertEquals("20240901", Utility.formatDate(date));
//        } catch (ParseException e) {
//            fail("Date parsing failed");
//        }
//
//        // Test null
//        assertEquals("", Utility.formatDate(null));
//    }
//
//    @Test
//    void testFormatDouble() {
//        assertEquals("123.46", Utility.formatDouble(123.456));
//        assertEquals("123.45", Utility.formatDouble(123.454));
//        assertEquals("0.00", Utility.formatDouble(0));
//        assertEquals("0.00", Utility.formatDouble(-0.005));
//    }
//
//    @Test
//    void testFormatDoubleDown() {
//        assertEquals("123.45", Utility.formatDoubleDown(123.456));
//        assertEquals("123.45", Utility.formatDoubleDown(123.454));
//        assertEquals("0.00", Utility.formatDoubleDown(0));
//        assertEquals("0.00", Utility.formatDoubleDown(-0.005));
//    }
//
//    @Test
//    void testFormatNumber() {
//        assertEquals("123,456.78", Utility.formatNumber(123456.78));
//        assertEquals("0.00", Utility.formatNumber(0));
//    }
//
//    @Test
//    void testFormatSignedNumber() {
//        assertEquals("¤ +123,456.78", Utility.formatSignedNumber(123456.78));
//        assertEquals("¤ -123,456.78", Utility.formatSignedNumber(-123456.78));
//        assertEquals("¤ +0.00", Utility.formatSignedNumber(0));
//    }
//
//    @Test
//    void testPadLeft() {
//        assertEquals("000123", Utility.padLeft("123", '0', 6));
//        assertEquals("   123", Utility.padLeft("123", ' ', 6));
//        assertEquals("123", Utility.padLeft("123", '0', 3)); // non fa nulla
//        assertNull(Utility.padLeft(null, '0', 6));
//    }
//
//    @Test
//    void testPadRight() {
//        assertEquals("123000", Utility.padRight("123", '0', 6));
//        assertEquals("123   ", Utility.padRight("123", ' ', 6));
//        assertEquals("123", Utility.padRight("123", '0', 3)); // non fa nulla
//        assertNull(Utility.padRight(null, '0', 6));
//    }
//
//    @Test
//    void testRoundTo() {
//        assertEquals(123.46, Utility.roundTo(123.456, 2));
//        assertEquals(123.45, Utility.roundTo(123.454, 2));
//        assertEquals(0.00, Utility.roundTo(0, 2));
//        assertEquals(-0.01, Utility.roundTo(-0.005, 2));
//    }
//
//    @Test
//    void testToDate() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        // Test valido
//        try {
//            Date expectedDate = sdf.parse("2024-09-01");
//            assertEquals(expectedDate, Utility.toDate(1, 9, 2024));
//        } catch (ParseException e) {
//            fail("Date parsing failed");
//        }
//    }
//
//    @Test
//    void testToday() {
//        Date today = new Date();
//        // Use a small delta to account for the time difference in milliseconds
//        assertTrue(Math.abs(today.getTime() - Utility.today().getTime()) < 1000);
//    }
//
//    @Test
//    void testToHMS() {
//        assertEquals("00:00:00.000", Utility.toHMS(0));
//        assertEquals("01:01:01.001", Utility.toHMS(3661001));
//        assertEquals("23:59:59.999", Utility.toHMS(86399999));
//    }
//
//    @Test
//    void testToSQLDate() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        // Test valido
//        try {
//            Date date = sdf.parse("2024-09-01");
//            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//            assertEquals(sqlDate, Utility.toSQLDate(date));
//        } catch (ParseException e) {
//            fail("Date parsing failed");
//        }
//
//        // Test null
//        assertNull(Utility.toSQLDate(null));
//    }
//
//    @Test
//    void testDecodeSede() {
//        assertEquals("DIREZIONE GENERALE", Utility.decodeSede("001234", "Some Desc"));
//        assertEquals("Some Desc", Utility.decodeSede("123456", "Some Desc"));
//        assertEquals("Some Desc", Utility.decodeSede(null, "Some Desc"));
//        assertEquals("Some Desc", Utility.decodeSede("", "Some Desc"));
//    }
//
//    @Test
//    void testAggiungiApostrofo() {
//        assertEquals("O'Neill", Utility.aggiungiApostrofo("O'Neill"));
//        assertEquals("O''Neill", Utility.aggiungiApostrofo("O'Neill"));
//        assertEquals("O''Neill''", Utility.aggiungiApostrofo("O'Neill'"));
//        assertEquals("", Utility.aggiungiApostrofo(""));
//        assertNull(Utility.aggiungiApostrofo(null));
//    }
}
