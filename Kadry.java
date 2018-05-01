package Kadry;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kadry {
	int zatrudnienie=0;
	Pracownik[] pracownicy_;
	double suma = 0.0;
	
	public Kadry() {
		this.pracownicy_ = new Pracownik[this.zatrudnienie+1];
		}
	
	public void dodajPracownika(Pracownik p) {
		if (zatrudnienie<=100) {
			pracownicy_[zatrudnienie] = p;
			this.zatrudnienie++;
		}else {
				System.out.println("Niestety nie mozemy cie juz zatrudnic. Idz do PUPu");
		}
		System.out.println("Obecny stan zatrudnienia: " + zatrudnienie);
		for (Pracownik e : pracownicy_) {
			System.out.println(e.toString());
		}
	}

	public void dodajPracownikainteraktywnie() {
		//String i,n,p,s,d;
			System.out.println("Podaj imie: ");
			Scanner i = new Scanner(System.in);
			String imie = i.nextLine();
			System.out.println("Podaj nazwisko: ");
			Scanner n = new Scanner(System.in);
			String nazwisko = n.nextLine();
			System.out.println("Podaj Place: ");
			Scanner p = new Scanner(System.in);
			double placa = p.nextDouble();
			System.out.println("Podaj plec: ");
			Scanner pl = new Scanner(System.in);
			char c = pl.next().charAt(0);
			System.out.println("Podaj dzial: ");
			Scanner d = new Scanner(System.in);
			int dzial = d.nextInt();
			Pracownik prac = new Pracownik(imie,nazwisko,placa,c,dzial);
			pracownicy_[zatrudnienie] = prac;
			n.close();
			i.close();
			pl.close();
			d.close();
			p.close();		
			System.out.println("Obecny stan zatrudnienia: " + zatrudnienie);
			for (Pracownik e : pracownicy_) {
				System.out.println(e.toString());
				}
			}
	public void importujZplikuTekstowego() {
		File plik = new File("plik.txt"); 
		Scanner odczyt = new Scanner(plik);
		odczyt.close();
		
	}
	
	public void sredniZarobek() {
		for (Pracownik e : pracownicy_) {
			this.suma = this.suma+e.zwrocPlace();
		}
	System.out.println("Srednia placa wynosi: "+ this.suma);
	}
	
	public double sredniZarobek(int d) {
		return 1.0;
	}
	
	

	public static void main(String[] args) {
		
		Kadry k = new Kadry();
		Pracownik p1 = new Pracownik("Jan", "Nowak", 2300.00, 'M', 45);
		k.dodajPracownika(p1);
		Kadry k1 = new Kadry();
		k1.dodajPracownikainteraktywnie();
		
		
		Kadry k2 = new Kadry();
		Pracownik p2 = new Pracownik("Jan", "Nowak", 2300.00, 'M', 45);
		k2.dodajPracownika(p2);
		
		//System.out.println(p1.toString());
		//System.out.println(k.sredni);
		
		//System.out.println(k.sredniZarobek());
		k.sredniZarobek();
		
	}
		
}

