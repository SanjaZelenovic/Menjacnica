package menjacnica;

import interfejs.MenjacnicaInterfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	public LinkedList <Valuta> valute;
	
	Menjacnica () {
		valute = new LinkedList<Valuta>();
	}

	public void dodajKurs(GregorianCalendar dat, double prodajniKurs,
			double kupovniKurs, String nazivValute) {
		
	}

	public void obrisiKurs(GregorianCalendar dat, String nazivValute) {
		
	}

	public double[] vratiKurs(GregorianCalendar dat, String nazivValute) {
		return null;
	}

}
