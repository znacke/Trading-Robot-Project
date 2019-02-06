import java.io.IOException;
import java.io.Serializable;
import java.time.Period;

public class Mitarbeiter implements Serializable {

	/** @author 
	 * Klasse dient als Kontrolle 
	 */

	private static final long serialVersionUID = -8829044902292400725L;
	private Kunde kunde;

	public Mitarbeiter() {
	}

	public Kunde erstelleKunde(String vorname, String nachname, String strasse, int hausnummer, String privatKontoNr,
			String email, String telefon) throws ClassNotFoundException, IOException {
		Kunde k = new Kunde("Hans", "Muster", "Musterstrasse", 1, "123-456", "muster@muster.ch", "781234567", true,
				true);
		Alter alter = new Alter(1992, 12, 28);

		if (Voraussetzungen.kontoStand >= 200000) {

			System.out.println("DER KUNDE KONNTE NICHT ERSTELLT WERDEN!");
		} else
			
			System.out.println("Der Kunde " + vorname + " " + nachname + " wurde erstellt");
		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		System.out.println("Alter > 18: " + (Period.between(Alter.geburtsdatum, Alter.getLocalDate()).getYears() >= 18));
		System.out.println("Strasse: " + strasse + hausnummer);
		System.out.println("Bank Kontonummer: " + privatKontoNr);
		System.out.println("Email Adresse: " + email);
		System.out.println("Telefonnummer: " + telefon);
		System.out.println("Bonit�t erf�llt? " + Voraussetzungen.result);
		Kunde pr1 = Kundenverwaltung.laden();
		System.out.println("Einlage erf�llt? " + pr1.getFondskonto().getFondsKontoStand());
		System.out.println("-----");
		System.out.println("");
		System.out.println("Kunde ist 18 Jahre alt: " + alter.checkAge18());

// -> need to check this ------------------------------------------------

		System.out.println("Bonit�t des Kunden: " + Voraussetzungen.result);
		System.out.println("Der Kunde hat eine Einlage von mindestens 200'000.- CHF getroffen: "
				+ pr1.getFondskonto().getFondsKontoStand());
		System.out.println("");
		System.out.println("-----");
		System.out.println("");

		return k;

	}

	public double auszahlenKonto(Fondskonto fondskonto, double betrag) {
		fondskonto.setFondsKontoStand(fondskonto.getFondsKontoStand() - betrag);
		System.out.println(
				"�berweisung ist an den Kunden erfolgt, der neue Kontostand ist: " + fondskonto.getFondsKonto());
		return fondskonto.getFondsKontoStand();
	}

	public Fondskonto erstelleFondsKonto(String fondsKonto, double fondsKontoStand) throws ClassNotFoundException, IOException {
		Fondskonto f = new Fondskonto(fondsKonto, fondsKontoStand);
		System.out.println("FONDSKONTO WURDE ERSTELLT");
		Kunde pr1 = Kundenverwaltung.laden();
		System.out.println("Fonds-Kontostand betr�gt aktuell: " + fondsKontoStand);
		return f;

	}

}

/*
 * KundenprofieErstellen() auszahlen() FondKontoEroefnen() FondKontoAufloesen()
 * GebuehrenErheben()
 */
