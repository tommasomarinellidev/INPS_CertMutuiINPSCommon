package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class BeneficiarioTest {

    private Beneficiario beneficiario;

    @BeforeEach
    public void setUp() {
        beneficiario = new Beneficiario();
    }

    @Test
    public void testGetAndSetMtr() {
        beneficiario.setMtr("123456");
        assertEquals("123456", beneficiario.getMtr());
    }

    @Test
    public void testGetAndSetSede() {
        beneficiario.setSede("Sede A");
        assertEquals("Sede A", beneficiario.getSede());
    }

    @Test
    public void testGetAndSetCognome() {
        beneficiario.setCognome("Rossi");
        assertEquals("Rossi", beneficiario.getCognome());
    }

    @Test
    public void testGetAndSetNome() {
        beneficiario.setNome("Mario");
        assertEquals("Mario", beneficiario.getNome());
    }

    @Test
    public void testGetAndSetDtCess() {
        Date dtCess = new Date();
        beneficiario.setDt_cess(dtCess);
        assertEquals(dtCess, beneficiario.getDt_cess());
    }

    @Test
    public void testGetAndSetDtMor() {
        Date dtMor = new Date();
        beneficiario.setDt_mor(dtMor);
        assertEquals(dtMor, beneficiario.getDt_mor());
    }

    @Test
    public void testGetAndSetMotCess() {
        beneficiario.setMot_cess("Motivo di Cessazione");
        assertEquals("Motivo di Cessazione", beneficiario.getMot_cess());
    }

    @Test
    public void testGetAndSetDescCess() {
        beneficiario.setDesc_cess("Descrizione di Cessazione");
        assertEquals("Descrizione di Cessazione", beneficiario.getDesc_cess());
    }

    @Test
    public void testToString() {
        beneficiario.setMtr("123456");
        beneficiario.setCognome("Rossi");
        beneficiario.setNome("Mario");
        assertEquals("123456 (Rossi Mario)", beneficiario.toString());
    }
}
