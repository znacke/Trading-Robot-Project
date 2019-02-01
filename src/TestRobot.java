import java.io.IOException;

/**
 * Author: Adrian
 * Dient zum Testen des Robots
 */

public class TestRobot {
	
public static void main(String[] args) throws ClassNotFoundException, IOException {
	
	Kunde pr1 = Kundenverwaltung.laden();
	pr1.getFondskonto().getFondsKontoStand();
	Fondskonto f =  new Fondskonto ();
	Robot r = new Robot (f);
	Aktie a = new Aktie ();
	a.setWert(300);
	a.setMinSchwellenwert(50);
	a.setMaxSchwellenwert(200);
	a.setVolumen(1000);
	
	r.checkSchwellenwert(a);
}
	
}
