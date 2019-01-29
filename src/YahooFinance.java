import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;


public class YahooFinance {
	
	public static void main(String[] args) throws IOException {
		Stock stock = YahooFinance.get("IBM");

		BigDecimal price = stock.getQuote().getPrice();
		BigDecimal change = stock.getQuote().getChangeInPercent();
		BigDecimal peg = stock.getStats().getPeg();
		BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

		stock.print();
	}

}
