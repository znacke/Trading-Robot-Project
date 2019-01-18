public class Fondskonto {
	
	//Eigenschaften
	
	private String fondsKonto; // Initialisierung
	private double fondsKontoStand = 200000;
	
	public void abheben (double summe) {
	fondsKontoStand = fondsKontoStand - summe;
	}
	
	public void einzahlen (double summe) {
		fondsKontoStand = fondsKontoStand + summe;
	}
	
	//Konstruktor
	
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
	
	//Methoden
	
		
		
		
}