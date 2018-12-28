
public class AgeCalculator {
	
	// test klasse zum altercheck des kunden. wird am ende ersetzt und/oder in der kundenklasse eingesetzt
	
	public static void main(String[] args) {
		
		Alter alter = new Alter(2000,12,28);
		System.out.println(alter.checkAge18());
		
	}
	
}