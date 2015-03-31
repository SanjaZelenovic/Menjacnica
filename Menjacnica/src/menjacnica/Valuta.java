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

	public void setNaziv(String naziv) throws RuntimeException {
		if ( naziv != null && naziv != "" ) this.naziv = naziv;
		else throw new RuntimeException("Naziv valute ne sme biti null, niti prazan String.");
	}


	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) throws RuntimeException {
		if ( skraceniNaziv != null && skraceniNaziv != "" ) this.skraceniNaziv = skraceniNaziv;
		else throw new RuntimeException("Skraceni naziv valute ne sme biti null, niti prazan String.");
	}


	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	
	

}
