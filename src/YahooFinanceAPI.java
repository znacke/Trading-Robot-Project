import java.io.IOException;
public class YahooFinanceAPI {
	
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

	public class HelloYahoo {
		public static void main(String[] args) throws IOException {
			Stock stock = YahooFinance.get("IBM");

			BigDecimal price = stock.getQuote().getPrice();
			BigDecimal change = stock.getQuote().getChangeInPercent();
			BigDecimal peg = stock.getStats().getPeg();
			BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

			stock.print();
		}

	}

}
