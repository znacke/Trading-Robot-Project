import java.util.ArrayList;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class Robot {

	Fondskonto fondskonto;
	ArrayList<Aktie> aktienListe;

	public Robot(Fondskonto f) {
		this.fondskonto = f;
		this.aktienListe = new ArrayList<Aktie>();
	}

	/**
	 * Diese Methode vergleicht den Schwellenwert mit dem Aktienkurs
	 */
			
	public void checkSchwellenwert(Aktie a) {
		
		if (a.getMinSchwellenwert() > a.getWert()) {
			/**
			 * Diese Methode prüft ob genügen Geld auf dem Fondskonto ist
			 */
			boolean summeOk = fondskonto.checkAmmount(a.getWert() * a.getVolumen());
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
	 * Diese Methode führt den Kauf aus
	 */
	private void kaufen(Aktie a) {

		System.out.println("Es werden " + a.getVolumen() + " Aktien zum Wert von " + a.getWert() + " Franken gekauft"
				+ " was einem Total von " + a.getWert() * a.getVolumen() + " Franken entspricht");
		fondskonto.abheben(a.getWert() * a.getVolumen());
		System.out.println("Der Fondskontostand beträngt nun: " + fondskonto.getFondsKontoStand() + " Franken");

	}
	/**
	 * Diese Methode führt den Verkauf aus 
	 */
	private void verkaufen(Aktie a) {
		System.out.println("Es werden " + a.getVolumen() + " Aktien zum Wert von " + a.getWert() + " Franken verkauft"
				+ " was einem Total von " + a.getWert() * a.getVolumen() + " Franken entspricht");
		fondskonto.einzahlen(a.getWert() * a.getVolumen());
		System.out.println("Der Fondskontostand beträngt nun: " + fondskonto.getFondsKontoStand() + " Franken");

	}
}