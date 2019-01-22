import java.io.Serializable;

public class Fondskonto implements Serializable{

	private String kontoNr; 
	private double kontoStand = 0;
	
	public Fondskonto (double startWert){
		this.kontoStand = startWert;
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

		System.out.println("Die Gebühr beträgt: " + summe*0.0025 + " Franken");
		kontoStand = kontoStand + realerBetrag;

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


}