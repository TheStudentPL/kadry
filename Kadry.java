package Kadry;
import java.io.File;
<<<<<<< HEAD
//import java.io.FileNotFoundException;
=======
import java.io.FileNotFoundException;
>>>>>>> master
import java.util.Scanner;

public class Kadry {

	private Pracownik[] pracownicy_;
	private int zatrudnienie = 0;
	
	public Kadry() {	
		this.pracownicy_ = new Pracownik[100]; 
		}
	
	public void dodajPracownika(Pracownik p) {
		if (this.zatrudnienie<=100) {
			this.pracownicy_[zatrudnienie] = p;
			(this.zatrudnienie)++;
		}else {
				System.out.println("Niestety nie mozemy cie juz zatrudnic. Idz do PUPu");
		}
	}

	public void dodajPracownikainteraktywnie() {
		
		
	}
	public void importujZplikuTekstowego() {
		File plik = new File("plik.txt"); 
		Scanner odczyt = new Scanner(plik);
		odczyt.close();
		
	}
	
	public double sredniZarobek() {
		return 1.0;
	}
	
	public double sredniZarobek(int d) {
		return 1.0;
	}
	
	public static void main(String[] args) {
		
		Kadry k = new Kadry();
		Pracownik p1 = new Pracownik("Jan", "Nowak", 2300.00, 'M', 45);
		k.dodajPracownika(p1);
		System.out.println(p1.toString());
		/*for(Pracownik x:pracownicy_) {
			System.out.println(x);
		}*/

		
	}
	
}
