package Kadry;

public class Kadry extends Pracownik {

	private Pracownik[] pracownicy_; 

	private int zatrudnienie = 1;

	
	public Kadry(String i, String n, double p, char s, int d) {	
		super(i,n,p,s,d);
		pracownicy_[] = new Pracownik[34];
		}
	
	public void dodajPracownika(String i, String n, double p, char s, int d) {
		if (this.zatrudnienie<=99) {
			this.pracownicy[zatrudnienie] = new Pracownik (i,n,p,s,d);
			(this.zatrudnienie)++;
		}else {
				System.out.println("Niestety nie mozemy cie juz zatrudnic. Idz do PUPu");
		}
	}

	public static void main(String[] args) {
		
		Pracownik pracownik1 = new Pracownik("Jan", "Nowak", 23.00, 'M', 45);
		pracownik1.czyPracujeWDziale(45);
		
		
		
	}
	
}
