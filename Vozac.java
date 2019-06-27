package test;

public class Vozac extends Covek{
	
	private String tekst = "VOZI MISKO!";
		
	public Vozac(String ime) {
		super(ime);
	}

	public String pricaj() {
		return this.tekst;
	}
}
