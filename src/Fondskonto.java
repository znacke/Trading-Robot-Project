public class Fondskonto {


	private String fondsKonto; 
	private double fondsKontoStand = 0;

	public Fondskonto(double startWert) {
		this.fondsKontoStand = startWert;
	}
	/**
	 * Diese Methode sorgt dafür, dass der Kaufbetrag vom Fonskontostand abgezogen wird
	 */

	public void abheben(double summe) {
		fondsKontoStand = fondsKontoStand - summe;
	}

	/**
	 * Diese Methode sorgt dafür, dass der Verkaufsbetrag aufs Fonskontostand abzüglich Gebühren überwiesen wird
	 */
	public void einzahlen(double summe) {
		double realerBetrag = summe - (summe * 0.0025);
		System.out.println("Die Gebühr beträgt: " + summe * 0.0025 + " Franken");
		fondsKontoStand = fondsKontoStand + realerBetrag;

	}

	/**
	 * Diese Methode prüft, ob der Kaufbetrag den Fondskontostand übersteigt
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