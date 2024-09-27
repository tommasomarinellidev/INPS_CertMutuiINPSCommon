package it.inps.eng.wscertificazionemutui.common.beans.migrazione;

import java.util.ArrayList;
import java.util.List;

import it.inps.eng.wscertificazionemutui.common.beans.Lettera;

/**
 * 
 * @author Sistemi2000 : Camorchia Michele
 *
 * Bean che descrive un report da generare.
 */
public class ReportObject {
	private String inputFile;
	private ArrayList outputFiles;
	private Object bean;
	private List<Lettera> Lettera;

	public ReportObject() {
		// Inizializzo la lista dei file
		outputFiles = new ArrayList();
	}
	
	public void clear() {
		outputFiles.clear();
	}
	
	public Object getBean() {
		return bean;
	}
	
	public void setBean(Object bean) {
		this.bean = bean;
	}
	
	public String getInputFile() {
		return inputFile;
	}
	
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	
	public ArrayList getOutputFiles() {
		return outputFiles;
	}
	
	public void addOutputFile(String outputFile) {
		this.outputFiles.add(outputFile);
	}
	
	
	public List<Lettera> getLettera() {
		return Lettera;
	}

	public void setLettera(List<Lettera> lettera) {
		Lettera = lettera;
	}

	/**
	 * Restituisce true se il this � uguale all'oggeto passato per argomento.
	 * 
	 * @param obj l'oggeto con cui confrontare this
	 * @return true se uguali, false altrimenti
	 */
	public boolean equals(Object obj) {
		// null, diversi
		if(obj==null) return false;
		// non dello stesso tipo, lascia decidere ad Object
		if(!(obj instanceof ReportObject)) return super.equals(obj);
		
		// cast safe
		ReportObject ro = (ReportObject)obj;
		// sono uguali se e solo se i file di output sono uguali
		ArrayList al = ro.getOutputFiles();
		for(int i=0;i<al.size();i++) {
			if(this.getOutputFiles().contains(al.get(i))) return true;
		}
		return false;
	}
}
