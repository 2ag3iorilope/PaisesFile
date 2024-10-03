package PaisesFile;

import java.time.LocalDate;


/**
 * The Class Paises.
 */
public class PaisesFile {

	/** Hiriaren Telefono kodea. */
	String PaisKode;

	/** Hiriaren izena. */
	String paissString;

	/** Kapitalaren izena. */
	String kapitalaString;

	/** Hiriko poblazio kopurua. */
	Double poblazioaDouble;

	/**  Bizi esperantza Kopurua. */
	int BiziEsperantzakop;

	/** Hiria sortutako Data. */
	LocalDate Sortudata;

	/** Demokrazia dagoen Hiri horretan. */
	boolean Demokrazioabool;


	/**
	 * Instantiates a new paises.
	 *
	 * @param kodea , hiriko telefono kodea
	 * @param Pais , hiriaren izea
	 * @param Kapitala , hiriko kapitala
	 * @param Poblazioa, hiriko poblazioa
	 * @param Bizi_Esperantza , hiriko bizi esperantza
	 * @param sortudataDate , hiria sortu zen data
	 * @param Demokrazia , demokrazia dagoen hirian
	 */
	public PaisesFile(String kodea,String Pais,String Kapitala,Double Poblazioa,int Bizi_Esperantza,LocalDate sortudataDate, boolean Demokrazia ) {

		PaisKode = kodea;
		paissString = Pais;
		kapitalaString = Kapitala;
		poblazioaDouble = Poblazioa;
		BiziEsperantzakop = Bizi_Esperantza;
		Sortudata = sortudataDate;
		Demokrazioabool = Demokrazia;

	}



	/**
	 * Hiriko telefono kodea lortzen duen metodoa.
	 *
	 * @return Hiriko Telefono Kodea
	 */
	public String getPaisKode() {
		return PaisKode;
	}



	/**
	 * Hiriko telefono kodea ezartzen duen metodoa.
	 *
	 * @param paisKode , telefono kode berria
	 */
	public void setPaisKode(String paisKode) {
		PaisKode = paisKode;
	}

	/**
	 * Hiriaren sortu zen data lortzen duen metodoa.
	 *
	 * @return hiria sortu zen data
	 */
	public LocalDate lortudata() {
		return Sortudata;
	}

	/**
	 * Hiraren data ezartzen duen metodoa.
	 *
	 * @param Hiriaren data berria
	 */
	public void setData(LocalDate fecha) {
		this.Sortudata = fecha;
	}


	/**
	 * Hiriaren izena lortzen duen metodoa.
	 *
	 * @return  paiss , Hiriaren izena
	 */
	public String getPaissString() {
		return PaisKode;
	}

	/**
	 * Hiriaren sortu zen data lortzen duen metodoa.
	 *
	 * @return hiria sortu zen data
	 */
	public LocalDate getFecha() {
		return Sortudata;
	}

	/**
	 * Hiriaren izena ezarten duen metodoa.
	 *
	 * @param paissString , hiriaren izen berria
	 */
	public void setPaissString(String paissString) {
		this.paissString = paissString;
	}
	
	public String gethiriizena() {
		return paissString;
	}


	/**
	 * Hiriaren kapitala lortzeko metodoa.
	 *
	 * @return  kapitala , Hiriaren kaptalaren izena
	 */
	public String getKapitalaString() {
		return kapitalaString;
	}


	/**
	 * Hiriaren kapitala ezartzeko metodoa.
	 *
	 * @param kapitalaString, hiriaren kapital berria
	 */
	public void setKapitalaString(String kapitalaString) {
		this.kapitalaString = kapitalaString;
	}

	/**
	 * Hiriaren poblazioa lortzen duen metodoa.
	 *
	 * @return the poblazioa , hiriaren poblazio guztia
	 */
	public Double getPoblazioaDouble() {
		return poblazioaDouble;
	}


	/**
	 * Hiriaren poblazioa ezartzeko metodoa.
	 *
	 * @param poblazioaDouble , hiriaren poblazio berria
	 */
	public void setPoblazioaDouble(Double poblazioaDouble) {
		this.poblazioaDouble = poblazioaDouble;
	}


	/**
	 * Hiriaren bizi esperantza lortzeko metodoa.
	 *
	 * @return hiriaren bizi esperantza
	 */
	public int getBiziEsperantzakop() {
		return BiziEsperantzakop;
	}


	/**
	 * Hiriaren bizi esperantza ezartzeko metodoa.
	 *
	 * @param biziEsperantzakop , hiriaren bizi esperantza berria
	 */
	public void setBiziEsperantzakop(int biziEsperantzakop) {
		BiziEsperantzakop = biziEsperantzakop;
	}

	/**
	 * Hiriak demokrazia duen konprobatzen duen metodoa
	 *
	 * @return true, demokrazia badu
	 */
	public boolean isDemokrazioabool() {
		return Demokrazioabool;
	}

	/**
	 * Gets the paiss string.
	 *
	 * @return the paiss string
	 */
	public String getPaissStringa() {
		return paissString; 
	}

	/**
	 * To string.
	 *
	 * @return erregistroa formatu egokian
	 */
	@Override
	public String toString() {
		return "Kodea: " + PaisKode + "\n" +
				"Estatua: " + paissString + "\n" +
				"BiziEsperantza: " + (BiziEsperantzakop != 0 ? BiziEsperantzakop : "Ez dago eskuragarri") + "\n" +
				"Data Sortu: " + Sortudata + "\n" +
				"Poblazioa: " + poblazioaDouble + "\n" +
				"Kapitala: " + kapitalaString + "\n" +
				"Demokrazia: " + (Demokrazioabool ? "Bai" : "Ez") + "\n" + 
				"------------------------------";
	}

}
