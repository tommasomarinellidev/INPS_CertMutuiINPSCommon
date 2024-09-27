package it.inps.eng.wscertificazionemutui.common.beans.migrazione;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import it.inps.eng.wscertificazionemutui.common.beans.Lettera;

public class ReportObjectTest {

    @Test
    public void testConstructor() {
        ReportObject reportObject = new ReportObject();
        assertNotNull(reportObject.getOutputFiles());
        assertTrue(reportObject.getOutputFiles().isEmpty());
    }

    @Test
    public void testGetAndSetInputFile() {
        ReportObject reportObject = new ReportObject();
        String inputFile = "input.txt";
        reportObject.setInputFile(inputFile);
        assertEquals(inputFile, reportObject.getInputFile());
    }

    @Test
    public void testGetAndSetBean() {
        ReportObject reportObject = new ReportObject();
        Object bean = new Object();
        reportObject.setBean(bean);
        assertEquals(bean, reportObject.getBean());
    }

    @Test
    public void testGetAndSetLettera() {
        ReportObject reportObject = new ReportObject();
        List<Lettera> lettere = new ArrayList<>();
        lettere.add(new Lettera());
        reportObject.setLettera(lettere);
        assertEquals(lettere, reportObject.getLettera());
    }

    @Test
    public void testAddOutputFile() {
        ReportObject reportObject = new ReportObject();
        String outputFile = "output.txt";
        reportObject.addOutputFile(outputFile);
        assertFalse(reportObject.getOutputFiles().isEmpty());
        assertEquals(1, reportObject.getOutputFiles().size());
        assertEquals(outputFile, reportObject.getOutputFiles().get(0));
    }

    @Test
    public void testClear() {
        ReportObject reportObject = new ReportObject();
        reportObject.addOutputFile("output1.txt");
        reportObject.addOutputFile("output2.txt");
        assertFalse(reportObject.getOutputFiles().isEmpty());
        reportObject.clear();
        assertTrue(reportObject.getOutputFiles().isEmpty());
    }

    @Test
    public void testEqualsSameObject() {
        ReportObject reportObject1 = new ReportObject();
        reportObject1.addOutputFile("output1.txt");

        assertTrue(reportObject1.equals(reportObject1)); // Lo stesso oggetto dovrebbe essere uguale a se stesso
    }

    @Test
    public void testEqualsDifferentObjectsSameContent() {
        ReportObject reportObject1 = new ReportObject();
        ReportObject reportObject2 = new ReportObject();
        reportObject1.addOutputFile("output1.txt");
        reportObject2.addOutputFile("output1.txt");

        assertTrue(reportObject1.equals(reportObject2)); // Oggetti diversi ma stesso contenuto
    }

    @Test
    public void testEqualsDifferentObjectsDifferentContent() {
        ReportObject reportObject1 = new ReportObject();
        ReportObject reportObject2 = new ReportObject();
        reportObject1.addOutputFile("output1.txt");
        reportObject2.addOutputFile("output2.txt");

        assertFalse(reportObject1.equals(reportObject2)); // Oggetti diversi con contenuto diverso
    }

    @Test
    public void testEqualsWithNullObject() {
        ReportObject reportObject1 = new ReportObject();
        assertFalse(reportObject1.equals(null)); // Un oggetto non dovrebbe mai essere uguale a null
    }

    @Test
    public void testEqualsWithDifferentType() {
        ReportObject reportObject1 = new ReportObject();
        String notReportObject = "Not a ReportObject";
        assertFalse(reportObject1.equals(notReportObject)); // Un oggetto di tipo diverso non dovrebbe essere uguale
    }
}
