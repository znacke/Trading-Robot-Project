
public class TestRobot {
	
public static void main(String[] args) {
	
	Fondskonto f = new Fondskonto (200000);
	Robot r = new Robot (f);
	Aktie a = new Aktie ();
	a.setWert(300);
	a.setMinSchwellenwert(50);
	a.setMaxSchwellenwert(200);
	a.setVolumen(1000);
	
	r.checkSchwellenwert(a);
}
	
}
