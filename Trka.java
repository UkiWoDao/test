package test;

public class Trka {
	
	private String naziv;
	private int brojVozila = 0;
	public int maxBrojVozila;
	private Vozilo vozila[];
		
	public Trka(String naziv, int maxBrojVozila) {
		this.naziv = naziv;
		this.maxBrojVozila = maxBrojVozila;
		this.vozila = new Vozilo[this.maxBrojVozila];
	}
	
	public void dodajVozilo(Vozilo vozilo) {
		if(vozilo.imaVozac() == false) {
			System.out.println("Vozilo nema vozaca");
			return;
		}
		for(int i = 0; i < vozila.length; i++) {
			if(vozila[i] == null) {
				vozila[i] = vozilo;
				brojVozila++;
				return;
			}
		} System.out.println("Nema slobodnog mesta");
	}
	
	public int getBrojVozila() {
		return this.brojVozila;
	}
	
	public Vozilo getPobednik() {
		int maxBrzina = vozila[0].getMaxBrzina();
		Vozilo pobednik = null;
		for(int i = 1; i < vozila.length; i++) {
			if(vozila[i] != null) {
				if(vozila[i].getMaxBrzina() > maxBrzina) {
					maxBrzina = vozila[i].getMaxBrzina();
				}
			}
		}
		
		for(int i = 0; i < vozila.length; i++) {
			if(vozila[i].getMaxBrzina() == maxBrzina) {
				pobednik = vozila[i];
			}
		}
		return pobednik;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "[" + this.naziv + "](" + this.getBrojVozila() + "/" + this.maxBrojVozila + ")";
		s += "\n" + this.getPobednik().toString();
		for(int i = 0; i < vozila.length; i++) {
			if(vozila[i] != null) {
				s += vozila[i].toString() + "\n";
			}
		}
		return s;
	}
}
