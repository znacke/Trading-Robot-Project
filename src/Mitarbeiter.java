
public class Mitarbeiter {

	public static void main(String[] args) {

//		Kunde peter = new Kunde("Peter", "Muster", "Lorenweg", 27, "123-456", "peter.muster@hotmail.com",
//				"078 704 51 89", true, true, 20);
//		Kunde hans = new Kunde("Hans", "Muster", "Musterstrasse1", 10, "132-654", "hans.muster@hotmail.com",
//				"0781234567", true, true, 26);¨

		Mitarbeiter michael = new Mitarbeiter();
		michael.erstelleKunde("Bojan", "Eric", "Musterstrasse", 123, "abc-123", "bojan.eric@gmx.ch", "0765858585", true, false, 25);
		
		Mitarbeiter adrian = new Mitarbeiter();
		adrian.erstelleFondsKonto("1234-5678", 234000.55);

	}

	public Kunde erstelleKunde(String vorname, String nachname, String strasse, int hausnummer, String privatKontoNr,
			String email, String telefon, boolean bonitaet, boolean einlage, int alter) {
		Kunde k = new Kunde("Hans", "Muster", "Musterstrasse", 1, "123-456", "muster@muster.ch", "781234567", true,
				true, 22);

		if (bonitaet == false || einlage == false) {

		System.out.println("DER KUNDE KONNTE NICHT ERSTELLT WERDEN!");
		} else 
		System.out.println("Der Kunde " + vorname + " " + nachname + " wurde erstellt");
		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		System.out.println("Alter: " + alter);
		System.out.println("Strasse: " + strasse + hausnummer);
		System.out.println("Bank Kontonummer: " + privatKontoNr);
		System.out.println("Email Adresse: " + email);
		System.out.println("Telefonnummer: " + telefon);
		System.out.println("Bonität erfüllt? " + bonitaet);
		System.out.println("Einlage erfüllt? " + einlage);

		return k;

	}

	public static void auszahlenKonto() {

	}

	public Fondskonto erstelleFondsKonto(String fondsKonto, double fondsKontoStand) {
		Fondskonto f = new Fondskonto(fondsKonto, fondsKontoStand);
		System.out.println("FONDSKONTO WURDE ERSTELLT");
		System.out.println("Fonds-Konto: " + fondsKonto);
		System.out.println("Fonds-Kontostand beträgt aktuell: " + fondsKontoStand);
		return f;
		

	}

	public static void auflösenFondsKonto() {

	}

	public static void erhebenGebuehren() {

	}

}

/*
 * KundenprofieErstellen() auszahlen() FondKontoEroefnen() FondKontoAufloesen()
 * GebuehrenErheben()
 */
