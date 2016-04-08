package pl.kobietydokodu.bazakotow.model;

import java.util.Date;

public class Kot {
	
	private String imie;			//imie kota
	private Date dataUrodzenia;		//data urodzenia kota
	private float waga;				//waga kota
	private String imieOpiekuna;	//imie opiekuna
	
	
	/* Metoda opisująca kota pełnym zdniem
	 * @return Opis kota w postaci zdania (ciągu znaków - String); 
	 * 
	 */
	
	public String przedstawSie () {
		return "Cześć, jestem " +imie+", urodziłem się " +dataUrodzenia+ ", waze "+waga+", opiekun moj nazywa sie "+imieOpiekuna+".";
		
		
	}
		public String getImie() {
			return imie;
		}
		
		public void setImie(String imie) {
			this.imie = imie;			
		}
		
		public Date getDataUrodzenia() {
			return dataUrodzenia;
		}
		
		public void setDataUrodzenia(Date dataUrodzenia) {
			this.dataUrodzenia = dataUrodzenia;
		}
		
		public float getWaga() {
			return waga;
		}
		
		public void setWaga(float waga) {
			this.waga = waga;
		}
		
		public String getImieOpiekuna() {
			return imieOpiekuna;
		}
		
		public void setImieOpiekuna(String imieOpiekuna) {
			this.imieOpiekuna = imieOpiekuna;
		}
		
		
		
		
	

}
