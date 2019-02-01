
public class Stock {
	
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

}
