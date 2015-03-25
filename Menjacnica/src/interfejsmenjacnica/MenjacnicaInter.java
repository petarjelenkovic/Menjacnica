package interfejsmenjacnica;

import java.util.GregorianCalendar;

import menjacnicamain.Kurs;

public interface MenjacnicaInter {
	
	public void unesiKurs(String nazivValute, String skraceni, GregorianCalendar datum, int srednji, int prodajni, int kupovni);
	public void obrisiKurs(String nazivValute, String skraceni, GregorianCalendar datum);
	public Kurs pronadjiIVrati(String nazivValute, String skraceni, GregorianCalendar datum);

}
