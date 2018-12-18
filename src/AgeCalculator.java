
public class AgeCalculator extends Kunde {

	private int day;
	private int month;
	private int year;

	public AgeCalculator(int day, int month, int year)
	   {
	      this.day = day;
	      this.month = month;
	      this.year = year;
	   }

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public String toString() {
		return year + " Years, " + month + " Months, " + day + " Days";
	}
}
