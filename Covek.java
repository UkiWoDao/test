package test;

public abstract class Covek {
	
	public static int globalId = 1;
	private String ime;
	private int id;
	
	public Covek(String ime) {
		this.ime = ime;
		this.id = globalId++;
	}
	
	public abstract String pricaj();
	
	public String toString() {
		return "[" + this.id + "]" + this.ime + ">{" + this.pricaj() + "}"; 
	}
}
