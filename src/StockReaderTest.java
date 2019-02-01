import java.util.ArrayList;

public class StockReaderTest {

	public static void main(String[] args) {

		StockReader reader = new StockReader();
		ArrayList<String> searchList = new ArrayList<String>();
		searchList.add("IBM");
		reader.readYahoo(searchList);

	}

}
