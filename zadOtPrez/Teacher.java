package zadOtPrez;

public class Teacher extends Person{
	public String position;

	public Teacher(String name, String surname, String position) {
		super(name, surname);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Teacher [position=" + position + "]";
	}
	public void welcomeMessage() {
		System.out.println("Hello "+position+ " "+name+" "+surname);
	}
}
