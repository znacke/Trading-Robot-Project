public class Fondskonto {
	
	//Eigenschaften
	
	private String kontoNr; // Initialisierung
	private double kontoStand = 0;
	
	public Fondskonto (double startWert){
		this.kontoStand = startWert;
	}
	
	public void abheben (double summe) {
	kontoStand = kontoStand - summe;
	}
	
	public void einzahlen (double summe) {
		double realerBetrag = summe - (summe * 0.0025);
		System.out.println("Die Gebühr beträgt: " + summe*0.0025 + " Franken");
		kontoStand = kontoStand + realerBetrag;
		
	}
	
	//Konstruktor
	
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
	
	//Methoden
	
		
		
		
}