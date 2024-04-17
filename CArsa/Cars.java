package CArsa;

public class Cars {
	protected String marka;
	protected String color;
	protected double cena ;
	protected String nomer;
	
	public Cars(String marka, String color, double cena, String nomer) {
		super();
		this.marka = marka;
		this.color = color;
		this.cena = cena;
		this.nomer = nomer;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getNomer() {
		return nomer;
	}

	public void setNomer(String nomer) {
		this.nomer = nomer;
	}

	@Override
	public String toString() {
		return "Car [" + marka + ", " + color + ", " + cena + ", " + nomer + "]";
	}
	

}
