
public class TestRobot {
	
public static void main(String[] args) {
	
	Fondskonto f = new Fondskonto (0);
	Robot r = new Robot (f);
	Aktie a = new Aktie ();
	a.setWert(30);
	a.setMinSchwellenwert(50);
	a.setMaxSchwellenwert(200);
	a.setVolumen(100);
	
	r.checkSchwellenwert(a);
}
	
}
