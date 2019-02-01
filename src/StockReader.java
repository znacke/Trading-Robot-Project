import java.util.ArrayList;

public class StockReader {

		/*
		 * Author: Bojan Array Liste für Aktien erstellen
		 */

		// ArrayListe
		private ArrayList<String> stockListe = new ArrayList<String>();

		public ArrayList<String> getStockListe() {
			return stockListe;
		}

	 public ArrayList<String> readYahoo(ArrayList <String> searchList) {
		 YahooFinanceAPI y = new YahooFinanceAPI(searchList);				 
		 return stockListe;
		 
	 }
}

		



	}

