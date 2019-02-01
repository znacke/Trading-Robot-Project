import java.util.ArrayList;

public class StockList {
	private ArrayList<Stock> stocklist;
	public StockList() {
		stocklist = new ArrayList<Stock>();
		stocklist.add(new Stock("ABBN", "Asea Brown Boveri", 95.55, 90.20, 100.50, 6000));
		stocklist.add(new Stock("UBSN", "Union de Banques Suisse", 12.50, 15.00, 13.00, 2000));
		stocklist.add(new Stock("SREN", "SwissRe", 95.55, 101.50, 100.00, 5500));
		stocklist.add(new Stock("ABBN", "Asea Brown Boveri", 19.50, 17.30, 18.80, 6000));
		stocklist.add(new Stock("ADEN", "Adecco", 50.50,  48.30, 50.26, 10000));
		// TODO Auto-generated constructor stub
		
	}
	public ArrayList<Stock> getStocks() {
	      return stocklist;
	   }

}
