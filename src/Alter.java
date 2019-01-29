import java.time.LocalDate;
import java.time.Period;

public class Alter {
	/*
	 * Author: Michael 
	 * Klasse zum pruefen des alters des kunden Alterscheck des
	 * Kunden: Kunde => 18 Jahre. Alter wird auf Tag genau gerechnet.
	 */
	int jahr;
	int monat;
	int tag;
	static LocalDate geburtsdatum;

	public static LocalDate getLocalDate() {
		return LocalDate.now();
	}

// iniziert jahr monat und tag in eins
	Alter(int jahr, int monat, int tag) {
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
		geburtsdatum = LocalDate.of(jahr, monat, tag);
	}

// alterscheck ob kunde 18+ oder nicht
	public boolean checkAge18() {
		if (Period.between(geburtsdatum, getLocalDate()).getYears() >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
