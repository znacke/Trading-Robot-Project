import java.util.ArrayList;

public class Adressbuch {

	public static void main(String[] args) {

		Stock peterAdresse = new Stock("Peter", "Fritzlangenstrasse4", "Berlin");
		Stock hansAdresse = new Stock("Hans", "Berlinerstrasse6", "Leipzig");

		ArrayList<Stock> adressenListe = new ArrayList<Stock>();
		adressenListe.add(peterAdresse);
		adressenListe.add(hansAdresse);

		// Ausgabe der Liste

		for (Stock adresse : adressenListe) {
			System.out.println("Name: " + adresse.getName() + " Strasse: " + adresse.getStrasse() + " Stadt: " + adresse.getStrasse());

		}
	}

}
