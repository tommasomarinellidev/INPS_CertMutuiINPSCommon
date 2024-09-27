package it.inps.eng.wscertificazionemutui.common.utils;


public enum StatiWorkflowEnum {

	IN_REDAZIONE(1l, "in redazione"), 
	IN_APPROVAZIONE(2l, "in approvazione"), 
	IN_PUBBLICAZIONE(3l, "in pubblicazione"),
	STATO_NON_PERMESSO(-1l, "STATO NON PERMESSO");
	
	private long stato;
	private String descrizione;

	private StatiWorkflowEnum(long stato, String descrizione) {
		this.setStato(stato);
		this.setDescrizione(descrizione);
	}

	public long getStato() {
		return stato;
	}

	public void setStato(long stato) {
		this.stato = stato;
	}

	public String getDescrizione() {
		return descrizione;
	}
	

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public static StatiWorkflowEnum decode(long stato) {
		StatiWorkflowEnum result = null;
		for(StatiWorkflowEnum statoWf : StatiWorkflowEnum.values()){
			if(statoWf.stato == stato){
				result = statoWf;
				break;
			}
		}
		return result != null ? result : STATO_NON_PERMESSO;
		
	}
}
