
public class Aktie {

	// max wird fuer Verkauf genutzt
	// min wird fuer Kauf genutzt
	// volumenk ist das Volumen für den Kauf
	// volumenv ist das Volumen für den Verkauf
	// ES FEHLT DIE METHODE CHECKSCHWELLENWERT

	private String name = "name";
	private double wert = 100.58;
	private double maxSchwellenwert = 150.33;
	private double minSchwellenwert = 80.05;
	private int volumen = 2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWert() {
		return wert;
	}

	public void setWert(double wert) {
		this.wert = wert;
	}

	public double getMaxSchwellenwert() {
		return maxSchwellenwert;
	}

	public void setMaxSchwellenwert(double maxSchwellenwert) {
		this.maxSchwellenwert = maxSchwellenwert;
	}

	public double getMinSchwellenwert() {
		return minSchwellenwert;
	}

	public void setMinSchwellenwert(double minSchwellenwert) {
		this.minSchwellenwert = minSchwellenwert;
	}

	public int getVolumenk() {
		return volumenk;
	}

	public void setVolumenk(int volumenk) {
		this.volumenk = volumenk;
	}

	public int getVolumenv() {
		return volumenv;
	}

	public void setVolumenv(int volumenv) {
		this.volumenv = volumenv;
	}

}