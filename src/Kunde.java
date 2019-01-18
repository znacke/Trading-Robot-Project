import java.time.LocalDate;

public class Kunde {

	// Eigenschaften

	private String vorname;
	private String nachname;
	private String strasse;
	private int hausnummer;
	private String privatKontoNr;
	private String email;
	private String telefon;

	private boolean bonitaet;
	private boolean einlage;
	private int alter; // abgeändert wegen getter und setter

	// Konstruktoren

	public Kunde() {

	}

	public Kunde(String vorname, String nachname, String strasse, int hausnummer, String privatKontoNr, String email,
			String telefon, boolean bonitaet, boolean einlage, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.privatKontoNr = privatKontoNr;
		this.email = email;
		this.telefon = telefon;
		this.bonitaet = bonitaet;
		this.einlage = einlage;
		this.alter = alter;

	}

//	public String getVorname() {
//		System.out.println("Der Vorname des Kunden ist: " + vorname);
//		return vorname;
	}

//	public void setVorname(String vorname) {
//		this.vorname = vorname;
//		this.nachname = nachname;
//		this.strasse = strasse;
//		this.hausnummer = hausnummer;
//		this.privatKontoNr = privatKontoNr;
//		this.email = email;
//		this.telefon = telefon;
//		this.bonitaet = bonitaet;
//		this.einlage = einlage;
//		this.alter = alter;

	

//		this.setVorname(vorname);
//		this.setNachname(nachname);
//		this.setStrasse(strasse);
//		this.setHausnummer(hausnummer);
//		this.setPrivatKontoNr(privatKontoNr);
//		this.setemail(email);
//		this.setTelefon(telefon);
//		this.setBonitaet(bonitaet);
//		this.setEinlage(einlage);
//		this.setAlter(alter);
//	}
//
//	public String getVorname() {
//		System.out.println("Der Vorname des Kunden ist: " + vorname);
//		return vorname;
//	}
//
//	public void setVorname(String vorname) {
//		this.vorname = vorname;
//	}
//
//	public String getNachname() {
//		System.out.println("Der Nachname des Kunden ist: " + nachname);
//		return nachname;
//	}
//
//	public void setNachname(String nachname) {
//		this.nachname = nachname;
//	}
//
//	public String getStrasse() {
//		System.out.println("Die Strasse des Kunden ist: " + strasse);
//		return strasse;
//	}
//
//	public void setStrasse(String strasse) {
//		this.strasse = strasse;
//	}
//
//	public int getHausnummer() {
//		System.out.println("Die Hausnummer des Kunden ist: " + hausnummer);
//		return hausnummer;
//	}
//
//	public void setHausnummer(int hausnummer) {
//		this.hausnummer = hausnummer;
//	}
//
//	public String getPrivatKontoNr() {
//		System.out.println("Die Kontonummer des Kunden ist: " + privatKontoNr);
//		return privatKontoNr;
//	}
//
//	public void setPrivatKontoNr(String privatKontoNr) {
//		this.privatKontoNr = privatKontoNr;
//	}
//
//	public String getemail() {
//		System.out.println("Die E-mail des Kunden ist: " + email);
//		return email;
//	}
//
//	public void setemail(String email) {
//		this.email = email;
//	}
//
//	public String getTelefon() {
//		System.out.println("Die Telefonnummer des Kunden ist: " + telefon);
//		return telefon;
//	}
//
//	public void setTelefon(String telefon) {
//		this.telefon = telefon;
//	}
//
//	public boolean isBonitaet() {
//		System.out.println("Die Bonität entspricht unseren Anforderungen");
//		return bonitaet;
//	}
//
//	public void setBonitaet(boolean bonitaet) {
//		this.bonitaet = bonitaet;
//	}
//
//	public boolean isEinlage() {
//		System.out.println("Die Einlage entspricht unseren Anforderungen");
//		return einlage;
//	}
//
//	public void setEinlage(boolean einlage) {
//		this.einlage = einlage;
//	}
//
//	public int getAlter() {
//		System.out.println("Das Alter des Kunden beträgt: " + alter);
//		return alter;
//	}
//
//	public void setAlter(int alter) {
//		this.alter = alter;
//	}
//	
//	
//
//	
//
//	}
//	
//	
//	
//	
//	
//	
//
//
