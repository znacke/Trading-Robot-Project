import java.io.Serializable;

public class Fondskonto implements Serializable{

	private String kontoNr; 
	private double kontoStand;
	private double openingDate;
	
	/*
	 * Author: Adrian
	 * Konstruktor Fondskonto
	 */
	public Fondskonto (double startWert){
		this.kontoStand = startWert;
	}
	/**
	 * Author: Adrian
	 * Diese Methode sorgt daf�r, dass der Kaufbetrag vom Fonskontostand abgezogen wird
	 */

	public void abheben(double summe) {
		kontoStand = kontoStand - summe;
	}

	/**
	 * Author: Adrian
	 * Diese Methode sorgt daf�r, dass der Verkaufsbetrag aufs Fonskontostand abz�glich Geb�hren �berwiesen wird
	 */
	public void einzahlen(double summe) {
		double realerBetrag = summe - (summe * 0.0025);

		System.out.println("Die Geb�hr betr�gt: " + summe*0.0025 + " Franken");
		kontoStand = kontoStand + realerBetrag;

	}

	/**
	 * Author: Adrian
	 * Diese Methode pr�ft, ob der Kaufbetrag den Fondskontostand �bersteigt
	 */
	public boolean checkAmmount(double summe) {
		if (kontoStand < summe) {
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

	//to do: constructor
	public Fondskonto(String fondsKonto, double fondsKontoStand) {

	}


}