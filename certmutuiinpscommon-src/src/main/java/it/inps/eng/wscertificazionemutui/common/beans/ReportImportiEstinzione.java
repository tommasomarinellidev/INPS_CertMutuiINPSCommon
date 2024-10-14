/**
 * @Autore 
 *
 * @Data 
 *
 * @Ora 
 *
 */

package it.inps.eng.wscertificazionemutui.common.beans;

import java.io.Serializable;

public class ReportImportiEstinzione implements Serializable {

	private static final long serialVersionUID = 6981816863223091570L;
	private String capitaleRientrato = "";
	private String totaleCapitaleRate = "";
	private String totaleQuotaCapitale = "";
	private String totaleQuotaInteressi = "";
	private String inputImporto = "";
	private String inputDataPagamento = "";
	private String minimoRateCalcolate = "";
	private String minimoRateCalcolateImporto = "";
	
	public String getCapitaleRientrato() {
		// Metodo getter di capitaleRientrato
		return capitaleRientrato;
	}
	public void setCapitaleRientrato(String capitaleRientrato) {
		// Metodo setter di this.capitaleRientrato
		this.capitaleRientrato = capitaleRientrato;
	}
	public String getTotaleCapitaleRate() {
		// Metodo getter di totaleCapitaleRate
		return totaleCapitaleRate;
	}
	public void setTotaleCapitaleRate(String totaleCapitaleRate) {
		// Metodo setter di this.totaleCapitaleRate
		this.totaleCapitaleRate = totaleCapitaleRate;
	}
	public String getTotaleQuotaCapitale() {
		// Metodo getter di totaleQuotaCapitale
		return totaleQuotaCapitale;
	}
	public void setTotaleQuotaCapitale(String totaleQuotaCapitale) {
		// Metodo setter di this.totaleQuotaCapitale
		this.totaleQuotaCapitale = totaleQuotaCapitale;
	}
	public String getTotaleQuotaInteressi() {
		// Metodo getter di totaleQuotaInteressi
		return totaleQuotaInteressi;
	}
	public void setTotaleQuotaInteressi(String totaleQuotaInteressi) {
		// Metodo setter di this.totaleQuotaInteressi
		this.totaleQuotaInteressi = totaleQuotaInteressi;
	}
	public String getInputImporto() {
		return inputImporto;
	}
	public void setInputImporto(String inputImporto) {
		this.inputImporto = inputImporto;
	}
	public String getInputDataPagamento() {
		return inputDataPagamento;
	}
	public void setInputDataPagamento(String inputDataPagamento) {
		this.inputDataPagamento = inputDataPagamento;
	}
	public String getMinimoRateCalcolate() {
		return minimoRateCalcolate;
	}
	public void setMinimoRateCalcolate(String minimoRateCalcolate) {
		this.minimoRateCalcolate = minimoRateCalcolate;
	}
	
	public String getMinimoRateCalcolateImporto() {
		return minimoRateCalcolateImporto;
	}
	public void setMinimoRateCalcolateImporto(String minimoRateCalcolateImporto) {
		this.minimoRateCalcolateImporto = minimoRateCalcolateImporto;
	}
	@Override
	public String toString() {
		return "ReportImportiEstinzione [capitaleRientrato=" + capitaleRientrato + ", totaleCapitaleRate="
				+ totaleCapitaleRate + ", totaleQuotaCapitale=" + totaleQuotaCapitale + ", totaleQuotaInteressi="
				+ totaleQuotaInteressi + ", inputImporto=" + inputImporto + ", inputDataPagamento=" + inputDataPagamento
				+ ", minimoRateCalcolate=" + minimoRateCalcolate + ", minimoRateCalcolateImporto="
				+ minimoRateCalcolateImporto + "]";
	}
	
	
	
	
}
