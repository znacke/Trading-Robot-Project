import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/*
 * Author: Bojan
 * Klasse YahooFinanceAPI, zeigt alle Daten der bestehenden SMI Aktien
 */
public class YahooFinanceAPI {

	public static void main(String[] args) throws IOException {
		Stock stock = YahooFinance.get("INTC");

		BigDecimal price = stock.getQuote().getPrice();
		BigDecimal change = stock.getQuote().getChangeInPercent();
		BigDecimal peg = stock.getStats().getPeg();
		BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

		stock.print();

		String[] symbols = new String[] { "SREN.VX", "ZURN.VX", "NVS", "SCMN.VX", "UBS", "ABB", "SLHN.VX", "CS",
				"UHR.VX", "SIKA.VX", "SGSN.VX", "RHHBY", "CFR.VX", "NSRGY", "LONN.VX", "LHN.VX", "BAER.VX", "GIVN.VX",
				"GEBN.VX", "ADEN.VX" };
		java.util.Map<String, Stock> stocks = YahooFinance.get(symbols); // single request
		Stock abb = stocks.get("ABB");
		abb.print();
		Stock ubs = stocks.get("UBS");
		ubs.print();
		Stock swisscom = stocks.get("SCMN.VX");
		swisscom.print();
		Stock novartis = stocks.get("NVS");
		novartis.print();
		Stock zurichInsurance = stocks.get("ZURN.VX");
		zurichInsurance.print();
		Stock swissRE = stocks.get("SREN.VX");
		swissRE.print();
		Stock swissLife = stocks.get("SLHN.VX");
		swissLife.print();
		Stock creditSuisse = stocks.get("CS");
		creditSuisse.print();
		Stock swatch = stocks.get("UHR.VX");
		swatch.print();
		Stock sika = stocks.get("SIKA.VX");
		sika.print();
		Stock sgs = stocks.get("SGSN.VX");
		sgs.print();
		Stock roche = stocks.get("RHHBY");
		roche.print();
		Stock richemont = stocks.get("CFR.VX");
		richemont.print();
		Stock nestle = stocks.get("NSRGY");
		nestle.print();
		Stock lonza = stocks.get("LONN.VX");
		lonza.print();
		Stock lafargeHolcim = stocks.get("LHN.VX");
		lafargeHolcim.print();
		Stock juliusBaer = stocks.get("BAER.VX");
		juliusBaer.print();
		Stock givaudan = stocks.get("GIVN.VX");
		givaudan.print();
		Stock geberit = stocks.get("GEBN.VX");
		geberit.print();
		Stock adecco = stocks.get("ADEN.VX");
		adecco.print();

	}

}
