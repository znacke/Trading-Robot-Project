import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgeCalculator {

//Alterscheck des Kunden: Kunde => 18 Jahre. Alter wird auf Tag genau gerechnet

	public static void main(String[] args) {

		JPanel panel = new JPanel();
		panel.add(new JLabel("Bonität das Kunden: "));
		JTextField textField = new JTextField(10);
		panel.add(textField);

//Alter input here	        
		Alter alter = new Alter(1992, 12, 28);

		System.out.println(alter.checkAge18());

	}

}