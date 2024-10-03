package PaisesFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;





// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {



		menua();		

	}

	/**
	 * Menua.
	 */
	public static void menua() {

		String hasierakoLanDirektorioString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu zure lan direktorioaren helbide absolutua:");

		hasierakoLanDirektorioString = sc.nextLine();

		//Konprobatu hutsik dagoen gure entry-a
		if (hasierakoLanDirektorioString.isEmpty()) {
			hasierakoLanDirektorioString = ".";
		}

		// Erakutsi zein direktorio erabiliko den
		System.out.println("Lan direktorioa: " + hasierakoLanDirektorioString);

		// File objetua sortu drektorioarekin
		File directory = new File(hasierakoLanDirektorioString);

		//Konprobatu ea existitzen den direktorioa
		if (directory.exists() && directory.isDirectory()) {
			System.out.println("Zure direktorioa existitzen da: " + hasierakoLanDirektorioString + " eta direktorioa " + directory.getAbsolutePath()) ;
		} else {
			System.out.println("Errorea: Zure direktorioa ez da existitzen edo ez da zuzeneko direktorioa.Beraz defektuzko lan direktorioa erabiliko da");
			hasierakoLanDirektorioString = ".";
			directory =  new File(hasierakoLanDirektorioString);
			System.out.println(directory.getAbsolutePath());

		}


		int Aukera = 0;

		do {
			// Erakutsi Menua
			System.out.println("\n----- MENUA -----");
			System.out.println("1. Erakutsi Lan direktorioko fitxategiak eta Direktorioak");
			System.out.println("2. Aldatu lan direktorioa Direktorio berri bat sortuz");
			System.out.println("3. Gorde Herrialdeak Fitxategietan");
			System.out.println("4. Ezabatu fitxategiak .aad");
			System.out.println("5.Aldatu direktorioa");
			System.out.println("6.Irten");
			System.out.print("Aukeratu: ");


			Aukera = sc.nextInt();
			sc.nextLine();

			switch(Aukera) {
			case 1:

				// Konproabtu fitxategiak dauden
				File[] fitxategiakFiles = directory.listFiles();

				if (fitxategiakFiles != null && fitxategiakFiles.length > 0) {
					System.out.println("Fitxategiak eta direktorioak:");


					System.out.printf("%-20s %-10s %10s %-30s %n", "Data", "Mota", "Tamaina", "Izena");
					System.out.println("----------------------------------------------------------------------");

					//ERakutsi fixtategi eta direktorio bakoitza modu egokian
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
					for (File fitxategiFile : fitxategiakFiles) {
						//Modifikazio data
						String data = sdf.format(fitxategiFile.lastModified());

						// Konproabtu direktorioa den
						String mota = fitxategiFile.isDirectory() ? "<DIR>" : "     ";

						// Fitxategien tamaina lortu
						long tamaina = fitxategiFile.isFile() ? fitxategiFile.length() : 0;

						//Informazioa erakutsi formatu egokian
						System.out.printf("%-20s %-10s %10s bytes %-30s %n ", data, mota, tamaina  > 0 ? tamaina : "", fitxategiFile.getName());
					}
				} else {
					System.out.println("Ez dago fitxategirik edo direktoriarik.");
				}
				break;



			case 2:
				// Direktorio berria eskatu
				System.out.println("Sartu zure lan direktorio berriaren izena:");
				String berriLanDirektorioIzena = sc.nextLine();

				// Konproabtu direktorioa ya existitzen den
				File berriLanDirektorio = new File(directory, berriLanDirektorioIzena); // Sortu direktorio berria gure direktorioan

				if (berriLanDirektorio.exists()) {
					System.out.println("Errorea: Direktorioa '" + berriLanDirektorioIzena + "' dagoeneko existitzen da.");
				} else {

					boolean sortuDa = berriLanDirektorio.mkdir();
					//Sortu bada erakutsi sortu dela
					if (sortuDa) {
						System.out.println("Direktorio berria sortu da: " + berriLanDirektorio.getAbsolutePath());
						//Direktorioa aldatu
						directory = berriLanDirektorio;
						System.out.println("Direktorio berria : " + directory.getAbsolutePath());
					} else {
						System.out.println("Errorea: Ezin izan da sortu '" + berriLanDirektorioIzena + "' direktorioa.");
					}
				}
				break;


			case 3:

				ArrayList<PaisesFile> paises = new ArrayList<>();

				paises.add(new PaisesFile("31", "Holanda","Amsterdam", 15460000.00,78, LocalDate.of(1581, 7, 26),false ));

				paises.add(new PaisesFile("376", "Andorra", "Andorra La Vieja",64000.00, 0, LocalDate.of(1993, 3, 14),true ));

				paises.add(new PaisesFile("90", "Turquia","Ankara",61058000.00,67, LocalDate.of(1923, 10, 29),true  ));

				paises.add(new PaisesFile("261", "Madagascar","Antananarivo",13651000.00, 52, LocalDate.of(1960, 6, 26),true ));

				paises.add(new PaisesFile("685", "Samoa Occidental","Apia",165000.00, 68, LocalDate.of(1962, 1, 1),true  ));

				paises.add(new PaisesFile("213", "Argelia","Argel", 27959000.00, 70, LocalDate.of(1962, 7, 5),true ));

				paises.add(new PaisesFile("291", "Eritrea","Asmara", 3400000.00, 0, LocalDate.of(1993, 5, 24),false ));

				paises.add(new PaisesFile("595", "Paraguay","Asuncion", 4828000.00, 68, LocalDate.of(1825, 8, 25),true ));

				paises.add(new PaisesFile("30", "Grecia","Atenas",10467000.00, 78, LocalDate.of(1830, 2, 3), true));

				paises.add(new PaisesFile("964", "Irak","Bagdad",20097000.00, 66, LocalDate.of(1958, 7, 14),false  ));


				for (PaisesFile pais : paises) {

					String fileName = pais.gethiriizena() + ".aad"; // Fitxategiaren izena Hiriaren izenarekin
					File paisFile = new File(directory, fileName); // Fitxategia sortu gure direktorioan

					try {
						// Sortu fitxategia
						if (paisFile.createNewFile()) {
							System.out.println("Fitxategia sortu da: " + paisFile.getAbsolutePath());
						} else {
							System.out.println("Fitxategia existitzen da: " + paisFile.getAbsolutePath());
						}


						try (FileWriter writer = new FileWriter(paisFile)) {
							writer.write("Hiriaren izena: " + pais.gethiriizena());
							System.out.println("Hiriaren izena idatzi da zure fitxategian: " + pais.gethiriizena());
						}

					} catch (IOException e) {
						System.out.println("Errorea hurrengo fitxategia sortzerakoan: " + pais.gethiriizena());
						e.printStackTrace();
					}
				}
				break;


			case 4:
				//Erakutsi momentuko fitxategiak
				File[] fitxategiakk = directory.listFiles(); 

				if (fitxategiakk != null && fitxategiakk.length > 0) {
					for (File fitxategi : fitxategiakk) {
						// Konprobatu .aad amaitzen dela
						if (fitxategi.isFile() && fitxategi.getName().toLowerCase().endsWith(".aad")) {
							// Fitxategia ezabatu
							if (fitxategi.delete()) {
								System.out.println("Hurrengo fitxategia ezabatu da: " + fitxategi.getName());
							} else {
								System.out.println("Ondorengo fitxategia borratzerakoan errorea egon da: " + fitxategi.getName());
							}
						}
					}
				} else {
					System.out.println("Ez dago fitxategirik ezabatzeko.");
				}
				break;



			case 5:
				// Aldatu direktorioa
				System.out.println("Sartu direktorioaren helbide absolutua:");
				String newDirPath = sc.nextLine();
				File newDir = new File(newDirPath);
				if (newDir.exists() && newDir.isDirectory()) {
					directory = newDir;
					System.out.println("Direktorioa aldatu da: " + directory.getAbsolutePath());
				} else {
					System.out.println("Errorea: Zure direktorioa ez da existitzen edo ez da zuzeneko direktorioa.");
				}
				break;

			case 6 :

				System.out.println("Irteten....");
				break;
			default:
				System.out.println("Aukera desegokia aukeratu ondo.");
			}

		} while (Aukera != 6);

		sc.close(); 
	}







}


