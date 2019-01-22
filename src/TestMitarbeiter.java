import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMitarbeiter {

	public static void main(String[] args) {

//			Kunde peter = new Kunde("Peter", "Muster", "Lorenweg", 27, "123-456", "peter.muster@hotmail.com",
//					"078 704 51 89", true, true, 20);
//			Kunde hans = new Kunde("Hans", "Muster", "Musterstrasse1", 10, "132-654", "hans.muster@hotmail.com",
//					"0781234567", true, true, 26);¨

			Mitarbeiter michael = new Mitarbeiter();
			Kunde kunde1 = michael.erstelleKunde("Bojan", "Eric", "Musterstrasse", 123, "abc-123", "bojan.eric@gmx.ch", "0765858585", true, false);
			Fondskonto fkonto1 = michael.erstelleFondsKonto("1234-5678", 234000.55);
			kunde1.setFondskonto(fkonto1);
			

			try {
				FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
				ObjectOutputStream o = new ObjectOutputStream(f);

				// Write objects to file
				o.writeObject(kunde1);

				o.close();
				f.close();

				FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
				ObjectInputStream oi = new ObjectInputStream(fi);

				// Read objects
				Kunde pr1 = (Kunde) oi.readObject();

				System.out.println("this is the output" +pr1.toString());

				oi.close();
				fi.close();

			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error initializing stream");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
	}
