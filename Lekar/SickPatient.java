package Lekar;

public class SickPatient extends Patient  {
	protected String epikriza;
	protected String status;
	protected int denNaZabolqwane;
	protected String imeNaLek;
	protected float kolichestvo;
	
	
	 public SickPatient(String name, String surname, String eGN, String epikriza, String status, int denNaZabolqwane,
			String imeNaLek, float kolichestvo) {
		super(name, surname, eGN);
		this.epikriza = epikriza;
		this.status = status;
		this.denNaZabolqwane = denNaZabolqwane;
		this.imeNaLek = imeNaLek;
		this.kolichestvo = kolichestvo;
	}


	public String getEpikriza() {
		return epikriza;
	}


	public void setEpikriza(String epikriza) {
		this.epikriza = epikriza;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getDenNaZabolqwane() {
		return denNaZabolqwane;
	}


	public void setDenNaZabolqwane(int denNaZabolqwane) {
		this.denNaZabolqwane = denNaZabolqwane;
	}


	public String getImeNaLek() {
		return imeNaLek;
	}


	public void setImeNaLek(String imeNaLek) {
		this.imeNaLek = imeNaLek;
	}


	public float getKolichestvo() {
		return kolichestvo;
	}


	public void setKolichestvo(float kolichestvo) {
		this.kolichestvo = kolichestvo;
	}


	public  void cure ()
	 			{System.out.println("[cure => Лекарство за прием : "+ imeNaLek +". Количество по лекарско предписане : " + kolichestvo+" .mg ]");
		 
		 }
}
