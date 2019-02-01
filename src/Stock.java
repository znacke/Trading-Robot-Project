
public class Stock {
<<<<<<< HEAD
	
	//Eigenschaften
	
	private String name;
	private String code;
	private String preis;
	private String 

	
	
	//Konstruktor
	
	public Stock() {
		
	}
	
		public Stock(String name, String strasse, String stadt) {
		super();
		this.name = name;
		this.code = strasse;
		this.preis = stadt;
	}



	//Methoden
	public String getStadt() {
		return preis;
	}
	public void setStadt(String stadt) {
		this.preis = stadt;
	}
	public String getStrasse() {
		return code;
	}
	public void setStrasse(String strasse) {
		this.code = strasse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

=======
	public Stock(String code, String name, double high, double low, double close, int volume) {
		super();
		this.code = code;
		this.name = name;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
	}
	private String code;
	private String name;
	private double high;
	private double low;
	private double close;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getChangeP() {
		return changeP;
	}
	public void setChangeP(double changeP) {
		this.changeP = changeP;
	}
	private int volume;
	private double change;
	private double changeP;
	
>>>>>>> branch 'Prototyp' of https://github.com/znacke/Trading-Robot-Project
}
