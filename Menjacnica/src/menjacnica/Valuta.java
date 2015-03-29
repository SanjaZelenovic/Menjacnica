package menjacnica;

import java.util.LinkedList;

public class Valuta {

	private String naziv;
	
	private String skraceniNaziv;
	
	public  LinkedList <Kurs> kursevi;
	
	Valuta ( String naziv, String skraceniNaziv) {
		
		this.naziv = naziv;
		this.skraceniNaziv = skraceniNaziv;
		kursevi = new LinkedList<Kurs>();
	
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	
	

}
