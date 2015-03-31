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

	public void setDatum(GregorianCalendar datum) throws RuntimeException {
		if ( datum != null ) this.datum = datum;
		else throw new RuntimeException("Datum ne sme biti null.");
	}


	public double getProdajniK() {
		return prodajniK;
	}

	public void setProdajniK(double prodajniK) throws RuntimeException {
		if (prodajniK > 0 ) {
			this.prodajniK = prodajniK;
			srednjiK = (prodajniK+kupovniK)/2.0;
		} else throw new RuntimeException("Prodajni kurs ne sme imati negativnu vrednost.");
	}


	public double getKupovniK() {
		return kupovniK;
	}

	public void setKupovniK(double kupovniK) throws RuntimeException {
		if (kupovniK > 0 ) {
			this.kupovniK = kupovniK;
			srednjiK = (prodajniK+kupovniK)/2.0;
		} else throw new RuntimeException("Kupovni kurs ne sme imati negativnu vrednost.");
	}


	public double getSrednjiK() {
		return srednjiK;
	}

	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", prodajniK=" + prodajniK
				+ ", kupovniK=" + kupovniK + ", srednjiK=" + srednjiK + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniK);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniK);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiK);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniK) != Double
				.doubleToLongBits(other.kupovniK))
			return false;
		if (Double.doubleToLongBits(prodajniK) != Double
				.doubleToLongBits(other.prodajniK))
			return false;
		if (Double.doubleToLongBits(srednjiK) != Double
				.doubleToLongBits(other.srednjiK))
			return false;
		return true;
	}

	
	
}
