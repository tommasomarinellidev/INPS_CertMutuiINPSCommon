package  it.inps.eng.wscertificazionemutui.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

public class Labels {
	private static Labels instance = null; 
	private static Properties initLabels;	

	private Labels(String labelFileName) {		
		try {										
			//System.out.println("propFileName: "+propFileName);
			
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			Properties props = new Properties();
			InputStream input = loader.getResourceAsStream(labelFileName);
			initLabels = new Properties();
			initLabels.load(input);
			input.close();
			printLabels();
		} catch (Exception e) {
			System.out.println("Errore nel costruttore Labels: "+e.getMessage());
		}
	}

	public static Properties getFileLabels(String nomeFile) {
		//System.out.println("instance: "+instance.toString());
		if (instance == null){
			System.out.println("nomeFile: "+nomeFile);
			instance = new Labels(nomeFile);
		}
		return initLabels;
	}

	public static Properties getFileLabels() {
		if (instance == null){			
			return null; 
		}
		return initLabels;
	}	
	
	private void printLabels(){
		Collection<Object> elements = initLabels.values();
		System.out.println("Caricamento Labels :");
		for(Object ele: elements) 
			System.out.println(ele);
	}
	
	public static String getLabel(String labelName) {
		if (instance == null){			
			return null; 
		}
		
		String label = "";
		label = initLabels.getProperty(labelName);
		return label;
	}
	
//	public static Properties getFileLabelsSimple(String nomeFile) {
//		ClassLoader loader = Thread.currentThread().getContextClassLoader();
//		try(InputStream input = loader.getResourceAsStream(nomeFile)) {
//            initLabels = new Properties();
//            initLabels.load(input);
//		} catch (IOException ex) {
//            ex.printStackTrace();
//        }
//		return initLabels;
//	}
	
	
}
