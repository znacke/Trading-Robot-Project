import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Voraussetzungen {

	/*
	 * Author: Michael Klasse - Optionen JOptionsPane zum püfen der Bonität und
	 * Einlage des Kunden. Beide Optionen sollen true ausgeben und eine Einlage des
	 * Kunden angeben.
	 */

	public static String s;
	public static boolean result;

	
	public static double getKontoStand() {
		return kontoStand;
	}

	public static double kontoStand = 0;
	public static String fondsKonto;

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Object[] options1 = { "True", "False" };
		Object[] options2 = { "Ok" };

// JOptionsPane 1 - Bonität des Kunden Optionpanel
		JPanel panel = new JPanel();
		panel.add(new JLabel("Bonität das Kunden: "));

		int result = JOptionPane.showOptionDialog(null, panel, "Enter a Number", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options1, null);

// if true = success message
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Der Kunde hat genügend Finanzielle Mittel!");

// if false = error message			
		} else {
			JOptionPane.showMessageDialog(null, "Der Kunde hat NICHT genügend Finanzielle Mittel!");
			System.out.println("---FEHLER---");
			System.out.println("Der Kunde hat NICHT genügend Finanzielle Mittel!");
		}
//JOptionsPane 2 - Einlage des Kunden Optionspanel
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("Einzahlung des Kunden ist über 200'000CHF und beträgt: "));

		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		JTextField textField2 = new JFormattedTextField(decimalFormat);
		textField2.setColumns(15);
		panel2.add(textField2);

		int result2 = JOptionPane.showOptionDialog(null, panel2, "Enter a Number", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options2, null);

// if true = success message
		if (result2 == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Eingezahlt in das Kundenkonto sind: " + textField2.getText());
			s = textField2.getText();
			kontoStand = Double.parseDouble(s);

//check if Konoteinzahlung = oder > also 200'000
			if (kontoStand >= 200000) {
				System.out.println("Auf dem Kundenkonto ist: " + kontoStand + " CHF");
				Kunde pr1 = Kundenverwaltung.laden();
				pr1.getFondskonto().setFondsKontoStand(kontoStand);
				Kundenverwaltung.speichern(pr1);
			}
// if false = error message			
			else {
				System.out.println("---FEHLER---");
				System.out.println("Auf dem Kundenkonto ist weniger als 200'000.- CHF.");
				System.out.println("Minimumbetrag auf dem Konto ist nicht erreicht!");
			}

		}

	}
}