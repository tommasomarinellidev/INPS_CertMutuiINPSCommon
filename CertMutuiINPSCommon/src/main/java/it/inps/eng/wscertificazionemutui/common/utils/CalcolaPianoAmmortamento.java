package it.inps.eng.wscertificazionemutui.common.utils;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import it.inps.eng.wscertificazionemutui.common.beans.Rata;

/**
 * 
 * @author Ciro, Sistemi2000 : Iovenitti Riccardo, Camorchia Michele.
 *
 * La classe offre le funzionalit� di calcolo di un piano di ammortamento.
 * Le funzionalit� previste sono quelle di calcolo di un piano completo a tasso fisso, 
 * calcolo completo a tasso fisso per le prime 240 rate e con un altro tasso dopo la 240 rata.
 * oppure il calcolo di un piano a partire da una certa rata in poi sempre con le caratteristiche
 * esposte sopra. 
 * L'oggetto restituito � un oggetto "immutabile", significa che non � possibile alterare lo
 * stato interno. Ovviamente � possibile alterare le rate del piano, dato che sono per reference.
 * 
 * Per utilizzare la classe bisogna utilizzare un meccanismo tipo "singleton":
 * 
 * ...
 * CalcolaPianoAmmortamento cpa = CalcolaPianoAmmortamento.getInstance(...);
 * Collection rate = cpa.getPiano();
 * ...
 * 
 * La Collection (in origine un ArrayList) contiene un elenco di Rate. Per sviluppare un nuovo
 * piano � necessaria un nuova chiamata a .getInstance(...).
 */
public class CalcolaPianoAmmortamento {
	private double capitaleResiduo = 0.0;
	private double quotaInteressi = 0.0;
	private double quotaCapitale = 0.0;
	private ArrayList<Rata> ratePiano = null;
	private double totaleInteressi = 0.0;


	/**
	 * Costruttore base protetto.
	 * Evita le new.
	 */
	private CalcolaPianoAmmortamento() {
		// Implementazione, "leggermente" modificata del pattern Singleton... ;)
		// Inizializza l'array
		ratePiano = new ArrayList<Rata>();
	}

	/**
	 * Calcola il valore di una rata.
	 * 
	 * @param capitale capitale su cui calcolare
	 * @param tasso tasso espresso in percentuale
	 * @param numeroRata numero della rata
	 * @return il valore della rata (non arrotondato)
	 */
	 
	// private double calcolarata(double capitale, double tasso, double numeroRata) {
	private double calcolarata(String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, double numeroRata) {		
		
		if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {
			
			// Mutui INPS
			System.out.println("*** CalcolaPianoAmmortamento.CalcolaRata : Mutuo INPS " + tasso + " ***");
		
		// precalcola alcuni valori
		tasso = 1 + (tasso / 100.0);
		double valINPS = (1.0 / 12);
		double i = Math.pow(tasso, valINPS) - 1;
		// Valuta la rata
		
		return (capitale * i) / (1 - (Math.pow((1 + i), (-1 * numeroRata))));
/*		
		// per miglioramento arrotondamento sostituire con ...

		return Utility.roundTo( (capitale * i) / (1 - (Math.pow((1 + i), (-1 * numeroRata)))) ,2);		
*/		
		} else {
			
			// Mutui IPOST
			System.out.println("*** CalcolaPianoAmmortamento.CalcolaRata : Mutuo IPOST " + tasso + " ***");
			
//          *** Ammortamento a rate costanti (francese) (INIZIO) ***			
/*			
			rata = capitalePrestato * fattoreA * fattoreB
			fattoreA = Math.pow(calcola, esponente)
			fattoreB = (calcola - 1) / (fattoraA - 1)
			calcola = 1 + interesse / periodicita
			esponente = periodicita * anniRimborso
*/
/*			
			periodicita = 12
			anniRimborso = NUMERORATE / 12
			>>> esponente = NUMERORATE
			interesse = TASSO / 100
			>>> calcola = 1 + (TASSO / 100) / 12
			>>> fattoreA = Math.pow(calcola, esponente)
			>>> fattoreB = (calcola - 1) / (fattoreA - 1)
			capitalePrestato = CAPITALE
			>>> rata = CAPITALE *  fattoreA * fattoreB
*/	
			double calcola = 1 + (tasso / 100) / 12;
			double fattoreA = Math.pow(calcola, numeroRata);
			double fattoreB = (calcola - 1) / (fattoreA - 1);
			double rata = capitale * fattoreA * fattoreB;	
			System.out.println("*** CalcolaPianoAmmortamento.CalcolaRata : Mutuo (ALLA FRANCESE) " + rata);
			
//          *** Ammortamento a rate costanti (francese) (FINE) ***	
			
			double Cap = capitale;
			double TA = tasso / 100.00;
			int PA = 12;
			int A = 35;
			// PA x A = 420 (rate iniziali) ma mutuo gi� iniziato
			// quindi PA x A  = 406 (rate residue) ovvero numeroRata
			
			double Exp = Math.pow((1 + TA/PA), numeroRata);
			System.out.println("*** CalcolaPianoAmmortamento.CalcolaRata : Mutuo IPOST " + (Cap * Exp * TA / PA) / (Exp - 1));
			
			return (Cap * Exp * TA / PA) / (Exp - 1);
/*			
//			per miglioramento arrotondamento sostituire con ...
			
			return Utility.roundTo( (Cap * Exp * TA / PA) / (Exp - 1) ,2);			
*/			
		}
		
	}
	
	private double calcolarata2(Connection con, String anno_mutuo, String prog_mutuo) {		
		
		String sql = " SELECT Mutuo.IMP_MUTUO, Mutuo.TP_MUTUO, Mutuo.VOCE, Mutuo.ST_MUTUO, Mutuo.DT_STI, "+
			 "Mutuo.DT_ERO, Mutuo.IMP_SPE, Mutuo.IMP_ITS_PREAMM, Mutuo.DT_NASC_MUTUO, Mutuo.DT_CHS, "+
			 "Mutuo.IMP_CAPI_1_LOTTO, Mutuo.DT_ERO_1_LOTTO, Mutuo.IMP_CAPI_2_LOTTO, Mutuo.DT_ERO_2_LOTTO, "+
			 "Mutuo.IMP_CAPI_3_LOTTO, Mutuo.DT_ERO_3_LOTTO, Mutuo.DetrazioneFiscale, Mutuo.Note, Mutuo.IMP_MUTUO_ECD, "+
			 "Mutuo.IMP_ITS_PREAMM_ECD, StoriaCondizioni.TAS_ECD, StoriaCondizioni.IMP_RT_ECD, StoriaCondizioni.TP_TAS_ECD, "+
			 "StoriaCondizioni.TAS, StoriaCondizioni.NUM_RT_RSD, StoriaCondizioni.NUM_RT_TOT, StoriaCondizioni.FRQ_RT, "+
			 "StoriaCondizioni.IMP_RT, StoriaCondizioni.DATA_SCADENZA, StoriaCondizioni.TP_TAS "+
			 "FROM  Mutuo "+
			 "INNER JOIN    StoriaCondizioni "+
			 "ON Mutuo.ANNO_MUTUO = StoriaCondizioni.ANNO_MUTUO AND Mutuo.PROG_MUTUO = StoriaCondizioni.PROG_MUTUO "+
			 "WHERE     (Mutuo.ANNO_MUTUO = ?) AND (Mutuo.PROG_MUTUO = ?) "+
			 "and StoriaCondizioni.DT_DEC = (SELECT MAX(DT_DEC) FROM StoriaCondizioni WHERE ANNO_MUTUO = ? AND PROG_MUTUO = ? AND ST_EVN <> '00') "+
			 "AND StoriaCondizioni.ST_EVN <> '00'";
		double rata = 0;
		try {
			System.out.println("calcolarata2: "+ sql);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, anno_mutuo);
			ps.setString(2, prog_mutuo);
			ps.setString(3, anno_mutuo);
			ps.setString(4, prog_mutuo);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				rata = new Double(rs.getString("imp_rt"));
			}
			
			rs.close();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rata;
	}

	/**
	 * Restituisce un'istanza del calcolo di un piano.
	 *  
	 * @param capitale capitale iniziale
	 * @param tasso tasso iniziale in percentuale
	 * @param numeroRate numero delle rate del piano
	 * @param tasso241 tasso applicato dalla 241 rata in poi (compresa)
	 * @param is241 se true indica di variare il tasso alla 241 rata (se false il tasso241 � ignorato)
	 * @param ultimoProgressivo ultimo numero di progressivo utilizzato (1 per nuovo piano)
	 * @return un'istanza valida col piano sviluppato
	 */
	
	// public static CalcolaPianoAmmortamento getInstance(double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {
	public static CalcolaPianoAmmortamento getInstance(String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {		
		
		// crea istanza
		CalcolaPianoAmmortamento cpa = new CalcolaPianoAmmortamento();
		// calcola il piano
		
		// cpa.sviluppaPiano(capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
		cpa.sviluppaPiano(tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);		
		
		// restituisce l'istanza
		return cpa; 
	}

	public static CalcolaPianoAmmortamento getInstance2(Connection con, String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {		
		
		// crea istanza
		CalcolaPianoAmmortamento cpa = new CalcolaPianoAmmortamento();
		// calcola il piano
		
		// cpa.sviluppaPiano(capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
		cpa.sviluppaPiano2(con, tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);		
		
		// restituisce l'istanza
		return cpa; 
	}
	
	public static CalcolaPianoAmmortamento getInstanceEXCEL(String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {		
		
		// crea istanza
		CalcolaPianoAmmortamento cpa = new CalcolaPianoAmmortamento();
		// calcola il piano
		
		// cpa.sviluppaPiano(capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);
		cpa.sviluppaPianoEXCEL(tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate, tasso241, is241, ultimoProgressivo);		
		
		// restituisce l'istanza
		return cpa; 
	}
	/**
	 * Sviluppa il piano di ammortamento
	 * 
	 * @param capitale capitale
	 * @param tasso tasso applicato
	 * @param numeroRate numero di rate
	 * @param tasso241 tasso applicato dalla 241 rata (compresa)
	 * @param is241 indica se usare o meno il tasso dalla 241 rata in poi
	 * @param ultimoProgressivo ultimo numero di progressivo utilizzato (nuovo piano = 0)
	 */
	
	// private void sviluppaPiano(double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {
	private void sviluppaPiano(String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {	
	
		if (numeroRate!=0) {
			// Calcola il valore della rata
			System.out.println("SVILUPPA PIANO");
			// double rata = calcolarata(capitale, tasso, numeroRate);
			double rata = calcolarata(tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate);			
			
			// salva il capitale
			capitaleResiduo = capitale;
			int progressivo = ultimoProgressivo + 1;
			// Totale
			double capitaleSomma = 0;
			// Sviluppa il piano
			for (int x = 1; x < numeroRate; x++) {
				// Abbiamo raggiunto la 241 rata e dobbiamo applicare il nuovo tasso?
				if ((x + ultimoProgressivo) > 240 && is241) {
					// si, varia tasso
					tasso = tasso241;
					// ricalcola rata con nuovi valori
					
					// rata = calcolarata(capitaleResiduo, tasso,
					rata = calcolarata(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso,							
							
							(numeroRate - x + 1));
					// evita di rientrare in questo path di codice
					is241 = false;
				}
				// calcola la variazione sul piano
				
				// piano(capitaleResiduo, tasso, rata);
				piano(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso, rata);						

				// crea la rata
				Rata r = new Rata();
				
				if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {
				
					// Mutui INPS				
					
					// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 1 : Mutuo INPS ***");				
				
				// imposta i valori arrotondando alla 2a cifra decimale
				
				r.setDebitoResiduo(new Double(roundTo(capitaleResiduo, 2)));
				r.setImportoRata(new Double(roundTo(rata, 2)));
				r.setCapitale(new Double(roundTo(quotaCapitale, 2)));
				// Il valore degli interessi � per differenza dall'importo rata con il valore del capitale
				r.setInteressi(new Double(roundTo((rata - r.getCapitale().doubleValue()), 2)));
 			
//				per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
					r.setImp_deb_rsd(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
					r.setImp_capi_rt(new Double(Utility.roundTo(quotaCapitale, 2)));
					// Il valore degli interessi � per differenza dall'importo rata con il valore del capitale
					r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));								
*/ /*						
				r.setImp_deb_rsd(new Double(capitaleResiduo));
				r.setImp_rt(new Double(rata));
				r.setImp_capi_rt(new Double(quotaCapitale));
				r.setImp_its_rt(new Double(quotaInteressi));								
*/				
				} else {
					
					// Mutui IPOST
					
					// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 1 : Mutuo IPOST ***");

					r.setDebitoResiduo(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImportoRata(new Double(Utility.roundTo(rata, 2)));					
					r.setInteressi(new Double(Utility.roundTo(quotaInteressi, 2)));
					r.setCapitale(new Double(Utility.roundTo(r.getImportoRata().doubleValue() - r.getInteressi().doubleValue(), 2)));

					// per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
					r.setImp_deb_rsd(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
					r.setImp_capi_rt(new Double(Utility.roundTo(quotaCapitale, 2)));
					r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));								
*/ /*
					r.setImp_deb_rsd(new Double(capitaleResiduo));
					r.setImp_rt(new Double(rata));
					r.setImp_capi_rt(new Double(quotaCapitale));
					r.setImp_its_rt(new Double(quotaInteressi));								
*/				
				}					
				
				r.setTasso(new Double(tasso));
				//Modifica del 29-09-2006 Aggiungo il progressivo rata
				r.setNumeroRata(new Integer(progressivo++));
				// aggiunge la rata
				ratePiano.add(r);

				// aggiorna totali
				capitaleSomma += r.getCapitale().doubleValue();

				// System.out.println("*** C.P.A. Rata  : " + r.getProg_rt() + " " + r.getAm_rif() + " " + r.getImp_rt() + " " + r.getImp_capi_rt() + " " + r.getImp_its_rt() + " " + r.getImp_deb_rsd()
				//					+ " (" + capitaleSomma + ")");

			}
			// Ultima rata per compensazione capitale
			// per problemi di arrotondamento dei double l'ultima rata potrebbe
			// non azzerare il capitale residuo. Allora il calcolo � fatto a
			// compensazione
			Rata r = new Rata();

			if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {			
			
				// Mutui INPS			
				
				// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 2 : Mutuo INPS ***");
				
			r.setDebitoResiduo(new Double(0));			
			r.setImportoRata(new Double(roundTo(rata, 2)));
			r.setCapitale(new Double(roundTo(capitale - capitaleSomma, 2)));
			r.setInteressi(new Double(roundTo((rata - r.getCapitale().doubleValue()), 2)));

			// per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
			r.setImp_deb_rsd(new Double(0));
			r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
			r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
			r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));						
*/ /*
			r.setImp_deb_rsd(new Double(0));
			r.setImp_rt(new Double(rata));
			r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
			r.setImp_its_rt(new Double(rata - Utility.roundTo(capitale - capitaleSomma, 2)));
*/			
			} else {
				
				// Mutui IPOST
				
				// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 2 : Mutuo IPOST ***");
				
				piano(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso, rata);				
			
				r.setDebitoResiduo(new Double(Utility.roundTo(capitaleResiduo, 2)));
				r.setImportoRata(new Double(Utility.roundTo(rata, 2)));					
				r.setInteressi(new Double(Utility.roundTo(quotaInteressi, 2)));
				r.setCapitale(new Double(Utility.roundTo(r.getImportoRata().doubleValue() - r.getInteressi().doubleValue(), 2)));

				// per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
				r.setImp_deb_rsd(new Double(0));
				r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
				r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
				r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));						
*/ /*			
				r.setImp_deb_rsd(new Double(0));				
				r.setImp_rt(new Double(rata));
				r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
				r.setImp_its_rt(new Double(rata - Utility.roundTo(capitale - capitaleSomma, 2)));				
*/				
			}
			
			r.setTasso(new Double(tasso));
			//Modifica del 29-09-2006 Aggiungo il progressivo rata
			r.setNumeroRata(new Integer(progressivo++));
			// aggiunge l'ultima rata
			ratePiano.add(r);

			// System.out.println("*** C.P.A. Ultima Rata  : " + r.getProg_rt() + " " + r.getAm_rif() + " " + r.getImp_rt() + " " + r.getImp_capi_rt() + " " + r.getImp_its_rt() + " " + r.getImp_deb_rsd()
			//					+ " (" + capitale + ")");
			
		}	else {
			//TODO: errori numerici
			throw new RuntimeException("Errore nei dati: verificare il numero di rate impostate nel database.");
		}	
	}
	
	private void sviluppaPiano2(Connection con, String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {	
		
		if (numeroRate!=0) {
			// Calcola il valore della rata
			System.out.println("SVILUPPA PIANO 2");

			// double rata = calcolarata(capitale, tasso, numeroRate);
//			double rata = calcolarata(con,tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate);
			
			double rata = calcolarata2(con, anno_mutuo, prog_mutuo);
			
			// salva il capitale
			capitaleResiduo = capitale;
			int progressivo = ultimoProgressivo + 1;
			// Totale
			double capitaleSomma = 0;
			// Sviluppa il piano
			for (int x = 1; x < numeroRate; x++) {
				// Abbiamo raggiunto la 241 rata e dobbiamo applicare il nuovo tasso?
				if ((x + ultimoProgressivo) > 240 && is241) {
					// si, varia tasso
					tasso = tasso241;
					// ricalcola rata con nuovi valori
					
					// rata = calcolarata(capitaleResiduo, tasso,
					rata = calcolarata(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso,							
							
							(numeroRate - x + 1));
					// evita di rientrare in questo path di codice
					is241 = false;
				}
				// calcola la variazione sul piano
				
				// piano(capitaleResiduo, tasso, rata);
				piano(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso, rata);						

				// crea la rata
				Rata r = new Rata();
				
				if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {
				
					// Mutui INPS				
					
					// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 1 : Mutuo INPS ***");				
				
				// imposta i valori arrotondando alla 2a cifra decimale
				
				r.setDebitoResiduo(new Double(roundTo(capitaleResiduo, 2)));
				r.setImportoRata(new Double(roundTo(rata, 2)));
				r.setCapitale(new Double(roundTo(quotaCapitale, 2)));
				// Il valore degli interessi � per differenza dall'importo rata con il valore del capitale
				r.setInteressi(new Double(roundTo((rata - r.getCapitale().doubleValue()), 2)));
 			
//				per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
					r.setImp_deb_rsd(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
					r.setImp_capi_rt(new Double(Utility.roundTo(quotaCapitale, 2)));
					// Il valore degli interessi � per differenza dall'importo rata con il valore del capitale
					r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));								
*/ 						
//				r.setImp_deb_rsd(new Double(capitaleResiduo));
//				r.setImp_rt(new Double(rata));
//				r.setImp_capi_rt(new Double(quotaCapitale));
//				r.setImp_its_rt(new Double(quotaInteressi));
				
				} else {
					
					// Mutui IPOST
					
					// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 1 : Mutuo IPOST ***");

					r.setDebitoResiduo(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImportoRata(new Double(Utility.roundTo(rata, 2)));					
					r.setInteressi(new Double(Utility.roundTo(quotaInteressi, 2)));
					r.setCapitale(new Double(Utility.roundTo(r.getImportoRata().doubleValue() - r.getInteressi().doubleValue(), 2)));

					// per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
					r.setImp_deb_rsd(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
					r.setImp_capi_rt(new Double(Utility.roundTo(quotaCapitale, 2)));
					r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));								
*/ 
//					r.setImp_deb_rsd(new Double(capitaleResiduo));
//					r.setImp_rt(new Double(rata));
//					r.setImp_capi_rt(new Double(quotaCapitale));
//					r.setImp_its_rt(new Double(quotaInteressi));
				
				}					
				
				r.setTasso(new Double(tasso));
				//Modifica del 29-09-2006 Aggiungo il progressivo rata
				r.setNumeroRata(new Integer(progressivo++));
				// aggiunge la rata
				ratePiano.add(r);

				// aggiorna totali
				capitaleSomma += r.getCapitale().doubleValue();

				// System.out.println("*** C.P.A. Rata  : " + r.getProg_rt() + " " + r.getAm_rif() + " " + r.getImp_rt() + " " + r.getImp_capi_rt() + " " + r.getImp_its_rt() + " " + r.getImp_deb_rsd()
				//					+ " (" + capitaleSomma + ")");

			}
			// Ultima rata per compensazione capitale
			// per problemi di arrotondamento dei double l'ultima rata potrebbe
			// non azzerare il capitale residuo. Allora il calcolo � fatto a
			// compensazione
			Rata r = new Rata();

			if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {			
			
				// Mutui INPS			
				
				// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 2 : Mutuo INPS ***");
				
			r.setDebitoResiduo(new Double(0));			
			r.setImportoRata(new Double(roundTo(rata, 2)));
			r.setCapitale(new Double(roundTo(capitale - capitaleSomma, 2)));
			r.setInteressi(new Double(roundTo((rata - r.getCapitale().doubleValue()), 2)));

			// per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
			r.setImp_deb_rsd(new Double(0));
			r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
			r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
			r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));						
*/ /*
			r.setImp_deb_rsd(new Double(0));
			r.setImp_rt(new Double(rata));
			r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
			r.setImp_its_rt(new Double(rata - Utility.roundTo(capitale - capitaleSomma, 2)));
*/			
			} else {
				
				// Mutui IPOST
				
				// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 2 : Mutuo IPOST ***");
				
				piano(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso, rata);				
			
				r.setDebitoResiduo(new Double(Utility.roundTo(capitaleResiduo, 2)));
				r.setImportoRata(new Double(Utility.roundTo(rata, 2)));					
				r.setInteressi(new Double(Utility.roundTo(quotaInteressi, 2)));
				r.setCapitale(new Double(Utility.roundTo(r.getImportoRata().doubleValue() - r.getInteressi().doubleValue(), 2)));

				// per miglioramento arrotondamento sostituire con ...
/* PER PROVA !!!					
				r.setImp_deb_rsd(new Double(0));
				r.setImp_rt(new Double(Utility.roundTo(rata, 2)));
				r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
				r.setImp_its_rt(new Double(Utility.roundTo((r.getImp_rt().doubleValue() - r.getImp_capi_rt().doubleValue()), 2)));						
*/ /*			
				r.setImp_deb_rsd(new Double(0));				
				r.setImp_rt(new Double(rata));
				r.setImp_capi_rt(new Double(Utility.roundTo(capitale - capitaleSomma, 2)));
				r.setImp_its_rt(new Double(rata - Utility.roundTo(capitale - capitaleSomma, 2)));				
*/				
			}
			
			r.setTasso(new Double(tasso));
			//Modifica del 29-09-2006 Aggiungo il progressivo rata
			r.setNumeroRata(new Integer(progressivo++));
			// aggiunge l'ultima rata
			ratePiano.add(r);

			// System.out.println("*** C.P.A. Ultima Rata  : " + r.getProg_rt() + " " + r.getAm_rif() + " " + r.getImp_rt() + " " + r.getImp_capi_rt() + " " + r.getImp_its_rt() + " " + r.getImp_deb_rsd()
			//					+ " (" + capitale + ")");
			
		}	else {
			//TODO: errori numerici
			throw new RuntimeException("Errore nei dati: verificare il numero di rate impostate nel database.");
		}	
	}
	
	/**
	 * Aggiorna i parametri del piano di ammortamento.
	 * 
	 * @param capitaleRes capitale residuo
	 * @param tasso tasso 
	 * @param rata importo fisso della rata
	 */
	private void sviluppaPianoEXCEL(String tp_ente, String anno_mutuo, String prog_mutuo, double capitale, double tasso, int numeroRate, double tasso241, boolean is241, int ultimoProgressivo) {	
		
		if (numeroRate!=0) {
			// Calcola il valore della rata
			System.out.println("SVILUPPA PIANO EXCEL");
			// double rata = calcolarata(capitale, tasso, numeroRate);
			double rata = calcolarata(tp_ente, anno_mutuo, prog_mutuo, capitale, tasso, numeroRate);			
			
			// salva il capitale
			capitaleResiduo = capitale;
			int progressivo = ultimoProgressivo + 1;
			// Totale
			double capitaleSomma = 0;
			// Sviluppa il piano
			for (int x = 1; x < numeroRate; x++) {
				// Abbiamo raggiunto la 241 rata e dobbiamo applicare il nuovo tasso?
				if ((x + ultimoProgressivo) > 240 && is241) {
					// si, varia tasso
					tasso = tasso241;
					// ricalcola rata con nuovi valori
					
					// rata = calcolarata(capitaleResiduo, tasso,
					rata = calcolarata(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso,	(numeroRate - x + 1));
					// evita di rientrare in questo path di codice
					is241 = false;
				}
				// calcola la variazione sul piano
				
				// piano(capitaleResiduo, tasso, rata);
				piano(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso, rata);						

				// crea la rata
				Rata r = new Rata();
				
				if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {
				
					// Mutui INPS				
					
					// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 1 : Mutuo INPS ***");				
				
				// imposta i valori arrotondando alla 2a cifra decimale
				
				r.setDebitoResiduo(new Double(roundTo(capitaleResiduo, 2)));
				r.setImportoRata(new Double(roundTo(rata, 2)));
				r.setCapitale(new Double(roundTo(quotaCapitale, 2)));
				// Il valore degli interessi � per differenza dall'importo rata con il valore del capitale
				r.setInteressi(new Double(roundTo((rata - r.getCapitale().doubleValue()), 2)));										
				} else {
					
					// Mutui IPOST
					
					// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 1 : Mutuo IPOST ***");

					r.setDebitoResiduo(new Double(Utility.roundTo(capitaleResiduo, 2)));
					r.setImportoRata(new Double(Utility.roundTo(rata, 2)));					
					r.setInteressi(new Double(Utility.roundTo(quotaInteressi, 2)));
					r.setCapitale(new Double(Utility.roundTo(r.getImportoRata().doubleValue() - r.getInteressi().doubleValue(), 2)));

				}					
				
				r.setTasso(new Double(tasso));
				//Modifica del 29-09-2006 Aggiungo il progressivo rata
				r.setNumeroRata(new Integer(progressivo++));
				// aggiunge la rata
				ratePiano.add(r);

				// aggiorna totali
				capitaleSomma += r.getCapitale().doubleValue();
				
				//EXPRIVIA MOD
//				totaleInteressi += r.getImp_its_rt().doubleValue();
//				System.out.println("+++ RATA "+r.getProg_rt()+" INTERESSE: " +r.getImp_its_rt()+ " SOMMA: "+totaleInteressi);

				// System.out.println("*** C.P.A. Rata  : " + r.getProg_rt() + " " + r.getAm_rif() + " " + r.getImp_rt() + " " + r.getImp_capi_rt() + " " + r.getImp_its_rt() + " " + r.getImp_deb_rsd()
				//					+ " (" + capitaleSomma + ")");

			}

			Rata r = new Rata();

			if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {			
			
				// Mutui INPS			
				
				// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 2 : Mutuo INPS ***");
				
			r.setDebitoResiduo(new Double(0));			
			r.setImportoRata(new Double(roundTo(rata, 2)));
			r.setCapitale(new Double(roundTo(capitale - capitaleSomma, 2)));
			r.setInteressi(new Double(roundTo((rata - r.getCapitale().doubleValue()), 2)));


			} else {
				
				// Mutui IPOST
				
				// System.out.println("*** CalcolaPianoAmmortamento.SviluppaPiano 2 : Mutuo IPOST ***");
				
				piano(tp_ente, anno_mutuo, prog_mutuo, capitaleResiduo, tasso, rata);				
			
				r.setDebitoResiduo(new Double(Utility.roundTo(capitaleResiduo, 2)));
				r.setImportoRata(new Double(Utility.roundTo(rata, 2)));					
				r.setInteressi(new Double(Utility.roundTo(quotaInteressi, 2)));
				r.setCapitale(new Double(Utility.roundTo(r.getImportoRata().doubleValue() - r.getInteressi().doubleValue(), 2)));
		
			}
			
			r.setTasso(new Double(tasso));
			//Modifica del 29-09-2006 Aggiungo il progressivo rata
			r.setNumeroRata(new Integer(progressivo++));
			// aggiunge l'ultima rata
			ratePiano.add(r);

		}	else {
			//TODO: errori numerici
			throw new RuntimeException("Errore nei dati: verificare il numero di rate impostate nel database.");
		}	
	}
	// private void piano(double capitaleRes, double tasso, double rata) {
	private void piano(String tp_ente, String anno_mutuo, String prog_mutuo, double capitaleRes, double tasso, double rata) {		
		
		if (tp_ente == null || tp_ente.equalsIgnoreCase("") || tp_ente.equalsIgnoreCase("00")) {		
		
			// Mutui INPS		
			
			// System.out.println("*** CalcolaPianoAmmortamento.Piano : Mutuo INPS ***");
			
		// calcola valori fissi
		tasso = 1 + (tasso / 100);
		double valINPS = (1.0 / 12);
		double i = Math.pow(tasso, valINPS) - 1;

		// calcola capitale, interesse e nuovo residuo

		quotaInteressi = (capitaleRes * i); // metodo applicato da INPS
		quotaCapitale = (rata - quotaInteressi);
		capitaleResiduo = (capitaleRes - quotaCapitale);		

		// per miglioramento arrotondamento sostituire con ...
/*			
		quotaInteressi = Utility.roundTo((capitaleRes * i),2); // metodo applicato da Inps
		quotaCapitale = Utility.roundTo((rata - quotaInteressi),2);
		capitaleResiduo = Utility.roundTo((capitaleRes - quotaCapitale),2);
*/		
		} else {
			
			// Mutui IPOST
			
			// System.out.println("*** CalcolaPianoAmmortamento.Piano : Mutuo IPOST ***");

			quotaInteressi = capitaleRes * (tasso / 100) / 12; // metodo applicato da IPOST
			quotaCapitale = rata - quotaInteressi;
			capitaleResiduo = capitaleRes - quotaCapitale;		
				
			// per miglioramento arrotondamento sostituire con ...
/*
			quotaInteressi = Utility.roundTo(capitaleRes * (tasso / 100) / 12,2); // metodo applicato da IPOST
			quotaCapitale = Utility.roundTo((rata - quotaInteressi),2);
			capitaleResiduo = Utility.roundTo(capitaleRes - quotaCapitale,2);
*/			
		}
		
	}

	/**
	 * Arrotonda un valore double al numero di decimali specificati. L'arrotondamento �
	 * fatto con regola HALF_UP (>=0.5 si va al decimale successivo, <0.5 al decmiale precedente)
	 * 
	 * @param value valore
	 * @param decimalDigits numero di decimali
	 * @return double arrotondato
	 */

	// per miglioramento arrotondamento commentare ...
 	
	private double roundTo(double value, int decimalDigits) {
		// Crea un bigdecimal con arrotondamento half_up e scala al numero di decimali
		BigDecimal bd = new BigDecimal(value).setScale(decimalDigits, BigDecimal.ROUND_HALF_UP);
		// ritorna nuovo valore
		return bd.doubleValue();
	}

	/**
	 * Recuper il piano di ammortamento generato.
	 * 
	 * @return il piano di ammortamento. (mai null)
	 */
	
	public ArrayList<Rata> getPiano() {
		// tanto per andare tranquilli, verifica che non sia null, altrimenti collection vuota
		return (this.ratePiano!=null) ? this.ratePiano : new ArrayList<Rata>();
	}
	
	public double getInteressi() {
		// tanto per andare tranquilli, verifica che non sia null, altrimenti collection vuota
		return (this.totaleInteressi!=0.0) ? this.totaleInteressi : 0.0;
	}
}
