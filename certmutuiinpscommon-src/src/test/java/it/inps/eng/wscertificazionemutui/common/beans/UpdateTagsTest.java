package it.inps.eng.wscertificazionemutui.common.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class UpdateTagsTest {

    // Classe concreta per il test, estende UpdateTags
    private class TestUpdateTags extends UpdateTags {
        // Questa classe serve solo per il testing, non ha ulteriori implementazioni
    }

    @Test
    public void testGettersAndSetters() {
        TestUpdateTags updateTags = new TestUpdateTags();

        // Test per il metodo setter e getter per dt_ul_agg
        Date date = new Date();
        updateTags.setDt_ul_agg(date);
        assertEquals(date, updateTags.getDt_ul_agg());

        // Test per il metodo setter e getter per mtr_ul_agg
        String mtrUlAgg = "MTR123";
        updateTags.setMtr_ul_agg(mtrUlAgg);
        assertEquals(mtrUlAgg, updateTags.getMtr_ul_agg());
    }


    @Test
    public void testDefaultConstructor() {
        TestUpdateTags updateTags = new TestUpdateTags();
        assertNotNull(updateTags);
    }
}
