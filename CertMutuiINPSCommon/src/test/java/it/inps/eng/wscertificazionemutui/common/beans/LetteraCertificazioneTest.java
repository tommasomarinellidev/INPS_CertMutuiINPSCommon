package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LetteraCertificazioneTest {

    private LetteraCertificazione letteraCertificazione;

    @BeforeEach
    public void setUp() {
        letteraCertificazione = new LetteraCertificazione();
    }
    
    @Test
    public void testSerialVersionUID() {
        // Expected serialVersionUID value
        long expectedSerialVersionUID = 746668062408082083L;
        
        // Assert that the actual serialVersionUID matches the expected value
        assertEquals(expectedSerialVersionUID, LetteraCertificazione.getSerialVersionUID());
    }

    @Test
    public void testConstructor() {
        assertNotNull(letteraCertificazione);
    }

    @Test
    public void testGetAndSetAnnoCertificazione() {
        String annoCertificazione = "2024";
        letteraCertificazione.setAnnoCertificazione(annoCertificazione);
        assertEquals(annoCertificazione, letteraCertificazione.getAnnoCertificazione());
    }

    @Test
    public void testGetAndSetCapCitta() {
        String capCitta = "00100";
        letteraCertificazione.setCapCitta(capCitta);
        assertEquals(capCitta, letteraCertificazione.getCapCitta());
    }

    @Test
    public void testGetAndSetCapErede1() {
        String capErede1 = "00101";
        letteraCertificazione.setCapErede1(capErede1);
        assertEquals(capErede1, letteraCertificazione.getCapErede1());
    }

    @Test
    public void testGetAndSetCapErede2() {
        String capErede2 = "00102";
        letteraCertificazione.setCapErede2(capErede2);
        assertEquals(capErede2, letteraCertificazione.getCapErede2());
    }

    @Test
    public void testGetAndSetCapErede3() {
        String capErede3 = "00103";
        letteraCertificazione.setCapErede3(capErede3);
        assertEquals(capErede3, letteraCertificazione.getCapErede3());
    }

    @Test
    public void testGetAndSetCapErede4() {
        String capErede4 = "00104";
        letteraCertificazione.setCapErede4(capErede4);
        assertEquals(capErede4, letteraCertificazione.getCapErede4());
    }

    @Test
    public void testGetAndSetCapErede5() {
        String capErede5 = "00105";
        letteraCertificazione.setCapErede5(capErede5);
        assertEquals(capErede5, letteraCertificazione.getCapErede5());
    }

    @Test
    public void testGetAndSetCapErede6() {
        String capErede6 = "00106";
        letteraCertificazione.setCapErede6(capErede6);
        assertEquals(capErede6, letteraCertificazione.getCapErede6());
    }

    @Test
    public void testGetAndSetCapitale() {
        String capitale = "1000,00";
        letteraCertificazione.setCapitale(capitale);
        assertEquals(capitale, letteraCertificazione.getCapitale());
    }

    @Test
    public void testGetAndSetCitta() {
        String citta = "Roma";
        letteraCertificazione.setCitta(citta);
        assertEquals(citta, letteraCertificazione.getCitta());
    }

    @Test
    public void testGetAndSetCittaErede1() {
        String cittaErede1 = "Milano";
        letteraCertificazione.setCittaErede1(cittaErede1);
        assertEquals(cittaErede1, letteraCertificazione.getCittaErede1());
    }

    @Test
    public void testGetAndSetCittaErede2() {
        String cittaErede2 = "Napoli";
        letteraCertificazione.setCittaErede2(cittaErede2);
        assertEquals(cittaErede2, letteraCertificazione.getCittaErede2());
    }

    @Test
    public void testGetAndSetCittaErede3() {
        String cittaErede3 = "Torino";
        letteraCertificazione.setCittaErede3(cittaErede3);
        assertEquals(cittaErede3, letteraCertificazione.getCittaErede3());
    }

    @Test
    public void testGetAndSetCittaErede4() {
        String cittaErede4 = "Genova";
        letteraCertificazione.setCittaErede4(cittaErede4);
        assertEquals(cittaErede4, letteraCertificazione.getCittaErede4());
    }

    @Test
    public void testGetAndSetCittaErede5() {
        String cittaErede5 = "Bologna";
        letteraCertificazione.setCittaErede5(cittaErede5);
        assertEquals(cittaErede5, letteraCertificazione.getCittaErede5());
    }

    @Test
    public void testGetAndSetCittaErede6() {
        String cittaErede6 = "Firenze";
        letteraCertificazione.setCittaErede6(cittaErede6);
        assertEquals(cittaErede6, letteraCertificazione.getCittaErede6());
    }

    @Test
    public void testGetAndSetCodiceFisc() {
        String codiceFisc = "RSSMRA80A01H501U";
        letteraCertificazione.setCodiceFisc(codiceFisc);
        assertEquals(codiceFisc, letteraCertificazione.getCodiceFisc());
    }

    @Test
    public void testGetAndSetCodiceFiscErede1() {
        String codiceFiscErede1 = "ABCDEF01G23H456I";
        letteraCertificazione.setCodiceFiscErede1(codiceFiscErede1);
        assertEquals(codiceFiscErede1, letteraCertificazione.getCodiceFiscErede1());
    }

    @Test
    public void testGetAndSetCodiceFiscErede2() {
        String codiceFiscErede2 = "XYZLMN89A01B234C";
        letteraCertificazione.setCodiceFiscErede2(codiceFiscErede2);
        assertEquals(codiceFiscErede2, letteraCertificazione.getCodiceFiscErede2());
    }

    @Test
    public void testGetAndSetCodiceFiscErede3() {
        String codiceFiscErede3 = "DEFABC01D23E456F";
        letteraCertificazione.setCodiceFiscErede3(codiceFiscErede3);
        assertEquals(codiceFiscErede3, letteraCertificazione.getCodiceFiscErede3());
    }

    @Test
    public void testGetAndSetCodiceFiscErede4() {
        String codiceFiscErede4 = "JKLXYZ89A01B234D";
        letteraCertificazione.setCodiceFiscErede4(codiceFiscErede4);
        assertEquals(codiceFiscErede4, letteraCertificazione.getCodiceFiscErede4());
    }

    @Test
    public void testGetAndSetCodiceFiscErede5() {
        String codiceFiscErede5 = "GHIMNO01P23Q456R";
        letteraCertificazione.setCodiceFiscErede5(codiceFiscErede5);
        assertEquals(codiceFiscErede5, letteraCertificazione.getCodiceFiscErede5());
    }

    @Test
    public void testGetAndSetCodiceFiscErede6() {
        String codiceFiscErede6 = "STUVWX01Y23Z456A";
        letteraCertificazione.setCodiceFiscErede6(codiceFiscErede6);
        assertEquals(codiceFiscErede6, letteraCertificazione.getCodiceFiscErede6());
    }

    @Test
    public void testGetAndSetCognNomeErede1() {
        String cognNomeErede1 = "Marco Bianchi";
        letteraCertificazione.setCognNomeErede1(cognNomeErede1);
        assertEquals(cognNomeErede1, letteraCertificazione.getCognNomeErede1());
    }

    @Test
    public void testGetAndSetCognNomeErede2() {
        String cognNomeErede2 = "Luca Verdi";
        letteraCertificazione.setCognNomeErede2(cognNomeErede2);
        assertEquals(cognNomeErede2, letteraCertificazione.getCognNomeErede2());
    }

    @Test
    public void testGetAndSetCognNomeErede3() {
        String cognNomeErede3 = "Giulia Neri";
        letteraCertificazione.setCognNomeErede3(cognNomeErede3);
        assertEquals(cognNomeErede3, letteraCertificazione.getCognNomeErede3());
    }

    @Test
    public void testGetAndSetCognNomeErede4() {
        String cognNomeErede4 = "Silvia Rossi";
        letteraCertificazione.setCognNomeErede4(cognNomeErede4);
        assertEquals(cognNomeErede4, letteraCertificazione.getCognNomeErede4());
    }

    @Test
    public void testGetAndSetCognNomeErede5() {
        String cognNomeErede5 = "Andrea Gialli";
        letteraCertificazione.setCognNomeErede5(cognNomeErede5);
        assertEquals(cognNomeErede5, letteraCertificazione.getCognNomeErede5());
    }

    @Test
    public void testGetAndSetCognNomeErede6() {
        String cognNomeErede6 = "Paola Blu";
        letteraCertificazione.setCognNomeErede6(cognNomeErede6);
        assertEquals(cognNomeErede6, letteraCertificazione.getCognNomeErede6());
    }

    @Test
    public void testGetAndSetCognomeNome() {
        String cognomeNome = "Mario Rossi";
        letteraCertificazione.setCognomeNome(cognomeNome);
        assertEquals(cognomeNome, letteraCertificazione.getCognomeNome());
    }

    @Test
    public void testGetAndSetIndirizzoVia() {
        String indirizzoVia = "Via Roma, 10";
        letteraCertificazione.setIndirizzoVia(indirizzoVia);
        assertEquals(indirizzoVia, letteraCertificazione.getIndirizzoVia());
    }

    /*@Test
    public void testGetAndSetIndirizzoViaErede1() {
        String indirizzoViaErede1 = "Via Milano, 20";
        letteraCertificazione.setIndirizzoViaErede1(indirizzoViaErede1);
        assertEquals(indirizzoViaErede1, letteraCertificazione.getIndirizzoViaErede1());
    }

    @Test
    public void testGetAndSetIndirizzoViaErede2() {
        String indirizzoViaErede2 = "Via Napoli, 30";
        letteraCertificazione.setIndirizzoViaErede2(indirizzoViaErede2);
        assertEquals(indirizzoViaErede2, letteraCertificazione.getIndirizzoViaErede2());
    }

    @Test
    public void testGetAndSetIndirizzoViaErede3() {
        String indirizzoViaErede3 = "Via Torino, 40";
        letteraCertificazione.setIndirizzoViaErede3(indirizzoViaErede3);
        assertEquals(indirizzoViaErede3, letteraCertificazione.getIndirizzoViaErede3());
    }

    @Test
    public void testGetAndSetIndirizzoViaErede4() {
        String indirizzoViaErede4 = "Via Genova, 50";
        letteraCertificazione.setIndirizzoViaErede4(indirizzoViaErede4);
        assertEquals(indirizzoViaErede4, letteraCertificazione.getIndirizzoViaErede4());
    }

    @Test
    public void testGetAndSetIndirizzoViaErede5() {
        String indirizzoViaErede5 = "Via Bologna, 60";
        letteraCertificazione.setIndirizzoViaErede5(indirizzoViaErede5);
        assertEquals(indirizzoViaErede5, letteraCertificazione.getIndirizzoViaErede5());
    }

    @Test
    public void testGetAndSetIndirizzoViaErede6() {
        String indirizzoViaErede6 = "Via Firenze, 70";
        letteraCertificazione.setIndirizzoViaErede6(indirizzoViaErede6);
        assertEquals(indirizzoViaErede6, letteraCertificazione.getIndirizzoViaErede6());
    }

    @Test
    public void testSetNomeCliente() {
        letteraCertificazione.setNomeCliente("Mario Rossi");
        assertEquals("Mario Rossi", letteraCertificazione.getNomeCliente());
    }

    @Test
    public void testSetNomeClienteNull() {
        letteraCertificazione.setNomeCliente(null);
        assertNull(letteraCertificazione.getNomeCliente());
    }

    @Test
    public void testSetNomeClienteEmpty() {
        letteraCertificazione.setNomeCliente("");
        assertEquals("", letteraCertificazione.getNomeCliente());
    }

    @Test
    public void testSetRagioneSociale() {
        letteraCertificazione.setRagioneSociale("ABC S.p.A.");
        assertEquals("ABC S.p.A.", letteraCertificazione.getRagioneSociale());
    }

    @Test
    public void testSetRagioneSocialeNull() {
        letteraCertificazione.setRagioneSociale(null);
        assertNull(letteraCertificazione.getRagioneSociale());
    }

    @Test
    public void testSetRagioneSocialeEmpty() {
        letteraCertificazione.setRagioneSociale("");
        assertEquals("", letteraCertificazione.getRagioneSociale());
    }

    @Test
    public void testSetDataFineLavori() {
        LocalDate date = LocalDate.of(2023, 12, 25);
        letteraCertificazione.setDataFineLavori(date);
        assertEquals(date, letteraCertificazione.getDataFineLavori());
    }

    @Test
    public void testSetDataFineLavoriNull() {
        letteraCertificazione.setDataFineLavori(null);
        assertNull(letteraCertificazione.getDataFineLavori());
    }*/
    
    @Test
    public void testGettersAndSetters() {
        // Test numMutuo
        letteraCertificazione.setNumMutuo("123456");
        assertEquals("123456", letteraCertificazione.getNumMutuo());

        // Test descMutuo
        letteraCertificazione.setDescMutuo("Mutuo Abitazione");
        assertEquals("Mutuo Abitazione", letteraCertificazione.getDescMutuo());

        // Test cognomeNome
        letteraCertificazione.setCognomeNome("Mario Rossi");
        assertEquals("Mario Rossi", letteraCertificazione.getCognomeNome());

        // Test indirizzoVia
        letteraCertificazione.setIndirizzoVia("Via Roma 1");
        assertEquals("Via Roma 1", letteraCertificazione.getIndirizzoVia());

        // Test capCitta
        letteraCertificazione.setCapCitta("00100");
        assertEquals("00100", letteraCertificazione.getCapCitta());

        // Test cap
        letteraCertificazione.setCap("00100");
        assertEquals("00100", letteraCertificazione.getCap());

        // Test localita
        letteraCertificazione.setLocalita("Roma");
        assertEquals("Roma", letteraCertificazione.getLocalita());

        // Test prov
        letteraCertificazione.setProv("RM");
        assertEquals("RM", letteraCertificazione.getProv());

        // Test citta
        letteraCertificazione.setCitta("Roma");
        assertEquals("Roma", letteraCertificazione.getCitta());

        // Test codiceFisc
        letteraCertificazione.setCodiceFisc("RSSMRA85M01H501Z");
        assertEquals("RSSMRA85M01H501Z", letteraCertificazione.getCodiceFisc());

        // Test numCivico
        letteraCertificazione.setNumCivico("1");
        assertEquals("1", letteraCertificazione.getNumCivico());

        // Test capitale
        letteraCertificazione.setCapitale("1000,00");
        assertEquals("1000,00", letteraCertificazione.getCapitale());

        // Test interessi
        letteraCertificazione.setInteressi("100,00");
        assertEquals("100,00", letteraCertificazione.getInteressi());

        // Test mora
        letteraCertificazione.setMora("50,00");
        assertEquals("50,00", letteraCertificazione.getMora());

        // Test preammortamento
        letteraCertificazione.setPreammortamento("20,00");
        assertEquals("20,00", letteraCertificazione.getPreammortamento());

        // Test spese
        letteraCertificazione.setSpese("30,00");
        assertEquals("30,00", letteraCertificazione.getSpese());

        // Test totale
        letteraCertificazione.setTotale("1200,00");
        assertEquals("1200,00", letteraCertificazione.getTotale());

        // Test perc_detr
        letteraCertificazione.setPerc_detr("15%");
        assertEquals("15%", letteraCertificazione.getPerc_detr());

        // Test cognNomeErede1
        letteraCertificazione.setCognNomeErede1("Luigi Bianchi");
        assertEquals("Luigi Bianchi", letteraCertificazione.getCognNomeErede1());

        // Test indirErede1
        letteraCertificazione.setIndirErede1("Via Milano 10");
        assertEquals("Via Milano 10", letteraCertificazione.getIndirErede1());

        // Test capErede1
        letteraCertificazione.setCapErede1("20100");
        assertEquals("20100", letteraCertificazione.getCapErede1());

        // Test cittaErede1
        letteraCertificazione.setCittaErede1("Milano");
        assertEquals("Milano", letteraCertificazione.getCittaErede1());

        // Test codiceFiscErede1
        letteraCertificazione.setCodiceFiscErede1("BNCGLU65M01H501Z");
        assertEquals("BNCGLU65M01H501Z", letteraCertificazione.getCodiceFiscErede1());

        // Test perc_detr1
        letteraCertificazione.setPerc_detr1("10%");
        assertEquals("10%", letteraCertificazione.getPerc_detr1());

        // Test cognNomeErede2
        letteraCertificazione.setCognNomeErede2("Anna Verdi");
        assertEquals("Anna Verdi", letteraCertificazione.getCognNomeErede2());

        // Test indirErede2
        letteraCertificazione.setIndirErede2("Via Napoli 15");
        assertEquals("Via Napoli 15", letteraCertificazione.getIndirErede2());

        // Test capErede2
        letteraCertificazione.setCapErede2("80100");
        assertEquals("80100", letteraCertificazione.getCapErede2());

        // Test cittaErede2
        letteraCertificazione.setCittaErede2("Napoli");
        assertEquals("Napoli", letteraCertificazione.getCittaErede2());

        // Test codiceFiscErede2
        letteraCertificazione.setCodiceFiscErede2("VRDNNA85M01H501Z");
        assertEquals("VRDNNA85M01H501Z", letteraCertificazione.getCodiceFiscErede2());

        // Test perc_detr2
        letteraCertificazione.setPerc_detr2("20%");
        assertEquals("20%", letteraCertificazione.getPerc_detr2());

        // Test cognNomeErede3
        letteraCertificazione.setCognNomeErede3("Giuseppe Neri");
        assertEquals("Giuseppe Neri", letteraCertificazione.getCognNomeErede3());

        // Test indirErede3
        letteraCertificazione.setIndirErede3("Via Torino 20");
        assertEquals("Via Torino 20", letteraCertificazione.getIndirErede3());

        // Test capErede3
        letteraCertificazione.setCapErede3("10100");
        assertEquals("10100", letteraCertificazione.getCapErede3());

        // Test cittaErede3
        letteraCertificazione.setCittaErede3("Torino");
        assertEquals("Torino", letteraCertificazione.getCittaErede3());

        // Test codiceFiscErede3
        letteraCertificazione.setCodiceFiscErede3("NRIGPP65M01H501Z");
        assertEquals("NRIGPP65M01H501Z", letteraCertificazione.getCodiceFiscErede3());

        // Test perc_detr3
        letteraCertificazione.setPerc_detr3("25%");
        assertEquals("25%", letteraCertificazione.getPerc_detr3());

        // Test cognNomeErede4
        letteraCertificazione.setCognNomeErede4("Maria Rossi");
        assertEquals("Maria Rossi", letteraCertificazione.getCognNomeErede4());

        // Test indirErede4
        letteraCertificazione.setIndirErede4("Via Firenze 5");
        assertEquals("Via Firenze 5", letteraCertificazione.getIndirErede4());

        // Test capErede4
        letteraCertificazione.setCapErede4("50100");
        assertEquals("50100", letteraCertificazione.getCapErede4());

        // Test cittaErede4
        letteraCertificazione.setCittaErede4("Firenze");
        assertEquals("Firenze", letteraCertificazione.getCittaErede4());

        // Test codiceFiscErede4
        letteraCertificazione.setCodiceFiscErede4("RSSMRA85M01H501Z");
        assertEquals("RSSMRA85M01H501Z", letteraCertificazione.getCodiceFiscErede4());

        // Test perc_detr4
        letteraCertificazione.setPerc_detr4("30%");
        assertEquals("30%", letteraCertificazione.getPerc_detr4());

        // Test cognNomeErede5
        letteraCertificazione.setCognNomeErede5("Antonio Bruni");
        assertEquals("Antonio Bruni", letteraCertificazione.getCognNomeErede5());

        // Test indirErede5
        letteraCertificazione.setIndirErede5("Via Bologna 25");
        assertEquals("Via Bologna 25", letteraCertificazione.getIndirErede5());

        // Test capErede5
        letteraCertificazione.setCapErede5("40100");
        assertEquals("40100", letteraCertificazione.getCapErede5());

        // Test cittaErede5
        letteraCertificazione.setCittaErede5("Bologna");
        assertEquals("Bologna", letteraCertificazione.getCittaErede5());

        // Test codiceFiscErede5
        letteraCertificazione.setCodiceFiscErede5("BRNAAA65M01H501Z");
        assertEquals("BRNAAA65M01H501Z", letteraCertificazione.getCodiceFiscErede5());

        // Test perc_detr5
        letteraCertificazione.setPerc_detr5("35%");
        assertEquals("35%", letteraCertificazione.getPerc_detr5());

        // Test cognNomeErede6
        letteraCertificazione.setCognNomeErede6("Luca Marchetti");
        assertEquals("Luca Marchetti", letteraCertificazione.getCognNomeErede6());

        // Test indirErede6
        letteraCertificazione.setIndirErede6("Via Genova 30");
        assertEquals("Via Genova 30", letteraCertificazione.getIndirErede6());

        // Test capErede6
        letteraCertificazione.setCapErede6("16100");
        assertEquals("16100", letteraCertificazione.getCapErede6());

        // Test cittaErede6
        letteraCertificazione.setCittaErede6("Genova");
        assertEquals("Genova", letteraCertificazione.getCittaErede6());

        // Test codiceFiscErede6
        letteraCertificazione.setCodiceFiscErede6("MRCLCU65M01H501Z");
        assertEquals("MRCLCU65M01H501Z", letteraCertificazione.getCodiceFiscErede6());

        // Test perc_detr6
        letteraCertificazione.setPerc_detr6("40%");
        assertEquals("40%", letteraCertificazione.getPerc_detr6());

        // Test cognEredeDi
        letteraCertificazione.setCognEredeDi("Giovanni Romano");
        assertEquals("Giovanni Romano", letteraCertificazione.getCognEredeDi());

        // Test dataCessazione
        letteraCertificazione.setDataCessazione("2024-12-31");
        assertEquals("2024-12-31", letteraCertificazione.getDataCessazione());

        // Test tipoFirmatario
        letteraCertificazione.setTipoFirmatario("Direttore");
        assertEquals("Direttore", letteraCertificazione.getTipoFirmatario());

        // Test tipoFirmatarioLogo
        letteraCertificazione.setTipoFirmatarioLogo("Logo Direttore");
        assertEquals("Logo Direttore", letteraCertificazione.getTipoFirmatarioLogo());

        // Test sede
        letteraCertificazione.setSede("Sede Centrale");
        assertEquals("Sede Centrale", letteraCertificazione.getSede());

        // Test annoCertificazione
        letteraCertificazione.setAnnoCertificazione("2024");
        assertEquals("2024", letteraCertificazione.getAnnoCertificazione());

        // Test annoCorrente
        letteraCertificazione.setAnnoCorrente("2024");
        assertEquals("2024", letteraCertificazione.getAnnoCorrente());

        // Test indSedeRid
        letteraCertificazione.setIndSedeRid("Via Torino 10");
        assertEquals("Via Torino 10", letteraCertificazione.getIndSedeRid());

        // Test capRid
        letteraCertificazione.setCapRid("10100");
        assertEquals("10100", letteraCertificazione.getCapRid());

        // Test cittaRid
        letteraCertificazione.setCittaRid("Torino");
        assertEquals("Torino", letteraCertificazione.getCittaRid());

        // Test faxRid
        letteraCertificazione.setFaxRid("0111234567");
        assertEquals("0111234567", letteraCertificazione.getFaxRid());

        // Test numeroTel
        letteraCertificazione.setNumeroTel("0117654321");
        assertEquals("0117654321", letteraCertificazione.getNumeroTel());

        // Test dataOdierna
        letteraCertificazione.setDataOdierna("2024-09-10");
        assertEquals("2024-09-10", letteraCertificazione.getDataOdierna());

        // Test nomeDirigente
        letteraCertificazione.setNomeDirigente("Dott. Alessandro Rossi");
        assertEquals("Dott. Alessandro Rossi", letteraCertificazione.getNomeDirigente());

        // Test indSede
        letteraCertificazione.setIndSede("Via Milano 15");
        assertEquals("Via Milano 15", letteraCertificazione.getIndSede());

        // Test capSede
        letteraCertificazione.setCapSede("20100");
        assertEquals("20100", letteraCertificazione.getCapSede());

        // Test cittaSede
        letteraCertificazione.setCittaSede("Milano");
        assertEquals("Milano", letteraCertificazione.getCittaSede());

        // Test prSede
        letteraCertificazione.setPrSede("MI");
        assertEquals("MI", letteraCertificazione.getPrSede());

        // Test dataCertificazione
        letteraCertificazione.setDataCertificazione("2024-09-10");
        assertEquals("2024-09-10", letteraCertificazione.getDataCertificazione());

        // Test impostaSostitutiva
        letteraCertificazione.setImpostaSostitutiva("100.00");
        assertEquals("100.00", letteraCertificazione.getImpostaSostitutiva());

        // Test dataStipula
        letteraCertificazione.setDataStipula("2024-01-01");
        assertEquals("2024-01-01", letteraCertificazione.getDataStipula());

        // Test tipoMutuo
        letteraCertificazione.setTipoMutuo("Mutuo Ordinario");
        assertEquals("Mutuo Ordinario", letteraCertificazione.getTipoMutuo());

        // Test conguagliCP1
        letteraCertificazione.setConguagliCP1("10.00");
        assertEquals("10.00", letteraCertificazione.getConguagliCP1());

        // Test conguagliCP2
        letteraCertificazione.setConguagliCP2("20.00");
        assertEquals("20.00", letteraCertificazione.getConguagliCP2());

        // Test conguagliCP3
        letteraCertificazione.setConguagliCP3("30.00");
        assertEquals("30.00", letteraCertificazione.getConguagliCP3());

        // Test conguagliCP4
        letteraCertificazione.setConguagliCP4("40.00");
        assertEquals("40.00", letteraCertificazione.getConguagliCP4());

        // Test conguagliCP5
        letteraCertificazione.setConguagliCP5("50.00");
        assertEquals("50.00", letteraCertificazione.getConguagliCP5());

        // Test conguagliCP6
        letteraCertificazione.setConguagliCP6("60.00");
        assertEquals("60.00", letteraCertificazione.getConguagliCP6());

        // Test annoConguagliCP1
        letteraCertificazione.setAnnoConguagliCP1("2022");
        assertEquals("2022", letteraCertificazione.getAnnoConguagliCP1());

        // Test annoConguagliCP2
        letteraCertificazione.setAnnoConguagliCP2("2023");
        assertEquals("2023", letteraCertificazione.getAnnoConguagliCP2());

        // Test annoConguagliCP3
        letteraCertificazione.setAnnoConguagliCP3("2024");
        assertEquals("2024", letteraCertificazione.getAnnoConguagliCP3());

        // Test annoConguagliCP4
        letteraCertificazione.setAnnoConguagliCP4("2025");
        assertEquals("2025", letteraCertificazione.getAnnoConguagliCP4());

        // Test annoConguagliCP5
        letteraCertificazione.setAnnoConguagliCP5("2026");
        assertEquals("2026", letteraCertificazione.getAnnoConguagliCP5());

        // Test annoConguagliCP6
        letteraCertificazione.setAnnoConguagliCP6("2027");
        assertEquals("2027", letteraCertificazione.getAnnoConguagliCP6());

        // Test inizioTesto
        letteraCertificazione.setInizioTesto("Testo iniziale");
        assertEquals("Testo iniziale", letteraCertificazione.getInizioTesto());

        // Test flagGestAcconti
        letteraCertificazione.setFlagGestAcconti(true);
        assertEquals(true, letteraCertificazione.getFlagGestAcconti());

    }
   

}

