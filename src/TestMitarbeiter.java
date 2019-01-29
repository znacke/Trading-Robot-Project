import java.io.FileNotFoundException;
import java.io.IOException;

public class TestMitarbeiter {
	
	/*
	 * Author: Michael 
	 * Alterscheck des Kunden: Kunde => 18 Jahre. Alter wird auf Tag
	 * genau gerechnet. Klasse wird zum test verwendet
	 */

	public static void main(String[] args) throws ClassNotFoundException, IOException {

//			Kunde peter = new Kunde("Peter", "Muster", "Lorenweg", 27, "123-456", "peter.muster@hotmail.com",
//					"078 704 51 89", true, true, 20);
//			Kunde hans = new Kunde("Hans", "Muster", "Musterstrasse1", 10, "132-654", "hans.muster@hotmail.com",
//					"0781234567", true, true, 26);¨

			Mitarbeiter michael = new Mitarbeiter();
			Kunde kunde1 = michael.erstelleKunde("Bojan", "Eric", "Musterstrasse", 123, "abc-123", "bojan.eric@gmx.ch", null);
			System.out.println("Kunde ohne Konto: " + kunde1.toString());
			Kunde pr1 = Kundenverwaltung.laden();
			pr1.getFondskonto().setFondsKontoStand(Voraussetzungen.kontoStand);
			Fondskonto fkonto1 = michael.erstelleFondsKonto("1234-5678 ", Voraussetzungen.getKontoStand());
			kunde1.setFondskonto(fkonto1);
			System.out.println("Kunde mit Konto:  " + kunde1.toString());
			
			// Erstellen eines Kunden.txt
			try {
				String kundenStringGeschrieben = kunde1.toString();
				
				// Write objects to file
				Kundenverwaltung.speichern(kunde1);

				// Read objects
				if(kundenStringGeschrieben.equals(pr1.toString()))
					System.out.println("Kunde korrekt geschrieben");
				else {
					System.err.println("Erwartete Kunde geschrieben: " + kundenStringGeschrieben);
					System.err.println("Erhalten Kunde gelesen:      " + pr1.toString());
				}
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error initializing stream");
			}

		}

		
	}
