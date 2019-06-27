package test;

public class Komentator extends Covek{
	
	private Trka trka = null;
	
	public Komentator(String ime) {
		super(ime);
	}

	@Override
	public String pricaj() {
		return trka.toString();
	}
	
	public void dodajTrku(Trka trka) {
		if(this.trka == null) {
			this.trka = trka;
		} else {
			System.out.println("Vec postoji trka");
		}
	}
	
	public void ukloniTrku() {
		this.trka = null;
	}
	
}
