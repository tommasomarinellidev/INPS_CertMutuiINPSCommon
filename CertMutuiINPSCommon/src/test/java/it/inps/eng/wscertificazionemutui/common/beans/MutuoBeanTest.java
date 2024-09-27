package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MutuoBeanTest {

    @Test
    public void testGettersAndSetters() {
        // Create an instance of the bean
        MutuoBean bean = new MutuoBean();
        
        // Test setter and getter for mutuiListString
        List<String> mutuiList = new ArrayList<>();
        mutuiList.add("Mutuo1");
        mutuiList.add("Mutuo2");
        bean.setMutuiListString(mutuiList);
        assertEquals(mutuiList, bean.getMutuiListString());

        // Test setter and getter for annoCert
        bean.setAnnoCert("2024");
        assertEquals("2024", bean.getAnnoCert());

        // Test setter and getter for annoM
        bean.setAnnoM("2024");
        assertEquals("2024", bean.getAnnoM());

        // Test setter and getter for progM
        bean.setProgM("001");
        assertEquals("001", bean.getProgM());

        // Test setter and getter for codLet
        bean.setCodLet("CodeLet1");
        assertEquals("CodeLet1", bean.getCodLet());

        // Test setter and getter for descLet
        bean.setDescLet("Description Lettera");
        assertEquals("Description Lettera", bean.getDescLet());

        // Test setter and getter for codFisDec
        bean.setCodFisDec("CodeFisDec1");
        assertEquals("CodeFisDec1", bean.getCodFisDec());

        // Test setter and getter for flRett
        bean.setFlRett("FlagRett1");
        assertEquals("FlagRett1", bean.getFlRett());

        // Test setter and getter for descRett
        bean.setDescRett("Description Rettifica");
        assertEquals("Description Rettifica", bean.getDescRett());

        // Test setter and getter for idCF
        bean.setIdCF("IDCF1234");
        assertEquals("IDCF1234", bean.getIdCF());
    }
}
