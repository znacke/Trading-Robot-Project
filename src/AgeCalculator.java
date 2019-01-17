
public class AgeCalculator {

//Alterscheck des Kunden: Kunde => 18 Jahre

	public static void main(String[] args) {
		
		Alter alter = new Alter(1992,12,28);
		
		System.out.println(alter.checkAge18());

	}

}