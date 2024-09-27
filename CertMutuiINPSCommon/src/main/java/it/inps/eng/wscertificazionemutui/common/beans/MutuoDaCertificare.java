package it.inps.eng.wscertificazionemutui.common.beans;

import java.util.Date;

/**
 * 
 * @author P@olo 
 *
 * Bean che rappresenta un mutuo da Certificare.
 */
public class MutuoDaCertificare extends UpdateTags {	
	
	private static final long serialVersionUID = -5598919680061422010L;
	
	private String annoMutuo;
	private String progMutuo;
	private String stMutuo;
	private Integer tpMutuo;
	private Double impMutuo;
	private Date dtSti;
	private Date dtChs;
	private boolean flagGestAcconti;
	private String tpAgenziaEntrate;
	private boolean cartolarizzato;
	
	public String getAnnoMutuo() {
		return annoMutuo;
	}
	public void setAnnoMutuo(String annoMutuo) {
		this.annoMutuo = annoMutuo;
	}
	public String getProgMutuo() {
		return progMutuo;
	}
	public void setProgMutuo(String progMutuo) {
		this.progMutuo = progMutuo;
	}
	public String getStMutuo() {
		return stMutuo;
	}
	public void setStMutuo(String stMutuo) {
		this.stMutuo = stMutuo;
	}
	public Integer getTpMutuo() {
		return tpMutuo;
	}
	public void setTpMutuo(Integer tpMutuo) {
		this.tpMutuo = tpMutuo;
	}
	
	public Double getImpMutuo() {
		return impMutuo;
	}
	public void setImpMutuo(Double impMutuo) {
		this.impMutuo = impMutuo;
	}
	public Date getDtSti() {
		return dtSti;
	}
	public void setDtSti(Date dtSti) {
		this.dtSti = dtSti;
	}
	public Date getDtChs() {
		return dtChs;
	}
	public void setDtChs(Date dtChs) {
		this.dtChs = dtChs;
	}
	public boolean getFlagGestAcconti() {
		return flagGestAcconti;
	}
	public void setFlagGestAcconti(boolean flagGestAcconti) {
		this.flagGestAcconti = flagGestAcconti;
	}
	public String getTpAgenziaEntrate() {
		return tpAgenziaEntrate;
	}
	public void setTpAgenziaEntrate(String tpAgenziaEntrate) {
		this.tpAgenziaEntrate = tpAgenziaEntrate;
	}
	public boolean isCartolarizzato() {
		return cartolarizzato;
	}
	public void setCartolarizzato(boolean cartolarizzato) {
		this.cartolarizzato = cartolarizzato;
	}
	
}
