package Lekar;

public abstract class Patient {
	protected String name;
	protected String surname;
	protected String EGN;
	
	public Patient(String name, String surname, String eGN) {
		super();
		this.name = name;
		this.surname = surname;
		EGN = eGN;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEGN() {
		return EGN;
	}
	public void setEGN(String eGN) {
		EGN = eGN;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}
		public abstract void cure();
}



