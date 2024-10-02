package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DataTest {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    
    private Date convertToDate(String dateStr) {
        try {
            return new Date(dateFormat.parse(dateStr).getTime());
        } catch (ParseException e) {
            throw new RuntimeException("Errore durante la conversione della data", e);
        }
    }

    @Test
    public void testGetDate() throws ParseException {
        String dateString = "15/09/2024";
        Date expectedDate = Date.valueOf("2024-09-15");
        Date actualDate = Data.getDate(dateString);
        assertEquals(expectedDate, actualDate, "Date should be parsed correctly.");
    }

    @Test
    public void testDataIsValid() {
        assertTrue(Data.dataIsValid("15/09/2024"), "Date should be valid in dd/MM/yyyy format.");
        assertFalse(Data.dataIsValid("2024-09-15"), "Date should be invalid in yyyy-MM-dd format.");
    }

    @Test
    public void testDataIsValid2() {
        assertTrue(Data.dataIsValid2("2024-09-15"), "Date should be valid in yyyy-MM-dd format.");
        assertFalse(Data.dataIsValid2("15/09/2024"), "Date should be invalid in dd/MM/yyyy format.");
    }

    @Test
    public void testAggiungiAnni() throws Exception {
        Date date = Date.valueOf("2024-09-15");
        Date expectedDate = Date.valueOf("2025-09-15");
        Date actualDate = Data.aggiungiAnni(1, date);
        assertEquals(expectedDate, actualDate, "Adding years to date should be correct.");
    }

    @Test
    public void testAggiungiGiorni() throws Exception {
        Date date = Date.valueOf("2024-09-15");
        Date expectedDate = Date.valueOf("2024-09-20");
        Date actualDate = Data.aggiungiGiorni(5, date);
        assertEquals(expectedDate, actualDate, "Adding days to date should be correct.");
    }

    @Test
    public void testAggiungiMesi() throws Exception {
        Date date = Date.valueOf("2024-09-15");
        Date expectedDate = Date.valueOf("2024-10-15");
        Date actualDate = Data.aggiungiMesi(1, date);
        assertEquals(expectedDate, actualDate, "Adding months to date should be correct.");
    }

    @Test
    public void testAnno() {
        Date date = Date.valueOf("2024-09-15");
        assertEquals(2024, Data.anno(date), "Year extraction should be correct.");
    }

    @Test
    public void testCalcolaEtaDecInAnniCompiuti() throws Exception {
        Date birthDate = Date.valueOf("2000-09-15");
        Date currentDate = Date.valueOf("2024-09-15");
        assertEquals(24, Data.calcolaEtaDecInAnniCompiuti(birthDate, currentDate), "Age calculation should be correct.");
    }

    @Test
    public void testDataDiOggi() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
        String expectedDate = sdf.format(new Date(System.currentTimeMillis()));
        String actualDate = Data.dataDiOggi();
        assertEquals(expectedDate, actualDate, "Today's date should be correct.");
    }

    @Test
    public void testDataDiOggiInMillisecondi() {
        long expectedMillis = System.currentTimeMillis();
        long actualMillis = Data.dataDiOggiInMillisecondi();
        assertEquals(expectedMillis, actualMillis, "Today's milliseconds should be correct.");
    }

    @Test
    public void testDataDiOggiPerDb2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String expectedDate = sdf.format(new Date(System.currentTimeMillis()));
        String actualDate = Data.dataDiOggiPerDb2();
        assertEquals(expectedDate, actualDate, "Today's date for DB2 should be correct.");
    }

    @Test
    public void testDataDiOggiPerVisualizzazione() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String expectedDate = sdf.format(new Date(System.currentTimeMillis()));
        String actualDate = Data.dataDiOggiPerVisualizzazione();
        assertEquals(expectedDate, actualDate, "Today's date for visualization should be correct.");
    }

    @Test
    public void testDistanzaInGiorni() throws Exception {
        Date startDate = Date.valueOf("2024-09-15");
        Date endDate = Date.valueOf("2024-09-20");
        assertEquals(5, Data.distanzaInGiorni(startDate, endDate), "Difference in days should be correct.");
    }

    @Test
    public void testEstrattiRuolo() {
        Date date = Date.valueOf("2024-09-15");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        String expectedRole = sdf.format(date);
        String actualRole = Data.estraiRuolo(date);
        assertEquals(expectedRole, actualRole, "Role extraction should be correct.");
    }

    @Test
    public void testGiorniMaxDelMese() {
        assertEquals(31, Data.giorniMaxDelMese(1, 2024), "January should have 31 days.");
        assertEquals(30, Data.giorniMaxDelMese(4, 2024), "April should have 30 days.");
        assertEquals(28, Data.giorniMaxDelMese(2, 2024), "February should have 28 days in non-leap year.");
        assertEquals(29, Data.giorniMaxDelMese(2, 2024), "February should have 29 days in leap year.");
    }

    @Test
    public void testGiorno() {
        Date date = Date.valueOf("2024-09-15");
        assertEquals(15, Data.giorno(date), "Day extraction should be correct.");
    }

    @Test
    public void testOggi_anno() throws Exception {
        Date today = Data.valoreDataOggi();
        assertEquals(2024, Data.Oggi_anno(), "Current year should be correct.");
    }

    @Test
    public void testOggi_giorno() throws Exception {
        Date today = Data.valoreDataOggi();
        assertEquals(15, Data.Oggi_giorno(), "Current day should be correct.");
    }

    @Test
    public void testOggi_mese() throws Exception {
        Date today = Data.valoreDataOggi();
        assertEquals(9, Data.Oggi_mese(), "Current month should be correct.");
    }

    @Test
    public void testOggi_ora_millisecondi() {
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss:SSS");
        String expectedTime = sdf.format(new java.util.Date(System.currentTimeMillis()));
        String actualTime = Data.Oggi_ora_millisecondi();
        assertEquals(expectedTime, actualTime, "Current time in milliseconds should be correct.");
    }

    @Test
    public void testOraCorrente() {
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
        String expectedTime = sdf.format(new java.util.Date(System.currentTimeMillis()));
        String actualTime = Data.oraCorrente();
        assertEquals(expectedTime, actualTime, "Current time should be correct.");
    }
    
    @Test
    public void testConvertiFormatoData() {
        // Test per il metodo convertiFormatoData
        assertEquals("2024-09-11", Data.convertiFormatoData("11/09/2024"));
        assertEquals("1990-01-01", Data.convertiFormatoData("01/01/1990"));
        
        // Test con input nullo
        try {
            Data.convertiFormatoData(null);
            fail("Doveva lanciare NullPointerException");
        } catch (NullPointerException e) {
            // Test superato
        }
    }

    @Test
    public void testConvertiFormatoData2() {
        // Test per il metodo convertiFormatoData2
        assertEquals("11/09/2024", Data.convertiFormatoData2("2024-09-11"));
        assertEquals("01/01/1990", Data.convertiFormatoData2("1990-01-01"));
        
        // Test con input nullo
        try {
            Data.convertiFormatoData2(null);
            fail("Doveva lanciare NullPointerException");
        } catch (NullPointerException e) {
            // Test superato
        }
    }

    @Test
    public void testDataValida() {
        // Test per il metodo dataValida
        assertTrue(Data.dataValida(Date.valueOf("2024-09-11")));
        assertFalse(Data.dataValida(Date.valueOf("2024-13-01"))); // Mese non valido
        assertFalse(Data.dataValida(Date.valueOf("2024-02-30"))); // Giorno non valido
    }

    @Test
    public void testDistanzaInMesi() throws Exception {
        // Test per il metodo distanzaInMesi
        Date dataInizio = Date.valueOf("2023-01-15");
        Date dataFine = Date.valueOf("2024-01-15");
        assertEquals(12, Data.distanzaInMesi(dataInizio, dataFine));

        dataInizio = Date.valueOf("2023-01-01");
        dataFine = Date.valueOf("2023-12-31");
        assertEquals(11, Data.distanzaInMesi(dataInizio, dataFine));
    }

    @Test
    public void testIsCompresoInPeriodo() throws Exception {
        // Test per il metodo isCompresoInPeriodo (versione con 3 parametri)
        Date dataInizioPeriodo = Date.valueOf("2023-01-01");
        Date dataFinePeriodo = Date.valueOf("2023-12-31");
        Date dataCompresa = Date.valueOf("2023-06-15");

        assertTrue(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataCompresa));
        
        dataCompresa = Date.valueOf("2024-01-01");
        assertFalse(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataCompresa));
    }

    @Test
    public void testIsMaggioreUgualeAOggi() throws Exception {
        // Test per il metodo isMaggioreUgualeAOggi
        Date oggi = new Date(System.currentTimeMillis());
        Date dataFutura = new Date(oggi.getTime() + 24 * 60 * 60 * 1000); // Data di domani
        Date dataPassata = new Date(oggi.getTime() - 24 * 60 * 60 * 1000); // Data di ieri
        
        assertTrue(Data.isMaggioreUgualeAOggi(dataFutura));
        assertTrue(Data.isMaggioreUgualeAOggi(oggi));
        assertFalse(Data.isMaggioreUgualeAOggi(dataPassata));
    }

    @Test
    public void testMaggiore() {
        // Test per il metodo maggiore
        Date data1 = Date.valueOf("2023-01-01");
        Date data2 = Date.valueOf("2024-01-01");
        
        assertTrue(Data.maggiore(data2, data1));
        assertFalse(Data.maggiore(data1, data2));
        assertFalse(Data.maggiore(data1, data1)); // Stessa data
    }

    @Test
    public void testMinore() {
        // Test per il metodo minore
        Date data1 = Date.valueOf("2023-01-01");
        Date data2 = Date.valueOf("2024-01-01");

        assertTrue(Data.minore(data1, data2));
        assertFalse(Data.minore(data2, data1));
        assertFalse(Data.minore(data1, data1)); // Stessa data
    }

    @Test
    public void testMeseInLettere() throws Exception {
        // Test per il metodo meseInLettere
        Date data = Date.valueOf("2023-01-01");
        assertEquals("January", Data.meseInLettere(data)); // Dipende dalla localizzazione

        data = Date.valueOf("2023-12-15");
        assertEquals("December", Data.meseInLettere(data));
    }
    
    @Test
    public void testOggi_ora_millisecondiT() {
        // Test per il metodo Oggi_ora_millisecondiT
        String ora = Data.Oggi_ora_millisecondiT();
        SimpleDateFormat formato = new SimpleDateFormat("kk.mm_ss.SSS");
        try {
            formato.parse(ora);
        } catch (ParseException e) {
            fail("Formato della data non corretto");
        }
    }

    @Test
    public void testOggi_ora_millisecondiT2() {
        // Test per il metodo Oggi_ora_millisecondiT2
        String ora = Data.Oggi_ora_millisecondiT2();
        SimpleDateFormat formato = new SimpleDateFormat("kk:mm:ss.SSS");
        try {
            formato.parse(ora);
        } catch (ParseException e) {
            fail("Formato della data non corretto");
        }
    }

    @Test
    public void testOraMinima() {
        // Test per il metodo oraMinima
        assertEquals("00:00:00", Data.oraMinima());
    }

    @Test
    public void testQuindiciMeseSucc() {
        // Test per il metodo quindiciMeseSucc
        Date inputDate = Date.valueOf("2024-08-15");
        Date expectedDate = Date.valueOf("2024-09-15");
        assertEquals(expectedDate, Data.quindiciMeseSucc(inputDate));
        
        // Test con il passaggio all'anno successivo
        inputDate = Date.valueOf("2024-12-15");
        expectedDate = Date.valueOf("2025-01-15");
        assertEquals(expectedDate, Data.quindiciMeseSucc(inputDate));
    }

    @Test
    public void testRestituisciMaggioreUgualeFraDueDate() throws Exception {
        // Test per il metodo restituisciMaggioreUgualeFraDueDate
        Date date1 = Date.valueOf("2023-01-01");
        Date date2 = Date.valueOf("2024-01-01");
        assertEquals(date2, Data.restituisciMaggioreUgualeFraDueDate(date1, date2));
        
        date1 = Date.valueOf("2025-01-01");
        date2 = Date.valueOf("2024-01-01");
        assertEquals(date1, Data.restituisciMaggioreUgualeFraDueDate(date1, date2));
    }

    @Test
    public void testRestituisciMinoreUgualeFraDueDate() throws Exception {
        // Test per il metodo restituisciMinoreUgualeFraDueDate
        Date date1 = Date.valueOf("2023-01-01");
        Date date2 = Date.valueOf("2024-01-01");
        assertEquals(date1, Data.restituisciMinoreUgualeFraDueDate(date1, date2));
        
        date1 = Date.valueOf("2024-01-01");
        date2 = Date.valueOf("2025-01-01");
        assertEquals(date1, Data.restituisciMinoreUgualeFraDueDate(date1, date2));
    }

    @Test
    public void testSottraiAnni() {
        // Test per il metodo sottraiAnni
        Date data = Date.valueOf("2024-09-11");
        Date expectedDate = Date.valueOf("2014-09-11");
        assertEquals(expectedDate, Data.sottraiAnni(10, data));
    }

    @Test
    public void testSottraiGiorni() {
        // Test per il metodo sottraiGiorni
        Date data = Date.valueOf("2024-09-11");
        Date expectedDate = Date.valueOf("2024-09-01");
        assertEquals(expectedDate, Data.sottraiGiorni(10, data));
    }

    @Test
    public void testSottraiMesi() {
        // Test per il metodo sottraiMesi
        Date data = Date.valueOf("2024-09-11");
        Date expectedDate = Date.valueOf("2024-06-11");
        assertEquals(expectedDate, Data.sottraiMesi(3, data));
    }

    @Test
    public void testToStringDateSql() {
        // Test per il metodo toStringDateSql
        Date data = Date.valueOf("2024-09-11");
        assertEquals("2024-09-11", Data.toStringDateSql(data));
    }

    @Test
    public void testTrasformaDataInIntero() {
        // Test per il metodo trasformaDataInIntero
        Date data = Date.valueOf("2024-09-11");
        assertEquals(110911, Data.trasformaDataInIntero(data));
    }

    @Test
    public void testTrasformaDataPerDb2() {
        // Test per il metodo trasformaDataPerDb2
        Date data = Date.valueOf("2024-09-11");
        assertEquals("2024-09-11", Data.trasformaDataPerDb2(data));
    }

    @Test
    public void testTrasformaDataPerVisualizzazione() {
        // Test per il metodo trasformaDataPerVisualizzazione
        Date data = Date.valueOf("2024-09-11");
        assertEquals("11/09/2024", Data.trasformaDataPerVisualizzazione(data));
    }

    @Test
    public void testGetDataOraEnglish() {
        // Test per il metodo getDataOraEnglish
        Date data = Date.valueOf("2024-09-11");
        String risultato = Data.getDataOraEnglish(data);
        SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd hh.mm");
        try {
            formato.parse(risultato);
        } catch (ParseException e) {
            fail("Formato della data non corretto");
        }
    }

    @Test
    public void testTrasformaInData() {
        // Test per il metodo trasformaInData
        Date expectedDate = Date.valueOf("2024-09-11");
        assertEquals(expectedDate, Data.trasformaInData(2024, 9, 11));
    }

    @Test
    public void testTrasformaStringa() {
        // Test per il metodo trasformaStringa
        Date expectedDate = Date.valueOf("2024-09-11");
        assertEquals(expectedDate, Data.trasformaStringa("2024-09-11"));
    }

    @Test
    public void testUguale() {
        // Test per il metodo uguale
        Date data1 = Date.valueOf("2024-09-11");
        Date data2 = Date.valueOf("2024-09-11");
        Date data3 = Date.valueOf("2023-09-11");

        assertTrue(Data.uguale(data1, data2));
        assertFalse(Data.uguale(data1, data3));
    }

    @Test
    public void testValoreTimeStampOggi() {
        // Test per il metodo valoreTimeStampOggi
        Timestamp timestamp = Data.valoreTimeStampOggi();
        assertNotNull(timestamp);
        assertEquals(new SimpleDateFormat("yyyy-MM-dd").format(timestamp), new SimpleDateFormat("yyyy-MM-dd").format(new GregorianCalendar().getTime()));
    }

    @Test
    public void testDistanzaInGiorniSolari() throws Exception {
        // Test per il metodo distanzaInGiorniSolari
        Date dataInizio = Date.valueOf("2024-09-01");
        Date dataFine = Date.valueOf("2024-09-11");
        assertEquals(10, Data.distanzaInGiorniSolari(dataInizio, dataFine));
    }
    
    @Test
    public void testIsCompresoInPeriodo_TrueWhenDatesWithinPeriod() throws Exception {
        // Dati di test validi: la data da controllare è compresa nel periodo
        Date dataInizioPeriodo = convertToDate("01/01/2024");
        Date dataFinePeriodo = convertToDate("31/12/2024");
        Date dataInizioCompresa = convertToDate("01/03/2024");
        Date dataFineCompresa = convertToDate("30/11/2024");

        assertTrue(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataInizioCompresa, dataFineCompresa),
            "Le date devono essere comprese nel periodo.");
    }

    @Test
    public void testIsCompresoInPeriodo_FalseWhenDataInizioCompresaBeforePeriodo() throws Exception {
        // La data di inizio del periodo da controllare è precedente al periodo
        Date dataInizioPeriodo = convertToDate("01/01/2024");
        Date dataFinePeriodo = convertToDate("31/12/2024");
        Date dataInizioCompresa = convertToDate("01/12/2023"); // Prima del periodo
        Date dataFineCompresa = convertToDate("30/11/2024");

        assertFalse(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataInizioCompresa, dataFineCompresa),
            "La data di inizio del periodo controllato è precedente al periodo.");
    }

    @Test
    public void testIsCompresoInPeriodo_FalseWhenDataFineCompresaAfterPeriodo() throws Exception {
        // La data di fine del periodo da controllare è successiva al periodo
        Date dataInizioPeriodo = convertToDate("01/01/2024");
        Date dataFinePeriodo = convertToDate("31/12/2024");
        Date dataInizioCompresa = convertToDate("01/03/2024");
        Date dataFineCompresa = convertToDate("01/01/2025"); // Successiva al periodo

        assertFalse(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataInizioCompresa, dataFineCompresa),
            "La data di fine del periodo controllato è successiva al periodo.");
    }

    @Test
    public void testIsCompresoInPeriodo_TrueWhenDatesMatchExactly() throws Exception {
        // La data del periodo da controllare coincide esattamente con il periodo
        Date dataInizioPeriodo = convertToDate("01/01/2024");
        Date dataFinePeriodo = convertToDate("31/12/2024");
        Date dataInizioCompresa = convertToDate("01/01/2024");
        Date dataFineCompresa = convertToDate("31/12/2024");

        assertTrue(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataInizioCompresa, dataFineCompresa),
            "Le date corrispondono esattamente al periodo.");
    }

    @Test
    public void testIsCompresoInPeriodo_FalseWhenBothDatesOutOfPeriod() throws Exception {
        // Sia la data di inizio che quella di fine sono fuori dal periodo
        Date dataInizioPeriodo = convertToDate("01/01/2024");
        Date dataFinePeriodo = convertToDate("31/12/2024");
        Date dataInizioCompresa = convertToDate("01/12/2023"); // Prima del periodo
        Date dataFineCompresa = convertToDate("01/01/2025"); // Dopo il periodo

        assertFalse(Data.isCompresoInPeriodo(dataInizioPeriodo, dataFinePeriodo, dataInizioCompresa, dataFineCompresa),
            "Sia la data di inizio che di fine sono fuori dal periodo.");
    }
}
