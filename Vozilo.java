package test;

public class Vozilo {
	
	private String naziv;
	private int maxBrzina;
	private int maxGorivo;
	private int trenGorivo;
	public Vozac vozac;
	
	public Vozilo(String naziv, int maxBrzina, int maxGorivo) {
		this.naziv = naziv;
		this.maxBrzina = maxBrzina;
		this.maxGorivo = maxGorivo;
		this.trenGorivo = 0;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getMaxBrzina() {
		return maxBrzina;
	}

	public int getMaxGorivo() {
		return maxGorivo;
	}

	public int getTrenGorivo() {
		return trenGorivo;
	}
	
	public int sipajGorivo(int gorivo) {
		if(gorivo <= 0) {
			System.out.println("Ne mogu da dodam manje od nule");
			return 0;
		} else {
			if(trenGorivo + gorivo <= maxGorivo) {
				trenGorivo += gorivo;
				return gorivo;
			} else {
				System.out.println("Ne moze toliko da stane");
				return maxGorivo - trenGorivo;
			}
		}
	}
	
	public int izvadiGorivo(int gorivo) {
		int n = Math.abs(gorivo);
		if(gorivo != 0) {
			if(trenGorivo - n >= 0) {
				trenGorivo -= n;
				return n;
			} else {
				int a = trenGorivo;
				trenGorivo = 0;
				return a;
			}
		} else {
			System.out.println("Ne mogu da izvadim nula gorina");
			return 0;
		}
	}
	
	public void dodajVozaca(Vozac vozac) {
		if(this.vozac == null) {
			this.vozac = vozac;
		} else {
			System.out.println("Vec ima vozac");
		}
	}
	
	public void ukloniVozaca() {
		this.vozac = null;
	}
	
	public boolean imaVozac() {
		if(this.vozac != null) {
			return true;
		} else return false;
	}
	
	@Override
	public String toString() {
		String vozac = "";
		if(this.vozac != null) {
			vozac = this.vozac.toString();
		}
		return "[" + this.getNaziv() + "](" + this.getMaxBrzina() + "km/h){"
				+ this.getTrenGorivo() + "/" + this.getMaxGorivo() + "}Litara"
				+ "\n" + vozac;
	}
	
}
