package menjacnica;

import java.util.GregorianCalendar;

public class TestMenjacnica {

	public static void main(String[] args) {
		
		Menjacnica m = new Menjacnica();
		
		Valuta v = new Valuta("evro","EUR");
		
		GregorianCalendar d = new GregorianCalendar();
		d.set(2015, 4, 5);
		Kurs k=new Kurs(465,123, d);
		
		k.setDatum(d);
		k.setKupovniK(456);
		k.setProdajniK(654);
		
        v.kursevi.add(k);

		m.valute.add(v);
		
		
		String b = m.valute.getFirst().getNaziv();
		double e = m.valute.getFirst().kursevi.getFirst().getKupovniK();
		double j = m.valute.getFirst().kursevi.getFirst().getSrednjiK();
		
		
		System.out.println(b);
		System.out.println(e);
		System.out.println(j);
		
		
		k.setProdajniK(5640);
		double l = m.valute.getFirst().kursevi.getFirst().getSrednjiK();
		System.out.println(l);

	}

}
