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

		kurs.setKupovniKurs(kupovni);
		kurs.setSrednjiKurs(srednji);
		kurs.setProdajniKurs(prodajni);
		
		for(int i=0;i<kursevi.size();i++){
			
			if(kursevi.get(i).getNazivValute().equals(nazivValute)&&kursevi.get(i).dateToString().equals(kurs.dateToString())){
				System.out.println("Vec postoji vrednost kursa te valute za taj dan.");
				return;
			}
		}
		kursevi.addFirst(kurs);

		
	}

	public void obrisiKurs(String nazivValute, String skraceni,
			GregorianCalendar datum) {
		Kurs kurs = new Kurs();
		kurs.setDatumKursa(datum);
		kurs.setNazivValute(nazivValute);
		kurs.setSkraceniNaziv(skraceni);
		
		for(int i=0;i<kursevi.size();i++){
			if(kursevi.get(i).getNazivValute().equals(nazivValute)&&kursevi.get(i).dateToString().equals(kurs.dateToString())){
				kursevi.remove(i);
				break;
			}
		}
		
	}

	public Kurs pronadjiIVrati(String nazivValute, String skraceni,
			GregorianCalendar datum) {
		
		Kurs kurs = new Kurs();
		kurs.setDatumKursa(datum);
		kurs.setNazivValute(nazivValute);
		kurs.setSkraceniNaziv(skraceni);
		
		for(int i=0;i<kursevi.size();i++){
			if(kursevi.get(i).getNazivValute().equals(nazivValute)&&kursevi.get(i).dateToString().equals(kurs.dateToString())){
				Kurs krs = kursevi.get(i);
				return krs;
			}
		}
		return null;
	}
	

}
