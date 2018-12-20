
public class Aktie {

	// max wird fuer Verkauf genutzt
	// min wird fuer Kauf genutzt
	// volumenk ist das Volumen für den Kauf
	// volumenv ist das Volumen für den Verkauf
	// ES FEHLT DIE METHODE CHECKSCHWELLENWERT

	String name = "name";

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

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
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

	double wert = 100.58;
	double max = 150.33;
	double min = 80.05;
	int volumenk = 2;
	int volumenv = 2;

}
