package test;

public class Main {

	public static void main(String[] args) {
		
		Vozilo v1 = new Vozilo("Ferari", 300, 300);
		Vozilo v2 = new Vozilo("Mercedes", 250, 310);
		Vozilo v3 = new Vozilo("Bugati", 280, 260);
		
		Vozac dule = new Vozac("Dusan");
		Vozac djole = new Vozac("Djordje");
		Vozac deksa = new Vozac("Dejan");
		
		Komentator k1 = new Komentator("Vukasin");
		
		Trka t1 = new Trka("Doha", 10);
		
		// provera validacije vozaca
		v1.dodajVozaca(dule);
		v1.dodajVozaca(djole);
		
		System.out.println(v1.toString());
		
		// provera pre nego su dodata vozila
		System.out.println(t1.getBrojVozila());
		
		System.out.println(t1.maxBrojVozila);
		
		// provera nakon sto su nego su dodata vozila
		t1.dodajVozilo(v1);
		System.out.println(t1.getBrojVozila());
		
//		// provera dodavanja vozila vez vozaca
//		trka.dodajVozilo(v2);
		
//		// provera apstraktne metode
//		System.out.println(djole.pricaj());
		
		// provera komentatora
		k1.dodajTrku(t1);
		System.out.println(k1.pricaj());
	}

}
