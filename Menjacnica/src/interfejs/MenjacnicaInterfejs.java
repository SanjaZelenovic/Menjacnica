package interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKurs( GregorianCalendar dat, double prodajniKurs, double kupovniKurs, String nazivValute);
	public void obrisiKurs (GregorianCalendar dat, String nazivValute);
	public double [] vratiKurs ( GregorianCalendar dat, String nazivValute);

}
