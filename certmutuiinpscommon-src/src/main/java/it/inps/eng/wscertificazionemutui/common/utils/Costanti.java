package it.inps.eng.wscertificazionemutui.common.utils;

public interface Costanti {

	/**
	 * Transcodifica tipologia di entità soggette a lock
	 * 
	 * @author Andrea M. Orfeo
	 * 
	 */
	public static final String CHARSET 	= "UTF-8" ; 
	public static final String DOCBOOK_ENDPOINT = "ws.docbook.endpoint";
	public static final String HOL_XSL = "hol.xsl.endpoint";
	public static final String HOL_XSL_PATH = "hol-xsl";
	public static final String HOL_XSL_GUIDAPDF = "guidapdf.xsl";
	public static final String HOL_XSL_GUIDAPDF_FAQ = "guidapdf_faq.xsl";
	public static final String HOL_INAIL_PNG_GUIDAPDF = "inail.png";
	
	
	public interface HolImportExcel {
		public static final String FILE_SYSTEM_ROOT = "filesystem.root.prop";
		
		public static final String SHEET = "ElencoInformative_DEV";
		
		public static final String Id_Informativa = "colonna.idinformativa";
		public static final String Titolo = "colonna.titolo";
		public static final String Uso = "colonna.uso";
		public static final String Modello = "colonna.modello";
		public static final String Composizione_GA = "colonna.composizione_GA";
		public static final String Composizione_HC = "colonna.composizione_HC";
		public static final String Introduzione = "colonna.introduzione";
		public static final String Corpo = "colonna.corpo";
		public static final String Conclusione = "colonna.conclusione";
		public static final String Glossario = "colonna.glossario";
		public static final String Gruppo = "colonna.gruppo";
		public static final String Lingua = "colonna.lingua";
		public static final String Applicazione = "colonna.applicazione";
		public static final String Versione = "colonna.versione";
		public static final String Macrofunzione = "colonna.macrofunzione";
		public static final String Funzione = "colonna.funzione";
		public static final String Sottofunzione1 = "colonna.sottofunzione1";
		public static final String Sottofunzione2 = "colonna.sottofunzione2";
		public static final String Pagina = "colonna.pagina";
		public static final String Oggetto = "colonna.oggetto";
		public static final String Immagini_pre = "colonna.immagini_pre";
		public static final String Immagini_post = "colonna.immagini_post";
		public static final String Collocazione_HC = "colonna.collocazione_HC";
		public static final String Desc_Macrofunzione = "colonna.desc.macrofunzione";
		public static final String Desc_Funzione = "colonna.desc.funzione";
		public static final String Desc_Sottofunzione1 = "colonna.desc.sottofunzione1";
		public static final String Desc_Sottofunzione2 = "colonna.desc.sottofunzione2";
		public static final String Desc_Pagina = "colonna.desc.pagina";
		public static final String Desc_Oggetto = "colonna.desc.oggetto"; 
		
		public static final String TEMPLATE_SEMPLICE = "Semplice";
		public static final String TEMPLATE_COMPLESSO = "Complesso";
		
		public static final String UTENTE_IMPORT = "IMPORT_EXCEL";

		public static final String CARTELLA_IMMAGINI = "/Immagini";
		
		public static final String TIP_AGGR_INCLUSA = "I";
		public static final String TIP_AGGR_LINK = "C";
		
	}
	
	public interface HolTipoNotifica {
		public static final long LOCK_VERSIONE = 1l;
		public static final long END_PRODUZIONE_PDF = 2l;
		public static final long END_COPIA_GUIDA= 3l;
		public static final long END_IMPORT_XLS = 4l;
		public static final long END_PRODUZIONE_PDF_CATALOGOFAQ = 5l;
		public static final long END_COPIA_FAQ = 6l;
		public static final long START_IMPORT_XLS = 7l;
	}
	
	public interface HOLTipoLock {
		public final static int LOCK_SU_INDICE = 1;
		public final static int LOCK_SU_FAQ = 2;
		public final static int LOCK_SU_INFORMATIVA = 3;
		public final static int LOCK_SU_GRUPPO = 4;
		public final static int LOCK_SU_GLOSSARIO = 5;
		public final static int LOCK_SU_CATALOGO_FAQ = 6;
	}
	
	public interface GestioneAnteprima {
		public final static String DOCBOOK_XSL_PATH_DA_SOSTITUIRE = "../docbook-xsl/html/docbook.xsl";
		public final static String DOCBOOK_XSL_ENDPOINT = "docbook.xsl.endpoint";
		public final static String GUIDAPDF_XSL_PATH_DA_SOSTITUIRE = "../hol-xsl/guidapdf.xsl";
		public final static String GUIDAPDF_XSL_ENDPOINT = "guidapdf.xsl.endpoint";
		public final static String FAQ_XSL_PATH_DA_SOSTITUIRE = "src/main/resources/hol-xsl/faq.xsl";
		public final static String FAQ_XSL_ENDPOINT = "docbook.faq.xsl.endpoint";
	}
	
	public interface FileSystemUtils {
		public final static String STRINGA_DA_SOSTITUIRE = "../docbook-xsl/fo/docbook.xsl";
		public final static String DOCBOOK_FO_ENDPOINT = "docbook.fo.endpoint";
	}
	
	public interface HOLTipoOggetto {
		public final static int INDICE = 1;
		public final static int FAQ = 2;
		public final static int INFORMATIVA = 3;
		public final static int GRUPPO = 4;
		public final static int GLOSSARIO = 5;
	}

	public interface Configuration {
		public static final String WS_CLASSIFICATORE_ENDPOINT= "ws.classificatore.endpoint" ;
		public static final String WS_CLASSIFICATORE_USERNAME= "ws.classificatore.username" ;
		public static final String WS_CLASSIFICATORE_PASSWORD= "ws.classificatore.password" ;
		public static final String WS_CLASSIFICATORE_GETNODI_DEFAULT_LEVEL = "ws.classificatore.dettaglioNodi.defaultLevel" ;
		public static final String WS_CLASSIFICATORE_GETNODI_NUMMAX = "ws.classificatore.dettaglioNodi.numMax" ;
		
		//WCC
		public static final String WCC_ePoint = "ws.wcc.endpoint";
		public static final String WCC_user = "ws.wcc.username";
		public static final String WCC_password = "ws.wcc.password";
		public static final String WCC_EXTENSIONS = "ws.wcc.extensions_allowed";
		public static final String WCC_IMG_EXTENSIONS = "ws.wcc.img.extensions_allowed";
		public static final String WCC_MAX_SIZE_CONTENT = "ws.wcc.maxsizefile";
		public static final String WCC_MAX_SIZE_PDF = "ws.wcc.pdf.maxsizefile";
		public static final String WCC_DDOCTYPE = "ws.wcc.doctype";
		public static final String WCC_DSECURITYGROUP = "ws.wcc.dsecuritygroup";
		public static final String WCC_DDOCACCOUNT = "ws.wcc.ddoaccount";
		
		public static final String HOL_NUM_ULTIME_FAQ_INSERITE_DA_MOSTRARE = "ultimefaqinseritedamostrare";
		
	}
	
	public interface ProfilazioneGruppi {
		public static final String GRUPPO_AMMINISTRATORE = "HolAmm";
		public static final String GRUPPO_PUBBLICATORE_GLOSSARIO = "HolPubGlos";
		public static final String GRUPPO_PUBBLICATORE = "HolPub";
		public static final String GRUPPO_APPROVATORE = "HolApp";
		public static final String GRUPPO_REDATTORE = "HolRed";
		public static final String COMPETENZA = "HOL";
		public static final String APPGUID = "HOL-HelpOnLine.{7c0d36e6-889f-49e5-a51f-557c5ed3e87b}"; 
		public static final String CODICE_GRUPPO_APPLICAZIONE = "codiceGruppoApplicazione";
		public static final String GRUPPI_APPLICAZIONE = "GetGruppiApplicazione";
	}
	
	public interface ServiziInail {
		public static final String WS_PROFILATORE_PROFILOUTENTE_ENDPOINT= "ws.profilatore.profiloutente.endpoint" ;
		public static final String WS_PROFILATORE_PROFILOUTENTE_USERNAME= "ws.profilatore.profiloutente.username" ;
		public static final String WS_PROFILATORE_MIOPROFILO_ENDPOINT= "ws.profilatore.mioprofilo.endpoint" ;
		public static final String WS_PROFILATORE_MIOPROFILO_USERNAME= "ws.profilatore.mioprofilo.username" ;
		public static final String WS_INFO_PROFILAZIONE_ENDPOINT= "ws.infoProfilazione.endpoint" ;
		public static final String WS_PROFILAZIONE_INFO_PROFILAZIONE_ENDPOINT = "ws.profilazioneInfoProfilazione.endpoint";
	}
	
	
	public interface CatalogoErrori {
		public static final int NESSUN_ERRORE_CODE = 0;
		public static final int VALIDAZIONE_DATI_INPUT_CODE = 1;
		public static final int REQ_NON_COMPLETA_NESSUN_NODO_INVIATO_CODE = 2 ;
		public static final int REQ_INCONGRUENTE_NODI_IN_STATO_ELABORATO_O_IGNORATO_CODE = 3;
		public static final int LOCK_SU_INFORMATIVA_CODE = 4;
		public static final int INFORMATIVA_NON_IN_STATO_IN_REDAZIONE_CODE = 5;
		public static final int LOCK_SU_GRUPPO_CODE = 6;
		public static final int IMPOSSIBILE_CANCELLARE_GRUPPO_CODE = 7;
		public static final int IMPOSSIBILE_SALVARE_INFORMATIVA_CODE = 8;
		public static final int REQ_INCONGRUENTE_NODO_NO_TIPO_OGGETTO_CODE = 9;
		public static final int LOCK_GIA_ATTIVO_SU_INDICE_CODE = 10;
//		11	L’informativa è utilizzata da altre informative (aggregazione contenuti)
		public static final int INFORMATIVA_USATA_DA_ALTRE_INFORMATIVE_CODE = 11;
//		12	Sul gruppo di fruitori non è attivo alcun lock di sessione
		public static final int GRUPPO_FRUITORI_NON_CODE = 12;
		public static final int GRUPPO_CON_STESSO_NOME_NELLA_STESSA_APPLICAZIONE_VERSIONE_CODE = 13;
		public static final int REQ_INCONGRUENTE_GRUPPO_NON_PUO_INCLUDERE_GRUPPI_PERCHE_GIA_INCLUSO_CODE = 14; 
		public static final int REQ_INCONGRUENTE_GRUPPI_INCLUSI_INCLUDONO_ALTRI_GRUPPI_CODE = 15;
		public static final int REQ_INCONGRUENTE_PROFILI_GIA_USATI_DA_ALTRI_GRUPPI_CODE = 16; 
		public static final int GRUPPI_INCLUSI_NON_MODIFICABILI_CODE = 17; 
		public static final int LOCK_SU_GRUPPO_IMPOSSIBILE_CODE = 18;
		public static final int NESSUN_PROFILO_DISPONIBILE_PER_IL_GRUPPO_CODE = 19;
		public static final int UTENTE_NON_ESISTE_IN_ANAGRAFICA = 20;
		public static final int NUM_RISULTATI_ECCEDE_LUNGHEZZA_MASSIMA = 21;
		public static final int NESSUNA_APPLICAZIONE_DISPONIBILE_PER_UTENTE = 22;
		public static final int NESSUNA_LINGUA_DISPONIBILE = 23;
		public static final int NESSUNA_VERSIONE_DISPONIBILE_PER_APPLICAZIONE_SELEZIONATA = 24;
		public static final int NESSUN_RUOLO_DISPONIBILE_PER_APPLICAZIONE_SELEZIONATA = 25;
		public static final int NESSUN_GRUPPO_DISPONIBILE_PER_APP_VERSIONE_SELEZIONATA = 26;
		public static final int LOCK_SU_FAQ_CODE = 27;
		public static final int LOCK_SU_CAMPO_LOGICO_CODE= 28;
		public static final int LOCK_SU_INDICE_CODE = 29;
		public static final int INFORMATIVA_NOT_FOUND_CODE = 30;
		public static final int INFORMATIVA_DUPLICATA_CODE = 31;
		public static final int INFORMATIVA_STESSO_TITOLO_CODE = 32;
		public static final int INFORMATIVA_AGGRAGATA_CODE = 33;
		public static final int INFORMATIVA_IN_GUIDA_CODE = 34;
		public static final int TEMPLATE_NON_TROVATO_CODE = 35;
		public static final int INFORMATIVA_NO_LOCK_SESSIONE_CODE = 36;
		public static final int TIPO_FILE_NON_GESTITO_CODE = 37;
		public static final int DIMENSIONI_FILE_NON_CONSENTITA_CODE = 38;
		public static final int CONTENUTO_NON_ADERENTE_A_TEMPLATE_CODE = 39;
		public static final int IMMAGINE_NON_TROVATA_CODE = 40;
		public static final int GRUPPO_NON_TROVATO_CODE = 41;
		public static final int FAQ_NON_TROVATA_CODE = 42;
		public static final int VOCE_GLOSSARIO_NON_TROVATA_CODE = 43;
		public static final int INDICE_NON_TROVATO_CODE = 44;
		public static final int STATI_INCOERENTI = 45;
		public static final int UTENTE_NON_ABILITATO_A_CAMBIARE_STATO = 46;
		public static final int INFORMATIVE_AGGREGATE_MANCANTI = 47;
		public static final int INFORMATIVE_AGGREGATE_CON_DATA_INCOERENTE = 48;
		public static final int ENTITA_COLLEGATE_AD_OGGETTO_DA_ARCHIVIARE = 49;
		public static final int AGGREGAZIONE_NON_SALVABILE_CAUSA_INFORMATIVE_IN_ARCHIVIO = 50;
		public static final int AGGREGAZIONE_NON_SALVABILE_CAUSA_INFORMATIVE_NON_UTILIZZABILI = 51;
		public static final int INFORMATIVE_AGGREGANTI_MANCANTI = 52;
		public static final int INDICE_NON_IN_REDAZIONE = 53;
		public static final int NODO_NON_TROVATO = 54;
		public static final int INDICE_GIA_IN_REDAZIONE = 55;
		public static final int INDICE_NON_GENERATO_INFORMATIVA_NON_TROVATA = 56;
		public static final int NO_LOCK_SESSIONE_SU_INDICE = 57;
		public static final int IL_NODO_DI_CUI_SI_CHIEDE_L_ELIMINAZIONE_NON_E_ASSOCIATO_ALL_INDICE = 58;
		public static final int IL_NODO_DI_CUI_SI_CHIEDE_L_INSERIMENTO_E_GIA_ASSOCIATO_ALL_INDICE = 59;
		public static final int ALL_INDICE_NON_E_ASSOCIATO_IL_NODO_PADRE_DEL_NODO_CUI_SI_RICHIEDE_L_INSERIMENTO_AGGIORNAMENTO = 60;
		public static final int NODO_NON_ASSOCIATO_A_INDICE = 61;
		public static final int INDICE_CON_STESSI_ATTRIBUTI_ESISTENTE = 62;
		public static final int INFORMATIVE_REFERENZIATE_DA_INDICE_MANCANTI = 63;
		public static final int INFORMATIVE_REFERENZIATE_CON_DATA_INIZIO_INCOERENTE = 64;
		public static final int IMPOSSIBILE_PROCEDERE_CON_PASSAGGIO_DI_STATO_INFORMAZIONI_CANCELLATE_E_AGGIUNTE = 65;
		public static final int IMPOSSIBILE_PROCEDERE_CON_PASSAGGIO_DI_STATO_INFORMAZIONI_AGGIUNTE = 66;
		public static final int IMPOSSIBILE_PROCEDERE_CON_PASSAGGIO_DI_STATO_INFORMAZIONI_CANCELLATE = 67;
		public static final int IMPOSSIBILE_GENERARE_GRUPPI_PER_VERSIONE_TARGET = 68;
		public static final int ESISTONO_INFORMATIVE_ASSOCIATE = 69;
		public static final int IMPOSSIBILE_INVIARE_RICHIESTA_COPIA = 70;
		public static final int VERSIONE_LOCK_COPIA_IN_CORSO_CODE = 71;
		public static final int COPIA_GRUPPI_TERMINATA_CON_ERRORE = 72;
		public static final int DOWNLOAD_GUIDA_DENIED = 73;
		public static final int GUIDA_NOT_FOUND = 74;
		public static final int FILE_NOT_AVAILABLE = 75;
		public static final int IMPOSSIBILE_RIMUOVERE_IL_NODO_ROOT_DALL_INDICE = 76;
		public static final int ERRORE_RICHIESTA_GENERAZIONE_PDF_INDICE = 77;
		public static final int COPIA_FAQ_E_INFORMATIVE = 78;
		public static final int COPIA_FAQ = 79;
		public static final int COPIA_INFORMATIVE = 80;
		public static final int COPIA_NON_PERMESSA = 81;
		public static final int APPLICAZIONE_NON_CENSITA = 82;
		public static final int VERSIONE_NON_CENSITA = 83;
		public static final int NODI_FOGLIA_CON_INFORMATIVE = 84;
		public static final int INDICE_PUO_INCLUDERE_SOLO_NODI_CON_INFORMATIVE_O_UTILI_A_RAGGIUNGERLI = 85;
		public static final int LINGUA_NON_TROVATA = 86;
		public static final int CATALOGOFAQ_PRESENTE = 87;
		public static final int LOCK_SU_CATALOGO_FAQ_CODE = 88;
		public static final int CATALOGOFAQ_NOT_FOUND_CODE = 89;
		public static final int IMPOSSIBILE_RIMUOVERE_NODO_ROOT = 90;
		public static final int NODO_NON_ASSOCIATO_A_CATALOGO = 91;
		public static final int POSSIBILE_RIMUOVERE_SOLO_NODI_FOGLIA = 92;
		public static final int IMPOSSIBILE_INSERIRE_NODO_ROOT = 93;
		public static final int ROOT_PERMETTE_SOLO_ARGOMENTI = 94;
		public static final int ARGOMENTO_PERMETTE_SOLO_TEMI = 95;
		public static final int TEMA_NON_PUO_AVERE_NODI_FIGLI = 96;
		public static final int NO_LOCK_PER_FAQ = 97;
		public static final int DOWNLOAD_INDICE_GUIDA_DENIED = 98 ;
		public static final int DOWNLOAD_RACCOLTA_FAQ_DENIED = 99 ;
		public static final int RACCOLTA_FAQ_NOT_FOUND = 100 ;
		public static final int IMPOSTA_FLG_IGNORATI_ALMOST_ONE_NODE = REQ_NON_COMPLETA_NESSUN_NODO_INVIATO_CODE;
		public static final int ARGOMENTO_NOT_FOUND_CODE = 101;
		public static final int IMPOSTA_FLG_IGNORATI_NO_ID_NODE = 111;
		public static final int IMPOSTA_FLG_IGNORATI_NO_DESC_NODE = 112;
		public static final int IMPOSTA_FLG_IGNORATI_TYPE_NODE_INVALID = 113;
		public static final int CONTENUTO_NON_TROVATO_CODE = 114;
		public static final int INFORMATIVA_RECUPERATA_SENZA_TEMPLATE = 115;
		public static final int RICHIESTA_INCONGRUENTE_ERRORE_VISIBILITA = 116;
		public static final int INFORMATIVE_NON_IN_STATO_PUBBLICATO = 117;
		public static final int VISIBILITA_INCOERENTE_CON_INFORMATIVA_PARTENZA = 118;
		public static final int INFORMATIVA_SENZA_CONTENUTO = 119;
		public static final int FAQ_NON_IN_STATO_IN_REDAZIONE_CODE = 120;
		public static final int FAQ_NO_LOCK_SESSIONE_CODE = 121;
		public static final int FAQ_STATO_INCONSISTENTE_CODE = 122;
		public static final int FAQ_KO_PASSAGGIO_STATO_AGGIUNTEECANCELLATE_CODE = 123;
		public static final int FAQ_KO_PASSAGGIO_STATO_AGGIUNTE_CODE = 124;
		public static final int FAQ_KO_PASSAGGIO_STATO_CANCELLATE_CODE = 125;
		public static final int FAQ_TITOLO_DUPLICATO_CODE = 126;
		public static final int FAQ_UTILIZZATA_GUIDA_CODE = 127;
		public static final int FAQ_NON_CLONABILE_CODE = 129;
		public static final int PDF_INDICE_STATO_ERRORE = 131;
		public static final int NOTIFICA_NON_TROVATA = 132;
		public static final int FILE_EXCEL_NON_TROVATO = 133;
		public static final int PIU_FILE_EXCEL = 134;
		
	}

	public interface ContentServiceEJBBean {
		public static final String VAL_FILE_OBBLIGATORIO = "VAL_FILE_OBBLIGATORIO";
		public static final String CONTENUTO_NON_TROVATO = "CONTENUTO_NON_TROVATO";
		public static final String DOCUMENTO_NON_TROVATO = "Documento non trovato";
		public static final String REPOSITORY_DOCUMENTALE = "Repository Documentale";
		public static final String VAL_NOME_FILE_OBBLIGATORIO = "VAL_NOME_FILE_OBBLIGATORIO";
		public static final String VAL_TIPO_FILE_NON_RICONOSCIUTO = "VAL_TIPO_FILE_NON_RICONOSCIUTO";
		public static final String VAL_DIMENSIONE_FILE = "VAL_DIMENSIONE_FILE";
		public static final String VAL_ID_OBBLIGATORIO = "VAL_ID_OBBLIGATORIO";
		public static final String CHECKOUT_NON_RIUSCITO = "CHECKOUT_NON_RIUSCITO";
		public static final String AGGIORNAMENTO_NON_RIUSCITO = "AGGIORNAMENTO_NON_RIUSCITO";
		public static final String AGGIORNAMENTO_NON_RIUSCITO_MSG = "Aggiornamento non riuscito";
		public static final String PARAMETRO_NOMEFILE_NON_VALORIZZATO_MSG = "Parametro nomeFile non valorizzato";
		public static final String VALIDAZIONE_MSG = "Validazione";
		public static final String NOT_AVAILABLE = "N/A";
		public static final String TIPO_FILE_NON_RICONOSCIUTO_MSG = "Tipo file non riconosciuto";
		public static final String PARAMETRO_ID_NON_VALORIZZATO_MSG = "Parametro ID non valorizzato";
		public static final String PARAMETRO_CONTENUTO_NON_VALORIZZATO_MSG = "Parametro contenuto non valorizzato";
		public static final String FILE_TROPPO_GRANDE_MSG = "Il file che si intende inserire è troppo grande";
		public static final String ERRORE_GENERICO_CODE = "-1000";
		
		public static final String DDOCTYPE = "Document";
		public static final String DSECURITYGROUP = "PersonalSpaces";
		public static final String DDOCACCOUNT = "weblogic";
		public static final String WCC_user = "weblogic";
		public static final String WCC_password = "welcome1";
		public static final String WCC_ePoint = "http://webcenter.oracle.local:16200/_dav/cs/idcplg";
//		public static final String WCC_EXTENSIONS = "txt,doc,docx,xml";
		public static final String WCC_MAX_SIZE_CONTENT = "10000";
	}
	
	public interface HOLTipoNodo {
		public static final Long NODO_VERSIONE = 1L;
		public static final Long NODO_MACROFUNZIONE = 2L;
		public static final Long NODO_FUNZIONE = 3L;
		public static final Long NODO_DETTAGLIO1 = 4L;
		public static final Long NODO_DETTAGLIO2 = 5L;
		public static final Long NODO_PAGINA = 6L;
		public static final Long NODO_OGGETTO = 7L;
		public static final Long ROOT_FAQ = 8L;
		public static final Long ARGOMENTO = 9L;
		public static final Long TEMA = 10L;
	}
	
	public interface HolAnaTemplate {
		public static final Long COMPLESSO = 1L;
		public static final String COMPLESSO_NAME_XSL = "complesso.xsl";
		public static final String COMPLESSO_DEXC = "Template complesso";
		public static final String COMPLESSO_IMG_PATH = "templateRedazionali/TemplateComplesso.png";
		public static final String COMPLESSO_XSD_PATH = "templateRedazionali/TemplateComplesso.xsd";
		public static final Long SEMPLICE_SOTTOCAMPO = 2L;
		public static final String SEMPLICE_SOTTOCAMPO_NAME_XSL = "sottocampo.xsl";
		public static final String SEMPLICE_SOTTOCAMPO_DEXC = "Template semplice (sottocampo)";
		public static final String SEMPLICE_SOTTOCAMPO_IMG_PATH = "templateRedazionali/TemplateSottocampo.png";
		public static final String SEMPLICE_SOTTOCAMPO_XSD_PATH = "templateRedazionali/TemplateSottocampo.xsd";
		public static final Long SEMPLICE_POPUP = 3L;
		public static final String SEMPLICE_POPUP_NAME_XSL = "popup.xsl";
		public static final String SEMPLICE_POPUP_DEXC = "Template semplice (popup)";
		public static final String SEMPLICE_POPUP_XSD_PATH = "templateRedazionali/TemplatePopup.xsd";
		public static final String SEMPLICE_POPUP_IMG_PATH = "templateRedazionali/TemplatePopup.png";
		public static final Long COMPLESSO_SEZIONE = 4L;
		public static final String COMPLESSO_SEZIONE_NAME_XSL = "complessoSezione.xsl";
		public static final String COMPLESSO_SEZIONE_DEXC = "Template complesso (sezione)";
		public static final String COMPLESSO_SEZIONE_IMG_PATH = "templateRedazionali/TemplateComplessoSezione.png";
		public static final String COMPLESSO_SEZIONE_XSD_PATH = "templateRedazionali/TemplateComplessoSezione.xsd";
		public static final Long FAQ = 5L;
		public static final String FAQ_NAME_XSL = "faq.xsl";
		public static final String FAQ_DEXC = "Template faq";
		public static final String FAQ_IMG_PATH = "templateRedazionali/TemplateFaq.png";
		public static final String FAQ_XSD_PATH = "templateRedazionali/TemplateFaq.xsd";
	}
	
	public interface HolTipoAmbiente {
		public static final long COLLAUDO 	= 1l ; 
		public static final long ESERCIZIO	= 2l ; 
	}
	
	public interface GestioneCatalogoApplicativoEJB {
		public static final String CLASSIFICATORE_user = "";
		public static final String CLASSIFICATORE_password = "";
		public static final String CLASSIFICATORE_ePoint = "";
	}
	
	public interface GestioneInformativeEJB {
		public static final String DOCBOOK_TEMPLATE_XSD_PATH = "docbook-xsd-4.5/docbook_template.xsd";
		public static final String DOCBOOK_XSD_PATH = "docbook-xsd-4.5/docbook.xsd";
		public static final String PREFIX_PATH = "file://";
		public static final String DOCBOOK_schemaLocation = "http://docbook.org/xsd/4.5/docbook.xsd";
	}

	/**
	 * @author ADALFONS
	 *  Codici descrittivi della tipologia di attivita
	 */

	public interface HOLTipoAttivita {
		public final static int ATTIVITA_INDICE = 1;
		public final static int ATTIVITA_INFORMATIVE = 2;
		public final static int ATTIVITA_FAQ = 3;
		public final static int ATTIVITA_INDICE_FAQ = 4;
		public final static int ATTIVITA_GLOSSARIO = 5;
	}
	
	/**
	 * 
	 * @author ADALFONS
	 *	Descrizione dei profili utenti
	 */
	public interface HolProfiloUtente {
		public static final String REDATTORE="HolRed";
		public static final String APPROVATORE="HolApp";
		public static final String PUBBLICATORE="HolPub";
		public static final String PUBBLICATORE_GLOSSARIO="HolPubGlos";
		public static final String AMMINISTRATORE="HolAmm";
	}
	
	public interface HolTipoNodoClassificatore {
		public static final String APPLICAZIONE 	= "1" ; 
		public static final String MACROFUNZIONE	= "2" ; 
		public static final String FUNZIONE			= "3" ; 
		public static final String DETTAGLIO1		= "4" ;
		public static final String DETTAGLIO2		= "5" ; 
		public static final String PAGINA			= "6" ;
		public static final String OGGETTO			= "7" ;
	}
	
	public interface HolNaturaNodoClassificatore {
		public static final String LOGICO 	= "L" ; 
		public static final String FISICO	= "F" ; 
	}
	
	public interface HolTipoIndice {
		public static final long FAQ 	= 1l ; 
		public static final long GUIDA	= 2l ; 
	}

	public interface HolTipoLingua {
		public static final long ITALIANO 	= 1l ; 
		public static final long TEDESCO	= 2l ; 
		
		public static final String DESC_ITALIANO 	= "it" ; 
		public static final String DESC_TEDESCO 	= "de" ; 
	}
	
	public interface HolConfigurationMockServices{
		public static String ProfilazioneMock = "MOCK" ;
		public static String CatalogoApplicativoMock = "CATALOGO_APPLICATIVO.MOCK" ;
		public static String CatalogoApplicativoHecMock = "CATALOGO_APPLICATIVO.HEC.MOCK" ;
	}
	
	public interface HolConfigurationTestQueueServices {
		public static String QueueTest = "QUEUE_TEST";
	}
	
	public interface HolTipoAggregazione {
		public static final long LINK 	= 1l ; 
		public static final long INCLUSO	= 2l ; 
	}

	public interface HolTipoVisibilita {
		public static final long GUIDA_APPLICATIVA 	= 1l ; 
		public static final long HELP_CONTESTUALE	= 2l ; 
	}
	
	public interface HolAnaInformativaSupporto {
		public static final String FLG_VISIBILITA_GA_FALSE = "N";
		public static final String FLG_VISIBILITA_GA_TRUE = "S";
		public static final String FLG_VISIBILITA_HC_FALSE = "N";
		public static final String FLG_VISIBILITA_HC_TRUE = "S";
		
		public static final String VISIBILITA_GA = "GA";
		public static final String VISIBILITA_HC = "HC";
	}
	
	public interface HolFlgElabCopia {
		public static final String FLG_ELAB_COPIA_Y = "Y";
		public static final String FLG_ELAB_COPIA_N = "N";
	}
	
	public interface HolFlagIgnorato {
		public static final String FLG_IGNORATO_N = "N";
		public static final String FLG_IGNORATO_Y = "Y";
	}
	
	/**
	 * @author ADALFONS
	 *	Mapping della tabella tipologica HOL_TIP_STATO_WORKFLOW 
	 */
	public interface HOLTipoStatoWorkflow {
		public final static Long STATO_IN_REDAZIONE = 1L;
		public final static Long STATO_IN_APPROVAZIONE = 2L;
		public final static Long STATO_IN_PUBBLICAZIONE = 3L;
		public final static Long STATO_PUBBLICATO_IN_COLLAUDO = 4L;
		public final static Long STATO_PUBBLICATO_IN_ESERCIZIO = 5L;
		public final static Long STATO_IN_ARCHIVIO = 6L;
	}
	
	public interface HolTipTransizioni {		
		public static final long STATO_IN_REDAZIONE_STATO_IN_APPROVAZIONE_HOLRED 	= 1l ;
		public static final long STATO_IN_APPROVAZIONE_STATO_IN_REDAZIONE_HOLAPP 	= 2l ;
		public static final long STATO_IN_APPROVAZIONE_STATO_IN_PUBBLICAZIONE_HOLAPP 	= 3l ;
		public static final long STATO_IN_PUBBLICAZIONE_STATO_PUBBLICATO_IN_COLLAUDO_HOLPUB 	= 4l ;
		public static final long STATO_IN_PUBBLICAZIONE_STATO_PUBBLICATO_IN_ESERCIZIO_HOLPUB 	= 5l ;
		public static final long STATO_IN_PUBBLICAZIONE_STATO_PUBBLICATO_IN_COLLAUDO_HOLPUBGLOS  = 6l ;
		public static final long STATO_IN_PUBBLICAZIONE_STATO_PUBBLICATO_IN_ESERCIZIO_HOLPUBGLOS 	= 7l ;
		public static final long STATO_PUBBLICATO_IN_COLLAUDO_STATO_PUBBLICATO_IN_ESERCIZIO_HOLPUB 	= 8l ;
		public static final long STATO_PUBBLICATO_IN_ESERCIZIO_STATO_IN_ARCHIVIO_HOLPUB  = 9l ;
		public static final long STATO_PUBBLICATO_IN_COLLAUDO_STATO_PUBBLICATO_IN_ESERCIZIO_HOLPUBGLOS 	= 10l ;
		public static final long STATO_PUBBLICATO_IN_ESERCIZIO_STATO_IN_ARCHIVIO_HOLLPUBGLOS 	= 11l ;
		public static final long STATO_PUBBLICATO_IN_COLLAUDO_STATO_IN_REDAZIONE_HOLPUB = 12l ;
		public static final long STATO_PUBBLICATO_IN_ESERCIZIO_STATO_IN_REDAZIONE_HOLPUB 	= 13l ;
		public static final long STATO_PUBBLICATO_IN_COLLAUDO_STATO_IN_REDAZIONE_HOLPUBBGLOS 	= 14l ;
		public static final long STATO_PUBBLICATO_IN_ESERCIZIO_STATO_IN_REDAZIONE_HOLPUBGLOS 	= 15l ;
		public static final long STATO_IN_PUBBLICAZIONE_STATO_IN_REDAZIONE_HOLPUB  = 17l ;
		public static final long STATO_IN_PUBBLICAZIONE_STATO_IN_REDAZIONE_HOLPUBGLOS 	= 18l ;
		public static final long STATO_IN_ARCHIVIO_STATO_IN_REDAZIONE_HOLPUB 	= 19l ;
		public static final long STATO_IN_ARCHIVIO_STATO_IN_REDAZIONE_HOLPUBGLOS 	= 20l ;
	}
	
	public interface HolTipElaborioneMessaggi {
		public static final String MESSAGGIO_GENERA_PDF_GUIDA = "MSG_TYPE_PDF_GUIDA" ;
		public static final String MESSAGGIO_GENERA_PDF_FAQ = "MSG_TYPE_PDF_FAQ" ;
		public static final String MESSAGGIO_COPIA_HOL = "MSG_TYPE_COPIA" ;
		public static final String MESSAGGIO_IMPORT_EXCEL = "MSG_TYPE_IMP_XLS" ;
	}
	
	public interface HolTipQueueParameters {
		public static final String MSG_TYPE = "msgType" ;
		public static final String UID_APPLICAZIONE = "UIDApplicazione" ;
		public static final String UID_VERSIONE = "UIDVersione" ;
		public static final String FLAG_COPIA_FAQ = "FlagCopiaFaq" ;
		public static final String FLAG_COPIA_INFORMATIVA = "FlagCopiaInformativa" ;
		public static final String UID_VERSIONE_PARTENZA = "UIDVersionePartenza";
		public static final String ID_INDICE = "idIndice";
		
		public static final String EXCEL_PATH = "excelPath";
		public static final String MSG_TYPE_IMPORT = "msgTypeImport" ;
		public static final String MATR_UTENTE = "MatrUtente";
	}
	
	
	public interface HolCopia {
		public static final String NOME_BATCH = "BATCH_COPIA";
	}
	
	public interface HolTipoRuolo {
		public final static Long HOL_AMM = 1l;
		public final static Long HOL_PUB = 2l;
		public final static Long HOL_APP = 3l;
		public final static Long HOL_RED = 4l;
		public final static Long HOL_PUB_GLOS = 5l;
	}
	
	public interface GeneraPdfEJBBean {
		public static final String NOME_BATCH = "BATCH_PDF";
	}
	
	public interface AnteprimaHelper {
		public static final String PLACEHOLDER_ID_INFORMATIVA = "#pIdInformativa#";
		public static final String PLACEHOLDER_ID_TIPO_VISIBILITA = "#pIdTipoVisibilita#";
		public static final String PLACEHOLDER_ID_TIPO_AGGREGAZIONE = "#pIdTipoAggregazione#";
		public static final String PLACEHOLDER_ID_IMMAGINE = "#pIdImmagine#";
		public static final String PLACEHOLDER_ID_INDICE = "#pIdIndice#";
		public static final String PLACEHOLDER_ID_LIVELLO_FAQ = "#pIdLivelloFaq#";
	}
}
