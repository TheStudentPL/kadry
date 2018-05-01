package Kadry;


public class Pracownik {

	private String imie;
	private String nazwisko;
	private double placa;
	private char plec;
	private int dzial;
	
	public Pracownik (String i, String n, double p, char s, int d) {		
		this.imie = i;
		this.nazwisko = n;
		this.placa = p;
		this.plec = s;
		this.dzial = d;
	}

	public String toString() {
		return "imie: "+ this.imie + " nazwisko: "+ this.nazwisko + " placa: "+ this.placa + " plec: "+ this.plec + " dzial: " + this.dzial;
	}
	
	public double zwrocPlace() {
		return this.placa;
	}
	
	public boolean czyPracujeWDziale(int a) {
		if (this.dzial == a) {
			return true;
		} else {
			return false;
		}
	}	
}
