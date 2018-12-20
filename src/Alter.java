import java.time.LocalDate;
import java.time.Period;

public class Alter {

	int jahr;
	int monat;
	int tag;
	LocalDate geburtsdatum;

	public static LocalDate getLocalDate() {
		return LocalDate.now();

	}

	Alter(int jahr, int monat, int tag) {
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
		geburtsdatum = LocalDate.of(jahr, monat, tag);

	}

	public boolean checkAge18() {
		if (Period.between(geburtsdatum, getLocalDate()).getYears() > 18) {
			return true;
		} else {
			return false;
		}
	}
}
