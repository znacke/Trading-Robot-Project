
public class Robot {

	//PUSH
	/*
	 * Aktie : aktie [ ] Fond-Konto: Fond Konto kaufen ( ) verkaufen ( ) Gebuehren
	 * ausrechnen ( ) Fond-Kontostand pruefen ( ) check Schwellenwert ( )
	 */
	public void checkSchwellenwert(Aktie a) {
//Schwellenwert wird mit Aktienkurs verglichen
		if (a.getMinSchwellenwert() > a.getWert()) {
			// jetzt soll Aktie gekauft werden (KAUFEN einbauen)
			kaufen();

		}
		if (a.getMaxSchwellenwert() < a.getWert()) {
			// jetzt muss die Aktie verkauft werden (VERKAUFEN einbauen)
			verkaufen();
		}

	}

	private void kaufen() {
		System.out.println("kaufen");
	}

	private void verkaufen() {
		System.out.println("verkaufen");
		// wenn verkauft wird müssen Gebühren noch ausgerechnet werden

	}
}
