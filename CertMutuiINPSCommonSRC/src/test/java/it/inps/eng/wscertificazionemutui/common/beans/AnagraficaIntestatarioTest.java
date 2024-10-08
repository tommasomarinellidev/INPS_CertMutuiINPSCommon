package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagraficaIntestatarioTest {

    private AnagraficaIntestatario anagrafica;

    @BeforeEach
    public void setUp() {
        anagrafica = new AnagraficaIntestatario("12345", "CF123456789");
    }

    @Test
    public void testConstructorWithMatricola() {
        AnagraficaIntestatario anagraficaSingleArg = new AnagraficaIntestatario("54321");
        assertEquals("54321", anagraficaSingleArg.getMatricola());
        assertNull(anagraficaSingleArg.getCodiceFiscale(), "Codice fiscale should be null");
    }

    @Test
    public void testConstructorWithMatricolaAndCodiceFiscale() {
        AnagraficaIntestatario anagraficaDoubleArg = new AnagraficaIntestatario("67890", "CF987654321");
        assertEquals("67890", anagraficaDoubleArg.getMatricola());
        assertEquals("CF987654321", anagraficaDoubleArg.getCodiceFiscale());
    }

    @Test
    public void testGetMatricola() {
        assertEquals("12345", anagrafica.getMatricola());
    }

    @Test
    public void testSetMatricola() {
        anagrafica.setMatricola("67890");
        assertEquals("67890", anagrafica.getMatricola());
    }

    @Test
    public void testGetCodiceFiscale() {
        assertEquals("CF123456789", anagrafica.getCodiceFiscale());
    }

    @Test
    public void testSetCodiceFiscale() {
        anagrafica.setCodiceFiscale("CF987654321");
        assertEquals("CF987654321", anagrafica.getCodiceFiscale());
    }

    @Test
    public void testGetCognome() {
        anagrafica.setCognome("Rossi");
        assertEquals("Rossi", anagrafica.getCognome());
    }

    @Test
    public void testSetCognome() {
        anagrafica.setCognome("Bianchi");
        assertEquals("Bianchi", anagrafica.getCognome());
    }

    @Test
    public void testGetNome() {
        anagrafica.setNome("Mario");
        assertEquals("Mario", anagrafica.getNome());
    }

    @Test
    public void testSetNome() {
        anagrafica.setNome("Luigi");
        assertEquals("Luigi", anagrafica.getNome());
    }

    @Test
    public void testGetResidenza() {
        Residenza residenza = new Residenza();
        residenza.setNumeroCiv("1");
        residenza.setCitta("Roma");
        residenza.setCap("00100");
        anagrafica.setResidenza(residenza);
        assertEquals(residenza, anagrafica.getResidenza());
    }

    @Test
    public void testSetResidenza() {
        Residenza residenza = new Residenza();
        residenza.setNumeroCiv("2");
        residenza.setCitta("Milano");
        residenza.setCap("20100");
        anagrafica.setResidenza(residenza);
        assertEquals(residenza, anagrafica.getResidenza());
    }

}
