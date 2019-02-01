import java.util.ArrayList;

public class StockArrayList {

	public static void main(String[] args) {
		
		/* Author: Bojan
		 * Array Liste für Aktien erstellen
		 */
		
		
		//ArrayListe
		ArrayList stock = new ArrayList<>();
		ArrayList <String> namensListe = new ArrayList<String>();
		
		
		//Daten
		stock.add("Wasser");
		stock.add("Brot");
		//stock.add(new Integer(4));
		
		namensListe.add("Hans");
		namensListe.add("Peter"); 
		
		//Datenausgabe
		for(int i = 0; i<namensListe.size(); i++) {
			namensListe.get(i);
			System.out.println("Name: " + namensListe.get(i));
		}
		
		for(String string : namensListe) {
			System.out.println("Die Länge des Namens ist: " + string.length() );
		}
			

	}

}
