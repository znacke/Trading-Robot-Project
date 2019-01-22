public class Fondskonto {
<<<<<<< HEAD
	
	//Eigenschaften
	
	private String kontoNr; // Initialisierung
	private double kontoStand = 0;
	
	public Fondskonto (double startWert){
		this.kontoStand = startWert;
=======

	// Eigenschaften

	private String fondsKonto; //Initialisierung
	private double fondsKontoStand = 0;

	public Fondskonto(double startWert) {
		this.fondsKontoStand = startWert;
>>>>>>> branch 'Prototyp' of https://github.com/znacke/Trading-Robot-Project
	}
<<<<<<< HEAD
	
	public void abheben (double summe) {
	kontoStand = kontoStand - summe;
=======
	/**
	 * Diese Methode sorgt dafür, dass der Kaufbetrag vom Fonskontostand abgezogen wird
	 */

	public void abheben(double summe) {
		fondsKontoStand = fondsKontoStand - summe;
>>>>>>> branch 'Prototyp' of https://github.com/znacke/Trading-Robot-Project
	}

	/**
	 * Diese Methode sorgt dafür, dass der Verkaufsbetrag aufs Fonskontostand abzüglich Gebühren überwiesen wird
	 */
	public void einzahlen(double summe) {
		double realerBetrag = summe - (summe * 0.0025);
<<<<<<< HEAD
		System.out.println("Die Gebühr beträgt: " + summe*0.0025 + " Franken");
		kontoStand = kontoStand + realerBetrag;
		
=======
		System.out.println("Die Gebühr beträgt: " + summe * 0.0025 + " Franken");
		fondsKontoStand = fondsKontoStand + realerBetrag;

>>>>>>> branch 'Prototyp' of https://github.com/znacke/Trading-Robot-Project
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
		return kontoNr;
	}

	public void setFondsKonto(String fondsKonto) {
		this.kontoNr = fondsKonto;
	}

	public double getFondsKontoStand() {
		return kontoStand;
	}

	public void setFondsKontoStand(double fondsKontoStand) {
		this.kontoStand = fondsKontoStand;
	}

	public Fondskonto() {

	}

	public Fondskonto(String fondsKonto, double fondsKontoStand) {

	}

	// Methoden

}