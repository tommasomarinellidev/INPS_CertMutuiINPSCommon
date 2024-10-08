package it.inps.eng.wscertificazionemutui.common.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportImportiEstinzioneTest {
    
    private ReportImportiEstinzione report;

    @BeforeEach
    public void setUp() {
        report = new ReportImportiEstinzione();
    }

    @Test
    public void testGettersAndSetters() {
        // Prepare test data
        String capitaleRientrato = "50000";
        String totaleCapitaleRate = "100000";
        String totaleQuotaCapitale = "80000";
        String totaleQuotaInteressi = "20000";
        String inputImporto = "55000";
        String inputDataPagamento = "2024-12-31";
        String minimoRateCalcolate = "5";
        String minimoRateCalcolateImporto = "1000";

        // Set values
        report.setCapitaleRientrato(capitaleRientrato);
        report.setTotaleCapitaleRate(totaleCapitaleRate);
        report.setTotaleQuotaCapitale(totaleQuotaCapitale);
        report.setTotaleQuotaInteressi(totaleQuotaInteressi);
        report.setInputImporto(inputImporto);
        report.setInputDataPagamento(inputDataPagamento);
        report.setMinimoRateCalcolate(minimoRateCalcolate);
        report.setMinimoRateCalcolateImporto(minimoRateCalcolateImporto);

        // Assertions
        assertEquals(capitaleRientrato, report.getCapitaleRientrato());
        assertEquals(totaleCapitaleRate, report.getTotaleCapitaleRate());
        assertEquals(totaleQuotaCapitale, report.getTotaleQuotaCapitale());
        assertEquals(totaleQuotaInteressi, report.getTotaleQuotaInteressi());
        assertEquals(inputImporto, report.getInputImporto());
        assertEquals(inputDataPagamento, report.getInputDataPagamento());
        assertEquals(minimoRateCalcolate, report.getMinimoRateCalcolate());
        assertEquals(minimoRateCalcolateImporto, report.getMinimoRateCalcolateImporto());
    }

    @Test
    public void testToString() {
        // Prepare test data
        String capitaleRientrato = "50000";
        String totaleCapitaleRate = "100000";
        String totaleQuotaCapitale = "80000";
        String totaleQuotaInteressi = "20000";
        String inputImporto = "55000";
        String inputDataPagamento = "2024-12-31";
        String minimoRateCalcolate = "5";
        String minimoRateCalcolateImporto = "1000";

        // Set values
        report.setCapitaleRientrato(capitaleRientrato);
        report.setTotaleCapitaleRate(totaleCapitaleRate);
        report.setTotaleQuotaCapitale(totaleQuotaCapitale);
        report.setTotaleQuotaInteressi(totaleQuotaInteressi);
        report.setInputImporto(inputImporto);
        report.setInputDataPagamento(inputDataPagamento);
        report.setMinimoRateCalcolate(minimoRateCalcolate);
        report.setMinimoRateCalcolateImporto(minimoRateCalcolateImporto);

        // Expected string representation
        String expectedString = "ReportImportiEstinzione [capitaleRientrato=" + capitaleRientrato + 
                                ", totaleCapitaleRate=" + totaleCapitaleRate + 
                                ", totaleQuotaCapitale=" + totaleQuotaCapitale + 
                                ", totaleQuotaInteressi=" + totaleQuotaInteressi + 
                                ", inputImporto=" + inputImporto + 
                                ", inputDataPagamento=" + inputDataPagamento + 
                                ", minimoRateCalcolate=" + minimoRateCalcolate + 
                                ", minimoRateCalcolateImporto=" + minimoRateCalcolateImporto + "]";

        // Assertion
        assertEquals(expectedString, report.toString());
    }
}
