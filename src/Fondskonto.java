public class Fondskonto {


	private String fondsKonto; 
	private double fondsKontoStand = 0;

	public Fondskonto(double startWert) {
		this.fondsKontoStand = startWert;
	}
	/**
	 * Diese Methode sorgt daf�r, dass der Kaufbetrag vom Fonskontostand abgezogen wird
	 */

	public void abheben(double summe) {
		fondsKontoStand = fondsKontoStand - summe;
	}

	/**
	 * Diese Methode sorgt daf�r, dass der Verkaufsbetrag aufs Fonskontostand abz�glich Geb�hren �berwiesen wird
	 */
	public void einzahlen(double summe) {
		double realerBetrag = summe - (summe * 0.0025);
		System.out.println("Die Geb�hr betr�gt: " + summe * 0.0025 + " Franken");
		fondsKontoStand = fondsKontoStand + realerBetrag;

	}

	/**
	 * Diese Methode pr�ft, ob der Kaufbetrag den Fondskontostand �bersteigt
	 */
	public boolean checkAmmount(double summe) {
		if (fondsKontoStand < summe) {
			return false;

		} else
			return true;
	}

	public String getFondsKonto() {
		return fondsKonto;
	}

	public void setFondsKonto(String fondsKonto) {
		this.fondsKonto = fondsKonto;
	}

	public double getFondsKontoStand() {
		return fondsKontoStand;
	}

	public void setFondsKontoStand(double fondsKontoStand) {
		this.fondsKontoStand = fondsKontoStand;
	}

	public Fondskonto() {

	}

	public Fondskonto(String fondsKonto, double fondsKontoStand) {

	}


}