package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class StoriaCondizioneTest {

    @Test
    public void testGettersAndSetters() {
        StoriaCondizione storia = new StoriaCondizione();

        // Test per i metodi setter e getter per ogni proprietà
        Date dtDec = new Date();
        storia.setDt_dec(dtDec);
        assertEquals(dtDec, storia.getDt_dec());

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        storia.setDt_ora_inser(timestamp);
        assertEquals(timestamp, storia.getDt_ora_inser());

        storia.setSt_evn("STEVN");
        assertEquals("STEVN", storia.getSt_evn());

        storia.setTp_evn("TPEVN");
        assertEquals("TPEVN", storia.getTp_evn());

        storia.setImp_deb(1000.0);
        assertEquals(1000.0, storia.getImp_deb());

        storia.setImp_deb_ecd(2000.0);
        assertEquals(2000.0, storia.getImp_deb_ecd());

        storia.setTp_tas("TPTAS");
        assertEquals("TPTAS", storia.getTp_tas());

        storia.setTp_tas_ecd("TPTAS_ECD");
        assertEquals("TPTAS_ECD", storia.getTp_tas_ecd());

        storia.setTas(3.5);
        assertEquals(3.5, storia.getTas());

        storia.setTas_ecd(4.5);
        assertEquals(4.5, storia.getTas_ecd());

        storia.setNum_rt_rsd(10);
        assertEquals(10, storia.getNum_rt_rsd());

        storia.setNum_rt_tot(20);
        assertEquals(20, storia.getNum_rt_tot());

        storia.setFrq_rt(5);
        assertEquals(5, storia.getFrq_rt());

        storia.setProg_rt(7);
        assertEquals(7, storia.getProg_rt());

        storia.setImp_rt(3000.0);
        assertEquals(3000.0, storia.getImp_rt());

        storia.setImp_rt_ecd(4000.0);
        assertEquals(4000.0, storia.getImp_rt_ecd());

        storia.setImp_estin(1500.0);
        assertEquals(1500.0, storia.getImp_estin());

        storia.setImp_estin_ecd(2500.0);
        assertEquals(2500.0, storia.getImp_estin_ecd());

        storia.setTp_varz("TPVARZ");
        assertEquals("TPVARZ", storia.getTp_varz());

        Date dataScadenza = new Date();
        storia.setData_scadenza(dataScadenza);
        assertEquals(dataScadenza, storia.getData_scadenza());

        storia.setAnno_mutuo("2024");
        assertEquals("2024", storia.getAnno_mutuo());

        storia.setProg_mutuo("P2024");
        assertEquals("P2024", storia.getProg_mutuo());
    }

    @Test
    public void testDefaultConstructor() {
        StoriaCondizione storia = new StoriaCondizione();
        assertNotNull(storia);
    }
}
