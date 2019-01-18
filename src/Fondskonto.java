public class Fondskonto {
	
	//Eigenschaften
	
	private String fondsKonto; // Initialisierung
	private double fondsKontoStand = 200000;
	
	public void abheben (double summe) {
	fondsKontoStand = fondsKontoStand - summe;
	}
	
	public void einzahlen (double summe) {
		double realerBetrag = summe - (summe * 0.0025);
		System.out.println("Die Gebühr beträgt: " + summe*0.0025 + " Franken");
		fondsKontoStand = fondsKontoStand + realerBetrag;
		
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