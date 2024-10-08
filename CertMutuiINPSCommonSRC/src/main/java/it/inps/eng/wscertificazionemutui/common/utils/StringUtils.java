package it.inps.eng.wscertificazionemutui.common.utils;


public class StringUtils {
	

	public static String riempimentoConZeri(String stringaOld, int lunghezza) {

		String stringaNew = new String();

		for (int i = 0; i < lunghezza - stringaOld.length(); i++){

			stringaNew = stringaNew + "0";		

		}

		stringaNew = stringaNew + stringaOld;

		return stringaNew;
	}
	
	public static String notNull(String s) {
		return (s!=null) ? s : "";
	}
	
	public static String formattaDoubleString(String val) {
		if(val.contains(",")){
			int index=val.indexOf(",");
			if(val.substring(index,val.length()-1).length()==1){
			val=val+"0";
			}
		}
		else{
			val=val+",00";
		}
		return val;
	}
	
	
	public static String capitalizer(String word){
		word =replaceVocaliApostrofo(word);
        String[] words = word.split(" ");
        StringBuilder sb = new StringBuilder();
        if (words[0].length() > 0) {
            sb.append(Character.toUpperCase(words[0].charAt(0)) + words[0].subSequence(1, words[0].length()).toString().toLowerCase());
            for (int i = 1; i < words.length; i++) {
                sb.append(" ");
                if (words[i].length() > 0) sb.append(Character.toUpperCase(words[i].charAt(0)) + words[i].subSequence(1, words[i].length()).toString().toLowerCase());
            }
        }
        return  sb.toString();
    }
	
	private static String replaceVocaliApostrofo(String parola){
		
		parola=parola.replace("a'", "\u00E0");
		parola=parola.replace("e'", "\u00E8");
		parola=parola.replace("i'", "\u00ec");
		parola=parola.replace("o'", "\u00f2");
		parola=parola.replace("u'", "\u00F9");
		
		return parola;
	}
	
	public static String tipoSedeResult(String tipo, String sede){
		String result="";
		tipo=tipo.toLowerCase();
		tipo=tipo.replaceFirst(tipo.substring(0, 1), tipo.substring(0, 1).toUpperCase());
    			
		//EXPRIVIA MOD 05/03/2020		
		//SE LA PAROLA CONTIENE è L’AQUILA L’AQUILA
		try {
			if(sede.contains("AQUILA")) {
				sede = sede.replace("’", "'");
				String[] s1 = sede.split("'");
				sede = s1[0] +"'"+StringUtils.capitalizer(s1[1]);
				System.out.println("++++++SEDE: "+sede);
	
			}else if(sede.contains("AOSTA")){
//				System.out.println("PRima AOSTA"+sede.indexOf("’"));
//				System.out.println(sede);
//				sede = sede.replace("’", "'");
//				System.out.println(sede.indexOf("'"));
//				System.out.println("Dopo AOSTA"+sede);
//				//SE LA PAROLA CONTIENE una una parola in più come Valle d'aosta
//				int i = sede.indexOf("'");
//				String sedeTemp = sede.substring(0, i-1);
//				String sedeTemp2 = sede.substring(i-1, sede.length());
//				String[] s2 = sedeTemp2.split("'");
//				sede = StringUtils.capitalizer(sedeTemp)+s2[0].toLowerCase()+"'"+StringUtils.capitalizer(s2[1]);
				sede = "Valle d'Aosta";
				System.out.println("++++++SEDE: "+sede);
			}
		
		//FINE EXPRIVIA MOD 05/03/2020		


			else{
			
		    	sede=sede.toLowerCase();
				sede=StringUtils.capitalizer(sede);
				String seq="";
				if(sede.contains("(") && sede.contains(")")){
					int indParA=sede.indexOf("(");
					int indParC=sede.indexOf(")");
					seq=(String) sede.subSequence(indParA, indParC+1);
				}
				if(sede.contains("-")){
					int indTrat=sede.indexOf("-");
					sede=sede.replace(sede.substring(indTrat+1, indTrat+2), sede.substring(indTrat+1, indTrat+2).toUpperCase());
				}
		//		if(sede.contains(".")){
		//			int indPoint=sede.indexOf(".");
		//			int indPoint1=sede.lastIndexOf(".");
		//			sede=sede.replace(sede.substring(indPoint+1, indPoint+2), sede.substring(indPoint+1, indPoint+2).toUpperCase());
		//			sede=sede.replace(sede.substring(indPoint1+1, indPoint1+2), sede.substring(indPoint1+1, indPoint1+2).toUpperCase());
		//		}
				sede=sede.replace("Di ", "di ");
				sede=sede.replace(seq,"");//Parametrico
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
    	
		result = tipo+" "+ sede;
		
		return result;
		
	}

}
