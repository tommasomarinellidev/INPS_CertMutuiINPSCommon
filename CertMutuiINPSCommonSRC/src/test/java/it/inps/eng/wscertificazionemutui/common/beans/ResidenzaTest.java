package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResidenzaTest {
    
    private Residenza residenza;

    @BeforeEach
    public void setUp() {
        residenza = new Residenza();
    }

    @Test
    public void testGettersAndSetters() {
        // Prepare test data
        String indirizzo = "Via Roma";
        String numeroCiv = "10";
        String cap = "00100";
        String citta = "Roma";
        String codSede = "RM123";
        String prSede = "RM";

        // Set values
        residenza.setIndirizzo(indirizzo);
        residenza.setNumeroCiv(numeroCiv);
        residenza.setCap(cap);
        residenza.setCitta(citta);
        residenza.setCodSede(codSede);
        residenza.setPrSede(prSede);

        // Assertions
        assertEquals(indirizzo, residenza.getIndirizzo());
        assertEquals(numeroCiv, residenza.getNumeroCiv());
        assertEquals(cap, residenza.getCap());
        assertEquals(citta, residenza.getCitta());
        assertEquals(codSede, residenza.getCodSede());
        assertEquals(prSede, residenza.getPrSede());
    }
}
