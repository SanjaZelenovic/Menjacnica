package menjacnica;

import interfejs.MenjacnicaInterfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	public LinkedList <Valuta> valute;
	
	Menjacnica () {
		valute = new LinkedList<Valuta>();
	}

	public void dodajKurs(GregorianCalendar dat, double prodajniKurs, double kupovniKurs, String nazivValute) {
		
		for (int i = 0; i < valute.size() ; i++) {
			
			for (int j = 0; j < valute.get(i).kursevi.size(); j++) {
				
				if ( valute.get(i).getNaziv().equals(nazivValute) && valute.get(i).kursevi.get(j).getDatum().equals(dat)) {
					
					valute.get(i).kursevi.get(j).setKupovniK(kupovniKurs);
					valute.get(i).kursevi.get(j).setProdajniK(prodajniKurs);
					
					return;
					
				}
				
			}
			
		}

	}

	public void obrisiKurs(GregorianCalendar dat, String nazivValute) {
		
	}

	public double[] vratiKurs(GregorianCalendar dat, String nazivValute) {
		return null;
	}

}
