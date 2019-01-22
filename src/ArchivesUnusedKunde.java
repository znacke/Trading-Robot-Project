import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ArchivesUnusedKunde {

	/*
	 * Author: Michael 
	 * Alternative klasse zum kundenanlegen
	 * Im Moment wird diese Klasse nicht eingesetzt
	 */
	
/*	public static void main(String[] args) throws FileNotFoundException, IOException {

		if (args.length < 8)
			throw new RuntimeException("Insufficient input");
		String mode = args[0];
		if (mode.compareTo("Kundeerstellung") == 0) {
			String kunde = args[1];
			final Properties props = new Properties();
			props.load(new FileInputStream(kunde));
			String vorname = props.getProperty("Vorname");
			String nachname = props.getProperty("Nachname");
			String strasse = props.getProperty("Strasse");
			String hausnummer = props.getProperty("Hausnummer");
			String telefon = props.getProperty("Telefon");
			String email = props.getProperty("EMail");
			String privatkontonr = props.getProperty("Privatkontonummer");


			System.out.println("Kunde: " + vorname + " " + nachname);
			System.out.println("Wonwort: " + strasse + ", " + hausnummer);
			System.out.println("Kontaktinformationen: " + "Telefon: " + telefon + ", " + "E-Mail: " + email);
			System.out.println("Privatkonto Nr: " + privatkontonr);
			
//			double kontostand = Double.parseDouble(props.getProperty("Kontostand"));
//			String ueberprueft = props.getProperty("ueberprueft");
			
//			System.out.println("Kunde wurde vom Mitarbeiter überprüft: " + ueberprueft);
			
		} 
		else if (mode.compareTo("handeln") == 0) {

		}

	} */

}
