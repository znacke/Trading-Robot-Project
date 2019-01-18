import java.util.ArrayList;

public class Robot {

	Fondskonto fondskonto;
	ArrayList<Aktie> aktienListe;
	
	
	public Robot (Fondskonto f) {
		this.fondskonto = f;
		this.aktienListe = new ArrayList<Aktie> ();
	}

	public void checkSchwellenwert(Aktie a) {
//Schwellenwert wird mit Aktienkurs verglichen
		if (a.getMinSchwellenwert() > a.getWert()) {
			// jetzt soll Aktie gekauft werden (KAUFEN einbauen)
			// muss gepr�ft werden ob genug Geld vorhanden ist um zu kaufen
			// muss den Kaufbetrag vom Fondskontostand abziehen
			kaufen (a);

		}
		if (a.getMaxSchwellenwert() < a.getWert()) {
			// jetzt muss die Aktie verkauft werden (VERKAUFEN einbauen)
			// muss den Verkaufsbetrag dem Fondskonto �berweisen abz�glich 0.25% Geb�hren
			verkaufen(a);
		}
	}

	private void kaufen (Aktie a) {
		
		//System.out.println(fondskonto.getFondsKontoStand() - (a.getVolumen()*a.getWert()));
		System.out.println(a.ge);
	
	}

	private void verkaufen(Aktie a) {
		System.out.println("verkaufen");
		// wenn verkauft wird m�ssen Geb�hren noch ausgerechnet werden

	}
}
