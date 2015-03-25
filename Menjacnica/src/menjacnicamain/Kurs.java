package menjacnicamain;

import java.util.GregorianCalendar;

public class Kurs {
	private String nazivValute;
	private String skraceniNaziv;
	private int srednjiKurs;
	private int prodajniKurs;
	private int kupovniKurs;
	private GregorianCalendar datumKursa;
	
	public String getNazivValute() {
		return nazivValute;
	}
	
	
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public int getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(int srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	public int getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(int prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public int getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(int kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}
	public void setDatumKursa(GregorianCalendar datumKursa) {
		this.datumKursa = datumKursa;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((datumKursa == null) ? 0 : datumKursa.hashCode());
		result = prime * result + kupovniKurs;
		result = prime * result
				+ ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + prodajniKurs;
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		result = prime * result + srednjiKurs;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datumKursa == null) {
			if (other.datumKursa != null)
				return false;
		} else if (!datumKursa.equals(other.datumKursa))
			return false;
		if (kupovniKurs != other.kupovniKurs)
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (prodajniKurs != other.prodajniKurs)
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (srednjiKurs != other.srednjiKurs)
			return false;
		return true;
	}
	
	private String dateToString() {
		int dan = datumKursa.get(GregorianCalendar.DAY_OF_MONTH);
		int mesec = datumKursa.get(GregorianCalendar.MONTH);
		int god = datumKursa.get(GregorianCalendar.YEAR);
		return dan+"/"+mesec+"/"+god;
	}
	
	public String toString() {
		return "Naziv valute: "+nazivValute+" skraceno: "+skraceniNaziv+" datum: "+dateToString()+" prodajni kurs: "+prodajniKurs+" kupovni kurs: "
				+kupovniKurs+" srednji kurs: "+srednjiKurs;
	}

}
