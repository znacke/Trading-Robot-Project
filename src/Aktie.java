
public class Aktie {

	// min wird fuer Kauf genutzt

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

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}


}