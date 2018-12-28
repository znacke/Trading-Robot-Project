import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExeptionKunde {

  public static void main(String[] a) {
    JFrame frame = new JFrame();
    Object result = JOptionPane.showInputDialog(frame, "Bonität: True/False: ");

    System.out.println(result);
    	
    if (result = boolean) {
    	this.infoBox("True, Bonität des Kunden ist gut");
    	
    }
    	
  }

}