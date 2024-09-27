package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetteraTest {

    private Lettera lettera;

    @BeforeEach
    public void setUp() {
        lettera = new Lettera();
    }

    @Test
    public void testGetAndSetCognomeNome() {
        String expected = "Mario Rossi";
        lettera.setCognomeNome(expected);
        assertEquals(expected, lettera.getCognomeNome());
    }

    @Test
    public void testGetAndSetIndirizzoVia() {
        String expected = "Via Roma";
        lettera.setIndirizzoVia(expected);
        assertEquals(expected, lettera.getIndirizzoVia());
    }

    @Test
    public void testGetAndSetCapCitta() {
        String expected = "00100 Roma";
        lettera.setCapCitta(expected);
        assertEquals(expected, lettera.getCapCitta());
    }

    @Test
    public void testGetAndSetCap() {
        String expected = "00100";
        lettera.setCap(expected);
        assertEquals(expected, lettera.getCap());
    }

    @Test
    public void testGetAndSetCitta() {
        String expected = "Roma";
        lettera.setCitta(expected);
        assertEquals(expected, lettera.getCitta());
    }

    @Test
    public void testGetAndSetProv() {
        String expected = "RM";
        lettera.setProv(expected);
        assertEquals(expected, lettera.getProv());
    }

    @Test
    public void testGetAndSetDataStipula() {
        String expected = "2024-01-01";
        lettera.setDataStipula(expected);
        assertEquals(expected, lettera.getDataStipula());
    }

    @Test
    public void testGetAndSetDataDecorrenza() {
        String expected = "2024-01-15";
        lettera.setDataDecorrenza(expected);
        assertEquals(expected, lettera.getDataDecorrenza());
    }

    @Test
    public void testGetAndSetMeseAnnoDecorrenza() {
        String expected = "01/2024";
        lettera.setMeseAnnoDecorrenza(expected);
        assertEquals(expected, lettera.getMeseAnnoDecorrenza());
    }

    @Test
    public void testGetAndSetNumeroRate() {
        String expected = "12";
        lettera.setNumeroRate(expected);
        assertEquals(expected, lettera.getNumeroRate());
    }

    @Test
    public void testGetAndSetImportoRata() {
        String expected = "1000,00";
        lettera.setImportoRata(expected);
        assertEquals(expected, lettera.getImportoRata());
    }

    @Test
    public void testGetAndSetImportoRataNew() {
        String expected = "1100,00";
        lettera.setImportoRataNew(expected);
        assertEquals(expected, lettera.getImportoRataNew());
    }

    @Test
    public void testGetAndSetNumeroFax() {
        String expected = "123456789";
        lettera.setNumeroFax(expected);
        assertEquals(expected, lettera.getNumeroFax());
    }

    @Test
    public void testGetAndSetMeseAnnoInizioPagamento() {
        String expected = "02/2024";
        lettera.setMeseAnnoInizioPagamento(expected);
        assertEquals(expected, lettera.getMeseAnnoInizioPagamento());
    }

    @Test
    public void testGetAndSetDataValuta() {
        String expected = "2024-02-01";
        lettera.setDataValuta(expected);
        assertEquals(expected, lettera.getDataValuta());
    }

    @Test
    public void testGetAndSetMeseAnnoRata() {
        String expected = "03/2024";
        lettera.setMeseAnnoRata(expected);
        assertEquals(expected, lettera.getMeseAnnoRata());
    }

    @Test
    public void testGetAndSetDataAccredito() {
        String expected = "2024-03-01";
        lettera.setDataAccredito(expected);
        assertEquals(expected, lettera.getDataAccredito());
    }

    @Test
    public void testGetAndSetDataPagamento() {
        String expected = "2024-04-01";
        lettera.setDataPagamento(expected);
        assertEquals(expected, lettera.getDataPagamento());
    }

    @Test
    public void testGetAndSetDataErogazione() {
        String expected = "2024-05-01";
        lettera.setDataErogazione(expected);
        assertEquals(expected, lettera.getDataErogazione());
    }

    @Test
    public void testGetAndSetDataProvvedimento() {
        String expected = "2024-06-01";
        lettera.setDataProvvedimento(expected);
        assertEquals(expected, lettera.getDataProvvedimento());
    }

    @Test
    public void testGetAndSetTipoVariazione() {
        String expected = "Aumento";
        lettera.setTipoVariazione(expected);
        assertEquals(expected, lettera.getTipoVariazione());
    }

    @Test
    public void testGetAndSetTassoUfficiale() {
        String expected = "1.5%";
        lettera.setTassoUfficiale(expected);
        assertEquals(expected, lettera.getTassoUfficiale());
    }

    @Test
    public void testGetAndSetNuovoTasso() {
        String expected = "2.0%";
        lettera.setNuovoTasso(expected);
        assertEquals(expected, lettera.getNuovoTasso());
    }

    @Test
    public void testGetAndSetTipoVariazione2() {
        String expected = "Riduzione";
        lettera.setTipoVariazione2(expected);
        assertEquals(expected, lettera.getTipoVariazione2());
    }

    @Test
    public void testGetAndSetDataDecorrenzaDebito() {
        String expected = "2024-07-01";
        lettera.setDataDecorrenzaDebito(expected);
        assertEquals(expected, lettera.getDataDecorrenzaDebito());
    }

    @Test
    public void testGetAndSetNumeroTel() {
        String expected = "1234567890";
        lettera.setNumeroTel(expected);
        assertEquals(expected, lettera.getNumeroTel());
    }

    @Test
    public void testGetAndSetSede2() {
        String expected = "Sede secondaria";
        lettera.setSede2(expected);
        assertEquals(expected, lettera.getSede2());
    }

    @Test
    public void testGetAndSetDebitoResiduo() {
        String expected = "5000,00";
        lettera.setDebitoResiduo(expected);
        assertEquals(expected, lettera.getDebitoResiduo());
    }

    @Test
    public void testGetAndSetRateResidue() {
        String expected = "5";
        lettera.setRateResidue(expected);
        assertEquals(expected, lettera.getRateResidue());
    }

    @Test
    public void testGetAndSetContoCorrente() {
        String expected = "IT60X0542811101000000123456";
        lettera.setContoCorrente(expected);
        assertEquals(expected, lettera.getContoCorrente());
    }

    @Test
    public void testGetAndSetIntestatarioConto() {
        String expected = "Mario Rossi";
        lettera.setIntestatarioConto(expected);
        assertEquals(expected, lettera.getIntestatarioConto());
    }

    @Test
    public void testGetAndSetIban() {
        String expected = "IT60X0542811101000000123456";
        lettera.setIban(expected);
        assertEquals(expected, lettera.getIban());
    }

    @Test
    public void testGetAndSetCodFiscale() {
        String expected = "RSSMRA80A01H501Z";
        lettera.setCodFiscRid(expected);
        assertEquals(expected, lettera.getCodFiscRid());
    }
    
    @Test
    public void testGetSetDataInizioPreamm() {
        String dataInizioPreamm = "2024-09-10";
        lettera.setDataInizioPreamm(dataInizioPreamm);
        assertEquals(dataInizioPreamm, lettera.getDataInizioPreamm());
    }

    @Test
    public void testGetSetImportoPreamm() {
        String importoPreamm = "1000,50";
        lettera.setImportoPreamm(importoPreamm);
        assertEquals(importoPreamm, lettera.getImportoPreamm());
    }

    @Test
    public void testGetSetImportoRimborsoSpese() {
        String importoRimborsoSpese = "250,75";
        lettera.setImportoRimborsoSpese(importoRimborsoSpese);
        assertEquals(importoRimborsoSpese, lettera.getImportoRimborsoSpese());
    }

    @Test
    public void testGetSetTipoFirmatario() {
        String tipoFirmatario = "Direttore";
        lettera.setTipoFirmatario(tipoFirmatario);
        assertEquals(tipoFirmatario, lettera.getTipoFirmatario());
    }

    @Test
    public void testGetSetSede() {
        String sede = "Roma";
        lettera.setSede(sede);
        assertEquals(sede, lettera.getSede());
    }

    @Test
    public void testGetSetTipoFirmatarioLogo() {
        String tipoFirmatarioLogo = "Logo.png";
        lettera.setTipoFirmatarioLogo(tipoFirmatarioLogo);
        assertEquals(tipoFirmatarioLogo, lettera.getTipoFirmatarioLogo());
    }

    @Test
    public void testGetSetAbi() {
        String abi = "03069";
        lettera.setAbi(abi);
        assertEquals(abi, lettera.getAbi());
    }

    @Test
    public void testGetSetCab() {
        String cab = "03200";
        lettera.setCab(cab);
        assertEquals(cab, lettera.getCab());
    }

    @Test
    public void testGetSetCin() {
        String cin = "X";
        lettera.setCin(cin);
        assertEquals(cin, lettera.getCin());
    }

    @Test
    public void testGetSetDatiBanca() {
        String datiBanca = "Banca Nazionale";
        lettera.setDatiBanca(datiBanca);
        assertEquals(datiBanca, lettera.getDatiBanca());
    }

    @Test
    public void testGetSetIndirizzoBanca() {
        String indirizzoBanca = "Via Roma 10";
        lettera.setIndirizzoBanca(indirizzoBanca);
        assertEquals(indirizzoBanca, lettera.getIndirizzoBanca());
    }
    
    @Test
    void testGetAndSetAbiRid() {
        lettera.setAbiRid("1234");
        assertEquals("1234", lettera.getAbiRid());
    }

    @Test
    void testGetAndSetCabRid() {
        lettera.setCabRid("5678");
        assertEquals("5678", lettera.getCabRid());
    }

    @Test
    void testGetAndSetCinRid() {
        lettera.setCinRid("A");
        assertEquals("A", lettera.getCinRid());
    }

    @Test
    void testGetAndSetComuneIntestatarioRid() {
        lettera.setComuneIntestatarioRid("Milano");
        assertEquals("Milano", lettera.getComuneIntestatarioRid());
    }

    @Test
    void testGetAndSetContoCorrenteRid() {
        lettera.setContoCorrenteRid("IT60X0542811101000000123456");
        assertEquals("IT60X0542811101000000123456", lettera.getContoCorrenteRid());
    }

    @Test
    void testGetAndSetDatiAgenzia() {
        lettera.setDatiAgenzia("Agenzia XYZ");
        assertEquals("Agenzia XYZ", lettera.getDatiAgenzia());
    }

    @Test
    void testGetAndSetDatiAgenziaRid() {
        lettera.setDatiAgenziaRid("Agenzia ABC");
        assertEquals("Agenzia ABC", lettera.getDatiAgenziaRid());
    }

    @Test
    void testGetAndSetDatiBancaRid() {
        lettera.setDatiBancaRid("Banca DEF");
        assertEquals("Banca DEF", lettera.getDatiBancaRid());
    }

    @Test
    void testGetAndSetImportoRataExtRid() {
        lettera.setImportoRataExtRid("150,00");
        assertEquals("150,00", lettera.getImportoRataExtRid());
    }

    @Test
    void testGetAndSetImportoRataRid() {
        lettera.setImportoRataRid("100,00");
        assertEquals("100,00", lettera.getImportoRataRid());
    }

    @Test
    void testGetAndSetIndirizzoBancaRid() {
        lettera.setIndirizzoBancaRid("Via Roma, 10");
        assertEquals("Via Roma, 10", lettera.getIndirizzoBancaRid());
    }

    @Test
    void testGetAndSetIntestatarioContoRid() {
        lettera.setIntestatarioContoRid("Mario Rossi");
        assertEquals("Mario Rossi", lettera.getIntestatarioContoRid());
    }

    @Test
    void testGetAndSetMeseAnnoPrimaRataRid() {
        lettera.setMeseAnnoPrimaRataRid("01/2023");
        assertEquals("01/2023", lettera.getMeseAnnoPrimaRataRid());
    }

    @Test
    void testGetAndSetMeseAnnoRataRid() {
        lettera.setMeseAnnoRataRid("02/2023");
        assertEquals("02/2023", lettera.getMeseAnnoRataRid());
    }

    @Test
    void testGetAndSetNomeCausaleRid() {
        lettera.setNomeCausaleRid("Causale ABC");
        assertEquals("Causale ABC", lettera.getNomeCausaleRid());
    }

    @Test
    void testGetAndSetNomeRid() {
        lettera.setNomeRid("Giuseppe Verdi");
        assertEquals("Giuseppe Verdi", lettera.getNomeRid());
    }

    @Test
    void testGetAndSetDataOdierna() {
        lettera.setDataOdierna("10/09/2024");
        assertEquals("10/09/2024", lettera.getDataOdierna());
    }

    @Test
    void testGetAndSetComuneSede() {
        lettera.setComuneSede("Roma");
        assertEquals("Roma", lettera.getComuneSede());
    }

    @Test
    void testGetAndSetCapRid() {
        lettera.setCapRid("00100");
        assertEquals("00100", lettera.getCapRid());
    }

    @Test
    void testGetAndSetCittaRid() {
        lettera.setCittaRid("Napoli");
        assertEquals("Napoli", lettera.getCittaRid());
    }

    @Test
    void testGetAndSetDenoSedeRid() {
        lettera.setDenoSedeRid("Denominazione XYZ");
        assertEquals("Denominazione XYZ", lettera.getDenoSedeRid());
    }

    @Test
    void testGetAndSetFaxRid() {
        lettera.setFaxRid("06-1234567");
        assertEquals("06-1234567", lettera.getFaxRid());
    }

    @Test
    void testGetAndSetIndSedeRid() {
        lettera.setIndSedeRid("Viale Manzoni, 12");
        assertEquals("Viale Manzoni, 12", lettera.getIndSedeRid());
    }

    @Test
    void testGetAndSetIban1() {
        lettera.setIban1("IT60X0542811101000000123456");
        assertEquals("IT60X0542811101000000123456", lettera.getIban1());
    }

    @Test
    void testGetAndSetFaxRid1() {
        lettera.setFaxRid1("06-7654321");
        assertEquals("06-7654321", lettera.getFaxRid1());
    }

    @Test
    void testGetAndSetDescTUR() {
        lettera.setDescTUR("Tasso Ufficiale Riferimento");
        assertEquals("Tasso Ufficiale Riferimento", lettera.getDescTUR());
    }

    @Test
    void testGetAndSetEmail() {
        lettera.setEmail("example@example.com");
        assertEquals("example@example.com", lettera.getEmail());
    }

    @Test
    void testGetAndSetFirma() {
        lettera.setFirma("Mario Rossi");
        assertEquals("Mario Rossi", lettera.getFirma());
    }

    @Test
    void testGetAndSetBancaVia() {
        lettera.setBancaVia("Via Garibaldi, 15");
        assertEquals("Via Garibaldi, 15", lettera.getBancaVia());
    }

    @Test
    void testGetAndSetBancaCitta() {
        lettera.setBancaCitta("Genova");
        assertEquals("Genova", lettera.getBancaCitta());
    }
    
    @Test
    public void testSetGetSedeDescr() {
        String sedeDescr = "Test Sede Descr";
        lettera.setSedeDescr(sedeDescr);
        assertEquals(sedeDescr, lettera.getSedeDescr());
    }

    @Test
    public void testSetGetSedeDescr1() {
        String sedeDescr1 = "Test Sede Descr 1";
        lettera.setSedeDescr1(sedeDescr1);
        assertEquals(sedeDescr1, lettera.getSedeDescr1());
    }

    @Test
    public void testSetGetSedeDescr2() {
        String sedeDescr2 = "Test Sede Descr 2";
        lettera.setSedeDescr2(sedeDescr2);
        assertEquals(sedeDescr2, lettera.getSedeDescr2());
    }

    @Test
    public void testSetGetProvSede() {
        String provSede = "MI";
        lettera.setProvSede(provSede);
        assertEquals(provSede, lettera.getProvSede());
    }

    @Test
    public void testSetGetStringa() {
        String stringa = "Test Stringa";
        lettera.setStringa(stringa);
        assertEquals(stringa, lettera.getStringa());
    }

    @Test
    public void testSetGetCapRid1() {
        String capRid1 = "00100";
        lettera.setCapRid1(capRid1);
        assertEquals(capRid1, lettera.getCapRid1());
    }

    @Test
    public void testSetGetCittaRid1() {
        String cittaRid1 = "Roma";
        lettera.setCittaRid1(cittaRid1);
        assertEquals(cittaRid1, lettera.getCittaRid1());
    }

    @Test
    public void testSetGetIndSedeRid1() {
        String indSedeRid1 = "Via Test, 10";
        lettera.setIndSedeRid1(indSedeRid1);
        assertEquals(indSedeRid1, lettera.getIndSedeRid1());
    }
    

    @Test
    public void testToString() {
        String expected = "Lettera [cognomeNome=, indirizzoVia=, capCitta=, cap=, citta=, prov=, dataStipula=, dataDecorrenza=, meseAnnoDecorrenza=, numeroRate=0, importoRata=0,00, importoRataNew=0,00, numeroFax=, meseAnnoInizioPagamento=, dataValuta=, meseAnnoRata=, dataAccredito=, dataPagamento=, dataErogazione=, dataProvvedimento=, tipoVariazione=, tassoUfficiale=, nuovoTasso=, tipoVariazione2=, dataDecorrenzaDebito=, numeroTel=, sede2=, debitoResiduo=, rateResidue=0, contoCorrente=, intestatarioConto=, datiBanca=, datiAgenzia=, indirizzoBanca=, abi=, cab=, cin=, importoPreamm=0,00, dataInizioPreamm=n/d, importoRimborsoSpese=0,00, tipoFirmatario=, tipoFirmatarioLogo=, sede=, comuneIntestatarioRid=, denoSedeRid=, indSedeRid=, capRid=, cittaRid=, faxRid=, faxRid1=, nomeRid=, codFiscRid=, importoRataRid=0,00, importoRataExtRid=, contoCorrenteRid=, intestatarioContoRid=, datiBancaRid=, datiAgenziaRid=, indirizzoBancaRid=, abiRid=, cabRid=, cinRid=, nomeCausaleRid=, meseAnnoPrimaRataRid=, meseAnnoRataRid=, dataOdierna=, comuneSede=, sedeDescr=, sedeDescr1=, sedeDescr2=, provSede=, indSedeRid1=, capRid1=, cittaRid1=, Stringa=, Iban=, Iban1=, descTUR=, email=, firma=, bancaVia=, bancaCitta=]";
        assertEquals(expected, lettera.toString());
    }

}
