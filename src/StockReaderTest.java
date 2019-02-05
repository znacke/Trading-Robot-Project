import java.util.ArrayList;

public class StockReaderTest {
	
	/* 
	 * Author: Bojan
	 * Zweck: Liste mit SMI Aktien wird erstellt.
	 */

	public static void main(String[] args) {

		StockReader reader = new StockReader();
		ArrayList<String> searchList = new ArrayList<String>();
		searchList.add("UBS");
		searchList.add("ABB");
		searchList.add("SCMN.VX");
		searchList.add("NVS");
		searchList.add("ZURN.VX");
		searchList.add("SREN.VX");
		searchList.add("SLHN.VX");
		searchList.add("CS");
		searchList.add("UHR.VX");
		searchList.add("SIKA.VX");
		searchList.add("SGSN.VX");
		searchList.add("RHHBY");
		searchList.add("CFR.VX");
		searchList.add("NSRGY");
		searchList.add("LONN.VX");
		searchList.add("BAER.VX");
		searchList.add("GIVN.VX");
		searchList.add("GEBN.VX");
		searchList.add("ADEN.VX");
		reader.readYahoo(searchList);

	}

}
