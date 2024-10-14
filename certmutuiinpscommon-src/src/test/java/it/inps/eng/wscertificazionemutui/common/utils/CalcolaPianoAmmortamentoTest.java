package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import it.inps.eng.wscertificazionemutui.common.beans.Rata;

class CalcolaPianoAmmortamentoTest {
//	
//	/*
//	 * // Dati di esempio per il test String tp_ente = "EsempioEnte"; String
//	 * anno_mutuo = "2024"; String prog_mutuo = "001"; double capitale = 100000.0;
//	 * // Capitale di esempio double tasso = 3.5; // Tasso d'interesse di esempio
//	 * int numeroRate = 120; // Numero di rate di esempio double tasso241 = 2.0; //
//	 * Tasso241 di esempio boolean is241 = true; // Flag is241 di esempio int
//	 * ultimoProgressivo = 0; // Ultimo progressivo di esempio
//	 * 
//	 * private CalcolaPianoAmmortamento calcolaPianoAmmortamento; private Connection
//	 * mockConnection;
//	 * 
//	 * @BeforeEach public void setUp() { // Ottieni un'istanza di
//	 * CalcolaPianoAmmortamento utilizzando il metodo getInstance
//	 * calcolaPianoAmmortamento = CalcolaPianoAmmortamento.getInstance(tp_ente,
//	 * anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241,
//	 * ultimoProgressivo);
//	 * 
//	 * mockConnection = Mockito.mock(Connection.class); }
//	 * 
//	 * @Test void testCalcolarataMutuoINPS() { // Test del metodo calcolarata per
//	 * mutuo INPS double capitale = 100000; double tasso = 5.0; double numeroRata =
//	 * 240; String tp_ente = "00"; String anno_mutuo = "2023"; String prog_mutuo =
//	 * "01";
//	 * 
//	 * double expectedRata = 645.14; // Valore atteso calcolato manualmente double
//	 * actualRata = calcolaPianoAmmortamento.calcolarata(tp_ente, anno_mutuo,
//	 * prog_mutuo, capitale, tasso, numeroRata);
//	 * 
//	 * assertEquals(expectedRata, actualRata, 0.01,
//	 * "La rata calcolata per il mutuo INPS non è corretta."); }
//	 * 
//	 * @Test void testCalcolarataMutuoIPOST() { // Test del metodo calcolarata per
//	 * mutuo IPOST double capitale = 150000; double tasso = 4.0; double numeroRata =
//	 * 300; String tp_ente = "01"; String anno_mutuo = "2022"; String prog_mutuo =
//	 * "02";
//	 * 
//	 * double expectedRata = 789.25; // Valore atteso calcolato manualmente double
//	 * actualRata = calcolaPianoAmmortamento.calcolarata(tp_ente, anno_mutuo,
//	 * prog_mutuo, capitale, tasso, numeroRata);
//	 * 
//	 * assertEquals(expectedRata, actualRata, 0.01,
//	 * "La rata calcolata per il mutuo IPOST non è corretta."); }
//	 * 
//	 * @Test void testGetInstance() { // Test del metodo getInstance per la
//	 * creazione di un nuovo piano double capitale = 100000; double tasso = 5.0; int
//	 * numeroRate = 240; double tasso241 = 3.5; boolean is241 = true; int
//	 * ultimoProgressivo = 1; String tp_ente = "00"; String anno_mutuo = "2023";
//	 * String prog_mutuo = "01";
//	 * 
//	 * CalcolaPianoAmmortamento instance =
//	 * CalcolaPianoAmmortamento.getInstance(tp_ente, anno_mutuo, prog_mutuo,
//	 * capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//	 * 
//	 * assertNotNull(instance,
//	 * "L'istanza di CalcolaPianoAmmortamento non dovrebbe essere null.");
//	 * assertNotNull(instance.getRatePiano(),
//	 * "La lista delle rate non dovrebbe essere null.");
//	 * assertFalse(instance.getRatePiano().isEmpty(),
//	 * "La lista delle rate non dovrebbe essere vuota."); }
//	 * 
//	 * @Test void testGetInstance2WithDBConnection() { // Test del metodo
//	 * getInstance2 con connessione al database double capitale = 100000; double
//	 * tasso = 5.0; int numeroRate = 240; double tasso241 = 3.5; boolean is241 =
//	 * true; int ultimoProgressivo = 1; String tp_ente = "00"; String anno_mutuo =
//	 * "2023"; String prog_mutuo = "01";
//	 * 
//	 * try (Connection con = DriverManager.getConnection("jdbc:your_database_url",
//	 * "username", "password")) { CalcolaPianoAmmortamento instance =
//	 * CalcolaPianoAmmortamento.getInstance2(con, tp_ente, anno_mutuo, prog_mutuo,
//	 * capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//	 * 
//	 * assertNotNull(instance,
//	 * "L'istanza di CalcolaPianoAmmortamento non dovrebbe essere null.");
//	 * assertNotNull(instance.getRatePiano(),
//	 * "La lista delle rate non dovrebbe essere null.");
//	 * assertFalse(instance.getRatePiano().isEmpty(),
//	 * "La lista delle rate non dovrebbe essere vuota."); } catch (SQLException e) {
//	 * fail("Errore nella connessione al database: " + e.getMessage()); } }
//	 * 
//	 * @Test public void testRoundTo() { assertEquals(12.35,
//	 * calcolaPianoAmmortamento.roundTo(12.3456, 2), 0.001); assertEquals(12.34,
//	 * calcolaPianoAmmortamento.roundTo(12.344, 2), 0.001); assertEquals(12.0,
//	 * calcolaPianoAmmortamento.roundTo(12.0, 2), 0.001); }
//	 * 
//	 * @Test public void testSviluppaPiano2_ValidInput() { ArrayList<Rata> ratePiano
//	 * = new ArrayList<>(); try {
//	 * calcolaPianoAmmortamento.sviluppaPiano2(mockConnection, "00", "2023", "001",
//	 * 100000, 2.5, 240, 3.0, true, 0); } catch (Exception e) {
//	 * fail("Exception should not have been thrown for valid input"); }
//	 * 
//	 * // Verifica che le rate siano state calcolate
//	 * assertNotNull(calcolaPianoAmmortamento.getRatePiano());
//	 * assertFalse(calcolaPianoAmmortamento.getRatePiano().isEmpty()); }
//	 * 
//	 * @Test public void testSviluppaPiano2_ZeroNumeroRate() { Exception exception =
//	 * assertThrows(RuntimeException.class, () -> {
//	 * calcolaPianoAmmortamento.sviluppaPiano2(mockConnection, "00", "2023", "001",
//	 * 100000, 2.5, 0, 3.0, true, 0); });
//	 * 
//	 * String expectedMessage =
//	 * "Errore nei dati: verificare il numero di rate impostate nel database.";
//	 * String actualMessage = exception.getMessage();
//	 * 
//	 * assertTrue(actualMessage.contains(expectedMessage)); }
//	 * 
//	 * @Test public void testPiano() { calcolaPianoAmmortamento.piano("00", "2023",
//	 * "001", 100000, 2.5, 500);
//	 * 
//	 * // Verifica che le variabili interne siano state aggiornate correttamente
//	 * assertEquals(0.0, calcolaPianoAmmortamento.getCapitaleResiduo());
//	 * assertEquals(0.0, calcolaPianoAmmortamento.getQuotaInteressi());
//	 * assertEquals(0.0, calcolaPianoAmmortamento.getQuotaCapitale()); }
//	 * 
//	 * @Test public void testSviluppaPianoEXCEL() { try {
//	 * calcolaPianoAmmortamento.sviluppaPianoEXCEL("00", "2023", "001", 100000, 2.5,
//	 * 240, 3.0, true, 0); } catch (Exception e) {
//	 * fail("Exception should not have been thrown for valid input"); }
//	 * 
//	 * // Verifica che le rate siano state calcolate
//	 * assertNotNull(calcolaPianoAmmortamento.getRatePiano());
//	 * assertFalse(calcolaPianoAmmortamento.getRatePiano().isEmpty()); }
//	 */
//	
//	private CalcolaPianoAmmortamento cpa;
//
//    @BeforeEach
//    public void setUp() {
//        // Inizializza l'istanza di CalcolaPianoAmmortamento
//        cpa = CalcolaPianoAmmortamento.getInstance("ente", "2024", "001", 100000, 3.5, 120, 0.0, false, 10);
//    }
//
//    @Test
//    public void testGetInstance_CreatesNewInstance() {
//        // Verifica che venga restituita una nuova istanza di CalcolaPianoAmmortamento
//        CalcolaPianoAmmortamento instance = CalcolaPianoAmmortamento.getInstance("ente", "2024", "001", 100000, 3.5, 120, 0.0, false, 10);
//        assertNotNull(instance, "L'istanza di CalcolaPianoAmmortamento non dovrebbe essere null");
//    }
//
//    @Test
//    public void testGetInstance_CapitaleResiduo() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni l'oggetto Field per il campo privato 'capitaleResiduo'
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("capitaleResiduo");
//        
//        // Rendi il campo accessibile
//        field.setAccessible(true);
//        
//        // Recupera il valore del campo 'capitaleResiduo' dall'oggetto 'cpa'
//        double capitaleResiduo = (double) field.get(cpa);
//        
//        // Verifica che il capitale residuo sia inizializzato correttamente
//        assertEquals(0.0, capitaleResiduo, "Il capitale residuo iniziale dovrebbe essere 0.0");
//    }
//
//    @Test
//    public void testGetInstance_QuotaInteressi() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni il campo privato 'quotaInteressi'
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("quotaInteressi");
//        
//        // Rendi il campo accessibile
//        field.setAccessible(true);
//        
//        // Recupera il valore del campo 'quotaInteressi'
//        double quotaInteressi = (double) field.get(cpa);
//        
//        // Verifica che la quota interessi sia inizializzata correttamente
//        assertEquals(0.0, quotaInteressi, "La quota interessi iniziale dovrebbe essere 0.0");
//    }
//
//    @Test
//    public void testGetInstance_QuotaCapitale() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni il campo privato 'quotaCapitale'
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("quotaCapitale");
//        
//        // Rendi il campo accessibile
//        field.setAccessible(true);
//        
//        // Recupera il valore del campo 'quotaCapitale'
//        double quotaCapitale = (double) field.get(cpa);
//        
//        // Verifica che la quota capitale sia inizializzata correttamente
//        assertEquals(0.0, quotaCapitale, "La quota capitale iniziale dovrebbe essere 0.0");
//    }
//
//    @Test
//    public void testGetInstance_TotaleInteressi() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni il campo privato 'totaleInteressi'
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        
//        // Rendi il campo accessibile
//        field.setAccessible(true);
//        
//        // Recupera il valore del campo 'totaleInteressi'
//        double totaleInteressi = (double) field.get(cpa);
//        
//        // Verifica che il totale interessi sia inizializzato correttamente
//        assertEquals(0.0, totaleInteressi, "Il totale interessi iniziale dovrebbe essere 0.0");
//    }
//
//    @Test
//    public void testGetInstance_RatePianoNull() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni il campo privato 'ratePiano'
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        
//        // Rendi il campo accessibile
//        field.setAccessible(true);
//        
//        // Recupera il valore del campo 'ratePiano'
//        ArrayList<?> ratePiano = (ArrayList<?>) field.get(cpa);
//        
//        // Verifica che l'ArrayList delle rate del piano sia null
//        assertNull(ratePiano, "L'ArrayList delle rate dovrebbe essere null prima del calcolo");
//    }
//
//    @Test
//    public void testGetInstance_ConParametriReali() throws NoSuchFieldException, IllegalAccessException {
//        // Verifica il comportamento con parametri di esempio realistici
//        CalcolaPianoAmmortamento instance = CalcolaPianoAmmortamento.getInstance("ente", "2024", "001", 50000, 1.5, 60, 0.0, false, 0);
//
//        assertNotNull(instance, "L'istanza restituita non dovrebbe essere null");
//
//        // Verifica il campo 'capitaleResiduo'
//        Field capitaleResiduoField = CalcolaPianoAmmortamento.class.getDeclaredField("capitaleResiduo");
//        capitaleResiduoField.setAccessible(true);
//        double capitaleResiduo = (double) capitaleResiduoField.get(instance);
//        assertEquals(0.0, capitaleResiduo, "Il capitale residuo dovrebbe essere 0.0");
//
//        // Verifica il campo 'quotaInteressi'
//        Field quotaInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaInteressi");
//        quotaInteressiField.setAccessible(true);
//        double quotaInteressi = (double) quotaInteressiField.get(instance);
//        assertEquals(0.0, quotaInteressi, "La quota interessi dovrebbe essere 0.0");
//
//        // Verifica il campo 'quotaCapitale'
//        Field quotaCapitaleField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaCapitale");
//        quotaCapitaleField.setAccessible(true);
//        double quotaCapitale = (double) quotaCapitaleField.get(instance);
//        assertEquals(0.0, quotaCapitale, "La quota capitale dovrebbe essere 0.0");
//
//        // Verifica il campo 'totaleInteressi'
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        double totaleInteressi = (double) totaleInteressiField.get(instance);
//        assertEquals(0.0, totaleInteressi, "Il totale interessi dovrebbe essere 0.0");
//
//        // Verifica il campo 'ratePiano'
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ArrayList<?> ratePiano = (ArrayList<?>) ratePianoField.get(instance);
//        assertNull(ratePiano, "L'ArrayList delle rate dovrebbe essere null prima del calcolo");
//    }
//    
//    @Test
//    public void testGetInstance2_InitialValues() throws NoSuchFieldException, IllegalAccessException {
//        // Crea un mock di Connection
//        Connection con = Mockito.mock(Connection.class);
//
//        // Ottieni l'istanza utilizzando il metodo getInstance2
//        CalcolaPianoAmmortamento instance = CalcolaPianoAmmortamento.getInstance2(con, "ente", "2024", "001", 50000, 1.5, 60, 0.0, false, 0);
//
//        assertNotNull(instance, "L'istanza restituita non dovrebbe essere null");
//
//        // Verifica il campo 'capitaleResiduo'
//        Field capitaleResiduoField = CalcolaPianoAmmortamento.class.getDeclaredField("capitaleResiduo");
//        capitaleResiduoField.setAccessible(true);
//        double capitaleResiduo = (double) capitaleResiduoField.get(instance);
//        assertEquals(0.0, capitaleResiduo, "Il capitale residuo dovrebbe essere 0.0");
//
//        // Verifica il campo 'quotaInteressi'
//        Field quotaInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaInteressi");
//        quotaInteressiField.setAccessible(true);
//        double quotaInteressi = (double) quotaInteressiField.get(instance);
//        assertEquals(0.0, quotaInteressi, "La quota interessi dovrebbe essere 0.0");
//
//        // Verifica il campo 'quotaCapitale'
//        Field quotaCapitaleField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaCapitale");
//        quotaCapitaleField.setAccessible(true);
//        double quotaCapitale = (double) quotaCapitaleField.get(instance);
//        assertEquals(0.0, quotaCapitale, "La quota capitale dovrebbe essere 0.0");
//
//        // Verifica il campo 'totaleInteressi'
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        double totaleInteressi = (double) totaleInteressiField.get(instance);
//        assertEquals(0.0, totaleInteressi, "Il totale interessi dovrebbe essere 0.0");
//
//        // Verifica il campo 'ratePiano'
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ArrayList<?> ratePiano = (ArrayList<?>) ratePianoField.get(instance);
//        assertNull(ratePiano, "L'ArrayList delle rate dovrebbe essere null prima del calcolo");
//    }
//
//    @Test
//    public void testGetInstance2_WithParameters() throws NoSuchFieldException, IllegalAccessException {
//        // Crea un mock di Connection
//        Connection con = Mockito.mock(Connection.class);
//
//        // Ottieni l'istanza utilizzando il metodo getInstance2
//        CalcolaPianoAmmortamento instance = CalcolaPianoAmmortamento.getInstance2(con, "ente", "2024", "001", 50000, 1.5, 60, 0.0, false, 0);
//
//        assertNotNull(instance, "L'istanza restituita non dovrebbe essere null");
//
//        // Verifica i valori dei campi dopo l'esecuzione di sviluppaPiano2
//        // Supponiamo che 'sviluppaPiano2' imposti alcuni valori (questo deve essere confermato con la logica effettiva)
//
//        Field capitaleResiduoField = CalcolaPianoAmmortamento.class.getDeclaredField("capitaleResiduo");
//        capitaleResiduoField.setAccessible(true);
//        double capitaleResiduo = (double) capitaleResiduoField.get(instance);
//        // Cambia il valore atteso secondo la logica di sviluppaPiano2
//        assertEquals(0.0, capitaleResiduo, "Il capitale residuo dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field quotaInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaInteressi");
//        quotaInteressiField.setAccessible(true);
//        double quotaInteressi = (double) quotaInteressiField.get(instance);
//        assertEquals(0.0, quotaInteressi, "La quota interessi dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field quotaCapitaleField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaCapitale");
//        quotaCapitaleField.setAccessible(true);
//        double quotaCapitale = (double) quotaCapitaleField.get(instance);
//        assertEquals(0.0, quotaCapitale, "La quota capitale dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        double totaleInteressi = (double) totaleInteressiField.get(instance);
//        assertEquals(0.0, totaleInteressi, "Il totale interessi dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ArrayList<?> ratePiano = (ArrayList<?>) ratePianoField.get(instance);
//        assertNull(ratePiano, "L'ArrayList delle rate dovrebbe essere null prima del calcolo");
//    }
//    
//    @Test
//    public void testGetInstanceEXCEL_InitialValues() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni l'istanza utilizzando il metodo getInstanceEXCEL
//        CalcolaPianoAmmortamento instance = CalcolaPianoAmmortamento.getInstanceEXCEL("ente", "2024", "001", 50000, 1.5, 60, 0.0, false, 0);
//
//        assertNotNull(instance, "L'istanza restituita non dovrebbe essere null");
//
//        // Verifica il campo 'capitaleResiduo'
//        Field capitaleResiduoField = CalcolaPianoAmmortamento.class.getDeclaredField("capitaleResiduo");
//        capitaleResiduoField.setAccessible(true);
//        double capitaleResiduo = (double) capitaleResiduoField.get(instance);
//        assertEquals(0.0, capitaleResiduo, "Il capitale residuo dovrebbe essere 0.0");
//
//        // Verifica il campo 'quotaInteressi'
//        Field quotaInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaInteressi");
//        quotaInteressiField.setAccessible(true);
//        double quotaInteressi = (double) quotaInteressiField.get(instance);
//        assertEquals(0.0, quotaInteressi, "La quota interessi dovrebbe essere 0.0");
//
//        // Verifica il campo 'quotaCapitale'
//        Field quotaCapitaleField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaCapitale");
//        quotaCapitaleField.setAccessible(true);
//        double quotaCapitale = (double) quotaCapitaleField.get(instance);
//        assertEquals(0.0, quotaCapitale, "La quota capitale dovrebbe essere 0.0");
//
//        // Verifica il campo 'totaleInteressi'
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        double totaleInteressi = (double) totaleInteressiField.get(instance);
//        assertEquals(0.0, totaleInteressi, "Il totale interessi dovrebbe essere 0.0");
//
//        // Verifica il campo 'ratePiano'
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ArrayList<?> ratePiano = (ArrayList<?>) ratePianoField.get(instance);
//        assertNull(ratePiano, "L'ArrayList delle rate dovrebbe essere null prima del calcolo");
//    }
//
//    @Test
//    public void testGetInstanceEXCEL_WithParameters() throws NoSuchFieldException, IllegalAccessException {
//        // Ottieni l'istanza utilizzando il metodo getInstanceEXCEL
//        CalcolaPianoAmmortamento instance = CalcolaPianoAmmortamento.getInstanceEXCEL("ente", "2024", "001", 50000, 1.5, 60, 0.0, false, 0);
//
//        assertNotNull(instance, "L'istanza restituita non dovrebbe essere null");
//
//        // Verifica i valori dei campi dopo l'esecuzione di sviluppaPianoEXCEL
//        // Supponiamo che 'sviluppaPianoEXCEL' imposti alcuni valori (questo deve essere confermato con la logica effettiva)
//
//        Field capitaleResiduoField = CalcolaPianoAmmortamento.class.getDeclaredField("capitaleResiduo");
//        capitaleResiduoField.setAccessible(true);
//        double capitaleResiduo = (double) capitaleResiduoField.get(instance);
//        // Cambia il valore atteso secondo la logica di sviluppaPianoEXCEL
//        assertEquals(0.0, capitaleResiduo, "Il capitale residuo dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field quotaInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaInteressi");
//        quotaInteressiField.setAccessible(true);
//        double quotaInteressi = (double) quotaInteressiField.get(instance);
//        assertEquals(0.0, quotaInteressi, "La quota interessi dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field quotaCapitaleField = CalcolaPianoAmmortamento.class.getDeclaredField("quotaCapitale");
//        quotaCapitaleField.setAccessible(true);
//        double quotaCapitale = (double) quotaCapitaleField.get(instance);
//        assertEquals(0.0, quotaCapitale, "La quota capitale dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        double totaleInteressi = (double) totaleInteressiField.get(instance);
//        assertEquals(0.0, totaleInteressi, "Il totale interessi dovrebbe essere 0.0"); // Modifica in base alla logica
//
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ArrayList<?> ratePiano = (ArrayList<?>) ratePianoField.get(instance);
//        assertNull(ratePiano, "L'ArrayList delle rate dovrebbe essere null prima del calcolo");
//    }
//    
// // Metodo per creare un'istanza della classe CalcolaPianoAmmortamento
//    private CalcolaPianoAmmortamento createInstance() throws Exception {
//    	// Utilizziamo reflection per accedere al costruttore privato
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true); // Rende accessibile il costruttore privato
//        return constructor.newInstance(); // Crea l'istanza
//    }
//
//    @Test
//    public void testGetPiano_WhenRatePianoIsNull() throws Exception {
//        // Usa il metodo per creare un'istanza di CalcolaPianoAmmortamento
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Usa reflection per impostare ratePiano a null
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ratePianoField.set(instance, null);
//
//        // Chiama il metodo getPiano
//        ArrayList<Rata> piano = instance.getPiano();
//
//        // Verifica che il risultato sia una lista vuota
//        assertNotNull(piano, "La lista non dovrebbe essere null");
//        assertTrue(piano.isEmpty(), "La lista dovrebbe essere vuota quando ratePiano è null");
//    }
//
//    @Test
//    public void testGetPiano_WhenRatePianoIsNotNull() throws Exception {
//        // Usa il metodo per creare un'istanza di CalcolaPianoAmmortamento
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Crea una nuova ArrayList<Rata> e imposta ratePiano
//        ArrayList<Rata> rateList = new ArrayList<>();
//        rateList.add(new Rata()); // Aggiungi un oggetto Rata per il test
//        Field ratePianoField = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        ratePianoField.setAccessible(true);
//        ratePianoField.set(instance, rateList);
//
//        // Chiama il metodo getPiano
//        ArrayList<Rata> piano = instance.getPiano();
//
//        // Verifica che il risultato corrisponda all'ArrayList impostato
//        assertNotNull(piano, "La lista non dovrebbe essere null");
//        assertEquals(1, piano.size(), "La lista dovrebbe contenere un elemento");
//    }
//
//    @Test
//    public void testGetInteressi_WhenTotaleInteressiIsZero() throws Exception {
//        // Usa il metodo per creare un'istanza di CalcolaPianoAmmortamento
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Usa reflection per impostare totaleInteressi a 0.0
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        totaleInteressiField.set(instance, 0.0);
//
//        // Chiama il metodo getInteressi
//        double interessi = instance.getInteressi();
//
//        // Verifica che il risultato sia 0.0
//        assertEquals(0.0, interessi, "Il totale interessi dovrebbe essere 0.0 quando non ci sono interessi");
//    }
//
//    @Test
//    public void testGetInteressi_WhenTotaleInteressiIsNotZero() throws Exception {
//        // Usa il metodo per creare un'istanza di CalcolaPianoAmmortamento
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Usa reflection per impostare totaleInteressi a un valore diverso da zero
//        Field totaleInteressiField = CalcolaPianoAmmortamento.class.getDeclaredField("totaleInteressi");
//        totaleInteressiField.setAccessible(true);
//        totaleInteressiField.set(instance, 1500.75); // Imposta un valore di esempio
//
//        // Chiama il metodo getInteressi
//        double interessi = instance.getInteressi();
//
//        // Verifica che il risultato corrisponda al valore impostato
//        assertEquals(1500.75, interessi, "Il totale interessi dovrebbe corrispondere al valore impostato");
//    }
//
//    // Metodo per invocare il metodo privato calcolarata
//    private double invokeCalcolarata(CalcolaPianoAmmortamento instance, String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, double numeroRata) throws Exception {
//        Method method = CalcolaPianoAmmortamento.class.getDeclaredMethod("calcolarata", String.class, String.class, String.class, double.class, double.class, double.class);
//        method.setAccessible(true);
//        return (double) method.invoke(instance, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRata);
//    }
//
//    @Test
//    public void testCalcolarata_INPS() throws Exception {
//        CalcolaPianoAmmortamento instance = createInstance();
//        double risultato = invokeCalcolarata(instance, "", "", "", 100000, 5, 12);
//        
//        // Calcolo manuale della rata attesa per confrontare il risultato
//        double tasso = 1 + (5 / 100.0);
//        double valINPS = (1.0 / 12);
//        double i = Math.pow(tasso, valINPS) - 1;
//        double atteso = (100000 * i) / (1 - (Math.pow((1 + i), (-12))));
//        
//        assertEquals(atteso, risultato, 0.01, "La rata calcolata per Mutuo INPS non è corretta");
//    }
//
//    @Test
//    public void testCalcolarata_IPOST() throws Exception {
//        CalcolaPianoAmmortamento instance = createInstance();
//        double risultato = invokeCalcolarata(instance, "01", "2024", "001", 100000, 5, 12);
//        
//        // Calcolo manuale della rata attesa per confrontare il risultato
//        double calcola = 1 + (5 / 100) / 12;
//        double fattoreA = Math.pow(calcola, 12);
//        double fattoreB = (calcola - 1) / (fattoreA - 1);
//        double atteso = 100000 * fattoreA * fattoreB;
//
//        assertEquals(atteso, risultato, 0.01, "La rata calcolata per Mutuo IPOST non è corretta");
//    }
//
//    @Test
//    public void testCalcolarata_WithZeroCapitale() throws Exception {
//        CalcolaPianoAmmortamento instance = createInstance();
//        double risultato = invokeCalcolarata(instance, "01", "2024", "001", 0, 5, 12);
//        
//        // Con capitale zero, la rata dovrebbe essere zero
//        assertEquals(0.0, risultato, "La rata calcolata con capitale zero dovrebbe essere 0.0");
//    }
//
//    @Test
//    public void testCalcolarata_WithNegativeTasso() throws Exception {
//        CalcolaPianoAmmortamento instance = createInstance();
//        double risultato = invokeCalcolarata(instance, "01", "2024", "001", 100000, -5, 12);
//        
//        // Dobbiamo definire un comportamento atteso qui, in base alla logica del metodo
//        // Supponiamo che il metodo gestisca tassi negativi come se fossero zero
//        assertTrue(risultato < 0, "La rata calcolata con tasso negativo non dovrebbe essere positiva.");
//    }
//    
// // Metodo per invocare il metodo privato calcolarata2
//    private double invokeCalcolarata2(CalcolaPianoAmmortamento instance, Connection con, String anno_mutuo, String prog_mutuo) throws Exception {
//        Method method = CalcolaPianoAmmortamento.class.getDeclaredMethod("calcolarata2", Connection.class, String.class, String.class);
//        method.setAccessible(true);
//        return (double) method.invoke(instance, con, anno_mutuo, prog_mutuo);
//    }
//
//    @Test
//    public void testCalcolarata2_Success() throws Exception {
//        // Mock del Connection
//        Connection con = Mockito.mock(Connection.class);
//        PreparedStatement ps = Mockito.mock(PreparedStatement.class);
//        ResultSet rs = Mockito.mock(ResultSet.class);
//
//        // Configurazione del comportamento del mock
//        Mockito.when(con.prepareStatement(Mockito.anyString())).thenReturn(ps);
//        Mockito.when(ps.executeQuery()).thenReturn(rs);
//        Mockito.when(rs.next()).thenReturn(true);
//        Mockito.when(rs.getString("imp_rt")).thenReturn("1000.0");
//
//        // Creazione dell'istanza della classe da testare
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Invocazione del metodo calcolarata2
//        double risultato = invokeCalcolarata2(instance, con, "2024", "001");
//
//        // Verifica che il risultato sia corretto
//        assertEquals(1000.0, risultato, "La rata calcolata non è corretta.");
//        
//        // Verifica che il PreparedStatement sia stato utilizzato correttamente
//        Mockito.verify(ps).setString(1, "2024");
//        Mockito.verify(ps).setString(2, "001");
//        Mockito.verify(ps).setString(3, "2024");
//        Mockito.verify(ps).setString(4, "001");
//
//        // Chiusura dei mock
//        rs.close();
//        ps.close();
//    }
//
//    @Test
//    public void testCalcolarata2_NoResult() throws Exception {
//        // Mock del Connection
//        Connection con = Mockito.mock(Connection.class);
//        PreparedStatement ps = Mockito.mock(PreparedStatement.class);
//        ResultSet rs = Mockito.mock(ResultSet.class);
//
//        // Configurazione del comportamento del mock
//        Mockito.when(con.prepareStatement(Mockito.anyString())).thenReturn(ps);
//        Mockito.when(ps.executeQuery()).thenReturn(rs);
//        Mockito.when(rs.next()).thenReturn(false); // Nessun risultato trovato
//
//        // Creazione dell'istanza della classe da testare
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Invocazione del metodo calcolarata2
//        double risultato = invokeCalcolarata2(instance, con, "2024", "001");
//
//        // Verifica che il risultato sia 0
//        assertEquals(0.0, risultato, "La rata calcolata dovrebbe essere 0.0 quando non ci sono risultati.");
//        
//        // Chiusura dei mock
//        rs.close();
//        ps.close();
//    }
//
//    @Test
//    public void testCalcolarata2_SQLException() throws Exception {
//        // Mock del Connection
//        Connection con = Mockito.mock(Connection.class);
//        PreparedStatement ps = Mockito.mock(PreparedStatement.class);
//
//        // Configurazione del comportamento del mock per sollevare un'eccezione
//        Mockito.when(con.prepareStatement(Mockito.anyString())).thenThrow(new SQLException("Database error"));
//
//        // Creazione dell'istanza della classe da testare
//        CalcolaPianoAmmortamento instance = createInstance();
//
//        // Invocazione del metodo calcolarata2
//        double risultato = invokeCalcolarata2(instance, con, "2024", "001");
//
//        // Verifica che il risultato sia 0 in caso di eccezione
//        assertEquals(0.0, risultato, "La rata calcolata dovrebbe essere 0.0 in caso di errore SQL.");
//    }
//    
// // Metodo per invocare il metodo privato sviluppaPiano
//    private void invokeSviluppaPiano(CalcolaPianoAmmortamento instance, String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) throws Exception {
//        Method method = CalcolaPianoAmmortamento.class.getDeclaredMethod("sviluppaPiano", String.class, String.class, String.class, double.class, double.class, int.class, double.class, boolean.class, int.class);
//        method.setAccessible(true);
//        method.invoke(instance, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//    }
//
//    @Test
//    public void testSviluppaPiano_MutuoINPS() throws Exception {
//        // Creiamo un'istanza della classe
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CalcolaPianoAmmortamento instance = constructor.newInstance();
//
//        // Inizializza ratePiano
//        ArrayList<Rata> ratePiano = new ArrayList<>();
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        field.setAccessible(true);
//        field.set(instance, ratePiano);
//
//        // Dati di input
//        String tp_ente = "00"; // Tipo ente per Mutuo INPS
//        String anno_mutuo = "2024";
//        String prog_mutuo = "001";
//        double capitale = 100000;
//        double tasso = 3.5;
//        int numeroRate = 12;
//        double tasso241 = 4.0;
//        boolean is241 = false;
//        int ultimoProgressivo = 0;
//
//        // Invocazione del metodo sviluppaPiano
//        invokeSviluppaPiano(instance, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//        
//        // Recupera le rate calcolate
//        ratePiano = (ArrayList<Rata>) field.get(instance);
//
//        // Verifica che il numero di rate sia corretto
//        assertEquals(numeroRate, ratePiano.size(), "Il numero di rate generate non è corretto.");
//
//        // Verifica che le rate siano state calcolate correttamente
//        for (Rata r : ratePiano) {
//            assertNotNull(r.getDebitoResiduo(), "Il debito residuo non deve essere nullo.");
//            assertNotNull(r.getImportoRata(), "L'importo della rata non deve essere nullo.");
//            assertNotNull(r.getCapitale(), "Il capitale non deve essere nullo.");
//            assertNotNull(r.getInteressi(), "Gli interessi non devono essere nulli.");
//        }
//    }
//
//    @Test
//    public void testSviluppaPiano_MutuoIPOST() throws Exception {
//        // Creiamo un'istanza della classe
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CalcolaPianoAmmortamento instance = constructor.newInstance();
//
//        // Inizializza ratePiano
//        ArrayList<Rata> ratePiano = new ArrayList<>();
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        field.setAccessible(true);
//        field.set(instance, ratePiano);
//
//        // Dati di input
//        String tp_ente = "01"; // Tipo ente per Mutuo IPOST
//        String anno_mutuo = "2024";
//        String prog_mutuo = "002";
//        double capitale = 100000;
//        double tasso = 3.5;
//        int numeroRate = 12;
//        double tasso241 = 4.0;
//        boolean is241 = true; // Imposta is241 a true per cambiare il tasso dopo la 240
//        int ultimoProgressivo = 240;
//
//        // Invocazione del metodo sviluppaPiano
//        invokeSviluppaPiano(instance, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//
//        // Recupera le rate calcolate
//        ratePiano = (ArrayList<Rata>) field.get(instance);
//
//        // Verifica che il numero di rate sia corretto
//        assertEquals(numeroRate, ratePiano.size(), "Il numero di rate generate non è corretto.");
//
//        // Verifica che le rate siano state calcolate correttamente
//        for (Rata r : ratePiano) {
//            assertNotNull(r.getDebitoResiduo(), "Il debito residuo non deve essere nullo.");
//            assertNotNull(r.getImportoRata(), "L'importo della rata non deve essere nullo.");
//            assertNotNull(r.getCapitale(), "Il capitale non deve essere nullo.");
//            assertNotNull(r.getInteressi(), "Gli interessi non devono essere nulli.");
//            assertNotNull(r.getTasso(), "Il tasso non deve essere nullo.");
//        }
//    }
//
//    @Test
//    public void testSviluppaPiano_ErroreNumeroRate() throws Exception {
//        // Creiamo un'istanza della classe
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CalcolaPianoAmmortamento instance = constructor.newInstance();
//
//        // Inizializza ratePiano
//        ArrayList<Rata> ratePiano = new ArrayList<>();
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        field.setAccessible(true);
//        field.set(instance, ratePiano);
//
//        // Dati di input con numero di rate impostato a 0
//        String tp_ente = "00"; // Tipo ente per Mutuo INPS
//        String anno_mutuo = "2024";
//        String prog_mutuo = "001";
//        double capitale = 100000;
//        double tasso = 3.5;
//        int numeroRate = 0; // Numero di rate non valido
//        double tasso241 = 4.0;
//        boolean is241 = false;
//        int ultimoProgressivo = 0;
//
//        // Verifica che venga lanciata un'eccezione
//        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
//            invokeSviluppaPiano(instance, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//        });
//
//        assertEquals("Errore nei dati: verificare il numero di rate impostate nel database.", exception.getMessage());
//    }
//    
// // Metodo per invocare il metodo privato sviluppaPiano2
//    private void invokeSviluppaPiano2(CalcolaPianoAmmortamento instance, Connection con, String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) throws Exception {
//        Method method = CalcolaPianoAmmortamento.class.getDeclaredMethod("sviluppaPiano2", Connection.class, String.class, String.class, String.class, double.class, double.class, int.class, double.class, boolean.class, int.class);
//        method.setAccessible(true);
//        method.invoke(instance, con, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//    }
//
//    // Metodo per simulare calcolarata2
//    private double simulateCalcolareRata(double capitale, double tasso, int numeroRate) {
//        return capitale * (tasso / 100) / (1 - Math.pow(1 + tasso / 100, -numeroRate)); // Formula per rata costante
//    }
//
//    // Test per il metodo sviluppaPiano2 con Mutuo INPS
//    @Test
//    public void testSviluppaPiano2_MutuoINPS() throws Exception {
//        // Creiamo un'istanza della classe
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CalcolaPianoAmmortamento instance = constructor.newInstance();
//
//        // Inizializza ratePiano
//        ArrayList<Rata> ratePiano = new ArrayList<>();
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        field.setAccessible(true);
//        field.set(instance, ratePiano);
//
//        // Dati di input
//        Connection con = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//        String tp_ente = "00"; // Tipo ente per Mutuo INPS
//        String anno_mutuo = "2024";
//        String prog_mutuo = "001";
//        double capitale = 100000;
//        double tasso = 3.5;
//        int numeroRate = 12;
//        double tasso241 = 4.0;
//        boolean is241 = false;
//        int ultimoProgressivo = 0;
//
//        // Simula il calcolo della rata
//        double rata = simulateCalcolareRata(capitale, tasso, numeroRate);
//
//        // Invocazione del metodo sviluppaPiano2
//        invokeSviluppaPiano2(instance, con, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//
//        // Recupera le rate calcolate
//        ratePiano = (ArrayList<Rata>) field.get(instance);
//
//        // Verifica che il numero di rate sia corretto
//        assertEquals(numeroRate, ratePiano.size(), "Il numero di rate generate non è corretto.");
//
//        // Verifica che le rate siano state calcolate correttamente
//        for (Rata r : ratePiano) {
//            assertNotNull(r.getDebitoResiduo(), "Il debito residuo non deve essere nullo.");
//            assertNotNull(r.getImportoRata(), "L'importo della rata non deve essere nullo.");
//            assertNotNull(r.getCapitale(), "Il capitale non deve essere nullo.");
//            assertNotNull(r.getInteressi(), "Gli interessi non devono essere nulli.");
//        }
//
//        // Chiudi la connessione al database
//        con.close();
//    }
//
//    // Test per il metodo sviluppaPiano2 con Mutuo IPOST
//    @Test
//    public void testSviluppaPiano2_MutuoIPOST() throws Exception {
//        // Creiamo un'istanza della classe
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CalcolaPianoAmmortamento instance = constructor.newInstance();
//
//        // Inizializza ratePiano
//        ArrayList<Rata> ratePiano = new ArrayList<>();
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        field.setAccessible(true);
//        field.set(instance, ratePiano);
//
//        // Dati di input
//        Connection con = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//        String tp_ente = "01"; // Tipo ente per Mutuo IPOST
//        String anno_mutuo = "2024";
//        String prog_mutuo = "002";
//        double capitale = 100000;
//        double tasso = 3.5;
//        int numeroRate = 12;
//        double tasso241 = 4.0;
//        boolean is241 = true; // Imposta is241 a true per cambiare il tasso dopo la 240
//        int ultimoProgressivo = 240;
//
//        // Simula il calcolo della rata
//        double rata = simulateCalcolareRata(capitale, tasso, numeroRate);
//
//        // Invocazione del metodo sviluppaPiano2
//        invokeSviluppaPiano2(instance, con, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//
//        // Recupera le rate calcolate
//        ratePiano = (ArrayList<Rata>) field.get(instance);
//
//        // Verifica che il numero di rate sia corretto
//        assertEquals(numeroRate, ratePiano.size(), "Il numero di rate generate non è corretto.");
//
//        // Verifica che le rate siano state calcolate correttamente
//        for (Rata r : ratePiano) {
//            assertNotNull(r.getDebitoResiduo(), "Il debito residuo non deve essere nullo.");
//            assertNotNull(r.getImportoRata(), "L'importo della rata non deve essere nullo.");
//            assertNotNull(r.getCapitale(), "Il capitale non deve essere nullo.");
//            assertNotNull(r.getInteressi(), "Gli interessi non devono essere nulli.");
//            assertNotNull(r.getTasso(), "Il tasso non deve essere nullo.");
//        }
//
//        // Chiudi la connessione al database
//        con.close();
//    }
//
//    // Test per il metodo sviluppaPiano2 con numero di rate errato
//    @Test
//    public void testSviluppaPiano2_ErroreNumeroRate() throws Exception {
//        // Creiamo un'istanza della classe
//        Constructor<CalcolaPianoAmmortamento> constructor = CalcolaPianoAmmortamento.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CalcolaPianoAmmortamento instance = constructor.newInstance();
//
//        // Inizializza ratePiano
//        ArrayList<Rata> ratePiano = new ArrayList<>();
//        Field field = CalcolaPianoAmmortamento.class.getDeclaredField("ratePiano");
//        field.setAccessible(true);
//        field.set(instance, ratePiano);
//
//        // Dati di input con numero di rate impostato a 0
//        Connection con = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//        String tp_ente = "00"; // Tipo ente per Mutuo INPS
//        String anno_mutuo = "2024";
//        String prog_mutuo = "001";
//        double capitale = 100000;
//        double tasso = 3.5;
//        int numeroRate = 0; // Numero di rate non valido
//        double tasso241 = 4.0;
//        boolean is241 = false;
//        int ultimoProgressivo = 0;
//
//        // Verifica che venga lanciata un'eccezione
//        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
//            invokeSviluppaPiano2(instance, con, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
//        });
//
//        assertEquals("Errore nei dati: verificare il numero di rate impostate nel database.", exception.getMessage());
//
//        // Chiudi la connessione al database
//        con.close();
//    }
}
