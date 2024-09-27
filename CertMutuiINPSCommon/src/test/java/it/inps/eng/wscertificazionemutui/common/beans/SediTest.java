package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SediTest {

    private Sedi sedi;

    @BeforeEach
    public void setUp() {
        sedi = new Sedi();
    }

    @Test
    public void testDefaultConstructor() {
        // Testa se dt_ult_agg è inizializzato correttamente
        Date now = new Date(System.currentTimeMillis());
        assertEquals(now.toString(), sedi.getDt_ult_agg().toString());
    }

    @Test
    public void testGettersAndSetters() {
        // Prepare test data
        String sede = "Sede Centrale";
        String ind = "Via Milano";
        String cap = "20100";
        String citta = "Milano";
        String pr = "MI";
        String tel = "0123456789";
        String telMob = "0987654321";
        String fax = "0123456789";
        String abi = "12345";
        String cab = "67890";
        String cin = "A";
        String cc = "1234567890123456";
        String email = "example@example.com";
        String denoBanca = "Banca Example";
        String denoAgenzia = "Agenzia Example";
        String indAgenzia = "Via Roma";
        String capAgenzia = "00100";
        String cittaAgenzia = "Roma";
        String prAgenzia = "RM";
        Date dtUltAgg = new Date(System.currentTimeMillis());
        String matrUltAgg = "123456";
        String nomeDirettore = "Direttore Example";
        String codicePaese = "IT";
        String cinEuro = "X";
        String iban = "IT60X0542811101000000123456";

        // Set values
        sedi.setSede(sede);
        sedi.setInd(ind);
        sedi.setCap(cap);
        sedi.setCitta(citta);
        sedi.setPr(pr);
        sedi.setTel(tel);
        sedi.setTelMob(telMob);
        sedi.setFax(fax);
        sedi.setAbi(abi);
        sedi.setCab(cab);
        sedi.setCin(cin);
        sedi.setCc(cc);
        sedi.setEmail(email);
        sedi.setDeno_banca(denoBanca);
        sedi.setDeno_agenzia(denoAgenzia);
        sedi.setInd_agenzia(indAgenzia);
        sedi.setCap_agenzia(capAgenzia);
        sedi.setCitta_agenzia(cittaAgenzia);
        sedi.setPr_agenzia(prAgenzia);
        sedi.setDt_ult_agg(dtUltAgg);
        sedi.setMatr_ult_agg(matrUltAgg);
        sedi.setNomeDirettore(nomeDirettore);
        sedi.setCodicePaese(codicePaese);
        sedi.setCinEuro(cinEuro);
        sedi.setIban(iban);

        // Assertions
        assertEquals(sede, sedi.getSede());
        assertEquals(ind, sedi.getInd());
        assertEquals(cap, sedi.getCap());
        assertEquals(citta, sedi.getCitta());
        assertEquals(pr, sedi.getPr());
        assertEquals(tel, sedi.getTel());
        assertEquals(telMob, sedi.getTelMob());
        assertEquals(fax, sedi.getFax());
        assertEquals(abi, sedi.getAbi());
        assertEquals(cab, sedi.getCab());
        assertEquals(cin, sedi.getCin());
        assertEquals(cc, sedi.getCc());
        assertEquals(email, sedi.getEmail());
        assertEquals(denoBanca, sedi.getDeno_banca());
        assertEquals(denoAgenzia, sedi.getDeno_agenzia());
        assertEquals(indAgenzia, sedi.getInd_agenzia());
        assertEquals(capAgenzia, sedi.getCap_agenzia());
        assertEquals(cittaAgenzia, sedi.getCitta_agenzia());
        assertEquals(prAgenzia, sedi.getPr_agenzia());
        assertEquals(dtUltAgg, sedi.getDt_ult_agg());
        assertEquals(matrUltAgg, sedi.getMatr_ult_agg());
        assertEquals(nomeDirettore, sedi.getNomeDirettore());
        assertEquals(codicePaese, sedi.getCodicePaese());
        assertEquals(cinEuro, sedi.getCinEuro());
        assertEquals(iban, sedi.getIban());
    }
}
