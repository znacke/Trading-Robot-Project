
public class TestRobot {
	
public static void main(String[] args) {
	
	Fondskonto f = new Fondskonto ();
	Robot r = new Robot (f);
	Aktie a = new Aktie ();
	a.setWert(40);
	a.setMinSchwellenwert(50);
	a.setMaxSchwellenwert(150);
	a.setVolumen(2);
	
	r.checkSchwellenwert(a);
}
	
}
