import java.util.ArrayList;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class Robot {

	Fondskonto fondskonto;
	ArrayList<Aktie> aktienListe;

	public Robot(Fondskonto f) {
		this.fondskonto = f;
		this.aktienListe = new ArrayList<Aktie>();
	}

	public void checkSchwellenwert(Aktie a) {
//Schwellenwert wird mit Aktienkurs verglichen
		if (a.getMinSchwellenwert() > a.getWert()) {
			// jetzt soll Aktie gekauft werden (KAUFEN einbauen)
			// muss geprüft werden ob genug Geld vorhanden ist um zu kaufen
			// muss den Kaufbetrag vom Fondskontostand abziehen
			boolean summeOk = fondskonto.checkAmmount(a.getWert()*a.getVolumen());
			if (summeOk) {
				kaufen(a);
			} else {
				System.out.println("Der Saldo auf dem Fondskonto ist nicht ausreichend");
			}
		}
		if (a.getMaxSchwellenwert() < a.getWert()) {
			// jetzt muss die Aktie verkauft werden (VERKAUFEN einbauen)
			// muss den Verkaufsbetrag dem Fondskonto überweisen abzüglich 0.25% Gebühren
			verkaufen(a);
		}
	}

	private void kaufen(Aktie a) {

		System.out.println("Es werden " + a.getVolumen() + " Aktien zum Wert von " + a.getWert() + " Franken gekauft"
				+ " was einem Total von " + a.getWert() * a.getVolumen() + " Franken entspricht");
		fondskonto.abheben(a.getWert() * a.getVolumen());
		System.out.println("Der Fondskontostand beträngt nun: " + fondskonto.getFondsKontoStand() + " Franken");

	}

	private void verkaufen(Aktie a) {
		System.out.println("Es werden " + a.getVolumen() + " Aktien zum Wert von " + a.getWert() + " Franken verkauft"
				+ " was einem Total von " + a.getWert() * a.getVolumen() + " Franken entspricht");
		fondskonto.einzahlen(a.getWert() * a.getVolumen());
		System.out.println("Der Fondskontostand beträngt nun: " + fondskonto.getFondsKontoStand() + " Franken");
		// wenn verkauft wird müssen Gebühren noch ausgerechnet werden

	}
}