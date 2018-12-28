
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class ExeptionKunde {

	    public static void main(String[] args) {
	        Object[] options1 = { "True", "False" };

	        JPanel panel = new JPanel();
	        panel.add(new JLabel("Bonität das Kunden: "));
	        JTextField textField = new JTextField(10);
	        panel.add(textField);

	        int result = JOptionPane.showOptionDialog(null, panel, "Enter a Number",
	                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
	                null, options1, null);
	        if (result == JOptionPane.YES_OPTION){
	            JOptionPane.showMessageDialog(null, textField.getText());
	        }
	    }
	}


 /* public static void main(String[] a) {
    JFrame frame = new JFrame();
    Object result = JOptionPane.showInputDialog(frame, "Bonität: True/False: ");

    System.out.println(result);
    	
    if (result = boolean) {
    	this.infoBox("True, Bonität des Kunden ist gut");
    	
    }
    	
  } */
	