package it.inps.eng.wscertificazionemutui.common.beans.certificazionefiscale;

import java.io.Serializable;

/**
 * 
 *
 * Bean che rappresenta i Rimborsi.
 */
public class Rimborsi implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tp_mov;
	private String desc;
	private Double imp_mov;
	private String anno;
	
	
	
	public String getTp_mov() {
		return tp_mov;
	}
	public void setTp_mov(String tp_mov) {
		this.tp_mov = tp_mov;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getImp_mov() {
		return imp_mov;
	}
	public void setImp_mov(Double imp_mov) {
		this.imp_mov = imp_mov;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	
	
	
	
}