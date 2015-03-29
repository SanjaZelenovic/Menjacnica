package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {

private GregorianCalendar datum;
	
	private double prodajniK;
	
	private double kupovniK;
	
	private double srednjiK;
	
	public Kurs( double prodajni, double kupovni, GregorianCalendar d) {
		prodajniK = prodajni;
		kupovniK = kupovni;
		srednjiK = (prodajni+kupovni)/2.0;
		datum = d;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public double getProdajniK() {
		return prodajniK;
	}

	public void setProdajniK(double prodajniK) {
		this.prodajniK = prodajniK;
		srednjiK = (prodajniK+kupovniK)/2.0;
	}

	public double getKupovniK() {
		return kupovniK;
	}

	public void setKupovniK(double kupovniK) {
		this.kupovniK = kupovniK;
		srednjiK = (prodajniK+kupovniK)/2.0;
	}

	public double getSrednjiK() {
		return srednjiK;
	}


}
