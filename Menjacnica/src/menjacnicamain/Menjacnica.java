package menjacnicamain;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsmenjacnica.MenjacnicaInter;

public class Menjacnica implements MenjacnicaInter{
	
	public LinkedList<Kurs> kursevi = new LinkedList<Kurs>();

	public void unesiKurs(String nazivValute, String skraceni,
			GregorianCalendar datum, int srednji, int prodajni, int kupovni) {
		Kurs kurs = new Kurs();
		kurs.setDatumKursa(datum);
		kurs.setNazivValute(nazivValute);
		kurs.setSkraceniNaziv(skraceni);
		kurs.setProdajniKurs(prodajni);
		kurs.setSkraceniNaziv(skraceni);
		kurs.setProdajniKurs(prodajni);
		
		kursevi.add(kurs);
		
	}

	public void obrisiKurs(String nazivValute, String skraceni,
			GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	public Kurs pronadjiIVrati(String nazivValute, String skraceni,
			GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
