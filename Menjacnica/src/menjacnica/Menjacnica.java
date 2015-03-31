package menjacnica;

import interfejs.MenjacnicaInterfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	public LinkedList <Valuta> valute;
	
	Menjacnica () {
		valute = new LinkedList<Valuta>();
	}

	public void dodajKurs(GregorianCalendar dat, double prodajniKurs, double kupovniKurs, String nazivValute) throws NullPointerException {
		
		if ( dat == null || nazivValute == null ) {
			throw new NullPointerException("Datum i naziv ne smeju imati null vrednost!");
		}
		
		Kurs k = new Kurs(prodajniKurs, kupovniKurs, dat);
		
		
		for (int i = 0; i < valute.size() ; i++) {
			

			if ( valute.get(i).getNaziv().equals(nazivValute) ) {
				
				valute.get(i).kursevi.addLast(k);
			}
		}
	} 


	public void obrisiKurs(GregorianCalendar dat, String nazivValute) throws NullPointerException {
		
		if ( dat == null || nazivValute == null ) {
			throw new NullPointerException("Datum i naziv ne smeju imati null vrednost!");
		}

		for (int i = 0; i < valute.size() ; i++) {
			
			if ( valute.get(i).getNaziv().equals(nazivValute) ) {
				
				for (int j = 0; j < valute.get(i).kursevi.size(); j++) {
					
					if ( valute.get(i).kursevi.get(j).getDatum().equals(dat) ) {
						
						valute.get(i).kursevi.remove(valute.get(i).kursevi.get(j));
						
						return;
						
					}
				}
			}
		}
			
	}
		


	public double[] vratiKurs(GregorianCalendar dat, String nazivValute) throws NullPointerException {
		
		if ( dat == null || nazivValute == null ) {
			throw new NullPointerException("Datum i naziv ne smeju imati null vrednost!");
		}
		
		double [] kps = new double [3];
		
		for (int i = 0; i < valute.size() ; i++) {
			
			if ( valute.get(i).getNaziv().equals(nazivValute) ) {
				
				for (int j = 0; j < valute.get(i).kursevi.size(); j++) {
					
					if ( valute.get(i).kursevi.get(j).getDatum().equals(dat)) {
						
						double kupovni =  valute.get(i).kursevi.get(j).getKupovniK();
						double prodajni = valute.get(i).kursevi.get(j).getProdajniK();
						double srednji = valute.get(i).kursevi.get(j).getSrednjiK();

						kps[0] = kupovni;
						kps[1] = prodajni;
						kps[2] = srednji;
						
						return kps;
					
					}	
				}
			}
			
	
		}

		kps[0] = -1;
		kps[1] = -1;
		kps[2] = -1;
		
		return kps;
		
	}

}

