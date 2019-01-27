import java.io.IOException;

public class TestRobot {
	
public static void main(String[] args) throws ClassNotFoundException, IOException {
	
	Kunde pr1 = Kundenverwaltung.laden();
	Fondskonto f = pr1.getFondskonto();
	Robot r = new Robot (f);
	Aktie a = new Aktie ();
	a.setWert(300);
	a.setMinSchwellenwert(50);
	a.setMaxSchwellenwert(200);
	a.setVolumen(1000);
	
	r.checkSchwellenwert(a);
}
	
}
