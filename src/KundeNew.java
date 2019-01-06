import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class KundeNew {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		if (args.length < 7)
			throw new RuntimeException("Insufficient Arguments");
		String mode = args[0];
		if (mode.compareTo("Kundeerstellung") == 0) {
			String kunde = args[1];
			final Properties props = new Properties();
			props.load(new FileInputStream(kunde));
			String vorname = props.getProperty("Vorname");
			String nachname = props.getProperty("Nachname");
			String strasse = props.getProperty("Strasse");
			int hausnummer = props.getProperty("Hausnummer");
			String telefon = props.getProperty("Telefon");
			String email = props.getProperty("EMail");
			String privatkontonr = props.getProperty("Privatkontonummer");

			double kontostand = Double.parseDouble(props.getProperty("Kontostand"));
			System.out.println("Kunde: " + vorname + " " + nachname);
			System.out.println("Wonwort: " + strasse + ", " + hausnummer);
			System.out.println("Kontaktinformationen: " + "Telefon: " + telefon + ", " + "E-Mail: " + email);
			System.out.println("Privatkonto Nr: " + privatkontonr);
		} 
		else if (mode.comareTo("handeln") == 0) {

		}

	}

}
