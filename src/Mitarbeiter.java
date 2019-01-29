import java.io.Serializable;

public class Mitarbeiter implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -8829044902292400725L;
	private Kunde kunde;
	
	public Mitarbeiter() {
	}

	public Kunde erstelleKunde(String vorname, String nachname, String strasse, int hausnummer, String privatKontoNr,
			String email, String telefon, boolean bonitaet) {
		Kunde k = new Kunde("Hans", "Muster", "Musterstrasse", 1, "123-456", "muster@muster.ch", "781234567", true,
				true);
		Alter alter = new Alter(1992, 12, 28);

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
		System.out.println("Einlage erfüllt? " + Voraussetzungen.kontoStand);
		System.out.println("-----");
		System.out.println("");
		System.out.println("Kunde ist 18 Jahre alt: " + alter.checkAge18());
		
		
// -> need to check this ------------------------------------------------
		
		System.out.println("Bonität des Kunden: " + Voraussetzungen.result);
		System.out.println(
				"Der Kunde hat eine Einlage von mindestens 200'000.- CHF getroffen: " + Voraussetzungen.getKontoStand());
		System.out.println("");
		System.out.println("-----");
		System.out.println("");

		return k;

	}

	public double auszahlenKonto(Fondskonto fondskonto, double betrag) {
		fondskonto.setFondsKontoStand(fondskonto.getFondsKontoStand() - betrag);
		System.out.println(
				"Überweisung ist an den Kunden erfolgt, der neue Kontostand ist: " + fondskonto.getFondsKonto());
		return fondskonto.getFondsKontoStand();
	}

	public Fondskonto erstelleFondsKonto(String fondsKonto, double fondsKontoStand) {
		Fondskonto f = new Fondskonto(fondsKonto, fondsKontoStand);
		System.out.println("FONDSKONTO WURDE ERSTELLT");				
		System.out.println("Fonds-Konto: " + Voraussetzungen.fondsKonto);
		System.out.println("Fonds-Kontostand beträgt aktuell: " + fondsKontoStand);
		return f;

	}
	

	public static void auflösenFondsKonto() {

		
		
	}


	}



/*
 * KundenprofieErstellen() auszahlen() FondKontoEroefnen() FondKontoAufloesen()
 * GebuehrenErheben()
 */
