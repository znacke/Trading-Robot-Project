import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Kundenverwaltung {
	
	/*
	*@Author: Michael
	* Zweck der Klasse: Speichern und laden funktiuon
	* 					Kunden001.txt files erstellen zwecks spechen und weitergeben der verschiedenen Kundendaten.				
	*/
	
	// Kundendatenbank mit einem Kunde
	private static String kundenDatei = "Kunde001.txt";

	//laden von daten vom file
	public static Kunde laden() throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream(new File(kundenDatei));
		ObjectInputStream oin = new ObjectInputStream(fin);

//Read objects
		Kunde kunde = (Kunde) oin.readObject();
		oin.close();
		return kunde;
	}
	// speichern von daten ins file
	public static void speichern(Kunde kunde1) throws IOException {
	
		FileOutputStream fout = new FileOutputStream(new File(kundenDatei));
		ObjectOutputStream oout = new ObjectOutputStream(fout);

		oout.writeObject(kunde1);
		oout.close();

		// google "try-with-resources block"
		// try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
		//	oout.writeObject(kunde1);
		// }
	}

	public static void main(String[] Args) {

		/*
		 * Fond Konto < Kauf
		 * 
		 * age < 18
		 * 
		 * einlagen < 200'00
		 */

	}

}
