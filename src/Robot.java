import java.io.IOException;
import java.util.ArrayList;

public class Robot {

	/*
	 * @Author: Zweck der Klasse:
	 */

	Fondskonto fondskonto;
	ArrayList<Aktie> aktienListe;

	public Robot(Fondskonto f) throws ClassNotFoundException, IOException {
		Kunde pr1 = Kundenverwaltung.laden();
		pr1.getFondskonto().getFondsKontoStand();
		this.fondskonto = f;
		this.aktienListe = new ArrayList<Aktie>();
	}

	/**
	 * Author: Adrian Diese Methode vergleicht den Schwellenwert mit dem Aktienkurs
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	public void checkSchwellenwert(Aktie a) throws ClassNotFoundException, IOException {

		if (a.getMinSchwellenwert() > a.getWert()) {

			/**
			 * Author: Adrian Diese Methode prüft ob genügen Geld auf dem Fondskonto ist
			 */

			Kunde pr1 = Kundenverwaltung.laden();
			boolean summeOk = pr1.getFondskonto().checkAmmount(a.getWert() * a.getVolumen());
			if (summeOk) {
				kaufen(a);
			} else {
				System.out.println("Der Saldo auf dem Fondskonto ist nicht ausreichend");
			}
		}
		if (a.getMaxSchwellenwert() < a.getWert()) {
			verkaufen(a);
		}
	}

	/**
	 * Author: Adrian Diese Methode führt den Kauf aus
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void kaufen(Aktie a) throws ClassNotFoundException, IOException {
		Kunde pr1 = Kundenverwaltung.laden();
		System.out.println("Es werden " + a.getVolumen() + " Aktien zum Wert von " + a.getWert() + " Franken gekauft"
				+ " was einem Total von " + a.getWert() * a.getVolumen() + " Franken entspricht");
		fondskonto.abheben(a.getWert() * a.getVolumen());
		System.out.println("Der Fondskontostand beträngt nun: "  + 
		(pr1.getFondskonto().getFondsKontoStand() - (a.getWert() * a.getVolumen()  - (a.getWert() * a.getVolumen())) -
				(a.getWert() * a.getVolumen()*0.0025) + " Franken"));

	}

	/**
	 * Author: Adrian Diese Methode führt den Verkauf aus
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void verkaufen(Aktie a) throws ClassNotFoundException, IOException {
		Kunde pr1 = Kundenverwaltung.laden();
		System.out.println("Es werden " + a.getVolumen() + " Aktien zum Wert von " + a.getWert() + " Franken verkauft"
				+ " was einem Total von " + a.getWert() * a.getVolumen() + " Franken entspricht");
		fondskonto.einzahlen(a.getWert() * a.getVolumen());
		Kundenverwaltung.speichern(pr1);
		System.out.println("Der Fondskontostand beträngt nun: " + 
		(pr1.getFondskonto().getFondsKontoStand() + (a.getWert() * a.getVolumen()) -
				(a.getWert() * a.getVolumen()*0.0025)  + " Franken"));

	}
}